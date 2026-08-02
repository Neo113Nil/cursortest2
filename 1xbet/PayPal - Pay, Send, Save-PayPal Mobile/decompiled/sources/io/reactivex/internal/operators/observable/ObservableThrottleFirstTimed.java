package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableThrottleFirstTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public ObservableThrottleFirstTimed(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed.DebounceTimedObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.createWorker()));
    }

    /* loaded from: classes17.dex */
    static final class DebounceTimedObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 786994795061867455L;
        volatile boolean Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getHighSpeedVideoSizesFor;
        final java.util.concurrent.TimeUnit getOutputFormats;

        DebounceTimedObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getOutputFormats = timeUnit;
            this.getHighSpeedVideoSizesFor = worker;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges.onNext(t);
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.disposables.DisposableHelper.replace(this, this.getHighSpeedVideoSizesFor.schedule(this, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats));
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Camera2StreamConfigurationMap = false;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRanges.onError(th);
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizesFor.isDisposed();
        }
    }
}
