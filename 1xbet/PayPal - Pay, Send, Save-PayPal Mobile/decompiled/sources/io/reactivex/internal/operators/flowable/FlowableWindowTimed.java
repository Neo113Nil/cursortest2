package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWindowTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizesFor;
    final long getInputFormats;
    final long getInputSizeshNQ4ISI;

    public FlowableWindowTimed(io.reactivex.Flowable<T> flowable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, long j3, int i, boolean z) {
        super(flowable);
        this.getInputSizeshNQ4ISI = j;
        this.getInputFormats = j2;
        this.getHighSpeedVideoSizesFor = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoSizes = j3;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        if (this.getInputSizeshNQ4ISI != this.getInputFormats) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber(serializedSubscriber, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor.createWorker(), this.getHighResolutionOutputSizeshNQ4ISI));
        } else if (this.getHighSpeedVideoSizes == Long.MAX_VALUE) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactUnboundedSubscriber(serializedSubscriber, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber(serializedSubscriber, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowExactUnboundedSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
        volatile boolean Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoSizes;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizesFor;
        final long getInputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.SequentialDisposable getOutputFormats;
        io.reactivex.processors.UnicastProcessor<T> getOutputMinFrameDuration;

        WindowExactUnboundedSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getOutputFormats = new io.reactivex.internal.disposables.SequentialDisposable();
            this.getInputSizeshNQ4ISI = j;
            this.getHighSpeedVideoSizesFor = timeUnit;
            this.getHighSpeedVideoSizes = scheduler;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getOutputMinFrameDuration = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRanges);
                org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
                subscriber.onSubscribe(this);
                long requested = requested();
                if (requested != 0) {
                    subscriber.onNext(this.getOutputMinFrameDuration);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (this.cancelled) {
                        return;
                    }
                    io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = this.getOutputFormats;
                    io.reactivex.Scheduler scheduler = this.getHighSpeedVideoSizes;
                    long j = this.getInputSizeshNQ4ISI;
                    if (sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.getHighSpeedVideoSizesFor))) {
                        subscription.request(Long.MAX_VALUE);
                        return;
                    }
                    return;
                }
                this.cancelled = true;
                subscription.cancel();
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver first window due to lack of requests."));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            if (fastEnter()) {
                this.getOutputMinFrameDuration.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighSpeedVideoSizes();
            }
            this.actual.onError(th);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                getHighSpeedVideoSizes();
            }
            this.actual.onComplete();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                this.Camera2StreamConfigurationMap = true;
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
            }
            this.queue.offer(getHighSpeedVideoFpsRangesFor);
            if (enter()) {
                getHighSpeedVideoSizes();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            r2.onError(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r10.getOutputMinFrameDuration = null;
            r0.clear();
            io.reactivex.internal.disposables.DisposableHelper.dispose(r10.getOutputFormats);
            r0 = r10.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r0 == null) goto L12;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [io.reactivex.processors.UnicastProcessor<T>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighSpeedVideoSizes() {
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputMinFrameDuration;
            int i = 1;
            while (true) {
                boolean z = this.Camera2StreamConfigurationMap;
                boolean z2 = this.done;
                java.lang.Object poll = simpleQueue.poll();
                if (!z2 || (poll != null && poll != getHighSpeedVideoFpsRangesFor)) {
                    if (poll != null) {
                        if (poll == getHighSpeedVideoFpsRangesFor) {
                            unicastProcessor.onComplete();
                            if (!z) {
                                unicastProcessor = (io.reactivex.processors.UnicastProcessor<T>) io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRanges);
                                this.getOutputMinFrameDuration = unicastProcessor;
                                long requested = requested();
                                if (requested != 0) {
                                    subscriber.onNext(unicastProcessor);
                                    if (requested != Long.MAX_VALUE) {
                                        produced(1L);
                                    }
                                } else {
                                    this.getOutputMinFrameDuration = null;
                                    this.queue.clear();
                                    this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
                                    subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver first window due to lack of requests."));
                                    return;
                                }
                            } else {
                                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                            }
                        } else {
                            unicastProcessor.onNext(io.reactivex.internal.util.NotificationLite.getValue(poll));
                        }
                    } else {
                        i = leave(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowExactBoundedSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription {
        final int Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;
        final long getHighSpeedVideoSizesFor;
        final io.reactivex.internal.disposables.SequentialDisposable getInputFormats;
        org.reactivestreams.Subscription getInputSizeshNQ4ISI;
        volatile boolean getOutputFormats;
        final io.reactivex.Scheduler getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputMinFrameDurationlomOqCM;
        final java.util.concurrent.TimeUnit getOutputStallDuration;
        io.reactivex.processors.UnicastProcessor<T> getOutputStallDurationlomOqCM;

        WindowExactBoundedSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i, long j2, boolean z) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getInputFormats = new io.reactivex.internal.disposables.SequentialDisposable();
            this.getHighSpeedVideoSizesFor = j;
            this.getOutputStallDuration = timeUnit;
            this.getOutputMinFrameDuration = scheduler;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = j2;
            this.getHighSpeedVideoSizes = z;
            if (z) {
                this.getOutputMinFrameDurationlomOqCM = scheduler.createWorker();
            } else {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.disposables.Disposable schedulePeriodicallyDirect;
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getInputSizeshNQ4ISI, subscription)) {
                this.getInputSizeshNQ4ISI = subscription;
                org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
                subscriber.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.Camera2StreamConfigurationMap);
                this.getOutputStallDurationlomOqCM = create;
                long requested = requested();
                if (requested != 0) {
                    subscriber.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder(this.getHighSpeedVideoFpsRangesFor, this);
                    if (this.getHighSpeedVideoSizes) {
                        io.reactivex.Scheduler.Worker worker = this.getOutputMinFrameDurationlomOqCM;
                        long j = this.getHighSpeedVideoSizesFor;
                        schedulePeriodicallyDirect = worker.schedulePeriodically(consumerIndexHolder, j, j, this.getOutputStallDuration);
                    } else {
                        io.reactivex.Scheduler scheduler = this.getOutputMinFrameDuration;
                        long j2 = this.getHighSpeedVideoSizesFor;
                        schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(consumerIndexHolder, j2, j2, this.getOutputStallDuration);
                    }
                    if (this.getInputFormats.replace(schedulePeriodicallyDirect)) {
                        subscription.request(Long.MAX_VALUE);
                        return;
                    }
                    return;
                }
                this.cancelled = true;
                subscription.cancel();
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver initial window due to lack of requests."));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getOutputFormats) {
                return;
            }
            if (fastEnter()) {
                io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputStallDurationlomOqCM;
                unicastProcessor.onNext(t);
                long j = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                if (j >= this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoFpsRangesFor++;
                    this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                    unicastProcessor.onComplete();
                    long requested = requested();
                    if (requested != 0) {
                        io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.Camera2StreamConfigurationMap);
                        this.getOutputStallDurationlomOqCM = create;
                        this.actual.onNext(create);
                        if (requested != Long.MAX_VALUE) {
                            produced(1L);
                        }
                        if (this.getHighSpeedVideoSizes) {
                            this.getInputFormats.get().dispose();
                            io.reactivex.Scheduler.Worker worker = this.getOutputMinFrameDurationlomOqCM;
                            io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder(this.getHighSpeedVideoFpsRangesFor, this);
                            long j2 = this.getHighSpeedVideoSizesFor;
                            this.getInputFormats.replace(worker.schedulePeriodically(consumerIndexHolder, j2, j2, this.getOutputStallDuration));
                        }
                    } else {
                        this.getOutputStallDurationlomOqCM = null;
                        this.getInputSizeshNQ4ISI.cancel();
                        this.actual.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver window due to lack of requests"));
                        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
                        io.reactivex.Scheduler.Worker worker2 = this.getOutputMinFrameDurationlomOqCM;
                        if (worker2 != null) {
                            worker2.dispose();
                            return;
                        }
                        return;
                    }
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = j;
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRanges();
            }
            this.actual.onError(th);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
            io.reactivex.Scheduler.Worker worker = this.getOutputMinFrameDurationlomOqCM;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRanges();
            }
            this.actual.onComplete();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
            io.reactivex.Scheduler.Worker worker = this.getOutputMinFrameDurationlomOqCM;
            if (worker != null) {
                worker.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        
            if (r16.getHighSpeedVideoFpsRangesFor != r7.getHighSpeedVideoFpsRanges) goto L61;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges() {
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
            io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputStallDurationlomOqCM;
            int i = 1;
            while (!this.getOutputFormats) {
                boolean z = this.done;
                java.lang.Object poll = simpleQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.getOutputStallDurationlomOqCM = null;
                    simpleQueue.clear();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onError(th);
                    } else {
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onComplete();
                    }
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
                    io.reactivex.Scheduler.Worker worker = this.getOutputMinFrameDurationlomOqCM;
                    if (worker != null) {
                        worker.dispose();
                        return;
                    }
                    return;
                }
                if (z2) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    int i2 = i;
                    if (z3) {
                        io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder = (io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder) poll;
                        if (!this.getHighSpeedVideoSizes) {
                            unicastProcessor = unicastProcessor;
                        }
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onComplete();
                        this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                        io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.Camera2StreamConfigurationMap);
                        this.getOutputStallDurationlomOqCM = create;
                        long requested = requested();
                        if (requested != 0) {
                            subscriber.onNext(create);
                            unicastProcessor = create;
                            if (requested != Long.MAX_VALUE) {
                                produced(1L);
                                unicastProcessor = create;
                            }
                        } else {
                            this.getOutputStallDurationlomOqCM = null;
                            this.queue.clear();
                            this.getInputSizeshNQ4ISI.cancel();
                            subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver first window due to lack of requests."));
                            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
                            io.reactivex.Scheduler.Worker worker2 = this.getOutputMinFrameDurationlomOqCM;
                            if (worker2 != null) {
                                worker2.dispose();
                                return;
                            }
                            return;
                        }
                    } else {
                        ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onNext(io.reactivex.internal.util.NotificationLite.getValue(poll));
                        long j = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                        if (j >= this.getHighSpeedVideoFpsRanges) {
                            this.getHighSpeedVideoFpsRangesFor++;
                            this.getHighResolutionOutputSizeshNQ4ISI = 0L;
                            ((io.reactivex.processors.UnicastProcessor) unicastProcessor).onComplete();
                            long requested2 = requested();
                            if (requested2 != 0) {
                                io.reactivex.processors.UnicastProcessor<T> create2 = io.reactivex.processors.UnicastProcessor.create(this.Camera2StreamConfigurationMap);
                                this.getOutputStallDurationlomOqCM = create2;
                                this.actual.onNext(create2);
                                if (requested2 != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                if (this.getHighSpeedVideoSizes) {
                                    this.getInputFormats.get().dispose();
                                    io.reactivex.Scheduler.Worker worker3 = this.getOutputMinFrameDurationlomOqCM;
                                    io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder consumerIndexHolder2 = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber.ConsumerIndexHolder(this.getHighSpeedVideoFpsRangesFor, this);
                                    long j2 = this.getHighSpeedVideoSizesFor;
                                    this.getInputFormats.replace(worker3.schedulePeriodically(consumerIndexHolder2, j2, j2, this.getOutputStallDuration));
                                }
                                unicastProcessor = create2;
                            } else {
                                this.getOutputStallDurationlomOqCM = null;
                                this.getInputSizeshNQ4ISI.cancel();
                                this.actual.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver window due to lack of requests"));
                                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
                                io.reactivex.Scheduler.Worker worker4 = this.getOutputMinFrameDurationlomOqCM;
                                if (worker4 != null) {
                                    worker4.dispose();
                                    return;
                                }
                                return;
                            }
                        } else {
                            this.getHighResolutionOutputSizeshNQ4ISI = j;
                            unicastProcessor = unicastProcessor;
                        }
                    }
                    i = i2;
                }
            }
            this.getInputSizeshNQ4ISI.cancel();
            simpleQueue.clear();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
            io.reactivex.Scheduler.Worker worker5 = this.getOutputMinFrameDurationlomOqCM;
            if (worker5 != null) {
                worker5.dispose();
            }
        }

        static final class ConsumerIndexHolder implements java.lang.Runnable {
            final long getHighSpeedVideoFpsRanges;
            final io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> getHighSpeedVideoFpsRangesFor;

            ConsumerIndexHolder(long j, io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber) {
                this.getHighSpeedVideoFpsRanges = j;
                this.getHighSpeedVideoFpsRangesFor = windowExactBoundedSubscriber;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowExactBoundedSubscriber<?> windowExactBoundedSubscriber = this.getHighSpeedVideoFpsRangesFor;
                if (!windowExactBoundedSubscriber.cancelled) {
                    windowExactBoundedSubscriber.queue.offer(this);
                } else {
                    windowExactBoundedSubscriber.getOutputFormats = true;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(windowExactBoundedSubscriber.getInputFormats);
                    io.reactivex.Scheduler.Worker worker = windowExactBoundedSubscriber.getOutputMinFrameDurationlomOqCM;
                    if (worker != null) {
                        worker.dispose();
                    }
                }
                if (windowExactBoundedSubscriber.enter()) {
                    windowExactBoundedSubscriber.getHighSpeedVideoFpsRanges();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowSkipSubscriber<T> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, java.lang.Object, io.reactivex.Flowable<T>> implements org.reactivestreams.Subscription, java.lang.Runnable {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;
        final io.reactivex.Scheduler.Worker getOutputFormats;
        final java.util.List<io.reactivex.processors.UnicastProcessor<T>> getOutputMinFrameDuration;

        WindowSkipSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, int i) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getHighSpeedVideoFpsRangesFor = j2;
            this.getInputSizeshNQ4ISI = timeUnit;
            this.getOutputFormats = worker;
            this.getHighSpeedVideoFpsRanges = i;
            this.getOutputMinFrameDuration = new java.util.LinkedList();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.actual.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                long requested = requested();
                if (requested != 0) {
                    io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRanges);
                    this.getOutputMinFrameDuration.add(create);
                    this.actual.onNext(create);
                    if (requested != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    this.getOutputFormats.schedule(new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.Completion(create), this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
                    io.reactivex.Scheduler.Worker worker = this.getOutputFormats;
                    long j = this.getHighSpeedVideoFpsRangesFor;
                    worker.schedulePeriodically(this, j, j, this.getInputSizeshNQ4ISI);
                    subscription.request(Long.MAX_VALUE);
                    return;
                }
                subscription.cancel();
                this.actual.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not emit the first window due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = this.getOutputMinFrameDuration.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(t);
                if (!enter()) {
                    return;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            this.actual.onError(th);
            this.getOutputFormats.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.done = true;
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            this.actual.onComplete();
            this.getOutputFormats.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
        }

        final void getHighSpeedVideoSizes(io.reactivex.processors.UnicastProcessor<T> unicastProcessor) {
            this.queue.offer(new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork(unicastProcessor, false));
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.queue;
            org.reactivestreams.Subscriber<? super V> subscriber = this.actual;
            java.util.List<io.reactivex.processors.UnicastProcessor<T>> list = this.getOutputMinFrameDuration;
            int i = 1;
            while (!this.getHighSpeedVideoSizes) {
                boolean z = this.done;
                java.lang.Object poll = simpleQueue.poll();
                boolean z2 = poll == null;
                boolean z3 = poll instanceof io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork;
                if (z && (z2 || z3)) {
                    simpleQueue.clear();
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    this.getOutputFormats.dispose();
                    return;
                }
                if (z2) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork subjectWork = (io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork) poll;
                    if (subjectWork.getHighResolutionOutputSizeshNQ4ISI) {
                        if (!this.cancelled) {
                            long requested = requested();
                            if (requested != 0) {
                                io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRanges);
                                list.add(create);
                                subscriber.onNext(create);
                                if (requested != Long.MAX_VALUE) {
                                    produced(1L);
                                }
                                this.getOutputFormats.schedule(new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.Completion(create), this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
                            } else {
                                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Can't emit window due to lack of requests"));
                            }
                        }
                    } else {
                        list.remove(subjectWork.Camera2StreamConfigurationMap);
                        subjectWork.Camera2StreamConfigurationMap.onComplete();
                        if (list.isEmpty() && this.cancelled) {
                            this.getHighSpeedVideoSizes = true;
                        }
                    }
                } else {
                    java.util.Iterator<io.reactivex.processors.UnicastProcessor<T>> it3 = list.iterator();
                    while (it3.hasNext()) {
                        it3.next().onNext(poll);
                    }
                }
            }
            this.Camera2StreamConfigurationMap.cancel();
            this.getOutputFormats.dispose();
            simpleQueue.clear();
            list.clear();
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork subjectWork = new io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.SubjectWork(io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRanges), true);
            if (!this.cancelled) {
                this.queue.offer(subjectWork);
            }
            if (enter()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        static final class SubjectWork<T> {
            final io.reactivex.processors.UnicastProcessor<T> Camera2StreamConfigurationMap;
            final boolean getHighResolutionOutputSizeshNQ4ISI;

            SubjectWork(io.reactivex.processors.UnicastProcessor<T> unicastProcessor, boolean z) {
                this.Camera2StreamConfigurationMap = unicastProcessor;
                this.getHighResolutionOutputSizeshNQ4ISI = z;
            }
        }

        final class Completion implements java.lang.Runnable {
            private final io.reactivex.processors.UnicastProcessor<T> getHighResolutionOutputSizeshNQ4ISI;

            Completion(io.reactivex.processors.UnicastProcessor<T> unicastProcessor) {
                this.getHighResolutionOutputSizeshNQ4ISI = unicastProcessor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.flowable.FlowableWindowTimed.WindowSkipSubscriber.this.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }
    }
}
