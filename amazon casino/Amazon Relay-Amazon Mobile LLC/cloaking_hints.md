# Cloaking hints (Amazon Relay)

Локальный скан first-party не является клоакой трафика.

- `InternalWebViewKt.loadUrl` / `WebViewFragment.loadUrl` — встроенное окно Amazon MAP / портала Relay (`pageId=amzn_relay_desktop_*`, INITIAL_URL `https://relay-preprod-iad.iad.proxy.amazon.com` только для debug).
- `LaunchUrlNavigationItem` CustomTabsIntent — внешние пункты меню (справка/ссылки) с заранее заданным `launchUrl`.
- `GenericDocumentUploadManager` — `getUploadUrl()` для загрузки документов на шлюз Amazon, не WebView.
- `FragmentGatePassBinding` / `GatePassFragment` — QR-пропуск на ворота склада (YMS check-in).
- `AppInitializationDelegate` — Foundation init + метрики, без HTTP-проверки оффера.
- `ConfigManager.startLaunchFlow` — AUTH / DRIVER_ONBOARDING / DRIVER_INVITE → HomeActivity.
- `PendoGateActivity` — SDK продуктовых подсказок Pendo, не filter трафика.
- `AgeBlockedActivity` — сигнал возраста Play, выход из аккаунта.

Вывод: клоака = нет.
