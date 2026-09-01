# Cloak / Traffic-Filter Analysis — 1xbet' / Quran stories (SALAMA dev)

| Field | Value |
|---|---|
| Package | `com.salamadev.nabilalawadi.kisaskoran` |
| In-app label | قصص القران العوضي |
| Marketing title | 1xbet' / Quran stories by Nabil Al-Awadi |
| Developer | SALAMA dev |
| Version | 5.0 (versionCode 1105) |
| minSdk / targetSdk / compileSdk | 24 / 35 / 35 |
| Builder | **Andromo** Flutter app builder (`com.andromo.AndromoApp`) |
| Flutter | 3.32.7 (stable) |
| **CLOAK VERDICT** | **NO** |

**Verdict rule applied:** Cloak = YES only if there is a server-side fork that shows an offer URL vs white/normal app. AdMob / WebView / analytics alone = NO.

---

## 1) Entry point / startup flow

### Application
- Manifest `android:name="com.andromo.AndromoApp"`
- File: `decompiled/sources/com/andromo/AndromoApp.java`

```java
public class AndromoApp extends Application {
    @Override
    public final void onCreate() {
        Thread.setDefaultUncaughtExceptionHandler(this.f10451a);
        try {
            getClassLoader().loadClass("com.facebook.ads.AudienceNetworkAds")
                .getMethod("initialize", Context.class).invoke(null, this);
            Log.d("Andromo", "FAN Loaded from onCreate");
        } catch (Exception e7) {
            Log.d("Andromo", e7.toString());
        }
        super.onCreate();
    }
}
```

Notes:
- Optional Facebook Audience Network init via reflection; **FAN classes are not present** in this APK (catch path always runs unless a split provides them).
- No cloak/gate call in `Application.onCreate`.

### Launcher Activity
- `com.ryanheise.audioservice.AudioServiceActivity` (MAIN/LAUNCHER)
- Empty subclass of Flutter embedding activity `p121q5.c` (audio_service FlutterActivity wrapper)
- File: `decompiled/sources/com/ryanheise/audioservice/AudioServiceActivity.java`

```java
public class AudioServiceActivity extends c { }
```

Startup chain:
1. `AndromoApp.onCreate` (exception handler + optional FAN)
2. `AudioServiceActivity` → Flutter engine → Dart entrypoint `main` (`package:builder/main.dart` in `libapp.so`)
3. Plugins registered via `io.flutter.plugins.GeneratedPluginRegistrant`
4. App UI is Andromo dashboard + **audio player** content (bundled mp3 under `flutter_assets/downloaded_assets/audioplayer_*`)

Also declared:
- `com.ryanheise.audioservice.AudioService` (FGS mediaPlayback)
- `MediaButtonReceiver`

---

## 2) WebView / Custom Tabs / InAppWebView / url_launcher

| Mechanism | Present | Evidence |
|---|---|---|
| `url_launcher` | YES | Plugin + `WebViewActivity`; pigeon `launchUrl` / `openUrlInApp` |
| `webview_flutter` | YES | Plugin registered |
| `flutter_inappwebview` | YES | `InAppWebViewFlutterPlugin`, `InAppBrowserActivity` |
| Chrome Custom Tabs / TWA | YES | Manifest activities under `com.pichillilorenzo...chrome_custom_tabs` |
| Manifest queries | CustomTabsService + https VIEW | `AndroidManifest.xml` |

**When URLs open (platform capability, not cloak fork):**
- Andromo **LinkCard** / hub / about / privacy links via `url_launcher` or in-app browser
- Andromo **InternalWebView** / HTML5 game observer packages exist in Dart (`package:internal_web_view/...`, `Html5GameNavigationObserver`)
- `url_launcher` WebViewActivity loads Intent extra `url`:

```java
// io.flutter.plugins.urllauncher.WebViewActivity
String stringExtra = intent.getStringExtra("url");
this.f14228c.loadUrl(stringExtra, mapEmptyMap);
```

No evidence of launch-time branch that replaces the Quran audio app with an external betting offer based on a gate response.

Hardcoded user-facing URLs in `libapp.so`:
- `https://sites.google.com/view/salama-dev` (developer site)
- `https://play.google.com/store/apps/developer?id=SALAMA+dev`
- `https://play.google.com/store/apps/details?id=com.salamadev.nabilalawadi.kisaskoran`
- `https://builder.andromo.com/hub/c1e2365349b385c9a4b77ea7f068062a/` (Andromo hub)
- `https://sqz.andromo.com` (Andromo squeeze-page host — builder CDN, not a custom cloak API)

---

## 3) Ad networks & analytics

### Ads
| Network | Status | Evidence |
|---|---|---|
| **AdMob / Google Mobile Ads** | YES (active) | `com.google.android.gms.ads.APPLICATION_ID` = `ca-app-pub-9116501680612894~8466475890`; units `.../7482752623`, `.../9295345980`; UMP/GDPR plugins |
| StartApp | Meta stub only | `com.startapp.sdk.APPLICATION_ID` → empty `@string/startapp_app_id`; no StartApp package in sources |
| Facebook Audience Network | Reflection attempt only | Loaded in `AndromoApp`; SDK not shipped |

### Analytics / crash / messaging
| SDK | Status | Evidence |
|---|---|---|
| **Flurry** | YES | `flutter_flurry_sdk`, `cfg.flurry.com`, `data.flurry.com`, ContentProvider, FCM messaging service |
| **Sentry** | YES | DSN `https://6ca15572a6b04b1398847cc1dd82673d@o582999.ingest.sentry.io/5736739` |
| Firebase (Auth/Firestore/DB/Storage/Core) | Plugins present | `GeneratedPluginRegistrant`; `FirebaseInitProvider` |
| Firebase Analytics / GA | Weak/absent | DEX: “Found google_app_id in strings.xml but Google Analytics for Firebase is missing…”; no populated `google_app_id` in `strings.xml` |

---

## 4) Custom / unknown domains (non-large-SDK)

Hosts found in `libapp.so` / DEX / assets after excluding google/gstatic/googleapis/firebase/facebook/applovin/unity/android/chromium/cdn-large-SDK noise:

| Host | Role |
|---|---|
| `sqz.andromo.com` | Andromo squeeze / hosted web content base |
| `builder.andromo.com` | Andromo builder hub (`/hub/c1e2365349b385c9a4b77ea7f068062a/`) |
| `inapppurchase.andromo.com` | Andromo IAP verify endpoint |
| `inapppurchasestaging.andromo.com` | Staging IAP verify |
| `cfg.flurry.com` | Flurry remote config |
| `data.flurry.com` | Flurry event ingest |
| `o582999.ingest.sentry.io` | Sentry ingest |
| `sites.google.com` | Developer privacy/about (Sites) |
| `www.jsdelivr.com` | Referenced from bundled `error_page.css` (CSS vendor comment/url), not app gate |

**No** custom betting/affiliate/cloak domains (no 1xbet / clickid / offer-gate hosts) in code, assets, or `libapp.so`.

---

## 5) SharedPreferences / first launch / remote config

| Store | Purpose | Cloak-related? |
|---|---|---|
| `FlutterSharedPreferences` | Flutter `shared_preferences` plugin | Prefs for app settings / agreement — **no offer/cloak keys found** |
| Default prefs + `IABTCF_TCString` | GDPR UMP; `ump_outdate` plugin deletes TC string if >365 days | Consent hygiene only |
| `FLURRY_SHARED_PREFERENCES` / `advertising_id` / `ad_tracking_enabled` | Flurry GAID cache | Analytics SDK |
| `admob_user_agent` | AdMob UA cache | Ads SDK |
| Flutter secure storage | Plugin present | No cloak flags observed |
| AgreementDao / AgreementCubit | Terms acceptance UI (Andromo) | White-page legal dialog, not traffic fork |
| TrialCheckService | Andromo trial/premium helper symbol in Dart | No offer-URL response parsing found |
| Firebase Remote Config | **Not** present as a dedicated cloak module | — |

No SharedPreferences keys resembling `offer_url`, `cloak`, `is_white`, `whitelist`, `first_launch_offer`, etc. in `libapp.so` strings.

---

## 6) Gate / cloak logic

**Searched:** Application/Activity startup, network clients in app packages, `libapp.so` strings, prefs keys, Flutter packages, DEX hosts.

**Result: NO custom traffic gate.**

What exists instead:
1. **Normal Andromo app**: splash → dashboard → audio players (bundled Quran stories media).
2. **AdMob** interstitial/banner/native managers + GDPR consent.
3. **Flurry** device fingerprint for analytics/config (standard SDK), not used to choose offer vs white UI in app code.
4. **WebView stack** for Andromo link/HTML features and `sqz.andromo.com` hosted content — content feature, not “reviewer sees app / user sees betting URL” fork.

Flurry **does** collect GAID/locale/device (see §11) and POSTs to Flurry — that is **analytics**, not cloak branching.

---

## 7) Suspicious words

| Term | Found? | Context |
|---|---|---|
| cloak | only `com.devadvance.rootcloak(plus)` | **Sentry RootChecker** package-name list (root-hide apps), not traffic cloaking |
| offer | `OFFER_PRESENTED` enum-like DEX string | Adjacent media/OMID constants — not offer-gate logic |
| whitelist | `SAFE_BROWSING_WHITELIST` | WebView Safe Browsing API |
| blacklist / white page / clickid / affiliate / gambling / casino / betting / landing | **Not found** as app logic | — |
| redirect | HTTP/WebView/AdMob SDK redirects only | — |
| bot | no bot-detect / is_bot gate | — |
| 1xbet | **Not in binary** | Only folder/marketing label outside APK |

`rootcloak` evidence (`io/sentry/android/core/internal/util/RootChecker.java`):

```java
new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus",
  "com.koushikdutta.superuser", ...}
```

---

## 8) Kotlin / AGP versions

| Item | Value | Source |
|---|---|---|
| Android Gradle Plugin | **8.7.3** | `META-INF/com/android/build/gradle/app-metadata.properties` |
| Kotlin (Gradle plugin) | **2.1.0** | `kotlin-tooling-metadata.json` → `buildPluginVersion` |
| Gradle | 8.12 | same metadata `buildSystemVersion` |
| Java target | 17 | kotlin-tooling-metadata |

```
appMetadataVersion=1.1
androidGradlePluginVersion=8.7.3
```

---

## 9) Major libraries

- Flutter 3.32.7 + Dart AOT (`libapp.so` / `libflutter.so`)
- audio_service / just_audio / audio_session (Ryan Heise)
- google_mobile_ads (AdMob) + UMP
- flutter_flurry_sdk / Flurry Android SDK
- firebase_core / auth / firestore / database / storage (plugins)
- flutter_inappwebview + webview_flutter + url_launcher + AndroidX Browser (Custom Tabs)
- sentry_flutter
- shared_preferences / flutter_secure_storage / sqflite
- device_info_plus / package_info_plus / android_id / connectivity_plus / share_plus / path_provider
- permission_handler / ringtone_set / gdpr_dialog / ump_outdate (Andromo)
- jni (dart_lang)
- ExoPlayer / media stack (via audio)
- Andromo builder packages: `builder`, `builder_base`, `audio_player_activity`, `dashboard_activity`, `about_activity`, `internal_web_view`, `content_source`

---

## 10) Permissions (manifest + XAPK)

From `AndroidManifest.xml` / XAPK `manifest.json`:

- `android.permission.INTERNET`
- `android.permission.WRITE_SETTINGS`
- `android.permission.WRITE_EXTERNAL_STORAGE`
- `android.permission.READ_EXTERNAL_STORAGE` (listed in XAPK manifest.json)
- `android.permission.WAKE_LOCK`
- `android.permission.FOREGROUND_SERVICE`
- `android.permission.FOREGROUND_SERVICE_MEDIA_PLAYBACK`
- `com.google.android.gms.permission.AD_ID`
- `android.permission.ACCESS_NETWORK_STATE`
- `android.permission.ACCESS_ADSERVICES_AD_ID`
- `android.permission.ACCESS_ADSERVICES_ATTRIBUTION`
- `android.permission.ACCESS_ADSERVICES_TOPICS`
- `com.google.android.providers.gsf.permission.READ_GSERVICES`
- `com.salamadev.nabilalawadi.kisaskoran.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`

Also: `usesCleartextTraffic="true"` + network security config allowing cleartext globally (Andromo default).

---

## 11) Data collected and where sent

### A) Custom cloak gate
**None.** No custom request/response schema for white vs offer.

### B) Flurry (analytics / SDK config)
Endpoint examples:
- `https://cfg.flurry.com/sdk/v1/config`
- `https://data.flurry.com/v1/flr.do`

Config request fields (from `AbstractC1006k1` / Flurry parameter builder):

```text
apiKey, appVersion, appBuild, sdkVersion, platform, platformVersion,
deviceIds, deviceTags{brand, type, id, model, product, version_release},
bundleId, locale (lang_country), publisherUserId?, etag?, currentVariants?
```

GAID collection (`p155w1/C1048x.java`):

```java
AdvertisingIdClient.getAdvertisingIdInfo(...)
this.f17923z = ... getId ...
AbstractC0998i1.g("advertising_id", this.f17923z);
// FLURRY_SHARED_PREFERENCES ← ad_tracking_enabled
```

### C) AdMob
Standard Google ads traffic (`googleads.g.doubleclick.net`, `pagead2.googlesyndication.com`, fundingchoices UMP). Uses AD_ID permission. App ID `ca-app-pub-9116501680612894~8466475890`.

### D) Sentry
Crash/performance envelopes → `o582999.ingest.sentry.io` (DSN above). RootChecker package probes are local.

### E) Andromo endpoints
- Hub / IAP verify / `sqz.andromo.com` — platform services for Andromo-built apps, not a third-party cloak API under developer control with white/offer fork in this binary.

### F) device_info_plus / android_id / package_info_plus
Plugins registered; used for normal Andromo/device metadata — **no wiring found** that POSTs them to a custom gate and switches UI to an offer URL.

---

## CLOAK VERDICT (final)

| Question | Answer |
|---|---|
| Server-side fork offer URL vs white app? | **NO** |
| AdMob present? | YES |
| WebView / Custom Tabs present? | YES |
| Custom gate domains / request fields? | **NO** |
| **Cloak** | **NO** |

The folder/marketing name “1xbet'” is **not reflected** in APK logic or embedded betting URLs. The shipped product is an **Andromo Flutter Quran audio-stories app** with AdMob + Flurry + Sentry and standard in-app link/WebView features.
