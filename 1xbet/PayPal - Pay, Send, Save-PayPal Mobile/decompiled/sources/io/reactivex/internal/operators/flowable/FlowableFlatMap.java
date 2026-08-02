package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFlatMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> getHighSpeedVideoSizes;

    public FlowableFlatMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
        super(flowable);
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.getHighSpeedVideoSizes)) {
            return;
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) subscribe(subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static <T, U> io.reactivex.FlowableSubscriber<T> subscribe(org.reactivestreams.Subscriber<? super U> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
        return new io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber(subscriber, function, z, i, i2);
    }

    /* loaded from: classes17.dex */
    static final class MergeSubscriber<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[0];
        static final io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super U> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        long getHighSpeedVideoSizesFor;
        final boolean getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        int getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDurationlomOqCM;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> getOutputSizes;
        final int getOutputSizeshNQ4ISI;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<U> getOutputStallDuration;
        int getOutputStallDurationlomOqCM;
        long getValidOutputFormatsForInputhNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]> isOutputSupportedFor;
        org.reactivestreams.Subscription isOutputSupportedForhNQ4ISI;
        final int unwrapAs;

        MergeSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, boolean z, int i, int i2) {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[]> atomicReference = new java.util.concurrent.atomic.AtomicReference<>();
            this.isOutputSupportedFor = atomicReference;
            this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputSizes = function;
            this.getInputFormats = z;
            this.getOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.unwrapAs = java.lang.Math.max(1, i >> 1);
            atomicReference.lazySet(Camera2StreamConfigurationMap);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.isOutputSupportedForhNQ4ISI, subscription)) {
                this.isOutputSupportedForhNQ4ISI = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                int i = this.getOutputSizeshNQ4ISI;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[] innerSubscriberArr2;
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(t), "The mapper returned a null Publisher");
                if (publisher instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object call = ((java.util.concurrent.Callable) publisher).call();
                        if (call == null) {
                            if (this.getOutputSizeshNQ4ISI == Integer.MAX_VALUE || this.getHighSpeedVideoSizes) {
                                return;
                            }
                            int i = this.getOutputStallDurationlomOqCM + 1;
                            this.getOutputStallDurationlomOqCM = i;
                            int i2 = this.unwrapAs;
                            if (i == i2) {
                                this.getOutputStallDurationlomOqCM = 0;
                                this.isOutputSupportedForhNQ4ISI.request(i2);
                                return;
                            }
                            return;
                        }
                        if (get() == 0 && compareAndSet(0, 1)) {
                            long j = this.getOutputMinFrameDurationlomOqCM.get();
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue = this.getOutputStallDuration;
                            if (j != 0 && (simpleQueue == 0 || simpleQueue.isEmpty())) {
                                this.getHighSpeedVideoFpsRangesFor.onNext(call);
                                if (j != Long.MAX_VALUE) {
                                    this.getOutputMinFrameDurationlomOqCM.decrementAndGet();
                                }
                                if (this.getOutputSizeshNQ4ISI != Integer.MAX_VALUE && !this.getHighSpeedVideoSizes) {
                                    int i3 = this.getOutputStallDurationlomOqCM + 1;
                                    this.getOutputStallDurationlomOqCM = i3;
                                    int i4 = this.unwrapAs;
                                    if (i3 == i4) {
                                        this.getOutputStallDurationlomOqCM = 0;
                                        this.isOutputSupportedForhNQ4ISI.request(i4);
                                    }
                                }
                            } else {
                                if (simpleQueue == 0) {
                                    simpleQueue = getHighSpeedVideoFpsRangesFor();
                                }
                                if (!simpleQueue.offer(call)) {
                                    onError(new java.lang.IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            }
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } else if (!getHighSpeedVideoFpsRangesFor().offer(call)) {
                            onError(new java.lang.IllegalStateException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                        getHighSpeedVideoFpsRanges();
                        return;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getOutputFormats.addThrowable(th);
                        if (getAndIncrement() == 0) {
                            getHighSpeedVideoFpsRanges();
                            return;
                        }
                        return;
                    }
                }
                long j2 = this.getValidOutputFormatsForInputhNQ4ISI;
                this.getValidOutputFormatsForInputhNQ4ISI = 1 + j2;
                io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber innerSubscriber = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber(this, j2);
                do {
                    innerSubscriberArr = this.isOutputSupportedFor.get();
                    if (innerSubscriberArr == getHighResolutionOutputSizeshNQ4ISI) {
                        innerSubscriber.dispose();
                        return;
                    }
                    int length = innerSubscriberArr.length;
                    innerSubscriberArr2 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[length + 1];
                    java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.isOutputSupportedFor, innerSubscriberArr, innerSubscriberArr2));
                publisher.subscribe(innerSubscriber);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.isOutputSupportedForhNQ4ISI.cancel();
                onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void getHighSpeedVideoSizes(io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber) {
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.isOutputSupportedFor.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr[i] == innerSubscriber) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = Camera2StreamConfigurationMap;
                } else {
                    io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr3 = new io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber[length - 1];
                    java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    java.lang.System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.isOutputSupportedFor, innerSubscriberArr, innerSubscriberArr2));
        }

        private io.reactivex.internal.fuseable.SimpleQueue<U> getHighSpeedVideoFpsRangesFor() {
            io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.getOutputStallDuration;
            if (simplePlainQueue == null) {
                if (this.getOutputSizeshNQ4ISI == Integer.MAX_VALUE) {
                    simplePlainQueue = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(this.getHighSpeedVideoFpsRanges);
                } else {
                    simplePlainQueue = new io.reactivex.internal.queue.SpscArrayQueue<>(this.getOutputSizeshNQ4ISI);
                }
                this.getOutputStallDuration = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getInputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (this.getOutputFormats.addThrowable(th)) {
                this.getInputSizeshNQ4ISI = true;
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRanges();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            this.getInputSizeshNQ4ISI = true;
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDurationlomOqCM, j);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRanges();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] andSet;
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.isOutputSupportedForhNQ4ISI.cancel();
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr = this.isOutputSupportedFor.get();
            io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr2 = getHighResolutionOutputSizeshNQ4ISI;
            if (innerSubscriberArr != innerSubscriberArr2 && (andSet = this.isOutputSupportedFor.getAndSet(innerSubscriberArr2)) != innerSubscriberArr2) {
                for (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?> innerSubscriber : andSet) {
                    innerSubscriber.dispose();
                }
                java.lang.Throwable terminate = this.getOutputFormats.terminate();
                if (terminate != null && terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    io.reactivex.plugins.RxJavaPlugins.onError(terminate);
                }
            }
            if (getAndIncrement() != 0 || (simplePlainQueue = this.getOutputStallDuration) == null) {
                return;
            }
            simplePlainQueue.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoFpsRanges() {
            long j;
            int i;
            long j2;
            long j3;
            boolean z;
            int i2;
            long j4;
            java.lang.Object obj;
            org.reactivestreams.Subscriber<? super U> subscriber = this.getHighSpeedVideoFpsRangesFor;
            int i3 = 1;
            while (!getHighSpeedVideoSizes()) {
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.getOutputStallDuration;
                long j5 = this.getOutputMinFrameDurationlomOqCM.get();
                boolean z2 = j5 == Long.MAX_VALUE;
                long j6 = 0;
                if (simplePlainQueue != null) {
                    j = 0;
                    do {
                        long j7 = 0;
                        obj = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            U poll = simplePlainQueue.poll();
                            if (getHighSpeedVideoSizes()) {
                                return;
                            }
                            if (poll == null) {
                                obj = poll;
                                break;
                            }
                            subscriber.onNext(poll);
                            j++;
                            j7++;
                            j5--;
                            obj = poll;
                        }
                        if (j7 != 0) {
                            j5 = z2 ? Long.MAX_VALUE : this.getOutputMinFrameDurationlomOqCM.addAndGet(-j7);
                        }
                        if (j5 == 0) {
                            break;
                        }
                    } while (obj != null);
                } else {
                    j = 0;
                }
                boolean z3 = this.getInputSizeshNQ4ISI;
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue2 = this.getOutputStallDuration;
                io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?>[] innerSubscriberArr = this.isOutputSupportedFor.get();
                int length = innerSubscriberArr.length;
                if (z3 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    java.lang.Throwable terminate = this.getOutputFormats.terminate();
                    if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        if (terminate == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(terminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    i = i3;
                    long j8 = this.getHighSpeedVideoSizesFor;
                    int i4 = this.getOutputMinFrameDuration;
                    if (length <= i4 || innerSubscriberArr[i4].getHighResolutionOutputSizeshNQ4ISI != j8) {
                        if (length <= i4) {
                            i4 = 0;
                        }
                        for (int i5 = 0; i5 < length && innerSubscriberArr[i4].getHighResolutionOutputSizeshNQ4ISI != j8; i5++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.getOutputMinFrameDuration = i4;
                        this.getHighSpeedVideoSizesFor = innerSubscriberArr[i4].getHighResolutionOutputSizeshNQ4ISI;
                    }
                    int i6 = i4;
                    boolean z4 = false;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            z = z4;
                            break;
                        }
                        if (getHighSpeedVideoSizes()) {
                            return;
                        }
                        io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr[i6];
                        java.lang.Object obj2 = null;
                        while (!getHighSpeedVideoSizes()) {
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue = innerSubscriber.getInputSizeshNQ4ISI;
                            int i8 = length;
                            if (simpleQueue != null) {
                                java.lang.Object obj3 = obj2;
                                long j9 = j6;
                                while (true) {
                                    if (j5 == j6) {
                                        break;
                                    }
                                    try {
                                        U poll2 = simpleQueue.poll();
                                        if (poll2 == null) {
                                            obj3 = poll2;
                                            j6 = 0;
                                            break;
                                        }
                                        subscriber.onNext(poll2);
                                        if (getHighSpeedVideoSizes()) {
                                            return;
                                        }
                                        j5--;
                                        j9++;
                                        obj3 = poll2;
                                        j6 = 0;
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        innerSubscriber.dispose();
                                        this.getOutputFormats.addThrowable(th);
                                        if (!this.getInputFormats) {
                                            this.isOutputSupportedForhNQ4ISI.cancel();
                                        }
                                        if (getHighSpeedVideoSizes()) {
                                            return;
                                        }
                                        getHighSpeedVideoSizes(innerSubscriber);
                                        i7++;
                                        z4 = true;
                                        i2 = 1;
                                    }
                                }
                                if (j9 != j6) {
                                    j5 = !z2 ? this.getOutputMinFrameDurationlomOqCM.addAndGet(-j9) : Long.MAX_VALUE;
                                    innerSubscriber.getHighSpeedVideoFpsRangesFor(j9);
                                    j4 = 0;
                                } else {
                                    j4 = j6;
                                }
                                if (j5 != j4 && obj3 != null) {
                                    length = i8;
                                    obj2 = obj3;
                                    j6 = 0;
                                }
                            }
                            boolean z5 = innerSubscriber.getHighSpeedVideoSizes;
                            io.reactivex.internal.fuseable.SimpleQueue<U> simpleQueue2 = innerSubscriber.getInputSizeshNQ4ISI;
                            if (z5 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                getHighSpeedVideoSizes(innerSubscriber);
                                if (getHighSpeedVideoSizes()) {
                                    return;
                                }
                                j++;
                                z4 = true;
                            }
                            if (j5 == 0) {
                                z = z4;
                                break;
                            }
                            i6++;
                            if (i6 == i8) {
                                i6 = 0;
                            }
                            i2 = 1;
                            i7 += i2;
                            length = i8;
                            j6 = 0;
                        }
                        return;
                    }
                    this.getOutputMinFrameDuration = i6;
                    this.getHighSpeedVideoSizesFor = innerSubscriberArr[i6].getHighResolutionOutputSizeshNQ4ISI;
                    j3 = j;
                    j2 = 0;
                } else {
                    i = i3;
                    j2 = 0;
                    j3 = j;
                    z = false;
                }
                if (j3 != j2 && !this.getHighSpeedVideoSizes) {
                    this.isOutputSupportedForhNQ4ISI.request(j3);
                }
                int i9 = i;
                if (z) {
                    i3 = i9;
                } else {
                    i3 = addAndGet(-i9);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
        }

        private boolean getHighSpeedVideoSizes() {
            if (!this.getHighSpeedVideoSizes) {
                if (this.getInputFormats || this.getOutputFormats.get() == null) {
                    return false;
                }
                io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue = this.getOutputStallDuration;
                if (simplePlainQueue != null) {
                    simplePlainQueue.clear();
                }
                java.lang.Throwable terminate = this.getOutputFormats.terminate();
                if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    this.getHighSpeedVideoFpsRangesFor.onError(terminate);
                }
                return true;
            }
            io.reactivex.internal.fuseable.SimplePlainQueue<U> simplePlainQueue2 = this.getOutputStallDuration;
            if (simplePlainQueue2 != null) {
                simplePlainQueue2.clear();
            }
            return true;
        }
    }

    /* loaded from: classes17.dex */
    static final class InnerSubscriber<T, U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        long getInputFormats;
        volatile io.reactivex.internal.fuseable.SimpleQueue<U> getInputSizeshNQ4ISI;
        final io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> getOutputMinFrameDuration;

        InnerSubscriber(io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getOutputMinFrameDuration = mergeSubscriber;
            int i = mergeSubscriber.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.Camera2StreamConfigurationMap = i >> 2;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getHighSpeedVideoFpsRanges = requestFusion;
                        this.getInputSizeshNQ4ISI = queueSubscription;
                        this.getHighSpeedVideoSizes = true;
                        io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber = this.getOutputMinFrameDuration;
                        if (mergeSubscriber.getAndIncrement() == 0) {
                            mergeSubscriber.getHighSpeedVideoFpsRanges();
                            return;
                        }
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getHighSpeedVideoFpsRanges = requestFusion;
                        this.getInputSizeshNQ4ISI = queueSubscription;
                    }
                }
                subscription.request(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(U u) {
            if (this.getHighSpeedVideoFpsRanges != 2) {
                io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber = this.getOutputMinFrameDuration;
                if (mergeSubscriber.get() == 0 && mergeSubscriber.compareAndSet(0, 1)) {
                    long j = mergeSubscriber.getOutputMinFrameDurationlomOqCM.get();
                    io.reactivex.internal.fuseable.SimpleQueue simpleQueue = this.getInputSizeshNQ4ISI;
                    if (j != 0 && (simpleQueue == null || simpleQueue.isEmpty())) {
                        mergeSubscriber.getHighSpeedVideoFpsRangesFor.onNext(u);
                        if (j != Long.MAX_VALUE) {
                            mergeSubscriber.getOutputMinFrameDurationlomOqCM.decrementAndGet();
                        }
                        getHighSpeedVideoFpsRangesFor(1L);
                    } else {
                        if (simpleQueue == null && (simpleQueue = this.getInputSizeshNQ4ISI) == null) {
                            simpleQueue = new io.reactivex.internal.queue.SpscArrayQueue(mergeSubscriber.getHighSpeedVideoFpsRanges);
                            this.getInputSizeshNQ4ISI = simpleQueue;
                        }
                        if (!simpleQueue.offer(u)) {
                            mergeSubscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Inner queue full?!"));
                            return;
                        }
                    }
                    if (mergeSubscriber.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    io.reactivex.internal.fuseable.SimpleQueue simpleQueue2 = this.getInputSizeshNQ4ISI;
                    if (simpleQueue2 == null) {
                        simpleQueue2 = new io.reactivex.internal.queue.SpscArrayQueue(mergeSubscriber.getHighSpeedVideoFpsRanges);
                        this.getInputSizeshNQ4ISI = simpleQueue2;
                    }
                    if (!simpleQueue2.offer(u)) {
                        mergeSubscriber.onError(new io.reactivex.exceptions.MissingBackpressureException("Inner queue full?!"));
                        return;
                    } else if (mergeSubscriber.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeSubscriber.getHighSpeedVideoFpsRanges();
                return;
            }
            io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber2 = this.getOutputMinFrameDuration;
            if (mergeSubscriber2.getAndIncrement() == 0) {
                mergeSubscriber2.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
            io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber = this.getOutputMinFrameDuration;
            if (mergeSubscriber.getOutputFormats.addThrowable(th)) {
                this.getHighSpeedVideoSizes = true;
                if (!mergeSubscriber.getInputFormats) {
                    mergeSubscriber.isOutputSupportedForhNQ4ISI.cancel();
                    for (io.reactivex.internal.operators.flowable.FlowableFlatMap.InnerSubscriber<?, ?> innerSubscriber : mergeSubscriber.isOutputSupportedFor.getAndSet(io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.getHighResolutionOutputSizeshNQ4ISI)) {
                        innerSubscriber.dispose();
                    }
                }
                if (mergeSubscriber.getAndIncrement() == 0) {
                    mergeSubscriber.getHighSpeedVideoFpsRanges();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber<T, U> mergeSubscriber = this.getOutputMinFrameDuration;
            if (mergeSubscriber.getAndIncrement() == 0) {
                mergeSubscriber.getHighSpeedVideoFpsRanges();
            }
        }

        final void getHighSpeedVideoFpsRangesFor(long j) {
            if (this.getHighSpeedVideoFpsRanges != 1) {
                long j2 = this.getInputFormats + j;
                if (j2 >= this.Camera2StreamConfigurationMap) {
                    this.getInputFormats = 0L;
                    get().request(j2);
                } else {
                    this.getInputFormats = j2;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
