# Cloaking hints (Betclic Sports Betting / The Racing Dev / Win)

- Play title «Betclic Sports Betting» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense к Google Play).
- Launcher: MainActivity.onCreate. SharedPreferences `local`. Через ~0,6–2,2 с: если ключ `saved_url` уже хранит ссылку — сразу ACTION_VIEW. Иначе тихий GET.
- Gate GET `https://ng4northernharborstudio.online/?t=1b7cc17d` (токен зашит, имя пакета в URL не кладут).
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет, OkHttp GET.
- OkHttpClient: followRedirects = false, followSslRedirects = false.
- Ответ: если HTTP 300–399 и есть заголовок Location — class c.a.b Redirect(url=…) сохранить в `saved_url` и открыть во внешнем браузере. Иначе (в т.ч. 200 с телом `{"status":"ok",...}`) — MainActivity.u() → MainActivity2 (белая оболочка «Быстрый счёт»). Тело JSON для развилки не читают.
- onFailure / неудачный ACTION_VIEW → белая MainActivity2. onResume снова открывает сохранённый redirect.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
- Живая проверка GET с этого IP: без редиректа, тело `{"status":"ok","version":"1.0.0","ts":…}`.
