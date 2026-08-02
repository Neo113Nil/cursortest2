package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelFromPublisher<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final int Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoSizes;

    public ParallelFromPublisher(org.reactivestreams.Publisher<? extends T> publisher, int i, int i2) {
        this.getHighSpeedVideoSizes = publisher;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher(subscriberArr, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelDispatcher<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        java.lang.Throwable Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final long[] getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;
        final int getInputFormats;
        int getInputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicLongArray getOutputFormats;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputMinFrameDuration;
        final org.reactivestreams.Subscriber<? super T>[] getOutputMinFrameDurationlomOqCM;
        int getOutputSizes;
        final java.util.concurrent.atomic.AtomicInteger getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        org.reactivestreams.Subscription getOutputStallDurationlomOqCM;

        ParallelDispatcher(org.reactivestreams.Subscriber<? super T>[] subscriberArr, int i) {
            this.getOutputMinFrameDurationlomOqCM = subscriberArr;
            this.getInputFormats = i;
            this.getHighSpeedVideoSizesFor = i - (i >> 2);
            int length = subscriberArr.length;
            int i2 = length + length;
            java.util.concurrent.atomic.AtomicLongArray atomicLongArray = new java.util.concurrent.atomic.AtomicLongArray(i2 + 1);
            this.getOutputFormats = atomicLongArray;
            atomicLongArray.lazySet(i2, length);
            this.getHighSpeedVideoFpsRanges = new long[length];
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDurationlomOqCM, subscription)) {
                this.getOutputStallDurationlomOqCM = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getOutputSizes = requestFusion;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.getHighSpeedVideoSizes = true;
                        Camera2StreamConfigurationMap();
                        getHighSpeedVideoSizes();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputSizes = requestFusion;
                        this.getOutputMinFrameDuration = queueSubscription;
                        Camera2StreamConfigurationMap();
                        subscription.request(this.getInputFormats);
                        return;
                    }
                }
                this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscArrayQueue(this.getInputFormats);
                Camera2StreamConfigurationMap();
                subscription.request(this.getInputFormats);
            }
        }

        private void Camera2StreamConfigurationMap() {
            org.reactivestreams.Subscriber<? super T>[] subscriberArr = this.getOutputMinFrameDurationlomOqCM;
            int length = subscriberArr.length;
            int i = 0;
            while (i < length && !this.getHighSpeedVideoFpsRangesFor) {
                int i2 = i + 1;
                this.getOutputSizeshNQ4ISI.lazySet(i2);
                subscriberArr[i].onSubscribe(new io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.RailSubscription(i, length));
                i = i2;
            }
        }

        final class RailSubscription implements org.reactivestreams.Subscription {
            final int Camera2StreamConfigurationMap;
            final int getHighSpeedVideoSizes;

            RailSubscription(int i, int i2) {
                this.getHighSpeedVideoSizes = i;
                this.Camera2StreamConfigurationMap = i2;
            }

            @Override // org.reactivestreams.Subscription
            public final void request(long j) {
                long j2;
                if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                    java.util.concurrent.atomic.AtomicLongArray atomicLongArray = io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.this.getOutputFormats;
                    do {
                        j2 = atomicLongArray.get(this.getHighSpeedVideoSizes);
                        if (j2 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.getHighSpeedVideoSizes, j2, io.reactivex.internal.util.BackpressureHelper.addCap(j2, j)));
                    if (io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.this.getOutputSizeshNQ4ISI.get() == this.Camera2StreamConfigurationMap) {
                        io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.this.getHighSpeedVideoSizes();
                    }
                }
            }

            @Override // org.reactivestreams.Subscription
            public final void cancel() {
                if (io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.this.getOutputFormats.compareAndSet(this.getHighSpeedVideoSizes + this.Camera2StreamConfigurationMap, 0L, 1L)) {
                    io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher parallelDispatcher = io.reactivex.internal.operators.parallel.ParallelFromPublisher.ParallelDispatcher.this;
                    int i = this.Camera2StreamConfigurationMap;
                    if (parallelDispatcher.getOutputFormats.decrementAndGet(i + i) == 0) {
                        parallelDispatcher.getHighSpeedVideoFpsRangesFor = true;
                        parallelDispatcher.getOutputStallDurationlomOqCM.cancel();
                        if (parallelDispatcher.getAndIncrement() == 0) {
                            parallelDispatcher.getOutputMinFrameDuration.clear();
                        }
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getOutputSizes == 0 && !this.getOutputMinFrameDuration.offer(t)) {
                this.getOutputStallDurationlomOqCM.cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue is full?"));
            } else {
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoSizes();
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoSizes() {
            boolean z;
            int i;
            java.lang.Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            long j = 1;
            if (this.getOutputSizes == 1) {
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputMinFrameDuration;
                org.reactivestreams.Subscriber<? super T>[] subscriberArr = this.getOutputMinFrameDurationlomOqCM;
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = this.getOutputFormats;
                long[] jArr = this.getHighSpeedVideoFpsRanges;
                int length = jArr.length;
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = 1;
                while (true) {
                    int i4 = 0;
                    while (!this.getHighSpeedVideoFpsRangesFor) {
                        if (simpleQueue.isEmpty()) {
                            for (org.reactivestreams.Subscriber<? super T> subscriber : subscriberArr) {
                                subscriber.onComplete();
                            }
                            return;
                        }
                        long j2 = atomicLongArray.get(i2);
                        long j3 = jArr[i2];
                        if (j2 == j3 || atomicLongArray.get(length + i2) != 0) {
                            i4++;
                        } else {
                            try {
                                T poll = simpleQueue.poll();
                                if (poll == null) {
                                    for (org.reactivestreams.Subscriber<? super T> subscriber2 : subscriberArr) {
                                        subscriber2.onComplete();
                                    }
                                    return;
                                }
                                subscriberArr[i2].onNext(poll);
                                jArr[i2] = j3 + 1;
                                i4 = 0;
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.getOutputStallDurationlomOqCM.cancel();
                                for (org.reactivestreams.Subscriber<? super T> subscriber3 : subscriberArr) {
                                    subscriber3.onError(th2);
                                }
                                return;
                            }
                        }
                        i2++;
                        if (i2 == length) {
                            i2 = 0;
                        }
                        if (i4 == length) {
                            int i5 = get();
                            if (i5 == i3) {
                                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                                i3 = addAndGet(-i3);
                                if (i3 == 0) {
                                    return;
                                }
                            } else {
                                i3 = i5;
                            }
                        }
                    }
                    simpleQueue.clear();
                    return;
                }
            }
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getOutputMinFrameDuration;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = this.getOutputMinFrameDurationlomOqCM;
            java.util.concurrent.atomic.AtomicLongArray atomicLongArray2 = this.getOutputFormats;
            long[] jArr2 = this.getHighSpeedVideoFpsRanges;
            int length2 = jArr2.length;
            int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i7 = this.getInputSizeshNQ4ISI;
            int i8 = 1;
            while (true) {
                int i9 = 0;
                while (!this.getHighSpeedVideoFpsRangesFor) {
                    boolean z2 = this.getHighSpeedVideoSizes;
                    if (z2 && (th = this.Camera2StreamConfigurationMap) != null) {
                        simpleQueue2.clear();
                        for (org.reactivestreams.Subscriber<? super T> subscriber4 : subscriberArr2) {
                            subscriber4.onError(th);
                        }
                        return;
                    }
                    boolean isEmpty = simpleQueue2.isEmpty();
                    if (z2 && isEmpty) {
                        for (org.reactivestreams.Subscriber<? super T> subscriber5 : subscriberArr2) {
                            subscriber5.onComplete();
                        }
                        return;
                    }
                    if (!isEmpty) {
                        long j4 = atomicLongArray2.get(i6);
                        long j5 = jArr2[i6];
                        if (j4 == j5 || atomicLongArray2.get(length2 + i6) != 0) {
                            z = true;
                            i9++;
                        } else {
                            try {
                                T poll2 = simpleQueue2.poll();
                                if (poll2 != null) {
                                    subscriberArr2[i6].onNext(poll2);
                                    jArr2[i6] = j5 + j;
                                    i7++;
                                    if (i7 == this.getHighSpeedVideoSizesFor) {
                                        this.getOutputStallDurationlomOqCM.request(i7);
                                        i7 = 0;
                                    }
                                    z = true;
                                    i9 = 0;
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                this.getOutputStallDurationlomOqCM.cancel();
                                for (org.reactivestreams.Subscriber<? super T> subscriber6 : subscriberArr2) {
                                    subscriber6.onError(th3);
                                }
                                return;
                            }
                        }
                        i6++;
                        if (i6 == length2) {
                            i6 = 0;
                        }
                        if (i9 == length2) {
                            i = get();
                            if (i != i8) {
                                this.getHighResolutionOutputSizeshNQ4ISI = i6;
                                this.getInputSizeshNQ4ISI = i7;
                                i8 = addAndGet(-i8);
                                if (i8 == 0) {
                                    return;
                                }
                            } else {
                                i8 = i;
                            }
                            j = 1;
                        } else {
                            j = 1;
                        }
                    }
                    z = true;
                    i = get();
                    if (i != i8) {
                    }
                    j = 1;
                }
                simpleQueue2.clear();
                return;
            }
        }
    }
}
