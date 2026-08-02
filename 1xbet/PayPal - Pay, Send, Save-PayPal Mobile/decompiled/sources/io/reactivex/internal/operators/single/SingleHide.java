package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleHide<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoSizes;

    public SingleHide(io.reactivex.SingleSource<? extends T> singleSource) {
        this.getHighSpeedVideoSizes = singleSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleHide.HideSingleObserver(singleObserver));
    }

    /* loaded from: classes17.dex */
    static final class HideSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        HideSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }
    }
}
