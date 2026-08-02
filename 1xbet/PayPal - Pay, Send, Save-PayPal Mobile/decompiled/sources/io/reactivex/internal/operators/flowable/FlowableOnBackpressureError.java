package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnBackpressureError<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    public FlowableOnBackpressureError(io.reactivex.Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnBackpressureError.BackpressureErrorSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class BackpressureErrorSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3176480756392482682L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        BackpressureErrorSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRanges = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            if (get() != 0) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
            } else {
                onError(new io.reactivex.exceptions.MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap.cancel();
        }
    }
}
