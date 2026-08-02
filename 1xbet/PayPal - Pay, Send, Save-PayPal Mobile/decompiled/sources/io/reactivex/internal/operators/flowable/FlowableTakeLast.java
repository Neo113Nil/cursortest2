package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTakeLast<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int getHighSpeedVideoSizes;

    public FlowableTakeLast(io.reactivex.Flowable<T> flowable, int i) {
        super(flowable);
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTakeLast.TakeLastSubscriber(subscriber, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class TakeLastSubscriber<T> extends java.util.ArrayDeque<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7240042530241604978L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicInteger getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();

        TakeLastSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputMinFrameDuration, subscription)) {
                this.getOutputMinFrameDuration = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == size()) {
                poll();
            }
            offer(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.Camera2StreamConfigurationMap, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputMinFrameDuration.cancel();
        }

        private void Camera2StreamConfigurationMap() {
            if (this.getInputSizeshNQ4ISI.getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
                long j = this.Camera2StreamConfigurationMap.get();
                while (!this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        long j2 = 0;
                        while (j2 != j) {
                            if (this.getHighSpeedVideoFpsRanges) {
                                return;
                            }
                            T poll = poll();
                            if (poll == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onNext(poll);
                                j2++;
                            }
                        }
                        if (j2 != 0 && j != Long.MAX_VALUE) {
                            j = this.Camera2StreamConfigurationMap.addAndGet(-j2);
                        }
                    }
                    if (this.getInputSizeshNQ4ISI.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
