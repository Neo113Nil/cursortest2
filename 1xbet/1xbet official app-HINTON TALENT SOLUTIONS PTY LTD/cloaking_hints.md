# Cloaking hints (1xbet official app / HINTON TALENT SOLUTIONS PTY LTD / Karregogaci)

- Play title «1xbet official app» ≠ APK application-label «Karregogaci».
- LAUNCHER: `com.karregogaci.app.MainActivity` (не меню белой игры).
- Белая оболочка: Space Cargo Pilot — `MainActivity1` (меню), `MainActivity2` (игра), `MainActivity3` (статистика), `MainActivity4` (результат).
- Gate URL (деобфускация int[] − 22 в `nm`): `https://richapp69.online/QBBr7kYg`
- Маркер белой страницы: путь `QBBr7kYg` (`nm.a.c()` / `nm.a.e`).
- Нет интернета → `file:///android_asset/index.html` + кнопка Play Game.
- Есть интернет и prefs пустые → `panePrimary` (`gt.a`) loadUrl gate.
- `WebViewClient.onPageFinished` (`mu`): URL содержит `QBBr7kYg` → показать Play Game (белая); иначе сохранить хост в prefs `jasdfqijsadfqw` / `nfllkansjenfas` и открыть во втором WebView (`paneSecondary`, `gt.b`).
- `onResume`: если сохранённый URL не содержит `QBBr7kYg` — снова открыть оффер в WebView.
- Кнопка Play Game (`actionProceed` / `proceedAction`) → `MainActivity1`.
- Нет OkHttp/Custom Tabs/GAID в запросе: только WebView GET без своих query-полей.
- `Dispatchers.IO` в бинарнике — Kotlin coroutines (`jc.c()` → `wo.b`), не сетевой хост приложения.
