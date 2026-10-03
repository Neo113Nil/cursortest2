# Cloaking hints — Chicken Road (ARDENOLLC)

- Play «Chicken Road» ≠ application-label «Mossdrop: Slime Trails» (белая оболочка по названию)
- Package: `com.kartiop.locak.hagyvagew` 1.0 (versionCode 1)
- LAUNCHER: `com.kartiop.locak.hagyvagew.MainActivity` (ComponentActivity + Compose)
- Extra `screen`: main / game / skins / howtoplay — локальные экраны, не URL
- Application: `com.pairip.application.Application` → LicenseClient.checkLicense → только Google Play (`com.android.vending`)
- Нет INTERNET, WebView, Custom Tabs, OkHttp, HttpURLConnection, ACTION_VIEW, remote config, ads, analytics
- DataStore `gameData` / `mossdrop_journal.preferences_pb`: локальный прогресс (profile / records / run)
- JSON-поле `gate` — виноградные ворота на карте острова, не traffic gate
- «offer» в тексте туториала: «Amber caches offer 3 crystals»
- config.ru — языковой сплит splits0.xml, не хост
- Dispatchers.IO — kotlinx.coroutines, не домен
- Cloak = нет (ребрендинг карточки Play без фильтрации трафика)
