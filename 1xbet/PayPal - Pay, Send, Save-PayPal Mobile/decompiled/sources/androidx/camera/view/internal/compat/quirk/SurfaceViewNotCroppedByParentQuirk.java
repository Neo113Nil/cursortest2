package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes6.dex */
public class SurfaceViewNotCroppedByParentQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRangesFor() {
        return "XIAOMI".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(android.os.Build.MODEL);
    }
}
