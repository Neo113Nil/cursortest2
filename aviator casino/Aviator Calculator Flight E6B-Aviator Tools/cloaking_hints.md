# Cloaking hints

- Play: «Aviator Calculator Flight E6B» / «Aviator Calculator: Flight E6B». APK application-label: «Aviator Calculator». Совпадает по смыслу, не белая оболочка.
- Application = PairIP LicenseClient (проверка лицензии Google Play), не gate оффера.
- Launcher: MainActivity extends BridgeActivity. onCreate: MobileAds.initialize + JavascriptInterface AdMobBridge.
- capacitor.config.json: нет server.url. WebView loadUrl = https://localhost/ из локальных assets/public (авиационный калькулятор).
- BridgeWebViewClient.shouldOverrideUrlLoading: внешние хосты через ACTION_VIEW (Instagram/TikTok/YouTube/Play). Не URL с сервера gate.
- MockCordovaWebViewImpl.loadUrl: только about:blank и javascript:.
- CordovaActivity / SystemWebViewEngine / SystemWebViewClient — SDK Cordova внутри Capacitor, лаунчер не CordovaActivity.
- RevenueCat «offer» / remote config — пакеты покупок и failover API SDK, не развилка оффер/белая.
- AdMob баннер/интерстициал. Custom Tabs — клики рекламы Google, не целевой оффер после проверки.
- First-party HTTP gate нет. JS-бандл — инструменты пилота (wind, holding, fuel, density altitude) + Lifetime Pro.
