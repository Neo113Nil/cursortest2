package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowablePublishMulticast<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public FlowablePublishMulticast(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = function;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor multicastProcessor = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        try {
            ((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(multicastProcessor), "selector returned a null Publisher")).subscribe(new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.OutputCanceller(subscriber, multicastProcessor));
            this.source.subscribe((io.reactivex.FlowableSubscriber) multicastProcessor);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class OutputCanceller<R> implements io.reactivex.FlowableSubscriber<R>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super R> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> getHighSpeedVideoSizes;

        OutputCanceller(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<?> multicastProcessor) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = multicastProcessor;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r) {
            this.Camera2StreamConfigurationMap.onNext(r);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
            this.getHighSpeedVideoSizes.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
            this.getHighSpeedVideoSizes.dispose();
        }
    }

    /* loaded from: classes17.dex */
    static final class MulticastProcessor<T> extends io.reactivex.Flowable<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[0];
        static final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[0];
        final boolean getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        java.lang.Throwable getHighSpeedVideoSizesFor;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> getInputFormats;
        final int getInputSizeshNQ4ISI;
        final int getOutputFormats;
        volatile boolean getOutputMinFrameDuration;
        int getOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicInteger getOutputStallDuration = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> getOutputSizes = new java.util.concurrent.atomic.AtomicReference<>(Camera2StreamConfigurationMap);

        MulticastProcessor(int i, boolean z) {
            this.getInputSizeshNQ4ISI = i;
            this.getOutputFormats = i - (i >> 2);
            this.getHighSpeedVideoFpsRangesFor = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputStallDurationlomOqCM, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputSizeshNQ4ISI = requestFusion;
                        this.getInputFormats = queueSubscription;
                        this.getOutputMinFrameDuration = true;
                        getHighSpeedVideoSizes();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputSizeshNQ4ISI = requestFusion;
                        this.getInputFormats = queueSubscription;
                        io.reactivex.internal.util.QueueDrainHelper.request(subscription, this.getInputSizeshNQ4ISI);
                        return;
                    }
                }
                this.getInputFormats = io.reactivex.internal.util.QueueDrainHelper.createQueue(this.getInputSizeshNQ4ISI);
                io.reactivex.internal.util.QueueDrainHelper.request(subscription, this.getInputSizeshNQ4ISI);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM);
            if (this.getOutputStallDuration.getAndIncrement() != 0 || (simpleQueue = this.getInputFormats) == null) {
                return;
            }
            simpleQueue.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(this.getOutputStallDurationlomOqCM.get());
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getOutputMinFrameDuration) {
                return;
            }
            if (this.getOutputSizeshNQ4ISI == 0 && !this.getInputFormats.offer(t)) {
                this.getOutputStallDurationlomOqCM.get().cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException());
            } else {
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputMinFrameDuration) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizesFor = th;
            this.getOutputMinFrameDuration = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getOutputMinFrameDuration) {
                return;
            }
            this.getOutputMinFrameDuration = true;
            getHighSpeedVideoSizes();
        }

        final void getHighSpeedVideoFpsRangesFor(io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription) {
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.getOutputSizes.get();
                int length = multicastSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (multicastSubscriptionArr[i] == multicastSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    multicastSubscriptionArr2 = Camera2StreamConfigurationMap;
                } else {
                    io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] multicastSubscriptionArr3 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[length - 1];
                    java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i);
                    java.lang.System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr3, i, (length - i) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputSizes, multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[] multicastSubscriptionArr2;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<>(subscriber, this);
            subscriber.onSubscribe(multicastSubscription);
            do {
                multicastSubscriptionArr = this.getOutputSizes.get();
                if (multicastSubscriptionArr == getHighResolutionOutputSizeshNQ4ISI) {
                    java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
                    if (th != null) {
                        subscriber.onError(th);
                        return;
                    } else {
                        subscriber.onComplete();
                        return;
                    }
                }
                int length = multicastSubscriptionArr.length;
                multicastSubscriptionArr2 = new io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription[length + 1];
                java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
                multicastSubscriptionArr2[length] = multicastSubscription;
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputSizes, multicastSubscriptionArr, multicastSubscriptionArr2));
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                getHighSpeedVideoFpsRangesFor(multicastSubscription);
            } else {
                getHighSpeedVideoSizes();
            }
        }

        final void getHighSpeedVideoSizes() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> atomicReference;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr;
            java.lang.Throwable th;
            java.lang.Throwable th2;
            if (this.getOutputStallDuration.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getInputFormats;
            int i = this.getHighSpeedVideoSizes;
            int i2 = this.getOutputFormats;
            boolean z = this.getOutputSizeshNQ4ISI != 1;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> atomicReference2 = this.getOutputSizes;
            io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference2.get();
            int i3 = 1;
            while (true) {
                int length = multicastSubscriptionArr2.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr2.length;
                    long j = Long.MAX_VALUE;
                    long j2 = Long.MAX_VALUE;
                    int i4 = 0;
                    while (i4 < length2) {
                        io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr2[i4];
                        java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                        long j3 = multicastSubscription.get() - multicastSubscription.getHighSpeedVideoFpsRanges;
                        if (j3 == Long.MIN_VALUE) {
                            length--;
                        } else if (j2 > j3) {
                            j2 = j3;
                        }
                        i4++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j4 = 0;
                    if (length == 0) {
                        j2 = 0;
                    }
                    while (j2 != j4) {
                        if (isDisposed()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z2 = this.getOutputMinFrameDuration;
                        if (z2 && !this.getHighSpeedVideoFpsRangesFor && (th2 = this.getHighSpeedVideoSizesFor) != null) {
                            getHighResolutionOutputSizeshNQ4ISI(th2);
                            return;
                        }
                        try {
                            T poll = simpleQueue.poll();
                            boolean z3 = poll == null;
                            if (!z2 || !z3) {
                                if (z3) {
                                    break;
                                }
                                int length3 = multicastSubscriptionArr2.length;
                                int i5 = 0;
                                boolean z4 = false;
                                while (i5 < length3) {
                                    io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr2[i5];
                                    long j5 = multicastSubscription2.get();
                                    if (j5 != Long.MIN_VALUE) {
                                        if (j5 != j) {
                                            multicastSubscription2.getHighSpeedVideoFpsRanges++;
                                        }
                                        multicastSubscription2.Camera2StreamConfigurationMap.onNext(poll);
                                    } else {
                                        z4 = true;
                                    }
                                    i5++;
                                    j = Long.MAX_VALUE;
                                }
                                j2--;
                                if (z && (i = i + 1) == i2) {
                                    this.getOutputStallDurationlomOqCM.get().request(i2);
                                    i = 0;
                                }
                                multicastSubscriptionArr = atomicReference.get();
                                if (!z4 && multicastSubscriptionArr == multicastSubscriptionArr2) {
                                    j4 = 0;
                                    j = Long.MAX_VALUE;
                                }
                                multicastSubscriptionArr2 = multicastSubscriptionArr;
                                atomicReference2 = atomicReference;
                            } else {
                                java.lang.Throwable th3 = this.getHighSpeedVideoSizesFor;
                                if (th3 != null) {
                                    getHighResolutionOutputSizeshNQ4ISI(th3);
                                    return;
                                } else {
                                    Camera2StreamConfigurationMap();
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM);
                            getHighResolutionOutputSizeshNQ4ISI(th4);
                            return;
                        }
                    }
                    if (j2 == j4) {
                        if (isDisposed()) {
                            simpleQueue.clear();
                            return;
                        }
                        boolean z5 = this.getOutputMinFrameDuration;
                        if (z5 && !this.getHighSpeedVideoFpsRangesFor && (th = this.getHighSpeedVideoSizesFor) != null) {
                            getHighResolutionOutputSizeshNQ4ISI(th);
                            return;
                        }
                        if (z5 && simpleQueue.isEmpty()) {
                            java.lang.Throwable th5 = this.getHighSpeedVideoSizesFor;
                            if (th5 != null) {
                                getHighResolutionOutputSizeshNQ4ISI(th5);
                                return;
                            } else {
                                Camera2StreamConfigurationMap();
                                return;
                            }
                        }
                    }
                }
                this.getHighSpeedVideoSizes = i;
                i3 = this.getOutputStallDuration.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.getInputFormats;
                }
                multicastSubscriptionArr = atomicReference.get();
                multicastSubscriptionArr2 = multicastSubscriptionArr;
                atomicReference2 = atomicReference;
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            for (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription : this.getOutputSizes.getAndSet(getHighResolutionOutputSizeshNQ4ISI)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.Camera2StreamConfigurationMap.onError(th);
                }
            }
        }

        private void Camera2StreamConfigurationMap() {
            for (io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastSubscription<T> multicastSubscription : this.getOutputSizes.getAndSet(getHighResolutionOutputSizeshNQ4ISI)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.Camera2StreamConfigurationMap.onComplete();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 8664815189257569791L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        long getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> getHighSpeedVideoSizes;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.flowable.FlowablePublishMulticast.MulticastProcessor<T> multicastProcessor) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this, j);
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this);
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
            }
        }
    }
}
