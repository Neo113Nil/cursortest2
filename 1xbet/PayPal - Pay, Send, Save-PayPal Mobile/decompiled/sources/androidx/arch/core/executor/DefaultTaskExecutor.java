package androidx.arch.core.executor;

/* loaded from: classes3.dex */
public class DefaultTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private final java.util.concurrent.ExecutorService getHighSpeedVideoFpsRanges = java.util.concurrent.Executors.newFixedThreadPool(4, new java.util.concurrent.ThreadFactory() { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1
        private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("arch_disk_io_");
            sb.append(this.getHighSpeedVideoFpsRanges.getAndIncrement());
            thread.setName(sb.toString());
            return thread;
        }
    });
    private volatile android.os.Handler getHighSpeedVideoSizes;

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRanges.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable runnable) {
        if (this.getHighSpeedVideoSizes == null) {
            synchronized (this.Camera2StreamConfigurationMap) {
                if (this.getHighSpeedVideoSizes == null) {
                    this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor(android.os.Looper.getMainLooper());
                }
            }
        }
        this.getHighSpeedVideoSizes.post(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    private static android.os.Handler getHighSpeedVideoFpsRangesFor(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.arch.core.executor.DefaultTaskExecutor.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(looper);
        }
        try {
            return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(looper);
        } catch (java.lang.reflect.InvocationTargetException unused2) {
            return new android.os.Handler(looper);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        public static android.os.Handler getHighResolutionOutputSizeshNQ4ISI(android.os.Looper looper) {
            return android.os.Handler.createAsync(looper);
        }
    }
}
