package io.reactivex.subscribers;

/* loaded from: classes17.dex */
public abstract class DefaultSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
    private org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.util.EndConsumerHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription, getClass())) {
            this.getHighSpeedVideoFpsRangesFor = subscription;
            onStart();
        }
    }

    protected final void request(long j) {
        org.reactivestreams.Subscription subscription = this.getHighSpeedVideoFpsRangesFor;
        if (subscription != null) {
            subscription.request(j);
        }
    }

    protected final void cancel() {
        org.reactivestreams.Subscription subscription = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        subscription.cancel();
    }

    protected void onStart() {
        request(Long.MAX_VALUE);
    }
}
