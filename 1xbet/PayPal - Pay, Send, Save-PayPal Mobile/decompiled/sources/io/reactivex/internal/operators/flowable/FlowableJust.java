package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableJust<T> extends io.reactivex.Flowable<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    private final T Camera2StreamConfigurationMap;

    public FlowableJust(T t) {
        this.Camera2StreamConfigurationMap = t;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new io.reactivex.internal.subscriptions.ScalarSubscription(subscriber, this.Camera2StreamConfigurationMap));
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public final T call() {
        return this.Camera2StreamConfigurationMap;
    }
}
