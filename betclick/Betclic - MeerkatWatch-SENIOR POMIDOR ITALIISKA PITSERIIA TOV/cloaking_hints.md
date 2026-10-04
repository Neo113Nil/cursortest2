# Cloaking hints (Betclic - MeerkatWatch / SENIOR POMIDOR ITALIISKA PITSERIIA TOV / Clic)

- Play title «Betclic - MeerkatWatch» ≠ APK application-label «Clic».
- Application: com.pairip.application.Application.attachBaseContext → LicenseClient.checkLicense (Google Play).
- Launcher: com.unity3d.player.UnityPlayerGameActivity → Unity 6000.4.3f1 IL2CPP.
- First-party C# Assembly-CSharp:
  - StartupFlow.Start (Assets/Scripts/StartupFlow.cs): gyroEnabled, gyroError, gyroscope, check, suspicious, hard, details, userAgent, report, checks, preflight, ok, isBot, done; locals device, blockedModel, blockedChromiumVersion, results, allowedGpuTokens, gyroscope/accelerometer thresholds, request.
  - Response locals: responseOk, responseIsBot, responseError.
  - White shell: MeerkatWatch.cs (BuildMeerkat / StartGame).
- Gate URL (IL2CPP string pool): https://vokoson.site/get
- Header: x-api-key = 753D5E1ADA77B20B9959A1030B8E0BA5CF925F2881D3635C3F791E5A0AE0EEB1
- JSON keys in format strings: checks, name, preflight, score, tag. Content-Type application/json.
- Local filters: blockedModel «huawei hry-lx1», sdk_gphone, chromiumVersion, GPU tokens, gyro/accelerometer sampling.
- OpenURL + libunity ACTION_VIEW. Unity WebViewCallback present. Custom Tabs / androidx.browser нет.
- Ads/analytics SDK нет. First-party Kotlin нет (C# IL2CPP + Java Unity/PairIP).
