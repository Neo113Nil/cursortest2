package androidx.camera.view.internal.compat.quirk;

/* loaded from: classes6.dex */
public class SurfaceViewStretchedQuirk implements androidx.camera.core.impl.Quirk {
    static boolean getHighSpeedVideoFpsRanges() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return false;
        }
        if ("SAMSUNG".equalsIgnoreCase(android.os.Build.MANUFACTURER) && ("F2Q".equalsIgnoreCase(android.os.Build.DEVICE) || "Q2Q".equalsIgnoreCase(android.os.Build.DEVICE))) {
            return true;
        }
        if ("OPPO".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(android.os.Build.DEVICE)) {
            return true;
        }
        return "LENOVO".equalsIgnoreCase(android.os.Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(android.os.Build.DEVICE);
    }
}
