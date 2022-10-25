package com.example.dogfoot.Dogfoot.index.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Dogfootcontroller {

    @GetMapping("Hello")
    public String hello(Model model){
        model.addAttribute("data", "hello");
        return "hello";

    }
}


