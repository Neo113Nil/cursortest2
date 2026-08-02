package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSingleSingle<T> extends io.reactivex.Single<T> {
    final io.reactivex.ObservableSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final T getHighSpeedVideoFpsRangesFor;

    public ObservableSingleSingle(io.reactivex.ObservableSource<? extends T> observableSource, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.observable.ObservableSingleSingle.SingleElementObserver(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class SingleElementObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        T getHighSpeedVideoFpsRangesFor;
        final T getHighSpeedVideoSizes;

        SingleElementObserver(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighSpeedVideoSizes = t;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
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
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                this.Camera2StreamConfigurationMap.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = t;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            T t = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = null;
            if (t == null) {
                t = this.getHighSpeedVideoSizes;
            }
            if (t != null) {
                this.Camera2StreamConfigurationMap.onSuccess(t);
            } else {
                this.Camera2StreamConfigurationMap.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
