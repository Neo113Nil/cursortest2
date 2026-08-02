package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableLastSingle<T> extends io.reactivex.Single<T> {
    final io.reactivex.ObservableSource<T> Camera2StreamConfigurationMap;
    final T getHighSpeedVideoFpsRangesFor;

    public ObservableLastSingle(io.reactivex.ObservableSource<T> observableSource, T t) {
        this.Camera2StreamConfigurationMap = observableSource;
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.observable.ObservableLastSingle.LastObserver(singleObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class LastObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final T Camera2StreamConfigurationMap;
        T getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRangesFor;

        LastObserver(io.reactivex.SingleObserver<? super T> singleObserver, T t) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.Camera2StreamConfigurationMap = t;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            T t = this.getHighResolutionOutputSizeshNQ4ISI;
            if (t != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
                return;
            }
            T t2 = this.Camera2StreamConfigurationMap;
            if (t2 != null) {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(t2);
            } else {
                this.getHighSpeedVideoFpsRangesFor.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
