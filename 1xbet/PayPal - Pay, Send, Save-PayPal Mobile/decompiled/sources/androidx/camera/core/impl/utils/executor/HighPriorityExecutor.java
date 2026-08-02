package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
final class HighPriorityExecutor implements java.util.concurrent.Executor {
    private static volatile java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
    private final java.util.concurrent.ExecutorService getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.Executors.newSingleThreadExecutor(new java.util.concurrent.ThreadFactory() { // from class: androidx.camera.core.impl.utils.executor.HighPriorityExecutor.1
        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    });

    HighPriorityExecutor() {
    }

    static java.util.concurrent.Executor getHighSpeedVideoFpsRanges() {
        if (getHighSpeedVideoFpsRangesFor != null) {
            return getHighSpeedVideoFpsRangesFor;
        }
        synchronized (androidx.camera.core.impl.utils.executor.HighPriorityExecutor.class) {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = new androidx.camera.core.impl.utils.executor.HighPriorityExecutor();
            }
        }
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.getHighResolutionOutputSizeshNQ4ISI.execute(runnable);
    }
}
