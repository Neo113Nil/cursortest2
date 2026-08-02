package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSwitchIfEmpty<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableSwitchIfEmpty(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<? extends T> publisher) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty.SwitchIfEmptySubscriber switchIfEmptySubscriber = new io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty.SwitchIfEmptySubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.onSubscribe(switchIfEmptySubscriber.getHighSpeedVideoFpsRangesFor);
        this.source.subscribe((io.reactivex.FlowableSubscriber) switchIfEmptySubscriber);
    }

    /* loaded from: classes17.dex */
    static final class SwitchIfEmptySubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoSizes;
        boolean Camera2StreamConfigurationMap = true;
        final io.reactivex.internal.subscriptions.SubscriptionArbiter getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.subscriptions.SubscriptionArbiter();

        SwitchIfEmptySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, org.reactivestreams.Publisher<? extends T> publisher) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoSizes = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.getHighSpeedVideoFpsRangesFor.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = false;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = false;
                this.getHighSpeedVideoSizes.subscribe(this);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }
    }
}
