package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class CameraUseInconsistentTimebaseQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet(java.util.Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = new java.util.HashSet(java.util.Arrays.asList("sm4350", "sm6375", "sm7325"));
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.HashSet(java.util.Arrays.asList("m2007j20cg", "m2007j20ct"));

    static boolean getHighSpeedVideoFpsRanges() {
        if (android.os.Build.VERSION.SDK_INT < 31 || !getHighSpeedVideoSizes.contains(android.os.Build.SOC_MODEL.toLowerCase())) {
            return ("SAMSUNG".equalsIgnoreCase(android.os.Build.BRAND) && getHighResolutionOutputSizeshNQ4ISI.contains(android.os.Build.HARDWARE.toLowerCase())) || getHighSpeedVideoFpsRangesFor.contains(android.os.Build.MODEL.toLowerCase());
        }
        return true;
    }
}
