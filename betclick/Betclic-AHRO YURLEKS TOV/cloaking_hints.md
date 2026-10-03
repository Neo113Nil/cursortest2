# Cloaking hints (Betclic / AHRO YURLEKS TOV / Alaric Fenmore TWA)

- Play / карточка «Betclic» = application-label «Betclic» (совпадает). Package `com.alaricz.fenmoq.rev`.
- Application в манифесте: `com.pairip.application.Application` (attachBaseContext → LicenseClient.checkLicense), дальше `com.alaricz.fenmoq.rev.Application` (Firebase Analytics + OneSignal `df80c62a-51cc-4f98-a4ba-9ee57b112ec2`).
- Лаунчер: `com.alaricz.fenmoq.rev.LauncherActivity` extends TWA `f1.AbstractActivityC0940h`.
- Перед стартом TWA: рекламный номер (GAID, SignalGrabber / AdvertisingIdClient) → prefs `runtime_state` / `ad_marker`; Firebase `getAppInstanceId` → `instance_marker`. На Android 13+ ещё запрос уведомлений OneSignal.
- URL: хардкод `https://bclicgamwi.org/` (`launchUrl`) + query `pv5mse` (GAID) + `fj8nma` (app instance id). Сборка в `LauncherActivity.i()`.
- Показ: Trusted Web Activity / Custom Tabs (immersive). fallbackType=`customtabs`. Запасной путь: `WebViewFallbackActivity.loadUrl`.
- Отдельного first-party HTTP gate (OkHttp/HttpURLConnection) с JSON url/offer нет: фильтрация на самом сайте. Проверка домена: белая страница «Alaric Fenmore» (контакты).
- TWA сгенерирован bubblewrap-cli. `config.ru` — языковой сплит splits0.xml. `com.chrome.dev` — пакет Chrome для Custom Tabs. `dispatchers.io` — строка Kotlin `Dispatchers.IO`.
