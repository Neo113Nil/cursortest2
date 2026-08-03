package com.adjust.sdk.scheduler;

/* loaded from: classes2.dex */
public class SingleThreadCachedScheduler implements com.adjust.sdk.scheduler.ThreadScheduler {
    private java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
    private final java.util.List<java.lang.Runnable> queue = new java.util.ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    public SingleThreadCachedScheduler(final java.lang.String str) {
        this.threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.adjust.sdk.scheduler.ThreadFactoryWrapper(str), new java.util.concurrent.RejectedExecutionHandler() { // from class: com.adjust.sdk.scheduler.SingleThreadCachedScheduler.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                com.adjust.sdk.AdjustFactory.getLogger().warn("Runnable [%s] rejected from [%s] ", runnable.toString(), str);
            }
        });
    }

    private void processQueue(final java.lang.Runnable runnable) {
        this.threadPoolExecutor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.scheduler.SingleThreadCachedScheduler.3
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.Runnable runnable2;
                com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable);
                while (true) {
                    synchronized (com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue) {
                        if (com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.isTeardown) {
                            return;
                        }
                        if (com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue.isEmpty()) {
                            com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.isThreadProcessing = false;
                            return;
                        } else {
                            runnable2 = (java.lang.Runnable) com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue.get(0);
                            com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.queue.remove(0);
                        }
                    }
                    com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.tryExecuteRunnable(runnable2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(java.lang.Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (java.lang.Throwable th) {
            com.adjust.sdk.AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(final java.lang.Runnable runnable, final long j) {
        synchronized (this.queue) {
            if (this.isTeardown) {
                return;
            }
            this.threadPoolExecutor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.scheduler.SingleThreadCachedScheduler.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        java.lang.Thread.sleep(j);
                    } catch (java.lang.InterruptedException e) {
                        com.adjust.sdk.AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
                    }
                    com.adjust.sdk.scheduler.SingleThreadCachedScheduler.this.submit(runnable);
                }
            });
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(java.lang.Runnable runnable) {
        synchronized (this.queue) {
            if (this.isTeardown) {
                return;
            }
            if (this.isThreadProcessing) {
                this.queue.add(runnable);
            } else {
                this.isThreadProcessing = true;
                processQueue(runnable);
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
