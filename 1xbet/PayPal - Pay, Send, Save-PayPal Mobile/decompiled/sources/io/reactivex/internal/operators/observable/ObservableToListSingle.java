package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableToListSingle<T, U extends java.util.Collection<? super T>> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToObservable<U> {
    final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public ObservableToListSingle(io.reactivex.ObservableSource<T> observableSource, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        this.Camera2StreamConfigurationMap = io.reactivex.internal.functions.Functions.createArrayList(i);
    }

    public ObservableToListSingle(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<U> callable) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super U> singleObserver) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.observable.ObservableToListSingle.ToListObserver(singleObserver, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<U> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableToList(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class ToListObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        U getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super U> getHighSpeedVideoSizes;

        ToListObserver(io.reactivex.SingleObserver<? super U> singleObserver, U u) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRanges = u;
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
            this.getHighSpeedVideoFpsRanges.add(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            U u = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes.onSuccess(u);
        }
    }
}
