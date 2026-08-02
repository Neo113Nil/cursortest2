package io.reactivex.internal.schedulers;

/* loaded from: classes3.dex */
public final class ImmediateThinScheduler extends io.reactivex.Scheduler {
    public static final io.reactivex.Scheduler INSTANCE = new io.reactivex.internal.schedulers.ImmediateThinScheduler();
    static final io.reactivex.Scheduler.Worker getHighSpeedVideoFpsRanges = new io.reactivex.internal.schedulers.ImmediateThinScheduler.ImmediateThinWorker();
    static final io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

    static {
        io.reactivex.disposables.Disposable empty = io.reactivex.disposables.Disposables.empty();
        getHighSpeedVideoFpsRangesFor = empty;
        empty.dispose();
    }

    private ImmediateThinScheduler() {
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable) {
        runnable.run();
        return getHighSpeedVideoFpsRangesFor;
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.disposables.Disposable schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        throw new java.lang.UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    @Override // io.reactivex.Scheduler
    public final io.reactivex.Scheduler.Worker createWorker() {
        return getHighSpeedVideoFpsRanges;
    }

    /* loaded from: classes17.dex */
    static final class ImmediateThinWorker extends io.reactivex.Scheduler.Worker {
        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return false;
        }

        ImmediateThinWorker() {
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable) {
            runnable.run();
            return io.reactivex.internal.schedulers.ImmediateThinScheduler.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            throw new java.lang.UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.Scheduler.Worker
        public final io.reactivex.disposables.Disposable schedulePeriodically(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
            throw new java.lang.UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }
    }
}
