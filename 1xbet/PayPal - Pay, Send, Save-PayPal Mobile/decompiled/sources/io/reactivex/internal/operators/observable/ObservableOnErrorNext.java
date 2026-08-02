package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableOnErrorNext<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> getHighSpeedVideoSizes;

    public ObservableOnErrorNext(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableOnErrorNext.OnErrorNextObserver onErrorNextObserver = new io.reactivex.internal.operators.observable.ObservableOnErrorNext.OnErrorNextObserver(observer, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        observer.onSubscribe(onErrorNextObserver.getHighSpeedVideoSizes);
        this.source.subscribe(onErrorNextObserver);
    }

    /* loaded from: classes17.dex */
    static final class OnErrorNextObserver<T> implements io.reactivex.Observer<T> {
        final boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizes = new io.reactivex.internal.disposables.SequentialDisposable();
        boolean getOutputFormats;

        OnErrorNextObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> function, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getHighSpeedVideoFpsRangesFor = function;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.replace(disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats) {
                if (this.getHighSpeedVideoFpsRanges) {
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    return;
                }
            }
            this.getOutputFormats = true;
            if (this.Camera2StreamConfigurationMap && !(th instanceof java.lang.Exception)) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                return;
            }
            try {
                io.reactivex.ObservableSource<? extends T> apply = this.getHighSpeedVideoFpsRangesFor.apply(th);
                if (apply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(nullPointerException);
                    return;
                }
                apply.subscribe(this);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputFormats = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }
}
