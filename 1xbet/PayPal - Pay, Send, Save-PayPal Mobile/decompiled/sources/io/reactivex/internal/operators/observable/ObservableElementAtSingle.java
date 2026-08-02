package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableElementAtSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final T Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public ObservableElementAtSingle(io.reactivex.ObservableSource<T> observableSource, long j, T t) {
        this.getHighSpeedVideoSizes = observableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableElementAtSingle.ElementAtObserver(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<T> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableElementAt(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, true));
    }

    /* loaded from: classes17.dex */
    static final class ElementAtObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        boolean Camera2StreamConfigurationMap;
        final T getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;
        io.reactivex.disposables.Disposable getOutputMinFrameDuration;

        ElementAtObserver(io.reactivex.SingleObserver<? super T> singleObserver, long j, T t) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighResolutionOutputSizeshNQ4ISI = t;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputMinFrameDuration, disposable)) {
                this.getOutputMinFrameDuration = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getOutputMinFrameDuration.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputMinFrameDuration.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            long j = this.getHighSpeedVideoFpsRanges;
            if (j == this.getHighSpeedVideoFpsRangesFor) {
                this.Camera2StreamConfigurationMap = true;
                this.getOutputMinFrameDuration.dispose();
                this.getHighSpeedVideoSizes.onSuccess(t);
                return;
            }
            this.getHighSpeedVideoFpsRanges = j + 1;
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
            T t = this.getHighResolutionOutputSizeshNQ4ISI;
            if (t != null) {
                this.getHighSpeedVideoSizes.onSuccess(t);
            } else {
                this.getHighSpeedVideoSizes.onError(new java.util.NoSuchElementException());
            }
        }
    }
}
