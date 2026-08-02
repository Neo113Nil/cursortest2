package io.reactivex.processors;

/* loaded from: classes17.dex */
public final class UnicastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final boolean Camera2StreamConfigurationMap;
    volatile boolean getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> getHighSpeedVideoFpsRangesFor;
    volatile boolean getHighSpeedVideoSizes;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> getHighSpeedVideoSizesFor;
    final java.util.concurrent.atomic.AtomicBoolean getInputFormats;
    boolean getInputSizeshNQ4ISI;
    java.lang.Throwable getOutputFormats;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getOutputMinFrameDuration;
    final java.util.concurrent.atomic.AtomicLong getOutputSizes;
    final io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> getOutputStallDurationlomOqCM;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create() {
        return new io.reactivex.processors.UnicastProcessor<>(bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int i) {
        return new io.reactivex.processors.UnicastProcessor<>(i);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(boolean z) {
        return new io.reactivex.processors.UnicastProcessor<>(bufferSize(), null, z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int i, java.lang.Runnable runnable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new io.reactivex.processors.UnicastProcessor<>(i, runnable);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.UnicastProcessor<T> create(int i, java.lang.Runnable runnable, boolean z) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new io.reactivex.processors.UnicastProcessor<>(i, runnable, z);
    }

    private UnicastProcessor(int i) {
        this(i, null, true);
    }

    private UnicastProcessor(int i, java.lang.Runnable runnable) {
        this(i, runnable, true);
    }

    private UnicastProcessor(int i, java.lang.Runnable runnable, boolean z) {
        this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>(runnable);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean();
        this.getOutputStallDurationlomOqCM = new io.reactivex.processors.UnicastProcessor.UnicastQueueSubscription();
        this.getOutputSizes = new java.util.concurrent.atomic.AtomicLong();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void getHighSpeedVideoFpsRangesFor() {
        long j;
        if (this.getOutputStallDurationlomOqCM.getAndIncrement() != 0) {
            return;
        }
        int i = 1;
        org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor.get();
        int i2 = 1;
        while (subscriber == null) {
            i2 = this.getOutputStallDurationlomOqCM.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
            subscriber = this.getHighSpeedVideoFpsRangesFor.get();
            i = 1;
        }
        if (this.getInputSizeshNQ4ISI) {
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getOutputMinFrameDuration;
            boolean z = this.Camera2StreamConfigurationMap;
            while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                boolean z2 = this.getHighSpeedVideoSizes;
                if (!z && z2 && this.getOutputFormats != null) {
                    spscLinkedArrayQueue.clear();
                    this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                    subscriber.onError(this.getOutputFormats);
                    return;
                }
                subscriber.onNext(null);
                if (z2) {
                    this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                    java.lang.Throwable th = this.getOutputFormats;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                i = this.getOutputStallDurationlomOqCM.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            spscLinkedArrayQueue.clear();
            this.getHighSpeedVideoFpsRangesFor.lazySet(null);
            return;
        }
        io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = this.getOutputMinFrameDuration;
        boolean z3 = !this.Camera2StreamConfigurationMap;
        int i3 = i;
        while (true) {
            long j2 = this.getOutputSizes.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z4 = this.getHighSpeedVideoSizes;
                T poll = spscLinkedArrayQueue2.poll();
                int i4 = poll == null ? i : 0;
                j = j3;
                if (!getHighResolutionOutputSizeshNQ4ISI(z3, z4, i4, subscriber, spscLinkedArrayQueue2)) {
                    if (i4 != 0) {
                        break;
                    }
                    subscriber.onNext(poll);
                    j3 = j + 1;
                    i = 1;
                } else {
                    return;
                }
            }
            if (j2 == j3 && getHighResolutionOutputSizeshNQ4ISI(z3, this.getHighSpeedVideoSizes, spscLinkedArrayQueue2.isEmpty(), subscriber, spscLinkedArrayQueue2)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.getOutputSizes.addAndGet(-j);
            }
            i3 = this.getOutputStallDurationlomOqCM.addAndGet(-i3);
            if (i3 == 0) {
                return;
            } else {
                i = 1;
            }
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, boolean z3, org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            spscLinkedArrayQueue.clear();
            this.getHighSpeedVideoFpsRangesFor.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.getOutputFormats != null) {
            spscLinkedArrayQueue.clear();
            this.getHighSpeedVideoFpsRangesFor.lazySet(null);
            subscriber.onError(this.getOutputFormats);
            return true;
        }
        if (!z3) {
            return false;
        }
        java.lang.Throwable th = this.getOutputFormats;
        this.getHighSpeedVideoFpsRangesFor.lazySet(null);
        if (th != null) {
            subscriber.onError(th);
        } else {
            subscriber.onComplete();
        }
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.getHighSpeedVideoSizes || this.getHighResolutionOutputSizeshNQ4ISI) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizes || this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getOutputMinFrameDuration.offer(t);
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizes || this.getHighResolutionOutputSizeshNQ4ISI) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getOutputFormats = th;
        this.getHighSpeedVideoSizes = true;
        java.lang.Runnable andSet = this.getHighSpeedVideoSizesFor.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighSpeedVideoSizes || this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        java.lang.Runnable andSet = this.getHighSpeedVideoSizesFor.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (!this.getInputFormats.get() && this.getInputFormats.compareAndSet(false, true)) {
            subscriber.onSubscribe(this.getOutputStallDurationlomOqCM);
            this.getHighSpeedVideoFpsRangesFor.set(subscriber);
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                return;
            } else {
                getHighSpeedVideoFpsRangesFor();
                return;
            }
        }
        io.reactivex.internal.subscriptions.EmptySubscription.error(new java.lang.IllegalStateException("This processor allows only a single Subscriber"), subscriber);
    }

    final class UnicastQueueSubscription extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            return io.reactivex.processors.UnicastProcessor.this.getOutputMinFrameDuration.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return io.reactivex.processors.UnicastProcessor.this.getOutputMinFrameDuration.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            io.reactivex.processors.UnicastProcessor.this.getOutputMinFrameDuration.clear();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            io.reactivex.processors.UnicastProcessor.this.getInputSizeshNQ4ISI = true;
            return 2;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(io.reactivex.processors.UnicastProcessor.this.getOutputSizes, j);
                io.reactivex.processors.UnicastProcessor.this.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (io.reactivex.processors.UnicastProcessor.this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            io.reactivex.processors.UnicastProcessor.this.getHighResolutionOutputSizeshNQ4ISI = true;
            java.lang.Runnable andSet = io.reactivex.processors.UnicastProcessor.this.getHighSpeedVideoSizesFor.getAndSet(null);
            if (andSet != null) {
                andSet.run();
            }
            if (io.reactivex.processors.UnicastProcessor.this.getInputSizeshNQ4ISI || io.reactivex.processors.UnicastProcessor.this.getOutputStallDurationlomOqCM.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.processors.UnicastProcessor.this.getOutputMinFrameDuration.clear();
            io.reactivex.processors.UnicastProcessor.this.getHighSpeedVideoFpsRangesFor.lazySet(null);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.getHighSpeedVideoFpsRangesFor.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        if (this.getHighSpeedVideoSizes) {
            return this.getOutputFormats;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.getHighSpeedVideoSizes && this.getOutputFormats == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.getHighSpeedVideoSizes && this.getOutputFormats != null;
    }
}
