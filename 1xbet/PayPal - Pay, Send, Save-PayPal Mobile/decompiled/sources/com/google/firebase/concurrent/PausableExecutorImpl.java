package com.google.firebase.concurrent;

/* loaded from: classes9.dex */
final class PausableExecutorImpl implements com.google.firebase.concurrent.PausableExecutor {
    private final java.util.concurrent.Executor delegate;
    private volatile boolean paused;
    final java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> queue = new java.util.concurrent.LinkedBlockingQueue<>();

    PausableExecutorImpl(boolean z, java.util.concurrent.Executor executor) {
        this.paused = z;
        this.delegate = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    private void maybeEnqueueNext() {
        if (this.paused) {
            return;
        }
        while (true) {
            for (java.lang.Runnable poll = this.queue.poll(); poll != null; poll = null) {
                this.delegate.execute(poll);
                if (this.paused) {
                }
            }
            return;
        }
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void pause() {
        this.paused = true;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final void resume() {
        this.paused = false;
        maybeEnqueueNext();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public final boolean isPaused() {
        return this.paused;
    }
}
