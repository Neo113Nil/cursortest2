# Cloaking hints (Betclic / Betclic Sport / com.betclic.gameplatformmobile)

- Play title «Betclic» ≠ APK application-label «Betclic: Sport platform».
- Application: com.pairip.application.Application.attachBaseContext → LicenseClient.checkLicense (Google Play).
- Launcher: com.unity3d.player.UnityPlayerActivity.onCreate → Unity 6000.4.3f1 IL2CPP.
- First-party C# Assembly-CSharp:
  - StartupFlow.Start: gyroEnabled, gyroError, gyroscope, suspicious, hard, details, userAgent, report, checks, preflight, isBot.
  - Locals: device, blockedModel, blockedChromiumVersion, results, allowedGpuTokens, gyroscope/accelerometer thresholds, request.
  - Response: responseOk, responseIsBot, responseError.
  - White path: ToGame / ToMenu / ExitGame / Main.
- Gate URL (metadata string pool): https://tunesbloons.site/get
- Header name x-api-key; value 753D5E1ADA77B20B9959A1030B8E0BA5CF925F2881D3635C3F791E5A0AE0EEB1
- JSON format keys: checks, name, preflight, score, tag. Content-Type application/json.
- Local filters: blockedModel «huawei hry-lx1», sdk_gphone, chromiumVersion, GPU tokens, gyro/accelerometer sampling.
- OpenURL + libunity ACTION_VIEW. WebViewCallback in libunity only; no android.webkit.WebView / Custom Tabs / loadUrl in classes.dex.
- Ads/analytics SDK нет. First-party Kotlin нет. Android SharedPreferences нет.
