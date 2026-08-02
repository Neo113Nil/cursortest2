package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleOnErrorReturn<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> Camera2StreamConfigurationMap;
    final T getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoSizes;

    public SingleOnErrorReturn(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function, T t) {
        this.getHighSpeedVideoSizes = singleSource;
        this.Camera2StreamConfigurationMap = function;
        this.getHighResolutionOutputSizeshNQ4ISI = t;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleOnErrorReturn.OnErrorReturn(singleObserver));
    }

    /* loaded from: classes17.dex */
    final class OnErrorReturn implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> getHighSpeedVideoFpsRangesFor;

        OnErrorReturn(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighSpeedVideoFpsRangesFor = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            T apply;
            if (io.reactivex.internal.operators.single.SingleOnErrorReturn.this.Camera2StreamConfigurationMap != null) {
                try {
                    apply = io.reactivex.internal.operators.single.SingleOnErrorReturn.this.Camera2StreamConfigurationMap.apply(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                    return;
                }
            } else {
                apply = io.reactivex.internal.operators.single.SingleOnErrorReturn.this.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (apply == null) {
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.getHighSpeedVideoFpsRangesFor.onError(nullPointerException);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.onSuccess(apply);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }
    }
}
