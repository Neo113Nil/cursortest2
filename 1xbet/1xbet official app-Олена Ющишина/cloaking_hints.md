# Cloaking hints (1xbet official app / Олена Ющишина / Fortune Blast Goal)

- Play title «1xbet official app» ≠ APK application-label «Fortune Blast Goal».
- Application: `com.pairip.application.Application` — PairIP Play license, не gate.
- LAUNCHER: `com.fortuneblastgoal5359.app.MainActivity`. Белая оболочка: LightActivity меню, StageActivity / VelocityActivity / SpeedActivity — экраны игры.
- Gate URL собрана из int[] − 35: `https://cold-night-ad90.kovalcukviktoria820.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`t00` / `h50`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`).
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. Lifecycle ON_RESUME снова открывает ссылку (`B0` / `i00.a`).
- Если URL остаётся на `workers.dev` (в т.ч. тело содержит `"status":"ok"`) или сеть/ошибка → `LightActivity` (белая оболочка). Нет сети на старте — сразу белая.
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
- domain_checks: `com.fortuneblastgoal5359.app` (пакет, DNS NXDOMAIN), `dispatchers.io` (пайплайн). Реальный gate: `cold-night-ad90.kovalcukviktoria820.workers.dev`.
