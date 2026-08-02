package dagger.hilt.android.internal;

/* loaded from: classes17.dex */
public final class ThreadUtil {
    private static java.lang.Thread Camera2StreamConfigurationMap;

    private ThreadUtil() {
    }

    public static boolean isMainThread() {
        if (Camera2StreamConfigurationMap == null) {
            Camera2StreamConfigurationMap = android.os.Looper.getMainLooper().getThread();
        }
        return java.lang.Thread.currentThread() == Camera2StreamConfigurationMap;
    }

    public static void ensureMainThread() {
        if (!isMainThread()) {
            throw new java.lang.IllegalStateException("Must be called on the Main thread.");
        }
    }
}
