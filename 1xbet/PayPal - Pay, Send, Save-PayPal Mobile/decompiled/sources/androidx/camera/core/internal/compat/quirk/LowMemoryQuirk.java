package androidx.camera.core.internal.compat.quirk;

/* loaded from: classes6.dex */
public class LowMemoryQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashSet(java.util.Arrays.asList("SM-A520W", "MOTOG3"));

    static boolean getHighSpeedVideoFpsRanges() {
        return getHighSpeedVideoFpsRanges.contains(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
