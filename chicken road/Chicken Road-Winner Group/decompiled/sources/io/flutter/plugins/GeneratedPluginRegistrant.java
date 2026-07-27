package io.flutter.plugins;

import C1.a;
import G2.d;
import Y1.C0078b;
import a2.C0100J;
import android.util.Log;
import com.startapp.flutter.sdk.StartAppSdkPlugin;
import io.appmetrica.analytics.flutter.AppMetricaPlugin;
import io.flutter.embedding.engine.FlutterEngine;
import o0.b;
import r0.C1177d;

/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.f9101d.a(new AppMetricaPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e3);
        }
        try {
            flutterEngine.f9101d.a(new d());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e4);
        }
        try {
            flutterEngine.f9101d.a(new a());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e5);
        }
        try {
            flutterEngine.f9101d.a(new C1177d());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin flutter_custom_tabs_android, com.github.droibit.flutter.plugins.customtabs.CustomTabsPlugin", e6);
        }
        try {
            flutterEngine.f9101d.a(new C0078b());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e7);
        }
        try {
            flutterEngine.f9101d.a(new Z1.d());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e8);
        }
        try {
            flutterEngine.f9101d.a(new C0100J());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e9);
        }
        try {
            flutterEngine.f9101d.a(new StartAppSdkPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin startapp_sdk, com.startapp.flutter.sdk.StartAppSdkPlugin", e10);
        }
        try {
            flutterEngine.f9101d.a(new b());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin", e11);
        }
    }
}
