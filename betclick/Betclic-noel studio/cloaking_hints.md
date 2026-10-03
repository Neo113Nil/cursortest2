# Cloaking hints (Betclic / noel studio / Win)

- Play title «Betclic» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense).
- Launcher: MainActivity. Init SharedPreferences `data`. Если ключ `goto` уже хранит ссылку — сразу ACTION_VIEW. Иначе fetch.
- Gate GET `https://aged-star-d7e5.mmazur-sashshshsavicktorr2.workers.dev/?app=` + packageName. Строки XOR (ключи 139/140).
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет, OkHttp GET, follow redirects.
- Ответ: финальный URL запроса (`HttpUrl.h`). Если в URL нет `workers.dev` — сохранить в `goto` и открыть во внешнем браузере. Если URL всё ещё workers.dev — MainActivity.x() → MainActivity2 (белая оболочка). Тело читают, ищут `"status":"ok"`, обе ветки при workers.dev ведут в fallback.
- onFailure / неудачный ACTION_VIEW → белая MainActivity2. onResume снова открывает сохранённый redirect.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
