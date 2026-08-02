package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableOnErrorReturn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> getHighSpeedVideoFpsRangesFor;

    public ObservableOnErrorReturn(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableOnErrorReturn.OnErrorReturnObserver(observer, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class OnErrorReturnObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        OnErrorReturnObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
            this.getHighSpeedVideoSizes = observer;
            this.Camera2StreamConfigurationMap = function;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            try {
                T apply = this.Camera2StreamConfigurationMap.apply(th);
                if (apply == null) {
                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.getHighSpeedVideoSizes.onError(nullPointerException);
                } else {
                    this.getHighSpeedVideoSizes.onNext(apply);
                    this.getHighSpeedVideoSizes.onComplete();
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
