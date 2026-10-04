# Cloaking hints (Betclic / Ba Digital ApS / Wazmirol)

- Play title «Betclic» ≠ APK application-label «Wazmirol».
- Application в манифесте: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense).
- Лаунчер: WazmirolGateActivity. Сразу в onCreate: AppRatingPrompt.gateEntry, затем TrafitUI.configCat.
- SDK key `configcat-sdk-1/_QzfCL3QH06LQJDJ5gWsDg/q_DbA_1nh0KmvbJ16qb0Dg`, stringKey `wavzyfjol`, buttonText `Begin Game`, OneSignal `b8761b03-fb65-4410-be05-a246d3608222`, LinkOpenMode.EXTERNAL_BROWSER, openInChromeTab=true (дефолт, в Gate не сбрасывают).
- TrafitConfigCat: ConfigCatClient autoPoll(60), SharedPreferencesCache `configcat_preferences`. GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent `ConfigCat-Droid/a-10.4.1`, опционально If-None-Match.
- getValueAsync без User-объекта: язык/GAID/страна в запрос проверки не кладут.
- Ответ: строка по ключу wavzyfjol. Пустая → ошибка. Равна «Begin Game» (без учёта регистра) → белая кнопка → HubActivity. Иначе URL открывают TrafitExternalBrowser (ACTION_VIEW), не Chrome Custom Tabs.
- Custom Tabs есть в TrafitChromeTabs, в этом билде выбран EXTERNAL_BROWSER. Deep link martinma://wemad (TrafitDeepLinkActivity).
- WebView в first-party / Trafit нет.
