package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeTimer extends io.reactivex.Maybe<java.lang.Long> {
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoSizes;

    public MaybeTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Long> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeTimer.TimerDisposable timerDisposable = new io.reactivex.internal.operators.maybe.MaybeTimer.TimerDisposable(maybeObserver);
        maybeObserver.onSubscribe(timerDisposable);
        io.reactivex.internal.disposables.DisposableHelper.replace(timerDisposable, this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(timerDisposable, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class TimerDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 2875964065294031672L;
        final io.reactivex.MaybeObserver<? super java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;

        TimerDisposable(io.reactivex.MaybeObserver<? super java.lang.Long> maybeObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(0L);
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
