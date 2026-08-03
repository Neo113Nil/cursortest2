package androidx.work.impl.utils.taskexecutor;

/* loaded from: classes2.dex */
public class WorkManagerTaskExecutor implements androidx.work.impl.utils.taskexecutor.TaskExecutor {
    private final androidx.work.impl.utils.SerialExecutorImpl mBackgroundExecutor;
    final android.os.Handler mMainThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.util.concurrent.Executor mMainThreadExecutor = new java.util.concurrent.Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable command) {
            androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.this.mMainThreadHandler.post(command);
        }
    };

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public /* synthetic */ void executeOnTaskThread(java.lang.Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    public WorkManagerTaskExecutor(java.util.concurrent.Executor backgroundExecutor) {
        this.mBackgroundExecutor = new androidx.work.impl.utils.SerialExecutorImpl(backgroundExecutor);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public java.util.concurrent.Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public androidx.work.impl.utils.SerialExecutorImpl getSerialTaskExecutor() {
        return this.mBackgroundExecutor;
    }
}
