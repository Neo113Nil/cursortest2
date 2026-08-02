package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFlatMapPublisher<T, U> extends io.reactivex.Flowable<U> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    final org.reactivestreams.Publisher<T> getInputFormats;

    public FlowableFlatMapPublisher(org.reactivestreams.Publisher<T> publisher, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
        this.getInputFormats = publisher;
        this.Camera2StreamConfigurationMap = function;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.getInputFormats, subscriber, this.Camera2StreamConfigurationMap)) {
            return;
        }
        this.getInputFormats.subscribe(io.reactivex.internal.operators.flowable.FlowableFlatMap.subscribe(subscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
    }
}
