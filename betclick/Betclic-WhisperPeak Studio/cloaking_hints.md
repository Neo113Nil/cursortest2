# Cloaking hints (Betclic / WhisperPeak Studio / Vultranis Leap)

- Play title «Betclic» ≠ APK application-label «Vultranis Leap».
- Application в манифесте: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense), дальше VultranisLeapApplication.
- Лаунчер: MainActivity. Сразу в onCreate: TrafitUI.configCat.
- SDK key `configcat-sdk-1/4xrfCBgHg0WL3_14HrJ-2A/psQzLnuOt0-MT2631ictvA`, stringKey `mkcvif`, buttonText `Tap to start`, OneSignal `bea85329-e112-4f3f-a2e3-4c23fb9c5163`, LinkOpenMode.EXTERNAL_BROWSER, openInChromeTab=true.
- TrafitConfigCat: ConfigCatClient autoPoll(60), SharedPreferencesCache `configcat_preferences`. GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent `ConfigCat-Droid/a-10.4.1`, опционально If-None-Match.
- getValueAsync без User-объекта: язык/GAID/страна в запрос проверки не кладут.
- Ответ: строка по ключу mkcvif. Пустая → ошибка. Равна «Tap to start» (без учёта регистра) → белая кнопка → HubActivity. Иначе URL открывают TrafitExternalBrowser (ACTION_VIEW), не Chrome Custom Tabs.
- Custom Tabs есть в TrafitChromeTabs, в этом билде выбран EXTERNAL_BROWSER. Deep link vultranisleap://play (TrafitDeepLinkActivity).
- WebView в first-party / Trafit нет.
