package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTakeLastTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final long getInputFormats;
    final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;

    public FlowableTakeLastTimed(io.reactivex.Flowable<T> flowable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
        super(flowable);
        this.getHighSpeedVideoSizes = j;
        this.getInputFormats = j2;
        this.getInputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTakeLastTimed.TakeLastTimedSubscriber(subscriber, this.getHighSpeedVideoSizes, this.getInputFormats, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class TakeLastTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        java.lang.Throwable getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getInputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputFormats;
        final io.reactivex.Scheduler getOutputMinFrameDuration;
        final java.util.concurrent.TimeUnit getOutputSizes;
        final long getOutputSizeshNQ4ISI;

        TakeLastTimedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getOutputSizeshNQ4ISI = j2;
            this.getOutputSizes = timeUnit;
            this.getOutputMinFrameDuration = scheduler;
            this.getInputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getInputSizeshNQ4ISI;
            long now = this.getOutputMinFrameDuration.now(this.getOutputSizes);
            spscLinkedArrayQueue.offer(java.lang.Long.valueOf(now), t);
            getHighResolutionOutputSizeshNQ4ISI(now, spscLinkedArrayQueue);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration.now(this.getOutputSizes), this.getInputSizeshNQ4ISI);
            }
            this.getHighSpeedVideoSizesFor = th;
            this.getHighSpeedVideoSizes = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDuration.now(this.getOutputSizes), this.getInputSizeshNQ4ISI);
            this.getHighSpeedVideoSizes = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        private void getHighResolutionOutputSizeshNQ4ISI(long j, io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue) {
            long j2 = this.getOutputSizeshNQ4ISI;
            long j3 = this.getHighResolutionOutputSizeshNQ4ISI;
            boolean z = j3 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((java.lang.Long) spscLinkedArrayQueue.peek()).longValue() >= j - j2 && (z || (spscLinkedArrayQueue.size() >> 1) <= j3)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getOutputFormats.cancel();
            if (getAndIncrement() == 0) {
                this.getInputSizeshNQ4ISI.clear();
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getInputSizeshNQ4ISI;
                boolean z = this.getHighSpeedVideoFpsRanges;
                int i = 1;
                do {
                    if (this.getHighSpeedVideoSizes) {
                        if (getHighResolutionOutputSizeshNQ4ISI(spscLinkedArrayQueue.isEmpty(), subscriber, z)) {
                            return;
                        }
                        long j = this.getInputFormats.get();
                        long j2 = 0;
                        while (true) {
                            if (getHighResolutionOutputSizeshNQ4ISI(spscLinkedArrayQueue.peek() == null, subscriber, z)) {
                                return;
                            }
                            if (j != j2) {
                                spscLinkedArrayQueue.poll();
                                subscriber.onNext(spscLinkedArrayQueue.poll());
                                j2++;
                            } else if (j2 != 0) {
                                io.reactivex.internal.util.BackpressureHelper.produced(this.getInputFormats, j2);
                            }
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, org.reactivestreams.Subscriber<? super T> subscriber, boolean z2) {
            if (this.Camera2StreamConfigurationMap) {
                this.getInputSizeshNQ4ISI.clear();
                return true;
            }
            if (z2) {
                if (!z) {
                    return false;
                }
                java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getHighSpeedVideoSizesFor;
            if (th2 != null) {
                this.getInputSizeshNQ4ISI.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }
    }
}
