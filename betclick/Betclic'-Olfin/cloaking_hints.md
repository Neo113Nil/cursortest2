# Cloaking hints (Betclic' / Olfin / Win)

- Play title «Betclic'» ≠ APK application-label «Win».
- Application-класса в манифесте нет. Лаунчер: MainActivity.onCreate.
- Адрес проверки XOR (b8, ключи 0xAF/0xBB): https://throbbing-cake-9194.kolomichyk5647sergi.workers.dev/?app=<package>.
- OkHttp GET, followRedirects по умолчанию. Заголовки: X-Device-Model (Build.MODEL), Accept-Language (хардкод en-US,en;q=0.9), User-Agent (WebSettings.getDefaultUserAgent).
- Если итоговый URL после редиректов НЕ содержит workers.dev → Redirect, сохраняют store/redirect_url, открывают ACTION_VIEW. onResume снова открывает ссылку.
- Если URL остаётся на workers.dev (в т.ч. тело {"status":"ok",...}) или сеть упала → MainActivity2 (белая оболочка утилит).
- Custom Tabs / WebView.loadUrl нет. Второй first-party HTTP: CurrencyConverterActivity → https://api.frankfurter.app/latest (курсы валют белой оболочки, не gate).
