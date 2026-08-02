package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableCollectSingle<T, U> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToObservable<U> {
    final java.util.concurrent.Callable<? extends U> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighSpeedVideoFpsRanges;

    public ObservableCollectSingle(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends U> callable, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        this.Camera2StreamConfigurationMap = callable;
        this.getHighSpeedVideoFpsRanges = biConsumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super U> singleObserver) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.observable.ObservableCollectSingle.CollectObserver(singleObserver, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The initialSupplier returned a null value"), this.getHighSpeedVideoFpsRanges));
        } catch (java.lang.Throwable th) {
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<U> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableCollect(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class CollectObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super U> getHighSpeedVideoFpsRangesFor;
        final U getHighSpeedVideoSizes;

        CollectObserver(io.reactivex.SingleObserver<? super U> singleObserver, U u, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
            this.getHighSpeedVideoSizes = u;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(this.getHighSpeedVideoSizes, t);
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRanges.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.onSuccess(this.getHighSpeedVideoSizes);
        }
    }
}
