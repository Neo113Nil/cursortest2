package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableNever extends io.reactivex.Flowable<java.lang.Object> {
    public static final io.reactivex.Flowable<java.lang.Object> INSTANCE = new io.reactivex.internal.operators.flowable.FlowableNever();

    private FlowableNever() {
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Object> subscriber) {
        subscriber.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
    }
}
