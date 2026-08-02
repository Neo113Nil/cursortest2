package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatMapPublisher<T, R> extends io.reactivex.Flowable<R> {
    final org.reactivestreams.Publisher<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public FlowableConcatMapPublisher(org.reactivestreams.Publisher<T> publisher, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        this.Camera2StreamConfigurationMap = publisher;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = errorMode;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.Camera2StreamConfigurationMap, subscriber, this.getHighResolutionOutputSizeshNQ4ISI)) {
            return;
        }
        this.Camera2StreamConfigurationMap.subscribe(io.reactivex.internal.operators.flowable.FlowableConcatMap.subscribe(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
    }
}
