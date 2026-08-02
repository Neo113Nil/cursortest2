package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableObserveOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public FlowableObserveOn(io.reactivex.Flowable<T> flowable, io.reactivex.Scheduler scheduler, boolean z, int i) {
        super(flowable);
        this.getHighSpeedVideoSizes = scheduler;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.Scheduler.Worker createWorker = this.getHighSpeedVideoSizes.createWorker();
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableObserveOn.ObserveOnConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, createWorker, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableObserveOn.ObserveOnSubscriber(subscriber, createWorker, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BaseObserveOnSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T>, java.lang.Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean Camera2StreamConfigurationMap;
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();
        long getInputFormats;
        boolean getInputSizeshNQ4ISI;
        final int getOutputFormats;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputMinFrameDurationlomOqCM;
        org.reactivestreams.Subscription getOutputSizes;
        int getOutputStallDurationlomOqCM;

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        abstract void getHighSpeedVideoFpsRanges();

        abstract void getHighSpeedVideoFpsRangesFor();

        BaseObserveOnSubscriber(io.reactivex.Scheduler.Worker worker, boolean z, int i) {
            this.getOutputMinFrameDurationlomOqCM = worker;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.getOutputFormats = i;
            this.getHighSpeedVideoFpsRanges = i - (i >> 2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            if (this.getOutputStallDurationlomOqCM != 2) {
                if (!this.getOutputMinFrameDuration.offer(t)) {
                    this.getOutputSizes.cancel();
                    this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.exceptions.MissingBackpressureException("Queue is full?!");
                    this.getHighSpeedVideoSizes = true;
                }
                if (getAndIncrement() == 0) {
                    this.getOutputMinFrameDurationlomOqCM.schedule(this);
                    return;
                }
                return;
            }
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDurationlomOqCM.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.getHighSpeedVideoSizes = true;
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDurationlomOqCM.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDurationlomOqCM.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighSpeedVideoSizesFor, j);
                if (getAndIncrement() == 0) {
                    this.getOutputMinFrameDurationlomOqCM.schedule(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getOutputSizes.cancel();
            this.getOutputMinFrameDurationlomOqCM.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.clear();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getInputSizeshNQ4ISI) {
                getHighSpeedVideoFpsRangesFor();
            } else if (this.getOutputStallDurationlomOqCM == 1) {
                getHighSpeedVideoFpsRanges();
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        final boolean getHighSpeedVideoSizes(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber) {
            if (this.Camera2StreamConfigurationMap) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                this.getOutputMinFrameDurationlomOqCM.dispose();
                return true;
            }
            java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th2 != null) {
                clear();
                subscriber.onError(th2);
                this.getOutputMinFrameDurationlomOqCM.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            this.getOutputMinFrameDurationlomOqCM.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getInputSizeshNQ4ISI = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getOutputMinFrameDuration.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getOutputMinFrameDuration.isEmpty();
        }
    }

    /* loaded from: classes17.dex */
    static final class ObserveOnSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final org.reactivestreams.Subscriber<? super T> getOutputStallDuration;

        ObserveOnSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.Scheduler.Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.getOutputStallDuration = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputSizes, subscription)) {
                this.getOutputSizes = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getOutputStallDurationlomOqCM = 1;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getHighSpeedVideoSizes = true;
                        this.getOutputStallDuration.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputStallDurationlomOqCM = 2;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getOutputStallDuration.onSubscribe(this);
                        subscription.request(this.getOutputFormats);
                        return;
                    }
                }
                this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscArrayQueue(this.getOutputFormats);
                this.getOutputStallDuration.onSubscribe(this);
                subscription.request(this.getOutputFormats);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void getHighSpeedVideoFpsRanges() {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getOutputStallDuration;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputMinFrameDuration;
            long j = this.getInputFormats;
            int i = 1;
            while (true) {
                long j2 = this.getHighSpeedVideoSizesFor.get();
                while (j != j2) {
                    try {
                        T poll = simpleQueue.poll();
                        if (this.Camera2StreamConfigurationMap) {
                            return;
                        }
                        if (poll == null) {
                            subscriber.onComplete();
                            this.getOutputMinFrameDurationlomOqCM.dispose();
                            return;
                        } else {
                            subscriber.onNext(poll);
                            j++;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getOutputSizes.cancel();
                        subscriber.onError(th);
                        this.getOutputMinFrameDurationlomOqCM.dispose();
                        return;
                    }
                }
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    subscriber.onComplete();
                    this.getOutputMinFrameDurationlomOqCM.dispose();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.getInputFormats = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void getHighResolutionOutputSizeshNQ4ISI() {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getOutputStallDuration;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputMinFrameDuration;
            long j = this.getInputFormats;
            int i = 1;
            while (true) {
                long j2 = this.getHighSpeedVideoSizesFor.get();
                while (j != j2) {
                    boolean z = this.getHighSpeedVideoSizes;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!getHighSpeedVideoSizes(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j++;
                            if (j == this.getHighSpeedVideoFpsRanges) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.getHighSpeedVideoSizesFor.addAndGet(-j);
                                }
                                this.getOutputSizes.request(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getOutputSizes.cancel();
                        simpleQueue.clear();
                        subscriber.onError(th);
                        this.getOutputMinFrameDurationlomOqCM.dispose();
                        return;
                    }
                }
                if (j == j2 && getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, simpleQueue.isEmpty(), subscriber)) {
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.getInputFormats = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void getHighSpeedVideoFpsRangesFor() {
            int i = 1;
            while (!this.Camera2StreamConfigurationMap) {
                boolean z = this.getHighSpeedVideoSizes;
                this.getOutputStallDuration.onNext(null);
                if (z) {
                    java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (th != null) {
                        this.getOutputStallDuration.onError(th);
                    } else {
                        this.getOutputStallDuration.onComplete();
                    }
                    this.getOutputMinFrameDurationlomOqCM.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.getOutputMinFrameDuration.poll();
            if (poll != null && this.getOutputStallDurationlomOqCM != 1) {
                long j = this.getInputFormats + 1;
                if (j == this.getHighSpeedVideoFpsRanges) {
                    this.getInputFormats = 0L;
                    this.getOutputSizes.request(j);
                    return poll;
                }
                this.getInputFormats = j;
            }
            return poll;
        }
    }

    /* loaded from: classes17.dex */
    static final class ObserveOnConditionalSubscriber<T> extends io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long getOutputSizeshNQ4ISI;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getOutputStallDuration;

        ObserveOnConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.Scheduler.Worker worker, boolean z, int i) {
            super(worker, z, i);
            this.getOutputStallDuration = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputSizes, subscription)) {
                this.getOutputSizes = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getOutputStallDurationlomOqCM = 1;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getHighSpeedVideoSizes = true;
                        this.getOutputStallDuration.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputStallDurationlomOqCM = 2;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getOutputStallDuration.onSubscribe(this);
                        subscription.request(this.getOutputFormats);
                        return;
                    }
                }
                this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscArrayQueue(this.getOutputFormats);
                this.getOutputStallDuration.onSubscribe(this);
                subscription.request(this.getOutputFormats);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void getHighSpeedVideoFpsRanges() {
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getOutputStallDuration;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputMinFrameDuration;
            long j = this.getInputFormats;
            int i = 1;
            while (true) {
                long j2 = this.getHighSpeedVideoSizesFor.get();
                while (j != j2) {
                    try {
                        T poll = simpleQueue.poll();
                        if (this.Camera2StreamConfigurationMap) {
                            return;
                        }
                        if (poll == null) {
                            conditionalSubscriber.onComplete();
                            this.getOutputMinFrameDurationlomOqCM.dispose();
                            return;
                        } else if (conditionalSubscriber.tryOnNext(poll)) {
                            j++;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getOutputSizes.cancel();
                        conditionalSubscriber.onError(th);
                        this.getOutputMinFrameDurationlomOqCM.dispose();
                        return;
                    }
                }
                if (this.Camera2StreamConfigurationMap) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    conditionalSubscriber.onComplete();
                    this.getOutputMinFrameDurationlomOqCM.dispose();
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.getInputFormats = j;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getOutputStallDuration;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputMinFrameDuration;
            long j = this.getInputFormats;
            long j2 = this.getOutputSizeshNQ4ISI;
            int i = 1;
            while (true) {
                long j3 = this.getHighSpeedVideoSizesFor.get();
                while (j != j3) {
                    boolean z = this.getHighSpeedVideoSizes;
                    try {
                        T poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!getHighSpeedVideoSizes(z, z2, conditionalSubscriber)) {
                            if (z2) {
                                break;
                            }
                            if (conditionalSubscriber.tryOnNext(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == this.getHighSpeedVideoFpsRanges) {
                                this.getOutputSizes.request(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getOutputSizes.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.getOutputMinFrameDurationlomOqCM.dispose();
                        return;
                    }
                }
                if (j == j3 && getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i2 = get();
                if (i == i2) {
                    this.getInputFormats = j;
                    this.getOutputSizeshNQ4ISI = j2;
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    i = i2;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        final void getHighSpeedVideoFpsRangesFor() {
            int i = 1;
            while (!this.Camera2StreamConfigurationMap) {
                boolean z = this.getHighSpeedVideoSizes;
                this.getOutputStallDuration.onNext(null);
                if (z) {
                    java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (th != null) {
                        this.getOutputStallDuration.onError(th);
                    } else {
                        this.getOutputStallDuration.onComplete();
                    }
                    this.getOutputMinFrameDurationlomOqCM.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.getOutputMinFrameDuration.poll();
            if (poll != null && this.getOutputStallDurationlomOqCM != 1) {
                long j = this.getOutputSizeshNQ4ISI + 1;
                if (j == this.getHighSpeedVideoFpsRanges) {
                    this.getOutputSizeshNQ4ISI = 0L;
                    this.getOutputSizes.request(j);
                    return poll;
                }
                this.getOutputSizeshNQ4ISI = j;
            }
            return poll;
        }
    }
}
