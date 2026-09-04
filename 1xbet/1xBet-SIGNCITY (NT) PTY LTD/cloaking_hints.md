# Cloaking hints (1xBet / SIGNCITY (NT) PTY LTD / Gregi)

- Play title «1xBet» ≠ APK application-label «Gregi».
- LAUNCHER: `com.gregi.app.MainActivity` (не меню белой игры).
- Белая оболочка: Castle Defender Dash — `MainActivity1` (меню), `MainActivity2` (игра), `MainActivity3` (статистика), `MainActivity4` (результат).
- Gate URL: `https://richapp53.online/MrzXZGNx`
- Маркер белой страницы: путь `MrzXZGNx` (`mw.a`).
- Нет интернета → `file:///android_asset/index.html` + кнопка Play Game.
- Есть интернет и prefs пустые → `primaryCanvas` loadUrl gate.
- `WebViewClient.onPageFinished`: URL содержит `MrzXZGNx` → показать Play Game (белая); иначе сохранить хост в prefs `jasdfqijsadfqw` / `nfllkansjenfas` и открыть во втором WebView.
- `onResume`: если сохранённый URL не содержит `MrzXZGNx` — снова открыть оффер в WebView.
- Кнопка Play Game (`proceedAction`) → `MainActivity1`.
- Нет OkHttp/Custom Tabs/GAID в запросе: только WebView GET без своих query-полей.
- `Dispatchers.IO` в бинарнике — Kotlin coroutines, не сетевой хост приложения.
