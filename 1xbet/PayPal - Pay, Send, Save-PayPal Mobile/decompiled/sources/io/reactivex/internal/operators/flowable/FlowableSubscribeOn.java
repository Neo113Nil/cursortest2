package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSubscribeOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRangesFor;

    public FlowableSubscribeOn(io.reactivex.Flowable<T> flowable, io.reactivex.Scheduler scheduler, boolean z) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.Scheduler.Worker createWorker = this.getHighResolutionOutputSizeshNQ4ISI.createWorker();
        io.reactivex.internal.operators.flowable.FlowableSubscribeOn.SubscribeOnSubscriber subscribeOnSubscriber = new io.reactivex.internal.operators.flowable.FlowableSubscribeOn.SubscribeOnSubscriber(subscriber, createWorker, this.source, this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class SubscribeOnSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Thread> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        final boolean getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Publisher<T> getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getInputSizeshNQ4ISI;

        SubscribeOnSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.Scheduler.Worker worker, org.reactivestreams.Publisher<T> publisher, boolean z) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getInputSizeshNQ4ISI = worker;
            this.getHighSpeedVideoSizes = publisher;
            this.getHighSpeedVideoFpsRangesFor = !z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(java.lang.Thread.currentThread());
            org.reactivestreams.Publisher<T> publisher = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = null;
            publisher.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                long andSet = this.getHighSpeedVideoFpsRanges.getAndSet(0L);
                if (andSet != 0) {
                    Camera2StreamConfigurationMap(andSet, subscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                org.reactivestreams.Subscription subscription = this.getHighResolutionOutputSizeshNQ4ISI.get();
                if (subscription != null) {
                    Camera2StreamConfigurationMap(j, subscription);
                    return;
                }
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighSpeedVideoFpsRanges, j);
                org.reactivestreams.Subscription subscription2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
                if (subscription2 != null) {
                    long andSet = this.getHighSpeedVideoFpsRanges.getAndSet(0L);
                    if (andSet != 0) {
                        Camera2StreamConfigurationMap(andSet, subscription2);
                    }
                }
            }
        }

        private void Camera2StreamConfigurationMap(long j, org.reactivestreams.Subscription subscription) {
            if (this.getHighSpeedVideoFpsRangesFor || java.lang.Thread.currentThread() == get()) {
                subscription.request(j);
            } else {
                this.getInputSizeshNQ4ISI.schedule(new io.reactivex.internal.operators.flowable.FlowableSubscribeOn.SubscribeOnSubscriber.Request(subscription, j));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getInputSizeshNQ4ISI.dispose();
        }

        static final class Request implements java.lang.Runnable {
            private final org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
            private final long getHighSpeedVideoFpsRangesFor;

            Request(org.reactivestreams.Subscription subscription, long j) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoFpsRangesFor = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.getHighSpeedVideoFpsRanges.request(this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }
}
