# Cloaking hints (BetClic / DISTRIBUTORKU / Inisial Wallpaper)

- Play title «BetClic» ≠ APK application-label «Inisial Wallpaper». Package `com.dps.pandora`, version 7.0.0 (vc 7).
- Application в манифесте: `com.dps.pandora.config.MyApplication` (onCreate пустой). attachBaseContext нет.
- Лаунчер: `com.dps.pandora.TrafitGateActivity`. Сразу в onCreate: TrafitUI.configCat.
- SDK key `configcat-sdk-1/KA_fCEdGnEOJ3Ux2ygF4fA/WkWy4QWTxU-lMOdN0E4lUA`, stringKey `intifjkkpepers`, buttonText `Play Now`, OneSignal `03ce9db9-2343-4cbd-a34a-a75a24663ce0`, LinkOpenMode.EXTERNAL_BROWSER, openInChromeTab по умолчанию true.
- TrafitConfigCat: ConfigCatClient autoPoll(60), SharedPreferencesCache `configcat_preferences`. GET `{cdn-global|cdn-eu}.configcat.com/configuration-files/{sdkKey}/config_v6.json`, заголовок X-ConfigCat-UserAgent `ConfigCat-Droid/a-10.4.1`, опционально If-None-Match.
- getValueAsync без User-объекта: язык/GAID/страна в запрос проверки не кладут.
- Ответ: строка по ключу intifjkkpepers. Пустая → ошибка. Равна «Play Now» (без учёта регистра) → белая кнопка → MainActivity. Иначе URL открывают TrafitExternalBrowser (ACTION_VIEW), не Chrome Custom Tabs.
- Custom Tabs есть в TrafitChromeTabs, в этом билде выбран EXTERNAL_BROWSER. Deep link martinma://wemad (TrafitDeepLinkActivity).
- WebView: PrivacyActivity / PrivacyFragment грузят только `file:///android_asset/privacy_policy.html`.
- SplashActivity (не лаунчер) тянет GitHub `80done.json` (STATUS_APP, LINK_REDIRECT). На пути Trafit белая оболочка идёт в MainActivity, минуя Splash.
- Белая оболочка: обои. MainActivity Volley MORE_DATA GitHub `morestarlionton.json` (поля Exit-промо). Картинки More/Categories в wallpaper.json с хоста aliendro.id.
