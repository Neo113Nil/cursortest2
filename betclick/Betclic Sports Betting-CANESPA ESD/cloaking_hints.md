# Cloaking hints (Betclic Sports Betting / CANESPA ESD / Win)

- Play title «Betclic Sports Betting» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense к Google Play).
- Launcher: MainActivity.onCreate. SharedPreferences `app_cache`. Через ~0,9–2,7 с: если ключ `nav` уже хранит ссылку — сразу ACTION_VIEW. Иначе тихий GET.
- Gate GET `https://de7silvercanyonstudio.online/?t=5f34fd30` (токен зашит, имя пакета в URL не кладут).
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет, OkHttp GET.
- OkHttpClient: followRedirects = false, followSslRedirects = false.
- Ответ: если HTTP 300–399 и есть заголовок Location — class a.a.b Redirect(url=…) сохранить в `nav` и открыть во внешнем браузере. Иначе (в т.ч. 200 с телом `{"status":"ok",...}`) — MainActivity.u() → MainActivity2 (белая оболочка). Тело JSON для развилки не читают.
- onFailure / неудачный ACTION_VIEW → белая MainActivity2. onResume снова открывает сохранённый redirect из памяти процесса.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
- Живая проверка GET: без редиректа, тело `{"status":"ok","version":"1.0.0","ts":…}`.
- Сборка: APKPure XAPK Betclic Sports Betting 1.0 vc1. Папки Play Collector в git не было. В этом XAPK сплиты base + config.en + config.mdpi (нет asset/xxhdpi).
