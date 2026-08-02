package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableHide<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableHide(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableHide.HideSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class HideSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;

        HideSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}
