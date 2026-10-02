# Cloaking hints — Amazon Casino & Real Rewards (TOR-BEZPEKA)

- Play title «Amazon Casino & Real Rewards» ≠ APK application-label «Amazon Casino»; package `com.lanejumper.Dodge.Road` 1.3.0 (versionCode 3)
- In-game Flutter title: «LANE JUMPER» / «Lane Jumper» (endless runner: ACE PILOT, ZX-PHANTOM, THE GARAGE, game_data.json)
- LAUNCHER: `com.lanejumper.Dodge.Road.MainActivity` extends FlutterActivity (`f0.f`)
- Application: `com.pairip.application.Application.attachBaseContext` → `LicenseClient.checkLicense` (Google Play licensing only, `com.android.vending`)
- Channel `lane_chassis_stream` method `unfurlMistLane` (`d0.b`): XOR 115 + AES/CBC decrypt of baked ciphertext → URL `https://halvani.org/NgMNry4b` → Custom Tabs (`e.d` / ACTION_VIEW + customtabs extras)
- Plugins: only `path_provider_android` (GeneratedPluginRegistrant)
- No android.webkit.WebView, OkHttp, HttpURLConnection, first-party JSON gate
- Custom Tabs query in manifest is used: first-party opens the decrypted offer URL
- Prefs: no SharedPreferences plugin; Dart keys game_data.json / carsDodged / levelHighScores / maxLevelUnlocked / perfectLaneChanges / maxWorldUnlocked / unlockedAchievements via path_provider
- dispatchers.io = Kotlin Dispatchers.IO; systemuioverlay.top = SystemChrome.setSystemUIOverlayStyle; scripts.sil.org = Alfa Slab One OFL (`http://scripts.sil.org/OFL`)
- Cloaking = да: encrypted offer URL + Custom Tabs + Play name vs APK label
