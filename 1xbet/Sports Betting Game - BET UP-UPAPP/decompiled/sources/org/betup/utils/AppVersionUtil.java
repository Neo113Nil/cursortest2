package org.betup.utils;

import android.os.Build;
import java.util.Locale;
import org.betup.BuildConfig;

/* loaded from: classes4.dex */
public class AppVersionUtil {
    private AppVersionUtil() {
    }

    public static String getAppVersion() {
        return String.format(Locale.getDefault(), "android (%s/%d)", BuildConfig.VERSION_NAME, Integer.valueOf(BuildConfig.VERSION_CODE));
    }

    public static String getDeviceInfo() {
        StringBuilder sb = new StringBuilder("Manufacturer: ");
        sb.append(Build.MANUFACTURER).append("\nModel: ");
        sb.append(Build.MODEL).append("\nDevice: ");
        sb.append(Build.DEVICE).append("\nAndroid Version: ");
        sb.append(Build.VERSION.RELEASE).append("\nSDK: ");
        sb.append(Build.VERSION.SDK_INT).append("\nApp Version: 3.3.5 (3606)\nLocale: ");
        sb.append(Locale.getDefault().toString());
        return sb.toString();
    }
}
