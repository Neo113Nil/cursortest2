package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
public class AudioExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.ExecutorService getHighSpeedVideoSizes = java.util.concurrent.Executors.newFixedThreadPool(2, new androidx.camera.core.impl.utils.executor.AudioExecutor.AnonymousClass1());

    /* renamed from: androidx.camera.core.impl.utils.executor.AudioExecutor$1, reason: invalid class name */
    class AnonymousClass1 implements java.util.concurrent.ThreadFactory {
        private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(0);

        AnonymousClass1() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(final java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.AudioExecutor$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.utils.executor.AudioExecutor.AnonymousClass1.getHighSpeedVideoFpsRanges(runnable);
                }
            });
            thread.setName(java.lang.String.format(java.util.Locale.US, "CameraX-camerax_audio_%d", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRanges.getAndIncrement())));
            return thread;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(java.lang.Runnable runnable) {
            android.os.Process.setThreadPriority(-16);
            runnable.run();
        }
    }

    static java.util.concurrent.Executor getHighSpeedVideoSizes() {
        if (getHighSpeedVideoFpsRanges != null) {
            return getHighSpeedVideoFpsRanges;
        }
        synchronized (androidx.camera.core.impl.utils.executor.AudioExecutor.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.utils.executor.AudioExecutor();
            }
        }
        return getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.getHighSpeedVideoSizes.execute(runnable);
    }
}
