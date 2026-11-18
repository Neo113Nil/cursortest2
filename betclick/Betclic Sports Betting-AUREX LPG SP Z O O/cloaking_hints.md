# Cloaking hints (Betclic Sports Betting / AUREX LPG SP Z O O / Win)

- Play title «Betclic Sports Betting» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense к Google Play).
- Launcher: MainActivity.onCreate. SharedPreferences `app_prefs`. Через ~0,9–2,1 с: если ключ `goto` уже хранит ссылку — сразу ACTION_VIEW. Иначе тихий GET.
- Gate GET `https://pl18copperravenhub.online/?t=d93d0c0c` (токен зашит, имя пакета в URL не кладут).
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет, OkHttp GET.
- OkHttpClient: followRedirects = false, followSslRedirects = false.
- Ответ: если HTTP 300–399 и есть заголовок Location — сохранить в `goto` и открыть во внешнем браузере. Иначе (в т.ч. 200 с телом `{"status":"ok",...}`) — loadFallbackGame() → MainActivity2 (белая оболочка «Мой день»). Тело JSON для развилки не читают.
- onFailure / неудачный ACTION_VIEW → белая MainActivity2. onResume снова открывает сохранённый redirect из памяти процесса.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
- Живая проверка GET: без редиректа, тело `{"status":"ok","version":"1.0.0","ts":…}`.
- Сборка: APKPure XAPK Betclic Sports Betting 1.0 vc1. Папки Play Collector в git не было. В этом XAPK сплиты base + config.en + config.mdpi (нет asset/xxhdpi).
