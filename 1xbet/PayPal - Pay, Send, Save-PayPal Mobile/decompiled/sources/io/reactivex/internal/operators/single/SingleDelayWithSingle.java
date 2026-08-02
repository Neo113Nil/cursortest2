package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDelayWithSingle<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<U> Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public SingleDelayWithSingle(io.reactivex.SingleSource<T> singleSource, io.reactivex.SingleSource<U> singleSource2) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.Camera2StreamConfigurationMap = singleSource2;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.single.SingleDelayWithSingle.OtherObserver(singleObserver, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class OtherObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRangesFor;

        OtherObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<T> singleSource) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = singleSource;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(U u) {
            this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.Camera2StreamConfigurationMap));
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
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
