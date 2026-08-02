package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleContains<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.SingleSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.Object getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> getHighSpeedVideoSizes;

    public SingleContains(io.reactivex.SingleSource<T> singleSource, java.lang.Object obj, io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> biPredicate) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes = biPredicate;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleContains.Single(singleObserver));
    }

    /* loaded from: classes17.dex */
    final class Single implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoFpsRanges;

        Single(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
            this.getHighSpeedVideoFpsRanges = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                this.getHighSpeedVideoFpsRanges.onSuccess(java.lang.Boolean.valueOf(io.reactivex.internal.operators.single.SingleContains.this.getHighSpeedVideoSizes.test(t, io.reactivex.internal.operators.single.SingleContains.this.getHighSpeedVideoFpsRanges)));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }
    }
}
