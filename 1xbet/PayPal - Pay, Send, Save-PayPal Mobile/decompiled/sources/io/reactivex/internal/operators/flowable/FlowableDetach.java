package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDetach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableDetach(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDetach.DetachSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class DetachSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        DetachSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            org.reactivestreams.Subscription subscription = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.EmptyComponent.asSubscriber();
            subscription.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.EmptyComponent.asSubscriber();
            subscriber.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.util.EmptyComponent.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.util.EmptyComponent.asSubscriber();
            subscriber.onComplete();
        }
    }
}
