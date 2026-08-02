package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
final class Utils {
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    Utils() {
    }

    public static boolean getHighSpeedVideoSizes(java.lang.String str) {
        return Camera2StreamConfigurationMap.matcher(str).matches();
    }
}
