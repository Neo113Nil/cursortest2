package io.flutter.plugins;

import E5.C0188f;
import G5.d;
import H5.e;
import L5.V;
import P5.L;
import Q5.f;
import R5.f0;
import android.util.Log;
import androidx.annotation.Keep;
import com.github.dart_lang.jni.JniPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import io.sentry.flutter.SentryFlutterPlugin;
import p043f5.g;
import p049g5.l;
import p064i5.k;
import p076k5.a;
import p084l5.c;
import p128r5.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(b bVar) {
        try {
            bVar.f16040d.b(new a());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin android_id, dev.fluttercommunity.android_id.AndroidIdPlugin", e7);
        }
        try {
            bVar.f16040d.b(new p035e5.a());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e8);
        }
        try {
            bVar.f16040d.b(new l());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin audio_service, com.ryanheise.audioservice.AudioServicePlugin", e9);
        }
        try {
            bVar.f16040d.b(new g());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e10);
        }
        try {
            bVar.f16040d.b(new e());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e11);
        }
        try {
            bVar.f16040d.b(new c());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e12);
        }
        try {
            bVar.f16040d.b(new p092m5.a());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e13);
        }
        try {
            bVar.f16040d.b(new C0188f());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e14);
        }
        try {
            bVar.f16040d.b(new F5.c());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e15);
        }
        try {
            bVar.f16040d.b(new d());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin firebase_database, io.flutter.plugins.firebase.database.FirebaseDatabasePlugin", e16);
        }
        try {
            bVar.f16040d.b(new K5.b());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e17);
        }
        try {
            bVar.f16040d.b(new v1.e());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin flutter_flurry_sdk, com.flurry.android.flutter.FlurryFlutterPlugin", e18);
        }
        try {
            bVar.f16040d.b(new InAppWebViewFlutterPlugin());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e19);
        }
        try {
            bVar.f16040d.b(new p019c5.c());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e20);
        }
        try {
            bVar.f16040d.b(new T5.a());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e21);
        }
        try {
            bVar.f16040d.b(new y1.a());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin gdpr_dialog, com.gmail.antonmolchan00.gdpr_dialog.GdprDialogPlugin", e22);
        }
        try {
            bVar.f16040d.b(new V());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e23);
        }
        try {
            bVar.f16040d.b(new JniPlugin());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e24);
        }
        try {
            bVar.f16040d.b(new p057h5.e());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e25);
        }
        try {
            bVar.f16040d.b(new p099n5.a());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e26);
        }
        try {
            bVar.f16040d.b(new O5.d());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e27);
        }
        try {
            bVar.f16040d.b(new p138t1.b());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e28);
        }
        try {
            bVar.f16040d.b(new p009b.a());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin ringtone_set, acr.rt.ringtone_set.RingtoneSetPlugin", e29);
        }
        try {
            bVar.f16040d.b(new SentryFlutterPlugin());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin sentry_flutter, io.sentry.flutter.SentryFlutterPlugin", e30);
        }
        try {
            bVar.f16040d.b(new p107o5.a());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e31);
        }
        try {
            bVar.f16040d.b(new L());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e32);
        }
        try {
            bVar.f16040d.b(new k());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e33);
        }
        try {
            bVar.f16040d.b(new p131s1.a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin ump_outdate, com.andromo.ump_outdate.UmpOutdatePlugin", e34);
        }
        try {
            bVar.f16040d.b(new f());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e35);
        }
        try {
            bVar.f16040d.b(new f0());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e36);
        }
    }
}
