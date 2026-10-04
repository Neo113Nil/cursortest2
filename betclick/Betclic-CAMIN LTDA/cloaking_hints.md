# Cloaking hints (Betclic / CAMIN LTDA / Center Circle Rise)

- Play / карточка «Betclic» = application-label «Betclic» (совпадает). Package `com.centercirclerise.rclerise` vc2.
- Application: `com.pairip.application.Application` (attachBaseContext → LicenseClient.checkLicense → Google Play CHECK_LICENSE).
- Лаунчер: `com.unity3d.player.UnityPlayerActivity` (Unity 6000.0.84f1, IL2CPP). Deep link `centercircle://open`.
- First-party Java только `com.centercirclerise.rclerise.R`. Сети в Java: нет OkHttp/HttpURLConnection/WebView/Custom Tabs/loadUrl.
- Firebase Analytics 23.2.0 + Installations; `google_storage_bucket` = `center-circle-rise.firebasestorage.app` (google-services.json). SDK Firebase Storage / Remote Config в assemblies нет.
- UnityWebRequest — модуль движка (Addressables локальный catalog.bin). HttpHelpers/SetRequestHeaders — Firebase.Internal, не gate.
- Metadata/libil2cpp: нет кастомных http-хостов оффера, нет cloak/offer/whitelist/is_bot. Addressables: PrivacyPolicy.prefab — окно политики, не лендинг.
- GAID: Unity `AndroidAdvertisingIdHelper` + MiniIT.AdvertisingIdFetcher — для аналитики Unity/Firebase, без отправки на неизвестный gate.
