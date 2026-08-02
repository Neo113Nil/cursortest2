package androidx.camera.core.impl.utils.executor;

/* loaded from: classes6.dex */
final class SequentialExecutor implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    final java.util.Deque<java.lang.Runnable> getHighSpeedVideoSizes = new java.util.ArrayDeque();
    private final androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker();
    androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE;
    long getHighSpeedVideoFpsRangesFor = 0;

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    SequentialExecutor(java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoFpsRanges = (java.util.concurrent.Executor) androidx.core.util.Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final java.lang.Runnable runnable) {
        androidx.core.util.Preconditions.checkNotNull(runnable);
        synchronized (this.getHighSpeedVideoSizes) {
            if (this.Camera2StreamConfigurationMap != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING && this.Camera2StreamConfigurationMap != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED) {
                long j = this.getHighSpeedVideoFpsRangesFor;
                java.lang.Runnable runnable2 = new java.lang.Runnable() { // from class: androidx.camera.core.impl.utils.executor.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }
                };
                this.getHighSpeedVideoSizes.add(runnable2);
                this.Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING;
                try {
                    this.getHighSpeedVideoFpsRanges.execute(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (this.Camera2StreamConfigurationMap != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.getHighSpeedVideoSizes) {
                        if (this.getHighSpeedVideoFpsRangesFor == j && this.Camera2StreamConfigurationMap == androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING) {
                            this.Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (java.lang.Error | java.lang.RuntimeException e) {
                    synchronized (this.getHighSpeedVideoSizes) {
                        boolean z = (this.Camera2StreamConfigurationMap == androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE || this.Camera2StreamConfigurationMap == androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.QUEUING) && this.getHighSpeedVideoSizes.removeLastOccurrence(runnable2);
                        if (!(e instanceof java.util.concurrent.RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.getHighSpeedVideoSizes.add(runnable);
        }
    }

    final class QueueWorker implements java.lang.Runnable {
        QueueWorker() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                getHighSpeedVideoSizes();
            } catch (java.lang.Error e) {
                synchronized (androidx.camera.core.impl.utils.executor.SequentialExecutor.this.getHighSpeedVideoSizes) {
                    androidx.camera.core.impl.utils.executor.SequentialExecutor.this.Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            r4 = new java.lang.StringBuilder();
            r4.append("Exception while executing runnable ");
            r4.append(r3);
            androidx.camera.core.Logger.e("SequentialExecutor", r4.toString(), r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        
            r7.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.getHighSpeedVideoFpsRangesFor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
        
            if (r0 != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighSpeedVideoSizes() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                } catch (java.lang.Throwable th) {
                    if (z) {
                    }
                    throw th;
                }
                synchronized (androidx.camera.core.impl.utils.executor.SequentialExecutor.this.getHighSpeedVideoSizes) {
                    if (!z2) {
                        if (androidx.camera.core.impl.utils.executor.SequentialExecutor.this.Camera2StreamConfigurationMap != androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING) {
                            androidx.camera.core.impl.utils.executor.SequentialExecutor.this.getHighSpeedVideoFpsRangesFor++;
                            androidx.camera.core.impl.utils.executor.SequentialExecutor.this.Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.RUNNING;
                            z2 = true;
                        }
                    }
                    java.lang.Runnable poll = androidx.camera.core.impl.utils.executor.SequentialExecutor.this.getHighSpeedVideoSizes.poll();
                    if (poll == null) {
                        break;
                    }
                    if (z) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
                if (!z) {
                    return;
                }
            }
        }
    }
}
