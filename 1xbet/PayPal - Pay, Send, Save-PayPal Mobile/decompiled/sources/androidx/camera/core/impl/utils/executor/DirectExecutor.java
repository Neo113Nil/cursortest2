package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
final class DirectExecutor implements java.util.concurrent.Executor {
    private static volatile androidx.camera.core.impl.utils.executor.DirectExecutor Camera2StreamConfigurationMap;

    DirectExecutor() {
    }

    static java.util.concurrent.Executor getHighSpeedVideoFpsRanges() {
        if (Camera2StreamConfigurationMap != null) {
            return Camera2StreamConfigurationMap;
        }
        synchronized (androidx.camera.core.impl.utils.executor.DirectExecutor.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new androidx.camera.core.impl.utils.executor.DirectExecutor();
            }
        }
        return Camera2StreamConfigurationMap;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
