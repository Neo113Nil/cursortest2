# Cloaking hints

- Play: «AVIATOR - MODA MASCULINA». APK application-label: «AVIATOR». Одно и то же имя бренда бразильского магазина мужской одежды; подзаголовок в карточке — категория, не белая оболочка.
- Application = PairIP LicenseClient (проверка лицензии Google Play), не gate оффера.
- Launcher: com.coderivy.shop.MainActivity extends FlutterActivity (y7.AbstractActivityC2032b). onCreate поднимает Flutter-движок, Dart entrypoint `main`, маршрут `/`.
- Deep link: https://www.aviator.com.br (официальный сайт магазина).
- q3/DialogC1594n.java loadUrl — Facebook SDK WebDialog: javascript закрытия fbPlatformDialogMustClose; URL диалога — facebook.com/dialog и fbconnect://success, SDK 18.3.0. Не оффер.
- q3/S.java loadUrl — тот же Facebook WebDialog (oauth/authorize).
- io.flutter.plugins.urllauncher.WebViewActivity + Custom Tabs (androidx.browser): URL из Flutter url_launcher (WhatsApp, Sizebay try-on, ссылки магазина). Не URL с gate-сервера.
- webview_flutter (c8): встроенные окна сайта магазина (Sizebay openSizebayWebView, VTEX iframe оплаты).
- Firebase Remote Config: package:shop/services/remote_config/remote_config_service.dart — флаги витрины (enableSizebay, enableCartUiV2, enableSplashVideo, linxScheduleUrl, whatsappCtaLabel). Нет развилки оффер/белая.
- First-party HTTP: app.coderivy.net / app.coderivy-qa.net (бэкенд конструктора Coderivy: каталог, корзина, заказы, VTEX/Linx).
- Mixpanel + Amplitude — аналитика магазина. Рекламных сетей нет.
- root_checker_plus / recaptcha_enterprise — антифрод магазина, не фильтр трафика клоаки.
- В Dart нет cloak/gate/is_bot/white page. «offerings» = VTEX attachmentOfferings (подарочная упаковка). «blacklist» = фильтры каталога/оплаты.
