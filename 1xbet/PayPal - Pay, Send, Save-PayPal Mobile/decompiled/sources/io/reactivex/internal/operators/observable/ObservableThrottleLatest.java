package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableThrottleLatest<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public ObservableThrottleLatest(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(observable);
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableThrottleLatest.ThrottleLatestObserver(observer, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.createWorker(), this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class ThrottleLatestObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        volatile boolean getHighSpeedVideoSizesFor;
        final java.util.concurrent.TimeUnit getInputFormats;
        final long getInputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<T> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        boolean getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputStallDuration;

        ThrottleLatestObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, boolean z) {
            this.Camera2StreamConfigurationMap = observer;
            this.getInputSizeshNQ4ISI = j;
            this.getInputFormats = timeUnit;
            this.getOutputSizeshNQ4ISI = worker;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputStallDuration, disposable)) {
                this.getOutputStallDuration = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getOutputFormats.set(t);
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputStallDuration.dispose();
            this.getOutputSizeshNQ4ISI.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputFormats.lazySet(null);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoSizesFor = true;
            getHighSpeedVideoFpsRanges();
        }

        private void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                java.util.concurrent.atomic.AtomicReference<T> atomicReference = this.getOutputFormats;
                io.reactivex.Observer<? super T> observer = this.Camera2StreamConfigurationMap;
                int i = 1;
                while (!this.getHighSpeedVideoFpsRangesFor) {
                    boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (z && this.getHighSpeedVideoSizes != null) {
                        atomicReference.lazySet(null);
                        observer.onError(this.getHighSpeedVideoSizes);
                        this.getOutputSizeshNQ4ISI.dispose();
                        return;
                    }
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        T andSet = atomicReference.getAndSet(null);
                        if (!z2 && this.getHighSpeedVideoFpsRanges) {
                            observer.onNext(andSet);
                        }
                        observer.onComplete();
                        this.getOutputSizeshNQ4ISI.dispose();
                        return;
                    }
                    if (z2) {
                        if (this.getHighSpeedVideoSizesFor) {
                            this.getOutputMinFrameDuration = false;
                            this.getHighSpeedVideoSizesFor = false;
                        }
                    } else if (!this.getOutputMinFrameDuration || this.getHighSpeedVideoSizesFor) {
                        observer.onNext(atomicReference.getAndSet(null));
                        this.getHighSpeedVideoSizesFor = false;
                        this.getOutputMinFrameDuration = true;
                        this.getOutputSizeshNQ4ISI.schedule(this, this.getInputSizeshNQ4ISI, this.getInputFormats);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }
}
