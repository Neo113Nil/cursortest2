package androidx.camera.video.internal.compat.quirk;

/* loaded from: classes6.dex */
public class ExtraSupportedResolutionQuirk implements androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk {
    static boolean getHighSpeedVideoSizes() {
        return "motorola".equalsIgnoreCase(android.os.Build.BRAND) && "moto e5 play".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
