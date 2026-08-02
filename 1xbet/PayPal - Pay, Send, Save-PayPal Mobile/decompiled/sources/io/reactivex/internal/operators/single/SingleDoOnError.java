package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleDoOnError<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleDoOnError(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer) {
        this.getHighSpeedVideoSizes = singleSource;
        this.Camera2StreamConfigurationMap = consumer;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.single.SingleDoOnError.DoOnError(singleObserver));
    }

    /* loaded from: classes17.dex */
    final class DoOnError implements io.reactivex.SingleObserver<T> {
        private final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        DoOnError(io.reactivex.SingleObserver<? super T> singleObserver) {
            this.getHighSpeedVideoSizes = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            try {
                io.reactivex.internal.operators.single.SingleDoOnError.this.Camera2StreamConfigurationMap.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.getHighSpeedVideoSizes.onError(th);
        }
    }
}
