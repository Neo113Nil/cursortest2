# Cloaking hints (Betclic / Denwy app / Win App)

- Play title «Betclic» ≠ APK application-label «Win App».
- Application в манифесте: com.pairip.application.Application (проверка лицензии Play). Лаунчер: MainActivity.onCreate.
- Адрес проверки XOR (ключи 22/96 по чётности байта): https://still-meadow-7909.v1ddslav-art-svintoshcko.workers.dev/?app=<package>.
- OkHttp GET, followRedirects по умолчанию. Заголовки: X-Device-Model (Build.MODEL), Accept-Language (хардкод uk-UA,it-IT;q=0.9,en-US;q=0.8), User-Agent (WebSettings.getDefaultUserAgent).
- Если итоговый URL после редиректов НЕ содержит workers.dev → Redirect, сохраняют data/rurl, открывают ACTION_VIEW.
- Если URL остаётся на workers.dev (тело {"status":"ok",...}) или сеть упала → MainActivity2 (белая оболочка-игра).
- В вёрстке есть скрытый WebView overlayWebView, loadUrl в first-party коде нет. Custom Tabs не вызываются.
