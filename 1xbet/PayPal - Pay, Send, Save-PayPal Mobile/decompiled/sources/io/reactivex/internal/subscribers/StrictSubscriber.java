package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public class StrictSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean Camera2StreamConfigurationMap;
    final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
    final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();
    final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean();

    public StrictSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRanges = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new java.lang.IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(java.lang.String.valueOf(j))));
        } else {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, j);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputMinFrameDuration);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
            this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new java.lang.IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        io.reactivex.internal.util.HalfSerializer.onNext(this.getHighSpeedVideoFpsRanges, t, this, this.getHighSpeedVideoSizes);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = true;
        io.reactivex.internal.util.HalfSerializer.onError(this.getHighSpeedVideoFpsRanges, th, this, this.getHighSpeedVideoSizes);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.Camera2StreamConfigurationMap = true;
        io.reactivex.internal.util.HalfSerializer.onComplete(this.getHighSpeedVideoFpsRanges, this, this.getHighSpeedVideoSizes);
    }
}
