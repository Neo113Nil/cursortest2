# Cloaking hints (1xbet official app / ASSEMBLE COMMUNITIES PTY LTD / Maze Football)

- Play title «1xbet official app» ≠ APK application-label «Maze Football».
- LAUNCHER: `com.mazefootball6813.app.MainActivity` (не меню белой игры).
- Белая оболочка: Castle Defender Dash — `MainActivity1` (меню), `MainActivity2` (игра), `MainActivity3` (статистика), `MainActivity4` (результат).
- Gate URL (деобфускация int[] − 31 в `af`): `https://richapp88.online/g4C52qsG`
- Маркер белой страницы: путь `g4C52qsG` (`af.a.c()` / `af.c`).
- Нет интернета → `file:///android_asset/index.html` + кнопка Play Game.
- Есть интернет и prefs пустые → `leadPane` (`f1.e`) loadUrl gate.
- `WebViewClient.onPageFinished` (`rm`): URL содержит `g4C52qsG` → показать Play Game (белая); иначе сохранить хост в prefs `jasdfqijsadfqw` / `nfllkansjenfas` и открыть во втором WebView (`followPane`, `f1.d`).
- `onResume` (`fx`): если сохранённый URL не содержит `g4C52qsG` — снова открыть оффер в WebView.
- Кнопка Play Game (`advanceAction` / `t1`) → `MainActivity1`.
- Нет OkHttp/Custom Tabs/GAID в запросе: только WebView GET без своих query-полей.
- `Dispatchers.IO` в бинарнике — Kotlin coroutines (`nc.c()` → `to.b`), не сетевой хост приложения.
