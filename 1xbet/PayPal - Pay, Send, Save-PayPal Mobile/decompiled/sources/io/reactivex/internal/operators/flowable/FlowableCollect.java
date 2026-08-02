package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableCollect<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<? extends U> getHighSpeedVideoSizes;

    public FlowableCollect(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends U> callable, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
        super(flowable);
        this.getHighSpeedVideoSizes = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = biConsumer;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        try {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableCollect.CollectSubscriber(subscriber, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The initial value supplied is null"), this.getHighResolutionOutputSizeshNQ4ISI));
        } catch (java.lang.Throwable th) {
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    static final class CollectSubscriber<T, U> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<U> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -3589550218733891694L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiConsumer<? super U, ? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final U getHighSpeedVideoSizes;

        CollectSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, U u, io.reactivex.functions.BiConsumer<? super U, ? super T> biConsumer) {
            super(subscriber);
            this.getHighSpeedVideoFpsRanges = biConsumer;
            this.getHighSpeedVideoSizes = u;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(this.getHighSpeedVideoSizes, t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.actual.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            complete(this.getHighSpeedVideoSizes);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.Camera2StreamConfigurationMap.cancel();
        }
    }
}
