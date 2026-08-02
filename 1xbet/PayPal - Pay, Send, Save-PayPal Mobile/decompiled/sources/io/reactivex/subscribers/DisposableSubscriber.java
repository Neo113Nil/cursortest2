package io.reactivex.subscribers;

/* loaded from: classes17.dex */
public abstract class DisposableSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.util.EndConsumerHelper.setOnce(this.getInputSizeshNQ4ISI, subscription, getClass())) {
            onStart();
        }
    }

    protected void onStart() {
        this.getInputSizeshNQ4ISI.get().request(Long.MAX_VALUE);
    }

    protected final void request(long j) {
        this.getInputSizeshNQ4ISI.get().request(j);
    }

    protected final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getInputSizeshNQ4ISI.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getInputSizeshNQ4ISI);
    }
}
