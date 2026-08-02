package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSampleTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public ObservableSampleTimed(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.observers.SerializedObserver serializedObserver = new io.reactivex.observers.SerializedObserver(observer);
        if (this.getHighSpeedVideoSizes) {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedEmitLast(serializedObserver, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        } else {
            this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedNoLast(serializedObserver, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class SampleTimedObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.Scheduler Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

        abstract void getHighSpeedVideoFpsRangesFor();

        SampleTimedObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getOutputMinFrameDuration = timeUnit;
            this.Camera2StreamConfigurationMap = scheduler;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                io.reactivex.Scheduler scheduler = this.Camera2StreamConfigurationMap;
                long j = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoSizesFor, scheduler.schedulePeriodicallyDirect(this, j, j, this.getOutputMinFrameDuration));
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            this.getHighSpeedVideoSizes.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleTimedNoLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(observer, j, timeUnit, scheduler);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.getHighSpeedVideoSizes.onNext(andSet);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleTimedEmitLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges;

        SampleTimedEmitLast(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(observer, j, timeUnit, scheduler);
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(1);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges.incrementAndGet() == 2) {
                T andSet = getAndSet(null);
                if (andSet != null) {
                    this.getHighSpeedVideoSizes.onNext(andSet);
                }
                if (this.getHighSpeedVideoFpsRanges.decrementAndGet() == 0) {
                    this.getHighSpeedVideoSizes.onComplete();
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        final void getHighSpeedVideoFpsRangesFor() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.getHighSpeedVideoSizes.onNext(andSet);
            }
            if (this.getHighSpeedVideoFpsRanges.decrementAndGet() == 0) {
                this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
