# Cloaking hints — Chicken Road (DUNCANS DUMPS)

Play-карточка: «Chicken Road». application-label в APK: «Duncan's Dumps». package: `com.duncandumps.duncandumps`. versionName 1.0 / versionCode 1.

Локальный скан first-party `agent_src` (не SDK):

- `SplashActivity.onCreate` — 2 секунды, открывает SQLite `duncans_dumps.db`, затем `MainActivity`. Нет `attachBaseContext`, нет своего `Application`.
- `MainActivity` — нижнее меню: Home / Services / Gallery / Pricing / Contact (прокат контейнеров в Tampa).
- Сеть first-party: Glide грузит картинки `images.unsplash.com` из локальной БД; заявка на расчёт — `ACTION_SEND` / `SENDTO` на `Jeremy@duncandumps.info` и `info@duncandumps.com`; карта — `ACTION_VIEW` `geo:`.
- Хиты `offer` — английский текст «we offer» / «the largest dumpster we offer», не URL оффера.
- `loadUrl` / `WebViewClient` / Custom Tabs / OkHttp / Retrofit / Volley / Firebase Remote Config в dex нет (кроме `WebView.findAddress` в AndroidX LinkifyCompat).
- PairIP `LicenseClient` ходит в Google Play (`com.android.vending`), не в gate.

Клоака = нет: развилки оффер/белая в сборке нет. Расхождение названия Play и label — ребрендинг витрины.
