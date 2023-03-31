package seleniumPkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopuphandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Yash//Downloads//chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");
		
		//handling alerts with a timer
		
		WebElement button = driver.findElement(By.id("timerAlertButton"));
		button.click();
		
		Thread.sleep(6000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//handling using confirm box
		
		WebElement confbutton = driver.findElement(By.id("confirmButton"));
		
		confbutton.click();
		
		Thread.sleep(3000);
		
		String Text = alert.getText();
		System.out.println(Text);
		
		alert.accept();
		
		WebElement confbutton1 = driver.findElement(By.id("confirmButton"));
		confbutton1.click();
		
		Thread.sleep(2000);
		
		String Text1 = alert.getText();
		
		alert.dismiss();
	}

}
