package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
final class IoExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.ExecutorService getHighSpeedVideoSizes = java.util.concurrent.Executors.newFixedThreadPool(2, new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.IoExecutor.1
        private final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName(java.lang.String.format(java.util.Locale.US, "CameraX-camerax_io_%d", java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.getAndIncrement())));
            return thread;
        }
    });

    IoExecutor() {
    }

    static java.util.concurrent.Executor Camera2StreamConfigurationMap() {
        if (getHighSpeedVideoFpsRanges != null) {
            return getHighSpeedVideoFpsRanges;
        }
        synchronized (androidx.camera.core.impl.utils.executor.IoExecutor.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.utils.executor.IoExecutor();
            }
        }
        return getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.getHighSpeedVideoSizes.execute(runnable);
    }
}
