package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends io.reactivex.Flowable<T> {
    final org.reactivestreams.Publisher<U> Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;

    public FlowableDelaySubscriptionOther(org.reactivestreams.Publisher<? extends T> publisher, org.reactivestreams.Publisher<U> publisher2) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.Camera2StreamConfigurationMap = publisher2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter = new io.reactivex.internal.subscriptions.SubscriptionArbiter();
        subscriber.onSubscribe(subscriptionArbiter);
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber(subscriptionArbiter, subscriber));
    }

    /* loaded from: classes17.dex */
    final class DelaySubscriber implements io.reactivex.FlowableSubscriber<U> {
        final io.reactivex.internal.subscriptions.SubscriptionArbiter getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        DelaySubscriber(io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriptionArbiter;
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.getHighResolutionOutputSizeshNQ4ISI.setSubscription(new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber.DelaySubscription(subscription));
            subscription.request(Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u) {
            onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber.OnCompleteSubscriber());
        }

        final class DelaySubscription implements org.reactivestreams.Subscription {
            private final org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;

            @Override // org.reactivestreams.Subscription
            public final void request(long j) {
            }

            DelaySubscription(org.reactivestreams.Subscription subscription) {
                this.getHighSpeedVideoFpsRangesFor = subscription;
            }

            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                this.getHighSpeedVideoFpsRangesFor.cancel();
            }
        }

        final class OnCompleteSubscriber implements io.reactivex.FlowableSubscriber<T> {
            OnCompleteSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
            public final void onSubscribe(org.reactivestreams.Subscription subscription) {
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber.this.getHighResolutionOutputSizeshNQ4ISI.setSubscription(subscription);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(T t) {
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber.this.getHighSpeedVideoSizes.onNext(t);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber.this.getHighSpeedVideoSizes.onError(th);
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther.DelaySubscriber.this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
