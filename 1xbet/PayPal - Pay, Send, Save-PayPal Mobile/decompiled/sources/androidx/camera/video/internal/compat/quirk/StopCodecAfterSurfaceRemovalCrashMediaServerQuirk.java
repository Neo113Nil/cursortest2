package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class StopCodecAfterSurfaceRemovalCrashMediaServerQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRangesFor() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto c".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
