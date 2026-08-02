package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableEmpty extends io.reactivex.Flowable<java.lang.Object> implements io.reactivex.internal.fuseable.ScalarCallable<java.lang.Object> {
    public static final io.reactivex.Flowable<java.lang.Object> INSTANCE = new io.reactivex.internal.operators.flowable.FlowableEmpty();

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final java.lang.Object call() {
        return null;
    }

    private FlowableEmpty() {
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Object> subscriber) {
        io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
    }
}
