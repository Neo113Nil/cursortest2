# Cloaking hints (Betclic / Aht IT / Brezvilo)

- Play title «Betclic» ≠ APK application-label «Brezvilo».
- Application в манифесте: com.pairip.application.Application (Play Integrity / licensecheck).
- Лаунчер: GateActivity (MAIN/LAUNCHER). MainActivity exported=false — белая оболочка.
- Сразу в onCreate: OrbixUI.configCat. SDK key `configcat-sdk-1/BwjfCB9VjUmOcvV7iGO8NA/7_qxsWPRFkePN0zJmynsCw`, stringKey `bretshfjlo`, buttonText `Enter Game`, OneSignal `078b8f6c-b87a-439d-9728-6cf6c0437eba`, LinkOpenMode.CHROME_TAB, openInChromeTab=true.
- OrbixConfigCat: ConfigCatClient autoPoll(60), SharedPreferencesCache `configcat_preferences`. GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent `ConfigCat-Droid/a-10.4.1`, опционально If-None-Match.
- getValueAsync без User-объекта: язык/GAID/страна в запрос проверки не кладут.
- Ответ: строка по ключу bretshfjlo. Пустая → ошибка. Равна «Enter Game» → белая кнопка → MainActivity. Иначе HTTP(S) URL открывают OrbixChromeTabs (Custom Tabs).
- WebView в first-party / Orbix для оффера нет. Deep link myapp://open (GateActivity + OrbixDeepLinkActivity).
- OrbixGateActivity exported, без LAUNCHER; в этом билде не точка входа.
