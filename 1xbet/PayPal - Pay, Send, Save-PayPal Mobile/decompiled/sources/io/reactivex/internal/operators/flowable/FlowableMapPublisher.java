package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableMapPublisher<T, U> extends io.reactivex.Flowable<U> {
    final io.reactivex.functions.Function<? super T, ? extends U> Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<T> getHighSpeedVideoSizes;

    public FlowableMapPublisher(org.reactivestreams.Publisher<T> publisher, io.reactivex.functions.Function<? super T, ? extends U> function) {
        this.getHighSpeedVideoSizes = publisher;
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.flowable.FlowableMap.MapSubscriber(subscriber, this.Camera2StreamConfigurationMap));
    }
}
