package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDelayWithObservable<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.ObservableSource<U> getHighSpeedVideoFpsRanges;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleDelayWithObservable(io.reactivex.SingleSource<T> singleSource, io.reactivex.ObservableSource<U> observableSource) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighSpeedVideoFpsRanges = observableSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.single.SingleDelayWithObservable.OtherSubscriber(singleObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class OtherSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        OtherSubscriber(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<T> singleSource) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = singleSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.set(this, disposable)) {
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u) {
            get().dispose();
            onComplete();
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
            this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
