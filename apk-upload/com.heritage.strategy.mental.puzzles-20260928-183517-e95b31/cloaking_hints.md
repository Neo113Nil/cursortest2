# Cloaking hints (Gravity Groove / upload / com.heritage.strategy.mental.puzzles)

- Play title «Gravity Groove» = APK application-label «Gravity Groove» (совпадает).
- Package: com.heritage.strategy.mental.puzzles.
- Точка входа: MainActivity → G.AbstractActivityC0005f (тот же JADX-класс, что FlutterActivity в других сборках этого репозитория).
- Локальный скан agent_src (не SDK): W/f0.java, W/e0.java, W/T.java, W/N.java — shouldOverrideUrlLoading; W/T.java — loadUrl.
- Подозрительные домены пайплайна: dispatchers.io, gavorella.org, systemuioverlay.top.
- gavorella.org — живой сайт «Gravity Groove — 3D Physics Balance Tower» (белая HTML5-игра).
- Папка prepare на origin/main отсутствовала; Play 404; зеркала APK нет; agent_src/agent_base.apk в эту ВМ не скопированы.
- Вердикт: да (хиты WebView loadUrl / shouldOverrideUrlLoading не разобраны как «не gate»).
