# Cloaking hints (Betclic Bets, Casino & Poker / Foncont Dev / Win)

- Play title «Betclic Bets, Casino & Poker» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense к Google Play).
- Launcher: MainActivity.onCreate. Через 607–2245 мс читает SharedPreferences `app_store`. Если ключ `last_url` уже хранит ссылку — сразу ACTION_VIEW. Иначе тихий GET.
- Gate GET `https://ua76silverharborfactory.online/?t=22caa1b0`. OkHttp followRedirects=false и followSslRedirects=false.
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет.
- Ответ: только HTTP 3xx и заголовок Location. Если Location есть — сохранить в `last_url` / p4.a и открыть во внешнем браузере. Если Location пустой (в том числе HTTP 200 с JSON) — MainActivity2 (белая оболочка «Учи слова»). Тело ответа приложение не читает.
- onFailure / неудачный ACTION_VIEW → белая MainActivity2. onResume снова открывает сохранённый redirect.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
- Живая проверка GET: HTTP 200, без редиректа, тело `{"status":"ok","version":"1.0.0","ts":…}`.
