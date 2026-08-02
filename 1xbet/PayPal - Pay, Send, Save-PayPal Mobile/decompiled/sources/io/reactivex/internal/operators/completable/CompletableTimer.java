package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableTimer extends io.reactivex.Completable {
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public CompletableTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableTimer.TimerDisposable timerDisposable = new io.reactivex.internal.operators.completable.CompletableTimer.TimerDisposable(completableObserver);
        completableObserver.onSubscribe(timerDisposable);
        io.reactivex.internal.disposables.DisposableHelper.replace(timerDisposable, this.getHighSpeedVideoSizes.scheduleDirect(timerDisposable, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class TimerDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3167244060586201109L;
        final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        TimerDisposable(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoSizes = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
