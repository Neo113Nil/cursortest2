package androidx.work.impl.utils;

/* loaded from: classes2.dex */
public class SerialExecutorImpl implements androidx.work.impl.utils.taskexecutor.SerialExecutor {
    private java.lang.Runnable mActive;
    private final java.util.concurrent.Executor mExecutor;
    private final java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutorImpl.Task> mTasks = new java.util.ArrayDeque<>();
    final java.lang.Object mLock = new java.lang.Object();

    public SerialExecutorImpl(java.util.concurrent.Executor executor) {
        this.mExecutor = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable command) {
        synchronized (this.mLock) {
            this.mTasks.add(new androidx.work.impl.utils.SerialExecutorImpl.Task(this, command));
            if (this.mActive == null) {
                scheduleNext();
            }
        }
    }

    void scheduleNext() {
        androidx.work.impl.utils.SerialExecutorImpl.Task poll = this.mTasks.poll();
        this.mActive = poll;
        if (poll != null) {
            this.mExecutor.execute(poll);
        }
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        boolean z;
        synchronized (this.mLock) {
            z = !this.mTasks.isEmpty();
        }
        return z;
    }

    public java.util.concurrent.Executor getDelegatedExecutor() {
        return this.mExecutor;
    }

    static class Task implements java.lang.Runnable {
        final java.lang.Runnable mRunnable;
        final androidx.work.impl.utils.SerialExecutorImpl mSerialExecutor;

        Task(androidx.work.impl.utils.SerialExecutorImpl serialExecutor, java.lang.Runnable runnable) {
            this.mSerialExecutor = serialExecutor;
            this.mRunnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mRunnable.run();
                synchronized (this.mSerialExecutor.mLock) {
                    this.mSerialExecutor.scheduleNext();
                }
            } catch (java.lang.Throwable th) {
                synchronized (this.mSerialExecutor.mLock) {
                    this.mSerialExecutor.scheduleNext();
                    throw th;
                }
            }
        }
    }
}
