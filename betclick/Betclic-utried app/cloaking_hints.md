# Cloaking hints (Betclic / utried app / Win)

- Play title «Betclic» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense к Google Play).
- Launcher: MainActivity.onCreate. SharedPreferences `cache`. Если ключ `goto` уже хранит ссылку — сразу ACTION_VIEW. Иначе тихий GET.
- Gate GET `https://crimson-thunder-8807.astghik-vartanian-nexora.workers.dev/?app=` + packageName. Строки XOR (чётный байт ^ 82, нечётный ^ 117) в lw.g / MainActivity.
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет, OkHttp GET, follow redirects.
- Ответ: финальный URL запроса (`HttpUrl.h`). Если в URL нет `workers.dev` — qn.b Redirect(url=…) сохранить в `goto` и открыть во внешнем браузере. Если URL всё ещё workers.dev — qn.a → MainActivity2 (белая оболочка WordFlash). Тело читают, ищут `"status":"ok"`, обе ветки при workers.dev ведут в белый путь.
- onFailure / неудачный ACTION_VIEW → белая MainActivity2. onResume снова открывает сохранённый redirect.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
- Живая проверка GET с этого IP: HTTP 200, без редиректа, тело `{"status":"ok","version":"1.0.0","ts":…}`.
