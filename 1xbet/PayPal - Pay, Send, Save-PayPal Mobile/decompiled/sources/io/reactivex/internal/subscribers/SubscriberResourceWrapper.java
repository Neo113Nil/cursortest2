package io.reactivex.internal.subscribers;

/* loaded from: classes17.dex */
public final class SubscriberResourceWrapper<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable, org.reactivestreams.Subscription {
    private static final long serialVersionUID = -8612022020200669122L;
    final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();

    public SubscriberResourceWrapper(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighSpeedVideoFpsRangesFor, subscription)) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
            this.getHighSpeedVideoFpsRangesFor.get().request(j);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRangesFor);
        io.reactivex.internal.disposables.DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighSpeedVideoFpsRangesFor.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        dispose();
    }

    public final void setResource(io.reactivex.disposables.Disposable disposable) {
        io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
    }
}
