package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSingleMaybe<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    public ObservableSingleMaybe(io.reactivex.ObservableSource<T> observableSource) {
        this.getHighSpeedVideoSizes = observableSource;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableSingleMaybe.SingleElementObserver(maybeObserver));
    }

    /* loaded from: classes17.dex */
    static final class SingleElementObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        T Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        SingleElementObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoSizes = maybeObserver;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.Camera2StreamConfigurationMap != null) {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoFpsRangesFor.dispose();
                this.getHighSpeedVideoSizes.onError(new java.lang.IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.Camera2StreamConfigurationMap = t;
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            T t = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            if (t == null) {
                this.getHighSpeedVideoSizes.onComplete();
            } else {
                this.getHighSpeedVideoSizes.onSuccess(t);
            }
        }
    }
}
