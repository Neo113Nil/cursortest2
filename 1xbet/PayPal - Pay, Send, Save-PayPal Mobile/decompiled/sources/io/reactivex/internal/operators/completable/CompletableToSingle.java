package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableToSingle<T> extends io.reactivex.Single<T> {
    final java.util.concurrent.Callable<? extends T> Camera2StreamConfigurationMap;
    final io.reactivex.CompletableSource getHighResolutionOutputSizeshNQ4ISI;
    final T getHighSpeedVideoFpsRanges;

    public CompletableToSingle(io.reactivex.CompletableSource completableSource, java.util.concurrent.Callable<? extends T> callable, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = completableSource;
        this.getHighSpeedVideoFpsRanges = t;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.completable.CompletableToSingle.ToSingle(singleObserver));
    }

    /* loaded from: classes17.dex */
    final class ToSingle implements io.reactivex.CompletableObserver {
        private final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

        ToSingle(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            T call;
            if (io.reactivex.internal.operators.completable.CompletableToSingle.this.Camera2StreamConfigurationMap != null) {
                try {
                    call = io.reactivex.internal.operators.completable.CompletableToSingle.this.Camera2StreamConfigurationMap.call();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    return;
                }
            } else {
                call = io.reactivex.internal.operators.completable.CompletableToSingle.this.getHighSpeedVideoFpsRanges;
            }
            if (call == null) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new java.lang.NullPointerException("The value supplied is null"));
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(call);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(disposable);
        }
    }
}
