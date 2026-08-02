package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableDebounce<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableDebounce(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
        super(observableSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class DebounceObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        volatile long getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> getHighSpeedVideoSizes;
        io.reactivex.disposables.Disposable getOutputFormats;

        DebounceObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoSizes = function;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputFormats, disposable)) {
                this.getOutputFormats = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRanges + 1;
            this.getHighSpeedVideoFpsRanges = j;
            io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoFpsRangesFor.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t), "The ObservableSource supplied is null");
                io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver debounceInnerObserver = new io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver(this, j, t);
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, disposable, debounceInnerObserver)) {
                    observableSource.subscribe(debounceInnerObserver);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoFpsRangesFor.get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver debounceInnerObserver = (io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver) disposable;
                if (debounceInnerObserver.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                    io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> debounceObserver = debounceInnerObserver.getHighSpeedVideoSizes;
                    long j = debounceInnerObserver.getHighSpeedVideoFpsRangesFor;
                    T t = debounceInnerObserver.getHighSpeedVideoFpsRanges;
                    if (j == debounceObserver.getHighSpeedVideoFpsRanges) {
                        debounceObserver.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                    }
                }
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getOutputFormats.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputFormats.isDisposed();
        }

        static final class DebounceInnerObserver<T, U> extends io.reactivex.observers.DisposableObserver<U> {
            boolean Camera2StreamConfigurationMap;
            final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
            final T getHighSpeedVideoFpsRanges;
            final long getHighSpeedVideoFpsRangesFor;
            final io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> getHighSpeedVideoSizes;

            DebounceInnerObserver(io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> debounceObserver, long j, T t) {
                this.getHighSpeedVideoSizes = debounceObserver;
                this.getHighSpeedVideoFpsRangesFor = j;
                this.getHighSpeedVideoFpsRanges = t;
            }

            @Override // io.reactivex.Observer
            public final void onNext(U u) {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                dispose();
                getHighSpeedVideoFpsRanges();
            }

            private void getHighSpeedVideoFpsRanges() {
                if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                    io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> debounceObserver = this.getHighSpeedVideoSizes;
                    long j = this.getHighSpeedVideoFpsRangesFor;
                    T t = this.getHighSpeedVideoFpsRanges;
                    if (j == debounceObserver.getHighSpeedVideoFpsRanges) {
                        debounceObserver.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                    }
                }
            }

            @Override // io.reactivex.Observer
            public final void onError(java.lang.Throwable th) {
                if (this.Camera2StreamConfigurationMap) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoSizes.onError(th);
                }
            }

            @Override // io.reactivex.Observer
            public final void onComplete() {
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                getHighSpeedVideoFpsRanges();
            }
        }
    }
}
