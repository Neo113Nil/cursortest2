package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableTakePublisher<T> extends io.reactivex.Flowable<T> {
    final long Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<T> getHighSpeedVideoFpsRangesFor;

    public FlowableTakePublisher(org.reactivestreams.Publisher<T> publisher, long j) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableTake.TakeSubscriber(subscriber, this.Camera2StreamConfigurationMap));
    }
}
