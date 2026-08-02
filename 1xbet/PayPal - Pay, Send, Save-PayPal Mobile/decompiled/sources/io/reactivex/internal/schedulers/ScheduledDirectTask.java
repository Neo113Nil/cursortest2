package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
public final class ScheduledDirectTask extends io.reactivex.internal.schedulers.AbstractDirectTask implements java.util.concurrent.Callable<java.lang.Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final /* bridge */ /* synthetic */ java.lang.Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public ScheduledDirectTask(java.lang.Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Void call() throws java.lang.Exception {
        this.runner = java.lang.Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(FINISHED);
            this.runner = null;
        }
    }
}
