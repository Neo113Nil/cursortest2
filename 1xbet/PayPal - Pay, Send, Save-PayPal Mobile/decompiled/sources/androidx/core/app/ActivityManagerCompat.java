package androidx.core.app;

/* loaded from: classes7.dex */
public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
    }

    @androidx.annotation.ReplaceWith(expression = "activityManager.isLowRamDevice()")
    @java.lang.Deprecated
    public static boolean isLowRamDevice(android.app.ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }
}
