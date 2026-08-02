package com.google.firebase.concurrent;

/* loaded from: classes9.dex */
class LimitedConcurrencyExecutor implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor delegate;
    private final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> queue = new java.util.concurrent.LinkedBlockingQueue<>();
    private final java.util.concurrent.Semaphore semaphore;

    LimitedConcurrencyExecutor(java.util.concurrent.Executor executor, int i) {
        com.google.firebase.components.Preconditions.checkArgument(i > 0, "concurrency must be positive.");
        this.delegate = executor;
        this.semaphore = new java.util.concurrent.Semaphore(i, true);
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    private void maybeEnqueueNext() {
        while (this.semaphore.tryAcquire()) {
            java.lang.Runnable poll = this.queue.poll();
            if (poll != null) {
                this.delegate.execute(decorate(poll));
            } else {
                this.semaphore.release();
                return;
            }
        }
    }

    private java.lang.Runnable decorate(final java.lang.Runnable runnable) {
        return new java.lang.Runnable() { // from class: com.google.firebase.concurrent.LimitedConcurrencyExecutor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.concurrent.LimitedConcurrencyExecutor.this.m10434x96c64136(runnable);
            }
        };
    }

    /* renamed from: lambda$decorate$0$com-google-firebase-concurrent-LimitedConcurrencyExecutor, reason: not valid java name */
    /* synthetic */ void m10434x96c64136(java.lang.Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.semaphore.release();
            maybeEnqueueNext();
        }
    }
}
