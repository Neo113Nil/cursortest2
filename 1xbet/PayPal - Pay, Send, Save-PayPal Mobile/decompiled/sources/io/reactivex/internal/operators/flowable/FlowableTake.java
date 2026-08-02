package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTake<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;

    public FlowableTake(io.reactivex.Flowable<T> flowable, long j) {
        super(flowable);
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTake.TakeSubscriber(subscriber, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class TakeSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        TakeSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighSpeedVideoSizes = j;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                if (this.getHighSpeedVideoFpsRangesFor == 0) {
                    subscription.cancel();
                    this.Camera2StreamConfigurationMap = true;
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(this.getHighSpeedVideoFpsRanges);
                    return;
                }
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            long j = this.getHighSpeedVideoSizes;
            long j2 = j - 1;
            this.getHighSpeedVideoSizes = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.getHighSpeedVideoFpsRanges.onNext(t);
                if (z) {
                    this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                    onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                this.getHighSpeedVideoFpsRanges.onError(th);
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                if (!get() && compareAndSet(false, true) && j >= this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighResolutionOutputSizeshNQ4ISI.request(Long.MAX_VALUE);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.request(j);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
