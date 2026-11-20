# Cloaking hints (1xbet Online Casino / ESA Dienstleistung / Win)

- Play title «1xbet Online Casino» ≠ APK application-label «Win».
- Application в манифесте: com.pairip.application.Application (проверка лицензии Play). Лаунчер: MainActivity.onCreate.
- Адрес проверки XOR (ключи 199/41 по чётности байта): https://long-bar-525e.ostroverskoanzela.workers.dev/?app=<package>.
- OkHttp GET, followRedirects по умолчанию. Заголовки: X-Device-Model (Build.MODEL), Accept-Language (хардкод en-US,en;q=0.9), User-Agent (WebSettings.getDefaultUserAgent).
- Если итоговый URL после редиректов НЕ содержит workers.dev → сохраняют mem/dest, открывают ACTION_VIEW.
- Если URL остаётся на workers.dev (тело {"status":"ok",...}) или сеть упала → MainActivity2 (белая оболочка — набор калькуляторов).
- loadUrl / WebView / Custom Tabs в first-party коде нет. CurrencyActivity GET https://open.er-api.com/v6/latest/USD — курсы валют белой оболочки, не gate.
