# Cloaking hints (1xbet official app / QBE INSURANCE (AUSTRALIA) LIMITED / Puzzle Star Match)

- Play title «1xbet official app» ≠ APK application-label «Puzzle Star Match».
- LAUNCHER: `com.puzzlestarmatch2722.app.MainActivity` (не меню белой игры).
- Белая оболочка: Jungle Totem Run — `PotionActivity` (меню), `PositionActivity` (игра), `HunterActivity` (статистика), `HealerActivity` (результат).
- Gate URL (деобфускация int[] − 44 в конструкторе MainActivity): `https://morning-grass-90d4.taufeeqkhan1429.workers.dev/`
- Запрос: GET `{D}?app={getPackageName()}` + заголовки `X-Device-Model` (Build.MODEL), `Accept-Language` (константа `en-US,en;q=0.9`), `User-Agent` (WebSettings.getDefaultUserAgent).
- Маркер белой страницы: финальный URL содержит `workers.dev` (`MainActivity.G`).
- Тело ответа проверяют на `"status":"ok"` (`MainActivity.F`), но обе ветки при `workers.dev` ведут в `PotionActivity`.
- Нет интернета / ошибка сети → `PotionActivity`.
- Если финальный URL не содержит `workers.dev` — сохранить в prefs `app_cfg_store` / `cached_redirect_url` и открыть через `ACTION_VIEW` (внешний браузер).
- `onStart`: если в prefs уже есть ссылка — снова `ACTION_VIEW`.
- `onResume`: если в памяти `B` есть ссылка — `n70.a` снова `ACTION_VIEW`.
- Нет WebView / Custom Tabs в first-party коде. `index.html` лежит в assets, loadUrl по нему нет.
- OkHttp 4.12.0 (`lr` = OkHttpClient).
