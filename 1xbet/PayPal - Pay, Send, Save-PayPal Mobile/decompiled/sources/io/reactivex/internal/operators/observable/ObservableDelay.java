package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDelay<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final long getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public ObservableDelay(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver(!this.getHighSpeedVideoFpsRangesFor ? new io.reactivex.observers.SerializedObserver(observer) : observer, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.createWorker(), this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class DelayObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getInputFormats;

        DelayObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoSizes = timeUnit;
            this.getInputFormats = worker;
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getInputFormats.schedule(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.OnNext(t), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getInputFormats.schedule(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.OnError(th), this.getHighSpeedVideoFpsRangesFor ? this.getHighSpeedVideoFpsRanges : 0L, this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getInputFormats.schedule(new io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.OnComplete(), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            this.getInputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputFormats.isDisposed();
        }

        final class OnNext implements java.lang.Runnable {
            private final T getHighSpeedVideoFpsRangesFor;

            OnNext(T t) {
                this.getHighSpeedVideoFpsRangesFor = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.getHighResolutionOutputSizeshNQ4ISI.onNext(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable getHighSpeedVideoSizes;

            OnError(java.lang.Throwable th) {
                this.getHighSpeedVideoSizes = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.getHighResolutionOutputSizeshNQ4ISI.onError(this.getHighSpeedVideoSizes);
                } finally {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.getInputFormats.dispose();
                }
            }
        }

        final class OnComplete implements java.lang.Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                } finally {
                    io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver.this.getInputFormats.dispose();
                }
            }
        }
    }
}
