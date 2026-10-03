# Cloaking hints (Betclic' / POTAL / BlickGames)

- Play title «Betclic'» ≠ APK application-label «BlickGames».
- Application: com.pairip.application.Application (attachBaseContext → LicenseClient.checkLicense к Google Play).
- Launcher: com.unity3d.player.UnityPlayerGameActivity → Unity SplashGame (Assets/Scripts/Core/SplashGame.cs).
- Gate URL (IL2CPP metadata): https://nmoines.site/get_ui_divkit ; рядом литералы tv34hgtr2, divkit_fallback, player_id, flow_state, flow_config.
- Сбор под запрос: FormatPayload, EnsureUserId, ReadDeviceLockState, ReadAndroidProperty, ReadLocaleHeader, BuildUserAgent, SanitizeHeader; разбор ответа JsonReadBool / JsonReadString.
- Ответ: JSON DivKit (поле card, опционально templates) → ApplyDivKitConfig / DivKitBridge.show → нативный Div2View на весь экран.
- http(s) в действиях DivKit → Intent ACTION_VIEW (внешний браузер). div-screen://close → DivKitBridge.hide + UnitySendMessage SplashGame.OnDivKitClose (остаётся обычная игра).
- WebView.loadUrl / Custom Tabs в first-party коде нет. assets/divkit_render.html не используется мостом (нативный Div2View).
- Белая оболочка: KiwiRun (Assets/Scripts/KiwiRun.cs), label BlickGames.
