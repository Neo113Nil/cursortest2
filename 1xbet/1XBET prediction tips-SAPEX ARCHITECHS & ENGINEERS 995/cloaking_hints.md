# Cloaking

- Play title: 1XBET prediction tips
- APK label: 1xBet Prediction Tips (то же имя, другой регистр — не белая оболочка)
- Application: com.pairip.application.Application → LicenseClient.checkLicense (Play лицензия, не gate оффера)
- MainActivity extends FlutterActivity: только фабрики нативной рекламы zuppeNative / zuppeNativeDark и канал zuppe/native_ads
- Dart-пакет приложения: cricket_app (онбординг языка/страны, прогнозы, toto, accumulators)
- First-party HTTP: GET https://adminapi.recruitagroup.com/api/public/config/com.betzona_avt_clone_v1
- Ответ: success, data.appName/category/status/packageName/unique_id, data.ads.{appOpen,banner,interstitial,rectangle,rewarded} — слоты Google Ad Manager, без url/offer/link
- SharedPreferences: ads_config_json (кэш слотов), язык/страна/спортивный профиль
- webview_flutter_android зарегистрирован, но package:webview_flutter / WebViewWidget / WebViewController в Dart приложения нет; loadUrl/shouldOverrideUrlLoading — Pigeon SDK для AdMob
- Custom Tabs: androidx.browser + queries CustomTabsService (зависимость рекламы), CustomTabsIntent в first-party нет
- Нет cloak/gate/offer/whitelist/is_bot в first-party коде
- Клоака: нет (обычные прогнозы + AdMob/GAM, без развилки оффер/белая)
