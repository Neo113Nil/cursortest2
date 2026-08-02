package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.internal.util.ErrorMode Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    final org.reactivestreams.Publisher<T> getOutputMinFrameDuration;

    public FlowableConcatMapEagerPublisher(org.reactivestreams.Publisher<T> publisher, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, int i2, io.reactivex.internal.util.ErrorMode errorMode) {
        this.getOutputMinFrameDuration = publisher;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = errorMode;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.getOutputMinFrameDuration.subscribe(new io.reactivex.internal.operators.flowable.FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
    }
}
