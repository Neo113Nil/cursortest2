package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableReduceSeedSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> Camera2StreamConfigurationMap;
    final R getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public ObservableReduceSeedSingle(io.reactivex.ObservableSource<T> observableSource, R r, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.getHighSpeedVideoSizes = observableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = r;
        this.Camera2StreamConfigurationMap = biFunction;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class ReduceSeedObserver<T, R> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.BiFunction<R, ? super T, R> Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super R> getHighResolutionOutputSizeshNQ4ISI;
        R getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        ReduceSeedObserver(io.reactivex.SingleObserver<? super R> singleObserver, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            this.getHighSpeedVideoFpsRanges = r;
            this.Camera2StreamConfigurationMap = biFunction;
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
            R r = this.getHighSpeedVideoFpsRanges;
            if (r != null) {
                try {
                    this.getHighSpeedVideoFpsRanges = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(r, t), "The reducer returned a null value");
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getHighSpeedVideoSizes.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges != null) {
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            R r = this.getHighSpeedVideoFpsRanges;
            if (r != null) {
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(r);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }
    }
}
