# Cloaking hints (Betclic / AMS Saeed / Nyravexis)

- Play title «Betclic» ≠ APK application-label «Nyravexis».
- Application в манифесте: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense).
- Лаунчер: GateActivity. Сразу в onCreate: OrbixUI.configCat.
- SDK key `configcat-sdk-1/ZO3eCEpNAU-HWH6bCsrDDA/0yhrg4hT50SVt1gkcVdztQ`, stringKey `nyufifjis`, buttonText `Begin Quest`, OneSignal `214dbc4d-d24d-4e22-bf82-e7177a8b76e0`, LinkOpenMode.CHROME_TAB, openInChromeTab=true.
- OrbixConfigCat: ConfigCatClient autoPoll(60), SharedPreferencesCache `configcat_preferences`. GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent `ConfigCat-Droid/a-10.4.1`, опционально If-None-Match.
- getValueAsync без User-объекта: язык/GAID/страна в запрос проверки не кладут.
- Ответ: строка по ключу nyufifjis. Пустая → ошибка. Равна «Begin Quest» (без учёта кавычек/пробелов) → белая кнопка → MainActivity. Иначе HTTP(S) URL открывают OrbixChromeTabs (Custom Tabs).
- WebView в first-party / Orbix нет. Deep link myapp://open (GateActivity + OrbixDeepLinkActivity).
