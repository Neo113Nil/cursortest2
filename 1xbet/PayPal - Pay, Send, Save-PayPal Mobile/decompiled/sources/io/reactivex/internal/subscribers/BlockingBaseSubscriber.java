package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public abstract class BlockingBaseSubscriber<T> extends java.util.concurrent.CountDownLatch implements io.reactivex.FlowableSubscriber<T> {
    java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
    volatile boolean getHighSpeedVideoFpsRangesFor;
    T getHighSpeedVideoSizes;

    public BlockingBaseSubscriber() {
        super(1);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
            this.getHighSpeedVideoFpsRanges = subscription;
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            subscription.request(Long.MAX_VALUE);
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                subscription.cancel();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking();
                await();
            } catch (java.lang.InterruptedException e) {
                org.reactivestreams.Subscription subscription = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(e);
            }
        }
        java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
        if (th != null) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
        return this.getHighSpeedVideoSizes;
    }
}
