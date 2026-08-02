package androidx.arch.core.executor;

/* loaded from: classes.dex */
public class ArchTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private static volatile androidx.arch.core.executor.ArchTaskExecutor getHighSpeedVideoFpsRanges;
    private final androidx.arch.core.executor.TaskExecutor Camera2StreamConfigurationMap;
    private androidx.arch.core.executor.TaskExecutor getHighSpeedVideoFpsRangesFor;
    private static final java.util.concurrent.Executor getHighSpeedVideoSizes = new java.util.concurrent.Executor() { // from class: androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            androidx.arch.core.executor.ArchTaskExecutor.getInstance().postToMainThread(runnable);
        }
    };
    private static final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.Executor() { // from class: androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda1
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            androidx.arch.core.executor.ArchTaskExecutor.getInstance().executeOnDiskIO(runnable);
        }
    };

    private ArchTaskExecutor() {
        androidx.arch.core.executor.DefaultTaskExecutor defaultTaskExecutor = new androidx.arch.core.executor.DefaultTaskExecutor();
        this.Camera2StreamConfigurationMap = defaultTaskExecutor;
        this.getHighSpeedVideoFpsRangesFor = defaultTaskExecutor;
    }

    public static androidx.arch.core.executor.ArchTaskExecutor getInstance() {
        if (getHighSpeedVideoFpsRanges != null) {
            return getHighSpeedVideoFpsRanges;
        }
        synchronized (androidx.arch.core.executor.ArchTaskExecutor.class) {
            if (getHighSpeedVideoFpsRanges == null) {
                getHighSpeedVideoFpsRanges = new androidx.arch.core.executor.ArchTaskExecutor();
            }
        }
        return getHighSpeedVideoFpsRanges;
    }

    public void setDelegate(androidx.arch.core.executor.TaskExecutor taskExecutor) {
        if (taskExecutor == null) {
            taskExecutor = this.Camera2StreamConfigurationMap;
        }
        this.getHighSpeedVideoFpsRangesFor = taskExecutor;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRangesFor.executeOnDiskIO(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRangesFor.postToMainThread(runnable);
    }

    public static java.util.concurrent.Executor getMainThreadExecutor() {
        return getHighSpeedVideoSizes;
    }

    public static java.util.concurrent.Executor getIOThreadExecutor() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
        return this.getHighSpeedVideoFpsRangesFor.isMainThread();
    }
}
