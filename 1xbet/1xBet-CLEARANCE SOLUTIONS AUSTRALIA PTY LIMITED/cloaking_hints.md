# Cloaking hints (1xBet / CLEARANCE SOLUTIONS AUSTRALIA PTY LIMITED / Guvuen)

- Play title «1xBet» ≠ APK application-label «Guvuen».
- LAUNCHER: `com.guvuen.app.MainActivity` (не меню белой игры).
- Белая оболочка: Ocean Drift — `MainActivity1` (меню), `MainActivity2` (игра), `MainActivity3` (статистика), `MainActivity4` (результат).
- Gate URL (собрана из int[] − 26): `https://richapp70.online/bFVPQsys`
- Маркер белой страницы: путь `bFVPQsys` (`MainActivity.I`, последний сегмент gate URL).
- Нет интернета → `file:///android_asset/index.html` + кнопка Play Game (`proceedAction`).
- Есть интернет и prefs пустые → `primaryCanvas` loadUrl gate.
- `WebViewClient.onPageFinished`: URL содержит `bFVPQsys` → показать Play Game (белая); иначе сохранить адрес без схемы в prefs `asdfwqefasd` / ключ `nqdfatjwfdsgaasg` и открыть во втором WebView (`secondaryCanvas`).
- `onResume`: если сохранённый URL не содержит `bFVPQsys` — снова открыть оффер в WebView.
- Кнопка Play Game (`proceedAction`) → `MainActivity1`.
- Нет OkHttp/Custom Tabs/GAID в запросе: только WebView GET без своих query-полей.
- `com.pairip.application.Application` — проверка лицензии Google Play, не gate клоаки.
