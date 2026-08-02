package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSkipLastTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getInputFormats;

    public FlowableSkipLastTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
        super(flowable);
        this.getHighSpeedVideoSizes = j;
        this.getInputFormats = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSkipLastTimed.SkipLastTimedSubscriber(subscriber, this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class SkipLastTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5677354903406201275L;
        java.lang.Throwable Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.Scheduler getInputSizeshNQ4ISI;
        final long getOutputFormats;
        org.reactivestreams.Subscription getOutputMinFrameDuration;
        final java.util.concurrent.TimeUnit getOutputMinFrameDurationlomOqCM;

        SkipLastTimedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getOutputFormats = j;
            this.getOutputMinFrameDurationlomOqCM = timeUnit;
            this.getInputSizeshNQ4ISI = scheduler;
            this.getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.getHighSpeedVideoFpsRangesFor = z;
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
            this.getHighSpeedVideoSizesFor.offer(java.lang.Long.valueOf(this.getInputSizeshNQ4ISI.now(this.getOutputMinFrameDurationlomOqCM)), t);
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputMinFrameDuration.cancel();
            if (getAndIncrement() == 0) {
                this.getHighSpeedVideoSizesFor.clear();
            }
        }

        private void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoSizes;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getHighSpeedVideoSizesFor;
                boolean z = this.getHighSpeedVideoFpsRangesFor;
                java.util.concurrent.TimeUnit timeUnit = this.getOutputMinFrameDurationlomOqCM;
                io.reactivex.Scheduler scheduler = this.getInputSizeshNQ4ISI;
                long j = this.getOutputFormats;
                int i = 1;
                do {
                    long j2 = this.getInputFormats.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Long l = (java.lang.Long) spscLinkedArrayQueue.peek();
                        boolean z3 = l == null;
                        long now = scheduler.now(timeUnit);
                        if (!z3 && l.longValue() > now - j) {
                            z3 = true;
                        }
                        if (!this.getHighSpeedVideoFpsRanges) {
                            if (z2) {
                                if (!z) {
                                    java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                                    if (th != null) {
                                        this.getHighSpeedVideoSizesFor.clear();
                                        subscriber.onError(th);
                                        return;
                                    } else if (z3) {
                                        subscriber.onComplete();
                                        return;
                                    }
                                } else if (z3) {
                                    java.lang.Throwable th2 = this.Camera2StreamConfigurationMap;
                                    if (th2 != null) {
                                        subscriber.onError(th2);
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                            }
                            if (z3) {
                                break;
                            }
                            spscLinkedArrayQueue.poll();
                            subscriber.onNext(spscLinkedArrayQueue.poll());
                            j3++;
                        } else {
                            this.getHighSpeedVideoSizesFor.clear();
                            return;
                        }
                    }
                    if (j3 != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(this.getInputFormats, j3);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
