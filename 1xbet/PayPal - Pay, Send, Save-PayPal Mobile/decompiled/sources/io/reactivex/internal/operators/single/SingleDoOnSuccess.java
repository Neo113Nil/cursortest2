package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoOnSuccess<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRangesFor;

    public SingleDoOnSuccess(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super T> consumer) {
        this.getHighSpeedVideoFpsRangesFor = singleSource;
        this.getHighSpeedVideoFpsRanges = consumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.single.SingleDoOnSuccess.DoOnSuccess(singleObserver));
    }

    /* loaded from: classes17.dex */
    final class DoOnSuccess implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

        DoOnSuccess(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnSuccess.this.getHighSpeedVideoFpsRanges.accept(t);
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }
}
