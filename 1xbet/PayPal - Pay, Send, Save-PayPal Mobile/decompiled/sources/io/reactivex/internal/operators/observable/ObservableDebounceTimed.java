package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDebounceTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public ObservableDebounceTimed(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.createWorker()));
    }

    /* loaded from: classes17.dex */
    static final class DebounceTimedObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final long Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        volatile long getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getHighSpeedVideoSizesFor;
        final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputFormats;

        DebounceTimedObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.Camera2StreamConfigurationMap = j;
            this.getInputSizeshNQ4ISI = timeUnit;
            this.getHighSpeedVideoSizesFor = worker;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRangesFor + 1;
            this.getHighSpeedVideoFpsRangesFor = j;
            io.reactivex.disposables.Disposable disposable = this.getOutputFormats;
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter debounceEmitter = new io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter(t, j, this);
            this.getOutputFormats = debounceEmitter;
            io.reactivex.internal.disposables.DisposableHelper.replace(debounceEmitter, this.getHighSpeedVideoSizesFor.schedule(debounceEmitter, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI));
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            io.reactivex.disposables.Disposable disposable = this.getOutputFormats;
            if (disposable != null) {
                disposable.dispose();
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            io.reactivex.disposables.Disposable disposable = this.getOutputFormats;
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter debounceEmitter = (io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizesFor.isDisposed();
        }
    }

    /* loaded from: classes17.dex */
    static final class DebounceEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long Camera2StreamConfigurationMap;
        final T getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();

        DebounceEmitter(T t, long j, io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> debounceTimedObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = debounceTimedObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> debounceTimedObserver = this.getHighSpeedVideoFpsRangesFor;
                long j = this.Camera2StreamConfigurationMap;
                T t = this.getHighResolutionOutputSizeshNQ4ISI;
                if (j == debounceTimedObserver.getHighSpeedVideoFpsRangesFor) {
                    debounceTimedObserver.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                    dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
