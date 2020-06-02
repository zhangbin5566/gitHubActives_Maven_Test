package com.github.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestTest {

	@RequestMapping("/hello")
	public String index() {
		return "hello World";
	}
}
