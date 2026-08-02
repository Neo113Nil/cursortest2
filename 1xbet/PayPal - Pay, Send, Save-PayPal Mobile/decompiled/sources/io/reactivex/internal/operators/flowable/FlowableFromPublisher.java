package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFromPublisher<T> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoSizes;

    public FlowableFromPublisher(org.reactivestreams.Publisher<? extends T> publisher) {
        this.getHighSpeedVideoSizes = publisher;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoSizes.subscribe(subscriber);
    }
}
