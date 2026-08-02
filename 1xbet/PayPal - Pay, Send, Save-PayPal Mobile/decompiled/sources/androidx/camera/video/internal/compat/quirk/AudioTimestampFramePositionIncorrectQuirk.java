package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class AudioTimestampFramePositionIncorrectQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.asList("cph1920", "cph1923", "cph2015", "cph2083");

    static boolean getHighSpeedVideoFpsRanges() {
        if ("oppo".equalsIgnoreCase(android.os.Build.BRAND) && getHighResolutionOutputSizeshNQ4ISI.contains(android.os.Build.MODEL.toLowerCase(java.util.Locale.ROOT))) {
            return true;
        }
        if ("lge".equalsIgnoreCase(android.os.Build.BRAND) && "lg-m250".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto c".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("realme".equalsIgnoreCase(android.os.Build.BRAND) && "rmx1941".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if ("Xiaomi".equalsIgnoreCase(android.os.Build.BRAND) && "Redmi 6A".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        if (com.adjust.sdk.Constants.REFERRER_API_VIVO.equalsIgnoreCase(android.os.Build.BRAND) && "vivo 1820".equalsIgnoreCase(android.os.Build.MODEL)) {
            return true;
        }
        return com.adjust.sdk.Constants.REFERRER_API_VIVO.equalsIgnoreCase(android.os.Build.BRAND) && "VIVO Y17".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
