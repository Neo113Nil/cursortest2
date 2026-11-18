# Cloaking hints (Betclic / BRAT-BUD KOLONIA / com.slatejunction.betor)

- Play / карточка «Betclic» ≠ application-label «Slate Junction» (launcherName «Slate Juncti»). Белая оболочка.
- Application в манифесте: `com.pairip.application.Application` (attachBaseContext → LicenseClient.checkLicense), дальше `com.slatejunction.betor.Application.onCreate` пустой.
- Лаунчер: `com.slatejunction.betor.LauncherActivity` extends TWA `K.AbstractActivityC0051h`. `i()` только `super.i()` — без GAID/query.
- URL хардкод в strings: launchUrl / fullScopeUrl / hostName / webManifestUrl / assetStatements = `https://slate-junction.bratbudkolonia.site/`.
- Показ: Trusted Web Activity / Custom Tabs. fallbackType=`customtabs`. Запасной класс `WebViewFallbackActivity.loadUrl` (включается только если FALLBACK_STRATEGY=webview).
- android.permission.INTERNET нет. First-party OkHttp/HttpURLConnection/Firebase/рекламных сетей нет.
- `config.ru` — языковой сплит splits0.xml. `com.chrome.dev` — пакет Chrome в списке TWA-провайдеров.
