package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWindow<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final int Camera2StreamConfigurationMap;
    final long getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public FlowableWindow(io.reactivex.Flowable<T> flowable, long j, long j2, int i) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoSizes = j2;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        long j = this.getHighSpeedVideoSizes;
        long j2 = this.getHighSpeedVideoFpsRangesFor;
        if (j == j2) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindow.WindowExactSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap));
        } else if (j > j2) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindow.WindowSkipSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindow.WindowOverlapSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowExactSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        final long getOutputFormats;
        io.reactivex.processors.UnicastProcessor<T> getOutputMinFrameDuration;

        WindowExactSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, int i) {
            super(1);
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputFormats = j;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
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
            long j = this.getHighSpeedVideoFpsRanges;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputMinFrameDuration;
            if (j == 0) {
                getAndIncrement();
                unicastProcessor = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoSizes, this);
                this.getOutputMinFrameDuration = unicastProcessor;
                this.getHighSpeedVideoFpsRangesFor.onNext(unicastProcessor);
            }
            long j2 = j + 1;
            unicastProcessor.onNext(t);
            if (j2 == this.getOutputFormats) {
                this.getHighSpeedVideoFpsRanges = 0L;
                this.getOutputMinFrameDuration = null;
                unicastProcessor.onComplete();
                return;
            }
            this.getHighSpeedVideoFpsRanges = j2;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputMinFrameDuration;
            if (unicastProcessor != null) {
                this.getOutputMinFrameDuration = null;
                unicastProcessor.onError(th);
            }
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputMinFrameDuration;
            if (unicastProcessor != null) {
                this.getOutputMinFrameDuration = null;
                unicastProcessor.onComplete();
            }
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                this.Camera2StreamConfigurationMap.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputFormats, j));
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.Camera2StreamConfigurationMap.cancel();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowSkipSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> getHighSpeedVideoSizes;
        final long getHighSpeedVideoSizesFor;
        io.reactivex.processors.UnicastProcessor<T> getInputFormats;
        org.reactivestreams.Subscription getInputSizeshNQ4ISI;
        final long getOutputFormats;

        WindowSkipSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, long j2, int i) {
            super(1);
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoSizesFor = j;
            this.getOutputFormats = j2;
            this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean();
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean();
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getInputSizeshNQ4ISI, subscription)) {
                this.getInputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getInputFormats;
            if (j == 0) {
                getAndIncrement();
                unicastProcessor = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRanges, this);
                this.getInputFormats = unicastProcessor;
                this.getHighSpeedVideoSizes.onNext(unicastProcessor);
            }
            long j2 = j + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(t);
            }
            if (j2 == this.getHighSpeedVideoSizesFor) {
                this.getInputFormats = null;
                unicastProcessor.onComplete();
            }
            if (j2 == this.getOutputFormats) {
                this.getHighResolutionOutputSizeshNQ4ISI = 0L;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = j2;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getInputFormats;
            if (unicastProcessor != null) {
                this.getInputFormats = null;
                unicastProcessor.onError(th);
            }
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getInputFormats;
            if (unicastProcessor != null) {
                this.getInputFormats = null;
                unicastProcessor.onComplete();
            }
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                if (!this.getHighSpeedVideoFpsRangesFor.get() && this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
                    this.getInputSizeshNQ4ISI.request(io.reactivex.internal.util.BackpressureHelper.addCap(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getHighSpeedVideoSizesFor, j), io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputFormats - this.getHighSpeedVideoSizesFor, j - 1)));
                } else {
                    this.getInputSizeshNQ4ISI.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputFormats, j));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.getInputSizeshNQ4ISI.cancel();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowOverlapSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        long getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicBoolean getInputFormats;
        final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> getOutputFormats;
        long getOutputMinFrameDuration;
        final long getOutputMinFrameDurationlomOqCM;
        final long getOutputSizes;
        final java.util.concurrent.atomic.AtomicLong getOutputSizeshNQ4ISI;
        final java.util.ArrayDeque<io.reactivex.processors.UnicastProcessor<T>> getOutputStallDuration;
        org.reactivestreams.Subscription getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicInteger isOutputSupportedForhNQ4ISI;

        WindowOverlapSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, long j2, int i) {
            super(1);
            this.Camera2StreamConfigurationMap = subscriber;
            this.getOutputSizes = j;
            this.getOutputMinFrameDurationlomOqCM = j2;
            this.getOutputFormats = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.getOutputStallDuration = new java.util.ArrayDeque<>();
            this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
            this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean();
            this.getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
            this.isOutputSupportedForhNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
            this.getHighSpeedVideoSizes = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDurationlomOqCM, subscription)) {
                this.getOutputStallDurationlomOqCM = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            long j = this.getOutputMinFrameDuration;
            if (j == 0 && !this.getHighResolutionOutputSizeshNQ4ISI) {
                getAndIncrement();
                io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoSizes, this);
                this.getOutputStallDuration.offer(create);
                this.getOutputFormats.offer(create);
                getHighSpeedVideoSizes();
            }
            long j2 = j + 1;
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.getOutputStallDuration.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            long j3 = this.getHighSpeedVideoSizesFor + 1;
            if (j3 == this.getOutputSizes) {
                this.getHighSpeedVideoSizesFor = j3 - this.getOutputMinFrameDurationlomOqCM;
                io.reactivex.processors.UnicastProcessor<T> poll = this.getOutputStallDuration.poll();
                if (poll != null) {
                    poll.onComplete();
                }
            } else {
                this.getHighSpeedVideoSizesFor = j3;
            }
            if (j2 == this.getOutputMinFrameDurationlomOqCM) {
                this.getOutputMinFrameDuration = 0L;
            } else {
                this.getOutputMinFrameDuration = j2;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.getOutputStallDuration.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.getOutputStallDuration.clear();
            this.getHighSpeedVideoFpsRangesFor = th;
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.getOutputStallDuration.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.getOutputStallDuration.clear();
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoSizes();
        }

        private void getHighSpeedVideoSizes() {
            if (this.isOutputSupportedForhNQ4ISI.getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.processors.UnicastProcessor<T>> spscLinkedArrayQueue = this.getOutputFormats;
                int i = 1;
                do {
                    long j = this.getOutputSizeshNQ4ISI.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        io.reactivex.processors.UnicastProcessor<T> poll = spscLinkedArrayQueue.poll();
                        boolean z2 = poll == null;
                        if (!getHighSpeedVideoSizes(z, z2, subscriber, spscLinkedArrayQueue)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, spscLinkedArrayQueue.isEmpty(), subscriber, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (j2 != 0 && j != Long.MAX_VALUE) {
                        this.getOutputSizeshNQ4ISI.addAndGet(-j2);
                    }
                    i = this.isOutputSupportedForhNQ4ISI.addAndGet(-i);
                } while (i != 0);
            }
        }

        private boolean getHighSpeedVideoSizes(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
            if (th != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputSizeshNQ4ISI, j);
                if (!this.getInputFormats.get() && this.getInputFormats.compareAndSet(false, true)) {
                    this.getOutputStallDurationlomOqCM.request(io.reactivex.internal.util.BackpressureHelper.addCap(this.getOutputSizes, io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputMinFrameDurationlomOqCM, j - 1)));
                } else {
                    this.getOutputStallDurationlomOqCM.request(io.reactivex.internal.util.BackpressureHelper.multiplyCap(this.getOutputMinFrameDurationlomOqCM, j));
                }
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (decrementAndGet() == 0) {
                this.getOutputStallDurationlomOqCM.cancel();
            }
        }
    }
}
