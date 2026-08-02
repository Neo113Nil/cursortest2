package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableCountSingle<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Long> {
    final io.reactivex.ObservableSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableCountSingle(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.observable.ObservableCountSingle.CountObserver(singleObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<java.lang.Long> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableCount(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class CountObserver implements io.reactivex.Observer<java.lang.Object>, io.reactivex.disposables.Disposable {
        long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.SingleObserver<? super java.lang.Long> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        CountObserver(io.reactivex.SingleObserver<? super java.lang.Long> singleObserver) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Long.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        }
    }
}
