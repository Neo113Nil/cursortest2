package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSkipLast<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int getHighSpeedVideoFpsRangesFor;

    public FlowableSkipLast(io.reactivex.Flowable<T> flowable, int i) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSkipLast.SkipLastSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class SkipLastSubscriber<T> extends java.util.ArrayDeque<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3807491841935125653L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        SkipLastSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i) {
            super(i);
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes == size()) {
                this.getHighSpeedVideoFpsRangesFor.onNext(poll());
            } else {
                this.Camera2StreamConfigurationMap.request(1L);
            }
            offer(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.Camera2StreamConfigurationMap.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap.cancel();
        }
    }
}
