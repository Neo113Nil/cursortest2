package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDelayWithCompletable<T> extends io.reactivex.Single<T> {
    final io.reactivex.CompletableSource getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRanges;

    public SingleDelayWithCompletable(io.reactivex.SingleSource<T> singleSource, io.reactivex.CompletableSource completableSource) {
        this.getHighSpeedVideoFpsRanges = singleSource;
        this.getHighResolutionOutputSizeshNQ4ISI = completableSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleDelayWithCompletable.OtherObserver(singleObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

        OtherObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<T> singleSource) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighSpeedVideoSizes = singleSource;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.observers.ResumeSingleObserver(this, this.Camera2StreamConfigurationMap));
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
