# Cloaking hints

- Play / карточка: «1xbet»
- application-label: «Win»
- Package: `com.nexus.core.quick.wave.fusion.r1xbet`
- Точка входа: `MainActivity.onCreate` → отложенный запуск → `fetchAndLoad`
- Gate: GET `https://pl18copperravenhub.online/?t=4f5da265`
- Заголовки: `User-Agent` (WebSettings.getDefaultUserAgent), `Accept-Language` (`en-US,en;q=0.9`), `X-Device-Model` (Build.MODEL)
- OkHttp: followRedirects=false, followSslRedirects=false
- 3xx + Location → prefs `app_prefs`/`dest` + ACTION_VIEW
- иначе / ошибка сети → `MainActivity2`
