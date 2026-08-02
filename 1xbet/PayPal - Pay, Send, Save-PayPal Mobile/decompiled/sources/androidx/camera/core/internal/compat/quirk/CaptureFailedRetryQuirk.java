package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public class CaptureFailedRetryQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<android.util.Pair<java.lang.String, java.lang.String>> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet(java.util.Collections.singletonList(android.util.Pair.create("SAMSUNG", "SM-G981U1")));

    public int getRetryCount() {
        return 1;
    }

    static boolean getHighSpeedVideoSizes() {
        return getHighResolutionOutputSizeshNQ4ISI.contains(android.util.Pair.create(android.os.Build.BRAND.toUpperCase(java.util.Locale.US), android.os.Build.MODEL.toUpperCase(java.util.Locale.US)));
    }
}
