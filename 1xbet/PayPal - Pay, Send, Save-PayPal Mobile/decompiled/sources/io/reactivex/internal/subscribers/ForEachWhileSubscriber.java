package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class ForEachWhileSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
    private static final long serialVersionUID = -4403180040475402120L;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;

    public ForEachWhileSubscriber(io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer, io.reactivex.functions.Action action) {
        this.getHighSpeedVideoFpsRanges = predicate;
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoFpsRangesFor = action;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        try {
            if (this.getHighSpeedVideoFpsRanges.test(t)) {
                return;
            }
            dispose();
            onComplete();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            dispose();
            onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        try {
            this.Camera2StreamConfigurationMap.accept(th);
        } catch (java.lang.Throwable th2) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        try {
            this.getHighSpeedVideoFpsRangesFor.run();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(get());
    }
}
