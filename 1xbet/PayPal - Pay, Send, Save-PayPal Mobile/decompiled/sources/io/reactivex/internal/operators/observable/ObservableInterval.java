package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableInterval extends io.reactivex.Observable<java.lang.Long> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;

    public ObservableInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        io.reactivex.internal.operators.observable.ObservableInterval.IntervalObserver intervalObserver = new io.reactivex.internal.operators.observable.ObservableInterval.IntervalObserver(observer);
        observer.onSubscribe(intervalObserver);
        io.reactivex.Scheduler scheduler = this.Camera2StreamConfigurationMap;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker createWorker = scheduler.createWorker();
            io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalObserver, createWorker);
            createWorker.schedulePeriodically(intervalObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
            return;
        }
        io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalObserver, scheduler.schedulePeriodicallyDirect(intervalObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class IntervalObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super java.lang.Long> getHighSpeedVideoSizes;

        IntervalObserver(io.reactivex.Observer<? super java.lang.Long> observer) {
            this.getHighSpeedVideoSizes = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.Observer<? super java.lang.Long> observer = this.getHighSpeedVideoSizes;
                long j = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = 1 + j;
                observer.onNext(java.lang.Long.valueOf(j));
            }
        }
    }
}
