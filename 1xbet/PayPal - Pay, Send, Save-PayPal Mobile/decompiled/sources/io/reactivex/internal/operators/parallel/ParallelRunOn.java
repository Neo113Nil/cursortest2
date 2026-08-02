package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelRunOn<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.parallel.ParallelFlowable<? extends T> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public ParallelRunOn(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, io.reactivex.Scheduler scheduler, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = parallelFlowable;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
            if (obj instanceof io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport) {
                ((io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport) obj).createWorkers(length, new io.reactivex.internal.operators.parallel.ParallelRunOn.MultiWorkerCallback(subscriberArr, subscriberArr2));
            } else {
                for (int i = 0; i < length; i++) {
                    Camera2StreamConfigurationMap(i, subscriberArr, subscriberArr2, this.getHighSpeedVideoFpsRangesFor.createWorker());
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriberArr2);
        }
    }

    final void Camera2StreamConfigurationMap(int i, org.reactivestreams.Subscriber<? super T>[] subscriberArr, org.reactivestreams.Subscriber<T>[] subscriberArr2, io.reactivex.Scheduler.Worker worker) {
        org.reactivestreams.Subscriber<? super T> subscriber = subscriberArr[i];
        io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(this.getHighSpeedVideoFpsRanges);
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelRunOn.RunOnConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoFpsRanges, spscArrayQueue, worker);
        } else {
            subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelRunOn.RunOnSubscriber(subscriber, this.getHighSpeedVideoFpsRanges, spscArrayQueue, worker);
        }
    }

    /* loaded from: classes17.dex */
    final class MultiWorkerCallback implements io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback {
        final org.reactivestreams.Subscriber<T>[] getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T>[] getHighSpeedVideoFpsRangesFor;

        MultiWorkerCallback(org.reactivestreams.Subscriber<? super T>[] subscriberArr, org.reactivestreams.Subscriber<T>[] subscriberArr2) {
            this.getHighSpeedVideoFpsRangesFor = subscriberArr;
            this.getHighResolutionOutputSizeshNQ4ISI = subscriberArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public final void onWorker(int i, io.reactivex.Scheduler.Worker worker) {
            io.reactivex.internal.operators.parallel.ParallelRunOn.this.Camera2StreamConfigurationMap(i, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighResolutionOutputSizeshNQ4ISI.parallelism();
    }

    /* loaded from: classes17.dex */
    static abstract class BaseRunOnSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.queue.SpscArrayQueue<T> getInputSizeshNQ4ISI;
        final int getOutputFormats;
        final io.reactivex.Scheduler.Worker getOutputMinFrameDuration;

        BaseRunOnSubscriber(int i, io.reactivex.internal.queue.SpscArrayQueue<T> spscArrayQueue, io.reactivex.Scheduler.Worker worker) {
            this.getOutputFormats = i;
            this.getInputSizeshNQ4ISI = spscArrayQueue;
            this.getHighResolutionOutputSizeshNQ4ISI = i - (i >> 2);
            this.getOutputMinFrameDuration = worker;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            if (!this.getInputSizeshNQ4ISI.offer(t)) {
                this.getHighSpeedVideoSizesFor.cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue is full?!"));
            } else if (getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = th;
            this.getHighSpeedVideoSizes = true;
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.schedule(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
                if (getAndIncrement() == 0) {
                    this.getOutputMinFrameDuration.schedule(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizesFor.cancel();
            this.getOutputMinFrameDuration.dispose();
            if (getAndIncrement() == 0) {
                this.getInputSizeshNQ4ISI.clear();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class RunOnSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelRunOn.BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final org.reactivestreams.Subscriber<? super T> getOutputStallDurationlomOqCM;

        RunOnSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i, io.reactivex.internal.queue.SpscArrayQueue<T> spscArrayQueue, io.reactivex.Scheduler.Worker worker) {
            super(i, spscArrayQueue, worker);
            this.getOutputStallDurationlomOqCM = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getOutputStallDurationlomOqCM.onSubscribe(this);
                subscription.request(this.getOutputFormats);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable th;
            int i = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.queue.SpscArrayQueue<T> spscArrayQueue = this.getInputSizeshNQ4ISI;
            org.reactivestreams.Subscriber<? super T> subscriber = this.getOutputStallDurationlomOqCM;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = 1;
            while (true) {
                long j = this.getInputFormats.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.Camera2StreamConfigurationMap) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z = this.getHighSpeedVideoSizes;
                    if (z && (th = this.getHighSpeedVideoFpsRangesFor) != null) {
                        spscArrayQueue.clear();
                        subscriber.onError(th);
                        this.getOutputMinFrameDuration.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (!z || !z2) {
                        if (z2) {
                            break;
                        }
                        subscriber.onNext(poll);
                        j2++;
                        i++;
                        if (i == i2) {
                            this.getHighSpeedVideoSizesFor.request(i);
                            i = 0;
                        }
                    } else {
                        subscriber.onComplete();
                        this.getOutputMinFrameDuration.dispose();
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.Camera2StreamConfigurationMap) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.getHighSpeedVideoSizes) {
                        java.lang.Throwable th2 = this.getHighSpeedVideoFpsRangesFor;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            subscriber.onError(th2);
                            this.getOutputMinFrameDuration.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            subscriber.onComplete();
                            this.getOutputMinFrameDuration.dispose();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.getInputFormats.addAndGet(-j2);
                }
                int i4 = get();
                if (i4 == i3) {
                    this.getHighSpeedVideoFpsRanges = i;
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    i3 = i4;
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class RunOnConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelRunOn.BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getOutputStallDuration;

        RunOnConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, int i, io.reactivex.internal.queue.SpscArrayQueue<T> spscArrayQueue, io.reactivex.Scheduler.Worker worker) {
            super(i, spscArrayQueue, worker);
            this.getOutputStallDuration = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizesFor, subscription)) {
                this.getHighSpeedVideoSizesFor = subscription;
                this.getOutputStallDuration.onSubscribe(this);
                subscription.request(this.getOutputFormats);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            java.lang.Throwable th;
            int i = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.queue.SpscArrayQueue<T> spscArrayQueue = this.getInputSizeshNQ4ISI;
            io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber = this.getOutputStallDuration;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = 1;
            while (true) {
                long j = this.getInputFormats.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.Camera2StreamConfigurationMap) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z = this.getHighSpeedVideoSizes;
                    if (z && (th = this.getHighSpeedVideoFpsRangesFor) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.getOutputMinFrameDuration.dispose();
                        return;
                    }
                    T poll = spscArrayQueue.poll();
                    boolean z2 = poll == null;
                    if (!z || !z2) {
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(poll)) {
                            j2++;
                        }
                        i++;
                        if (i == i2) {
                            this.getHighSpeedVideoSizesFor.request(i);
                            i = 0;
                        }
                    } else {
                        conditionalSubscriber.onComplete();
                        this.getOutputMinFrameDuration.dispose();
                        return;
                    }
                }
                if (j2 == j) {
                    if (this.Camera2StreamConfigurationMap) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.getHighSpeedVideoSizes) {
                        java.lang.Throwable th2 = this.getHighSpeedVideoFpsRangesFor;
                        if (th2 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th2);
                            this.getOutputMinFrameDuration.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.getOutputMinFrameDuration.dispose();
                            return;
                        }
                    }
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.getInputFormats.addAndGet(-j2);
                }
                int i4 = get();
                if (i4 == i3) {
                    this.getHighSpeedVideoFpsRanges = i;
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    i3 = i4;
                }
            }
        }
    }
}
