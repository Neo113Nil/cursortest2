package io.flutter.plugins;

import I0.a;
import M0.f;
import M2.C0098b;
import N2.H;
import android.util.Log;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import com.onesignal.flutter.OneSignalPlugin;
import com.yandex.varioqub.flutter.VarioqubPlugin;
import io.appmetrica.analytics.flutter.AppMetricaPlugin;
import io.flutter.embedding.engine.FlutterEngine;
import l5.c;
import p2.C1381a;
import q2.C1388a;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.f10085d.a(new AppMetricaPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e3);
        }
        try {
            flutterEngine.f10085d.a(new c());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e6);
        }
        try {
            flutterEngine.f10085d.a(new C1381a());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e7);
        }
        try {
            flutterEngine.f10085d.a(new f());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin flutter_custom_tabs_android, com.github.droibit.flutter.plugins.customtabs.CustomTabsPlugin", e8);
        }
        try {
            flutterEngine.f10085d.a(new C0098b());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e9);
        }
        try {
            flutterEngine.f10085d.a(new JniPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e10);
        }
        try {
            flutterEngine.f10085d.a(new JniFlutterPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e11);
        }
        try {
            flutterEngine.f10085d.a(new C1388a());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin network_info_plus, dev.fluttercommunity.plus.network_info.NetworkInfoPlusPlugin", e12);
        }
        try {
            flutterEngine.f10085d.a(new OneSignalPlugin());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin onesignal_flutter, com.onesignal.flutter.OneSignalPlugin", e13);
        }
        try {
            flutterEngine.f10085d.a(new H());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e14);
        }
        try {
            flutterEngine.f10085d.a(new VarioqubPlugin());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin varioqub_plugin, com.yandex.varioqub.flutter.VarioqubPlugin", e15);
        }
        try {
            flutterEngine.f10085d.a(new a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin", e16);
        }
    }
}
