package io.reactivex.internal.subscribers;

/* loaded from: classes3.dex */
public final class LambdaSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable, io.reactivex.observers.LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

    public LambdaSubscriber(io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer3) {
        this.getHighSpeedVideoSizes = consumer;
        this.Camera2StreamConfigurationMap = consumer2;
        this.getHighSpeedVideoFpsRangesFor = action;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer3;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.getHighSpeedVideoSizes.accept(t);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
            lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
            try {
                this.Camera2StreamConfigurationMap.accept(th);
                return;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                return;
            }
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
            lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
            try {
                this.getHighSpeedVideoFpsRangesFor.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        get().request(j);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.Camera2StreamConfigurationMap != io.reactivex.internal.functions.Functions.ON_ERROR_MISSING;
    }
}
