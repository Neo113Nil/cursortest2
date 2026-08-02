package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableLastMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public ObservableLastMaybe(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighSpeedVideoSizes = observableSource;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableLastMaybe.LastObserver(maybeObserver));
    }

    /* loaded from: classes17.dex */
    static final class LastObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        T getHighSpeedVideoFpsRangesFor;

        LastObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor = t;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            T t = this.getHighSpeedVideoFpsRangesFor;
            if (t != null) {
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }
    }
}
