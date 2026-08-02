package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes3.dex */
public class WorkManagerTaskExecutor implements androidx.work.impl.utils.taskexecutor.TaskExecutor {
    private final androidx.work.impl.utils.SerialExecutorImpl getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizes;
    final android.os.Handler getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.Executor Camera2StreamConfigurationMap = new java.util.concurrent.Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable runnable) {
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.this.getHighResolutionOutputSizeshNQ4ISI.post(runnable);
        }
    };

    public WorkManagerTaskExecutor(java.util.concurrent.Executor executor) {
        androidx.work.impl.utils.SerialExecutorImpl serialExecutorImpl = new androidx.work.impl.utils.SerialExecutorImpl(executor);
        this.getHighSpeedVideoFpsRanges = serialExecutorImpl;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.ExecutorsKt.from(serialExecutorImpl);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public java.util.concurrent.Executor getMainThreadExecutor() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public androidx.work.impl.utils.SerialExecutorImpl getSerialTaskExecutor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public kotlinx.coroutines.CoroutineDispatcher getTaskCoroutineDispatcher() {
        return this.getHighSpeedVideoSizes;
    }
}
