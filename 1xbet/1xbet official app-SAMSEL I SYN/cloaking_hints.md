# Cloaking hints (1xbet official app / SAMSEL I SYN / Rush Blast League)

- Play title «1xbet official app» ≠ APK application-label «Rush Blast League».
- Application: `com.pairip.application.Application` — PairIP Play license, не gate.
- LAUNCHER: `com.rushblastleague1299.app.MainActivity`. Белая оболочка: WaveActivity меню, DamageActivity / WindActivity / CraftActivity — экраны игры.
- Gate URL собрана из int[] − 40: `https://morning-wildflower-3c66.dankevicivanna3.workers.dev/` + `?app=` + `getPackageName()`.
- OkHttp GET (`s00` / `o50`), followRedirects по умолчанию. Заголовки: `X-Device-Model` (`Build.MODEL`), `Accept-Language` (хардкод `en-US,en;q=0.9`), `User-Agent` (`WebSettings.getDefaultUserAgent`).
- Если итоговый URL после редиректов НЕ содержит `workers.dev` → сохраняют `app_cfg_store` / `cached_redirect_url`, открывают `ACTION_VIEW`. Lifecycle ON_RESUME снова открывает ссылку (`f30.a`).
- Если URL остаётся на `workers.dev` (в т.ч. тело содержит `"status":"ok"`) или сеть/ошибка → `WaveActivity` (белая оболочка). Нет сети на старте — сразу белая.
- WebView.loadUrl / Custom Tabs нет. Рекламных SDK / Firebase нет. GAID в запросе не читается (только permission AD_ID).
- domain_checks: `com.rushblastleague1299.app` (пакет, DNS NXDOMAIN), `dispatchers.io` (пайплайн). Реальный gate: `morning-wildflower-3c66.dankevicivanna3.workers.dev`.
