package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDoOnLifecycle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    private final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> Camera2StreamConfigurationMap;
    private final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    private final io.reactivex.functions.LongConsumer getHighSpeedVideoSizes;

    public FlowableDoOnLifecycle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer, io.reactivex.functions.LongConsumer longConsumer, io.reactivex.functions.Action action) {
        super(flowable);
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoSizes = longConsumer;
        this.getHighSpeedVideoFpsRangesFor = action;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle.SubscriptionLambdaSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class SubscriptionLambdaSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.LongConsumer getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        SubscriptionLambdaSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer, io.reactivex.functions.LongConsumer longConsumer, io.reactivex.functions.Action action) {
            this.getHighSpeedVideoSizes = subscriber;
            this.Camera2StreamConfigurationMap = consumer;
            this.getHighSpeedVideoFpsRanges = action;
            this.getHighSpeedVideoFpsRangesFor = longConsumer;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            try {
                this.Camera2StreamConfigurationMap.accept(subscription);
                if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                    this.getHighSpeedVideoSizes.onSubscribe(this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                subscription.cancel();
                this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
                io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.getHighSpeedVideoSizes);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                this.getHighSpeedVideoSizes.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                this.getHighSpeedVideoFpsRangesFor.accept(j);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                this.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
