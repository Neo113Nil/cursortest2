package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
final class MainThreadExecutor {
    private static volatile java.util.concurrent.ScheduledExecutorService Camera2StreamConfigurationMap;

    private MainThreadExecutor() {
    }

    static java.util.concurrent.ScheduledExecutorService Camera2StreamConfigurationMap() {
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        synchronized (androidx.camera.core.impl.utils.executor.MainThreadExecutor.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService(new android.os.Handler(android.os.Looper.getMainLooper()));
            }
        }
        return Camera2StreamConfigurationMap;
    }
}
