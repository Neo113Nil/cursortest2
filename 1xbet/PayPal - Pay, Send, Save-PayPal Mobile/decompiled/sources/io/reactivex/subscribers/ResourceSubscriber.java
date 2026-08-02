package io.reactivex.subscribers;

/* loaded from: classes17.dex */
public abstract class ResourceSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
    private final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
    private final io.reactivex.internal.disposables.ListCompositeDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.ListCompositeDisposable();
    private final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();

    public final void add(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(disposable, "resource is null");
        this.getHighSpeedVideoFpsRangesFor.add(disposable);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.getHighSpeedVideoFpsRanges, subscription, getClass())) {
            long andSet = this.getHighSpeedVideoSizes.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
            onStart();
        }
    }

    protected void onStart() {
        request(Long.MAX_VALUE);
    }

    protected final void request(long j) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, j);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges)) {
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(this.getHighSpeedVideoFpsRanges.get());
    }
}
