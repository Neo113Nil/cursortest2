package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleTimer extends io.reactivex.Single<java.lang.Long> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public SingleTimer(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        io.reactivex.internal.operators.single.SingleTimer.TimerDisposable timerDisposable = new io.reactivex.internal.operators.single.SingleTimer.TimerDisposable(singleObserver);
        singleObserver.onSubscribe(timerDisposable);
        io.reactivex.internal.disposables.DisposableHelper.replace(timerDisposable, this.getHighSpeedVideoFpsRangesFor.scheduleDirect(timerDisposable, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class TimerDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8465401857522493082L;
        final io.reactivex.SingleObserver<? super java.lang.Long> getHighSpeedVideoFpsRangesFor;

        TimerDisposable(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(0L);
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
