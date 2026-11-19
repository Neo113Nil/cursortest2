# Cloaking hints — 1win (Airiss Company)

- Play title «1win» ≠ APK application-label «Turbo Blaze»; package `com.asphaltic.octane.ignition.carburetor.redline`
- LAUNCHER: MainActivity extends FlutterActivity (`c0.AbstractActivityC0104f`); class body empty
- Application: `com.pairip.application.Application.attachBaseContext` → `LicenseClient.checkLicense` (Google Play licensing only)
- Plugins: jni, jni_flutter, shared_preferences_android (GeneratedPluginRegistrant)
- No android.webkit.WebView, CustomTabsIntent, ACTION_VIEW, HttpURLConnection, OkHttp, url_launcher
- No android.permission.INTERNET — network cloak/gate is not possible
- Prefs keys: turbo_blaze_achievements / turbo_blaze_completed_levels / turbo_blaze_cumulative_distance / turbo_blaze_total_points / turbo_blaze_unlocked_levels / turbo_blaze_welcome_shown
- libapp.so strings: Turbo Blaze racing (Nitro, chapters, Burnout Master, City Speedster)
- config.ru = splits0.xml language split; dispatchers.io = Kotlin Dispatchers.IO; systemuioverlay.top = SystemUiOverlay.top; com.chrome.dev not present in APK (no androidx.browser)
- Cloaking = нет: Play/label mismatch is listing rebrand, no offer/white traffic fork
