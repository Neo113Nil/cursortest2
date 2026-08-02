package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableIntervalRange extends io.reactivex.Observable<java.lang.Long> {
    final long Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizesFor;

    public ObservableIntervalRange(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = j3;
        this.Camera2StreamConfigurationMap = j4;
        this.getHighSpeedVideoSizesFor = timeUnit;
        this.getHighSpeedVideoFpsRanges = scheduler;
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = j2;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Long> observer) {
        io.reactivex.internal.operators.observable.ObservableIntervalRange.IntervalRangeObserver intervalRangeObserver = new io.reactivex.internal.operators.observable.ObservableIntervalRange.IntervalRangeObserver(observer, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        observer.onSubscribe(intervalRangeObserver);
        io.reactivex.Scheduler scheduler = this.getHighSpeedVideoFpsRanges;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker createWorker = scheduler.createWorker();
            io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalRangeObserver, createWorker);
            createWorker.schedulePeriodically(intervalRangeObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor);
            return;
        }
        io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalRangeObserver, scheduler.schedulePeriodicallyDirect(intervalRangeObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor));
    }

    /* loaded from: classes17.dex */
    static final class IntervalRangeObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        final io.reactivex.Observer<? super java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        IntervalRangeObserver(io.reactivex.Observer<? super java.lang.Long> observer, long j, long j2) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRanges = j2;
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
            if (isDisposed()) {
                return;
            }
            long j = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(java.lang.Long.valueOf(j));
            if (j == this.getHighSpeedVideoFpsRanges) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            } else {
                this.getHighSpeedVideoSizes = j + 1;
            }
        }
    }
}
