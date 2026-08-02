package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSkip<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long getHighSpeedVideoSizes;

    public FlowableSkip(io.reactivex.Flowable<T> flowable, long j) {
        super(flowable);
        this.getHighSpeedVideoSizes = j;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSkip.SkipSubscriber(subscriber, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class SkipSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        SkipSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                long j = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(j);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j != 0) {
                this.getHighSpeedVideoFpsRangesFor = j - 1;
            } else {
                this.getHighSpeedVideoSizes.onNext(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
        }
    }
}
