package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableAllSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Boolean> {
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRangesFor;

    public ObservableAllSingle(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Predicate<? super T> predicate) {
        this.getHighSpeedVideoFpsRangesFor = observableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.observable.ObservableAllSingle.AllObserver(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<java.lang.Boolean> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableAll(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class AllObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Boolean> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoSizes;

        AllObserver(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, io.reactivex.functions.Predicate<? super T> predicate) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighSpeedVideoSizes = predicate;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            try {
                if (this.getHighSpeedVideoSizes.test(t)) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoFpsRanges.dispose();
                this.Camera2StreamConfigurationMap.onSuccess(java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.Camera2StreamConfigurationMap.onSuccess(java.lang.Boolean.TRUE);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }
    }
}
