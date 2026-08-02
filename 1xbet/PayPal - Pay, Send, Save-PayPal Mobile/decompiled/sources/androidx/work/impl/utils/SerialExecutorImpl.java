package androidx.work.impl.utils;

/* loaded from: classes3.dex */
public class SerialExecutorImpl implements androidx.work.impl.utils.taskexecutor.SerialExecutor {
    final java.util.concurrent.Executor getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Runnable getHighSpeedVideoFpsRanges;
    final java.util.ArrayDeque<androidx.work.impl.utils.SerialExecutorImpl.Task> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque<>();
    final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    public SerialExecutorImpl(java.util.concurrent.Executor executor) {
        this.getHighResolutionOutputSizeshNQ4ISI = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.add(new androidx.work.impl.utils.SerialExecutorImpl.Task(this, runnable));
            if (this.getHighSpeedVideoFpsRanges == null) {
                androidx.work.impl.utils.SerialExecutorImpl.Task poll = this.getHighSpeedVideoFpsRangesFor.poll();
                this.getHighSpeedVideoFpsRanges = poll;
                if (poll != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.execute(poll);
                }
            }
        }
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public boolean hasPendingTasks() {
        boolean isEmpty;
        synchronized (this.Camera2StreamConfigurationMap) {
            isEmpty = this.getHighSpeedVideoFpsRangesFor.isEmpty();
        }
        return !isEmpty;
    }

    public java.util.concurrent.Executor getDelegatedExecutor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    static class Task implements java.lang.Runnable {
        final androidx.work.impl.utils.SerialExecutorImpl getHighSpeedVideoFpsRanges;
        final java.lang.Runnable getHighSpeedVideoFpsRangesFor;

        Task(androidx.work.impl.utils.SerialExecutorImpl serialExecutorImpl, java.lang.Runnable runnable) {
            this.getHighSpeedVideoFpsRanges = serialExecutorImpl;
            this.getHighSpeedVideoFpsRangesFor = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.getHighSpeedVideoFpsRangesFor.run();
                synchronized (this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap) {
                    androidx.work.impl.utils.SerialExecutorImpl serialExecutorImpl = this.getHighSpeedVideoFpsRanges;
                    androidx.work.impl.utils.SerialExecutorImpl.Task poll = serialExecutorImpl.getHighSpeedVideoFpsRangesFor.poll();
                    serialExecutorImpl.getHighSpeedVideoFpsRanges = poll;
                    if (poll != null) {
                        serialExecutorImpl.getHighResolutionOutputSizeshNQ4ISI.execute(poll);
                    }
                }
            } catch (java.lang.Throwable th) {
                synchronized (this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap) {
                    androidx.work.impl.utils.SerialExecutorImpl serialExecutorImpl2 = this.getHighSpeedVideoFpsRanges;
                    androidx.work.impl.utils.SerialExecutorImpl.Task poll2 = serialExecutorImpl2.getHighSpeedVideoFpsRangesFor.poll();
                    serialExecutorImpl2.getHighSpeedVideoFpsRanges = poll2;
                    if (poll2 != null) {
                        serialExecutorImpl2.getHighResolutionOutputSizeshNQ4ISI.execute(poll2);
                    }
                    throw th;
                }
            }
        }
    }
}
