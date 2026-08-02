package io.reactivex.internal.subscriptions;

/* loaded from: classes17.dex */
public final class AsyncSubscription extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = 7028635084060361255L;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighResolutionOutputSizeshNQ4ISI;

    public AsyncSubscription() {
        this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
    }

    public AsyncSubscription(io.reactivex.disposables.Disposable disposable) {
        this();
        this.Camera2StreamConfigurationMap.lazySet(disposable);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getHighResolutionOutputSizeshNQ4ISI, this, j);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.Camera2StreamConfigurationMap);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    public final boolean setResource(io.reactivex.disposables.Disposable disposable) {
        return io.reactivex.internal.disposables.DisposableHelper.set(this.Camera2StreamConfigurationMap, disposable);
    }

    public final boolean replaceResource(io.reactivex.disposables.Disposable disposable) {
        return io.reactivex.internal.disposables.DisposableHelper.replace(this.Camera2StreamConfigurationMap, disposable);
    }

    public final void setSubscription(org.reactivestreams.Subscription subscription) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getHighResolutionOutputSizeshNQ4ISI, this, subscription);
    }
}
