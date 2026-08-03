package com.google.common.util.concurrent;

@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class SequentialExecutor implements java.util.concurrent.Executor {
    private static final com.google.common.util.concurrent.LazyLogger log = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.SequentialExecutor.class);
    private final java.util.concurrent.Executor executor;
    private final java.util.Deque<java.lang.Runnable> queue = new java.util.ArrayDeque();
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
    public void execute(final java.lang.Runnable task) {
        com.google.common.base.Preconditions.checkNotNull(task);
        synchronized (this.queue) {
            if (this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING && this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED) {
                long j = this.workerRunCount;
                java.lang.Runnable runnable = new java.lang.Runnable(this) { // from class: com.google.common.util.concurrent.SequentialExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        task.run();
                    }

                    public java.lang.String toString() {
                        return task.toString();
                    }
                };
                this.queue.add(runnable);
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
                        boolean z = (this.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE || this.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) && this.queue.removeLastOccurrence(runnable);
                        if (!(th instanceof java.util.concurrent.RejectedExecutionException) || z) {
                            throw th;
                        }
                        return;
                    }
                }
            }
            this.queue.add(task);
        }
    }

    private final class QueueWorker implements java.lang.Runnable {

        @javax.annotation.CheckForNull
        java.lang.Runnable task;

        private QueueWorker() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                workOnQueue();
            } catch (java.lang.Error e) {
                synchronized (com.google.common.util.concurrent.SequentialExecutor.this.queue) {
                    com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            r8.task.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            com.google.common.util.concurrent.SequentialExecutor.log.get().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.task, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
        
            r8.task = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void workOnQueue() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (com.google.common.util.concurrent.SequentialExecutor.this.queue) {
                        if (!z) {
                            if (com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING) {
                                com.google.common.util.concurrent.SequentialExecutor.access$308(com.google.common.util.concurrent.SequentialExecutor.this);
                                com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING;
                                z = true;
                            }
                        }
                        java.lang.Runnable runnable = (java.lang.Runnable) com.google.common.util.concurrent.SequentialExecutor.this.queue.poll();
                        this.task = runnable;
                        if (runnable == null) {
                            com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE;
                        }
                    }
                    if (z2) {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } finally {
                    if (z2) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public java.lang.String toString() {
            java.lang.Runnable runnable = this.task;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + com.google.common.util.concurrent.SequentialExecutor.this.workerRunningState + "}";
        }
    }

    public java.lang.String toString() {
        return "SequentialExecutor@" + java.lang.System.identityHashCode(this) + "{" + this.executor + "}";
    }
}
