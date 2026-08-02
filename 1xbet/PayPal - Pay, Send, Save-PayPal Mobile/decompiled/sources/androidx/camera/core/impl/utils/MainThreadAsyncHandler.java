package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class MainThreadAsyncHandler {
    private static volatile android.os.Handler getHighSpeedVideoSizes;

    public static android.os.Handler getInstance() {
        if (getHighSpeedVideoSizes != null) {
            return getHighSpeedVideoSizes;
        }
        synchronized (androidx.camera.core.impl.utils.MainThreadAsyncHandler.class) {
            if (getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());
            }
        }
        return getHighSpeedVideoSizes;
    }

    private MainThreadAsyncHandler() {
    }
}
