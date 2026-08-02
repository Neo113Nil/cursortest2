package com.google.common.util.concurrent;

/* loaded from: classes4.dex */
final class SequentialExecutor implements java.util.concurrent.Executor {
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.SequentialExecutor.class);
    private final java.util.concurrent.Executor executor;
    private final java.util.Deque<java.lang.Runnable> queue = new java.util.ArrayDeque();

    @com.google.errorprone.annotations.concurrent.LazyInit
    private com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE;
    private long workerRunCount = 0;
    private final com.google.common.util.concurrent.SequentialExecutor.QueueWorker worker = new com.google.common.util.concurrent.SequentialExecutor.QueueWorker();

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long access$308(com.google.common.util.concurrent.SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    SequentialExecutor(java.util.concurrent.Executor executor) {
        this.executor = (java.util.concurrent.Executor) com.google.common.base.Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final java.lang.Runnable runnable) {
        com.google.common.base.Preconditions.checkNotNull(runnable);
        synchronized (this.queue) {
            if (this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING && this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED) {
                long j = this.workerRunCount;
                java.lang.Runnable runnable2 = new java.lang.Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                    final /* synthetic */ com.google.common.util.concurrent.SequentialExecutor this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        runnable.run();
                    }

                    public java.lang.String toString() {
                        return runnable.toString();
                    }
                };
                this.queue.add(runnable2);
                this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING;
                try {
                    this.executor.execute(this.worker);
                    if (this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) {
                        return;
                    }
                    synchronized (this.queue) {
                        if (this.workerRunCount == j && this.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) {
                            this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED;
                        }
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    synchronized (this.queue) {
                        boolean z = (this.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE || this.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) && this.queue.removeLastOccurrence(runnable2);
                        if (!(th instanceof java.util.concurrent.RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            this.queue.add(runnable);
        }
    }

    final class QueueWorker implements java.lang.Runnable {
        java.lang.Runnable task;

        private QueueWorker() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                workOnQueue();
            } catch (java.lang.Error e) {
                synchronized (com.google.common.util.concurrent.SequentialExecutor.this.queue) {
                    com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        
            r4 = com.google.common.util.concurrent.SequentialExecutor.log.get();
            r5 = java.util.logging.Level.SEVERE;
            r6 = new java.lang.StringBuilder();
            r6.append("Exception while executing runnable ");
            r6.append(r8.task);
            r4.log(r5, r6.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
        
            r8.this$0.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
        
            if (r0 != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void workOnQueue() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                } catch (java.lang.Throwable th) {
                    if (z) {
                    }
                    throw th;
                }
                synchronized (com.google.common.util.concurrent.SequentialExecutor.this.queue) {
                    if (!z2) {
                        if (com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING) {
                            com.google.common.util.concurrent.SequentialExecutor.access$308(com.google.common.util.concurrent.SequentialExecutor.this);
                            com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING;
                            z2 = true;
                        }
                    }
                    java.lang.Runnable runnable = (java.lang.Runnable) com.google.common.util.concurrent.SequentialExecutor.this.queue.poll();
                    this.task = runnable;
                    if (runnable == null) {
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
                this.task = null;
            }
            java.lang.Thread.currentThread().interrupt();
        }

        public final java.lang.String toString() {
            java.lang.Runnable runnable = this.task;
            if (runnable != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SequentialExecutorWorker{running=");
                sb.append(runnable);
                sb.append("}");
                return sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SequentialExecutorWorker{state=");
            sb2.append(com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SequentialExecutor@");
        sb.append(java.lang.System.identityHashCode(this));
        sb.append("{");
        sb.append(this.executor);
        sb.append("}");
        return sb.toString();
    }
}
