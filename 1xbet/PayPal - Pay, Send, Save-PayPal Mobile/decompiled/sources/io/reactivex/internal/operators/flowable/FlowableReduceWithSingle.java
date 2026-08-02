package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableReduceWithSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> Camera2StreamConfigurationMap;
    final java.util.concurrent.Callable<R> getHighSpeedVideoFpsRanges;
    final org.reactivestreams.Publisher<T> getHighSpeedVideoSizes;

    public FlowableReduceWithSingle(org.reactivestreams.Publisher<T> publisher, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        this.getHighSpeedVideoSizes = publisher;
        this.getHighSpeedVideoFpsRanges = callable;
        this.Camera2StreamConfigurationMap = biFunction;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super R> singleObserver) {
        try {
            this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.Camera2StreamConfigurationMap, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The seedSupplier returned a null value")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }
}
