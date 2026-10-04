# Cloaking hints (Betclic / Anveont / WIN)

- Play title «Betclic» ≠ APK application-label «WIN».
- Application в манифесте: com.pairip.application.Application (проверка лицензии Play). Лаунчер: MainActivity.onCreate.
- Адрес проверки XOR (ключи 111, 250, 172, 76 по индексу % 4): https://silent-violet-fae1.dmmagchhhutowvtrooo.workers.dev/?app=<package>.
- OkHttp GET, followRedirects=true. Заголовки: X-Device-Model (Build.MODEL), Accept-Language (хардкод en-US,en;q=0.9), User-Agent (WebSettings.getDefaultUserAgent).
- Если итоговый URL после редиректов НЕ содержит workers.dev → сохраняют cfg/rurl, открывают ACTION_VIEW.
- Если URL остаётся на workers.dev или сеть упала → HomeActivity (белая оболочка).
- WebView.loadUrl и Custom Tabs в first-party коде нет. В activity_main только логотип и прогресс.
