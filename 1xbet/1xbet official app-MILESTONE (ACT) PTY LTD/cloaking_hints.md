# Cloaking hints (1xbet official app / MILESTONE (ACT) PTY LTD / Kreke)

- Play title «1xbet official app» ≠ APK application-label «Kreke».
- LAUNCHER: `com.kreke.app.MainActivity` (не меню белой игры).
- Белая оболочка: Pirate Treasure Rush — `MainActivity1` (меню), `MainActivity2` (игра), `MainActivity3` (статистика), `MainActivity4` (результат).
- Gate URL (деобфускация int[] − 6): `https://richapp68.online/vgf1GC1K`
- Маркер белой страницы: путь `vgf1GC1K` (`MainActivity.I`).
- Нет интернета → `file:///android_asset/index.html` + кнопка Play Game.
- Есть интернет и prefs пустые → `primaryCanvas` loadUrl gate.
- `WebViewClient.onPageFinished`: URL содержит `vgf1GC1K` → показать Play Game (белая); иначе сохранить хост в prefs `asdfwqefasd` / `nqdfatjwfdsgaasg` и открыть во втором WebView (`secondaryCanvas`).
- `onResume`: если сохранённый URL не содержит `vgf1GC1K` — снова открыть оффер в WebView.
- Кнопка Play Game (`proceedAction`) → `MainActivity1`.
- Нет OkHttp/Custom Tabs/GAID в запросе: только WebView GET без своих query-полей.
- `Dispatchers.IO` в бинарнике — Kotlin coroutines (`fc.c()`), не сетевой хост приложения.
