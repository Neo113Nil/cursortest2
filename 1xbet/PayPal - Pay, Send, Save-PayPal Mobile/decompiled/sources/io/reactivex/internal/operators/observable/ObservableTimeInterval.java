package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTimeInterval<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.schedulers.Timed<T>> {
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;

    public ObservableTimeInterval(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRanges = timeUnit;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableTimeInterval.TimeIntervalObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class TimeIntervalObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

        TimeIntervalObserver(io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> observer, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRangesFor = scheduler;
            this.getHighSpeedVideoSizes = timeUnit;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.now(this.getHighSpeedVideoSizes);
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long now = this.getHighSpeedVideoFpsRangesFor.now(this.getHighSpeedVideoSizes);
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = now;
            this.Camera2StreamConfigurationMap.onNext(new io.reactivex.schedulers.Timed(t, now - j, this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}
