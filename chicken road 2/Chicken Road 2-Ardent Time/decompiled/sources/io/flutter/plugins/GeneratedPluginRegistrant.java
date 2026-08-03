package io.flutter.plugins;

@androidx.annotation.Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final java.lang.String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        try {
            flutterEngine.f7618d.a(new io.appmetrica.analytics.flutter.AppMetricaPlugin());
        } catch (java.lang.Exception e2) {
            android.util.Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e2);
        }
        try {
            flutterEngine.f7618d.a(new I0.a());
        } catch (java.lang.Exception e3) {
            android.util.Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e3);
        }
        try {
            flutterEngine.f7618d.a(new f1.J());
        } catch (java.lang.Exception e4) {
            android.util.Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e4);
        }
        try {
            flutterEngine.f7618d.a(new G0.c());
        } catch (java.lang.Exception e5) {
            android.util.Log.e(TAG, "Error registering plugin varioqub_plugin, com.yandex.varioqub.flutter.VarioqubPlugin", e5);
        }
    }
}
