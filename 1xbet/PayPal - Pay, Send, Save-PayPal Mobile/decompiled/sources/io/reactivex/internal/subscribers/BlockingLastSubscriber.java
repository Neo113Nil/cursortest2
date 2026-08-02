package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class BlockingLastSubscriber<T> extends io.reactivex.internal.subscribers.BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        this.getHighSpeedVideoSizes = t;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = th;
        countDown();
    }
}
