package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public final class LargeJpegImageQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> Camera2StreamConfigurationMap = new java.util.HashSet(java.util.Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = new java.util.HashSet(java.util.Arrays.asList("V2244A", "V2045", "V2046"));

    private static boolean getHighSpeedVideoFpsRanges() {
        return "Vivo".equalsIgnoreCase(android.os.Build.BRAND) && getHighSpeedVideoSizes.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    static boolean Camera2StreamConfigurationMap() {
        return "Samsung".equalsIgnoreCase(android.os.Build.BRAND) || getHighSpeedVideoFpsRanges();
    }

    public final boolean shouldCheckInvalidJpegData(byte[] bArr) {
        return ("Samsung".equalsIgnoreCase(android.os.Build.BRAND) && Camera2StreamConfigurationMap.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US))) || getHighSpeedVideoFpsRanges() || bArr.length > 10000000;
    }
}
