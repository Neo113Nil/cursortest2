package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableThrottleLatest<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public FlowableThrottleLatest(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(flowable);
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableThrottleLatest.ThrottleLatestSubscriber(subscriber, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.createWorker(), this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ThrottleLatestSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean Camera2StreamConfigurationMap;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final long getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        java.lang.Throwable getOutputFormats;
        boolean getOutputMinFrameDurationlomOqCM;
        final java.util.concurrent.TimeUnit getOutputSizes;
        final io.reactivex.Scheduler.Worker getOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicReference<T> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicLong();

        ThrottleLatestSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, boolean z) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getInputFormats = j;
            this.getOutputSizes = timeUnit;
            this.getOutputSizeshNQ4ISI = worker;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDurationlomOqCM, subscription)) {
                this.getOutputStallDurationlomOqCM = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizesFor.set(t);
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getOutputFormats = th;
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDuration, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap = true;
            this.getOutputStallDurationlomOqCM.cancel();
            this.getOutputSizeshNQ4ISI.dispose();
            if (getAndIncrement() == 0) {
                this.getHighSpeedVideoSizesFor.lazySet(null);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getInputSizeshNQ4ISI = true;
            getHighSpeedVideoFpsRanges();
        }

        private void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                java.util.concurrent.atomic.AtomicReference<T> atomicReference = this.getHighSpeedVideoSizesFor;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputMinFrameDuration;
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
                int i = 1;
                while (!this.Camera2StreamConfigurationMap) {
                    boolean z = this.getHighSpeedVideoSizes;
                    if (z && this.getOutputFormats != null) {
                        atomicReference.lazySet(null);
                        subscriber.onError(this.getOutputFormats);
                        this.getOutputSizeshNQ4ISI.dispose();
                        return;
                    }
                    boolean z2 = atomicReference.get() == null;
                    if (z) {
                        if (!z2 && this.getHighResolutionOutputSizeshNQ4ISI) {
                            T andSet = atomicReference.getAndSet(null);
                            long j = this.getHighSpeedVideoFpsRangesFor;
                            if (j != atomicLong.get()) {
                                this.getHighSpeedVideoFpsRangesFor = j + 1;
                                subscriber.onNext(andSet);
                                subscriber.onComplete();
                            } else {
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit final value due to lack of requests"));
                            }
                        } else {
                            atomicReference.lazySet(null);
                            subscriber.onComplete();
                        }
                        this.getOutputSizeshNQ4ISI.dispose();
                        return;
                    }
                    if (z2) {
                        if (this.getInputSizeshNQ4ISI) {
                            this.getOutputMinFrameDurationlomOqCM = false;
                            this.getInputSizeshNQ4ISI = false;
                        }
                    } else if (!this.getOutputMinFrameDurationlomOqCM || this.getInputSizeshNQ4ISI) {
                        T andSet2 = atomicReference.getAndSet(null);
                        long j2 = this.getHighSpeedVideoFpsRangesFor;
                        if (j2 != atomicLong.get()) {
                            subscriber.onNext(andSet2);
                            this.getHighSpeedVideoFpsRangesFor = j2 + 1;
                            this.getInputSizeshNQ4ISI = false;
                            this.getOutputMinFrameDurationlomOqCM = true;
                            this.getOutputSizeshNQ4ISI.schedule(this, this.getInputFormats, this.getOutputSizes);
                        } else {
                            this.getOutputStallDurationlomOqCM.cancel();
                            subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests"));
                            this.getOutputSizeshNQ4ISI.dispose();
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }
}
