package com.alexmercerind.media_kit_video;

import android.os.Build;
import androidx.core.os.EnvironmentCompat;
import io.flutter.Log;

/* loaded from: classes3.dex */
public abstract class Utils {
    private static final String TAG = "Utils";

    public static boolean isEmulator() {
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                return true;
            }
            String str = Build.FINGERPRINT;
            if (str.startsWith("generic") || str.startsWith(EnvironmentCompat.MEDIA_UNKNOWN)) {
                return true;
            }
            String str2 = Build.HARDWARE;
            if (str2.contains("goldfish") || str2.contains("ranchu")) {
                return true;
            }
            String str3 = Build.MODEL;
            if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                return true;
            }
            String str4 = Build.PRODUCT;
            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator")) {
                return true;
            }
            return str4.contains("simulator");
        } catch (Throwable th) {
            Log.e(TAG, "isEmulator", th);
            return false;
        }
    }
}
