# Cloaking hints (Betclic / Bio Code / Win)

- Play title «Betclic» ≠ APK application-label «Win».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense).
- Launcher: MainActivity. Cache.init → SharedPreferences `app_cfg`. Если ключ `dest` уже хранит ссылку — сразу Browser.open (ACTION_VIEW). Иначе fetchAndLoad.
- Gate GET `https://autumn-cake-c8d4.sdiachoklink.workers.dev/?app=` + packageName. Строки XOR в TextStore (XorUtil, ключи 150/203).
- Заголовки: X-Device-Model = Build.MODEL; Accept-Language = фиксированное `en-US,en;q=0.9`; User-Agent = WebSettings.getDefaultUserAgent. Тела нет, OkHttp GET, follow redirects.
- Ответ: финальный URL запроса (`HttpUrl.h`). Если в URL нет `workers.dev` — сохранить в `dest` и открыть во внешнем браузере. Если URL всё ещё workers.dev — Backup.load → MainActivity2 (белая оболочка). Тело читают, ищут `"status":"ok"`, обе ветки при workers.dev ведут в fallback.
- onFailure / неудачный Browser.open → белая MainActivity2. onResume снова открывает сохранённый redirect.
- WebView/Custom Tabs для оффера нет. WebSettings только для UA.
- dispatchers.io в пайплайне = kotlinx.coroutines Dispatchers.IO, не сетевой хост этого APK.
