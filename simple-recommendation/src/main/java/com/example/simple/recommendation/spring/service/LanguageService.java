package com.example.simple.recommendation.spring.service;

import java.util.List;

import com.example.simple.recommendation.spring.entity.Language;

public interface LanguageService {

	public void addLanguage(Language language);
	public List<Language> listLanguages();
}
