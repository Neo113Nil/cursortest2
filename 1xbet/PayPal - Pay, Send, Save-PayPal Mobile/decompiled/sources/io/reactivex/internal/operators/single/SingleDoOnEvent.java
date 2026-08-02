package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoOnEvent<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> getHighSpeedVideoSizes;

    public SingleDoOnEvent(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.BiConsumer<? super T, ? super java.lang.Throwable> biConsumer) {
        this.getHighSpeedVideoFpsRangesFor = singleSource;
        this.getHighSpeedVideoSizes = biConsumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.single.SingleDoOnEvent.DoOnEvent(singleObserver));
    }

    /* loaded from: classes17.dex */
    final class DoOnEvent implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

        DoOnEvent(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnEvent.this.getHighSpeedVideoSizes.accept(t, null);
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnEvent.this.getHighSpeedVideoSizes.accept(null, th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }
}
