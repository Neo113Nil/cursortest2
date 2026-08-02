package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableZip<T, R> extends io.reactivex.Flowable<R> {
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<? extends T>[] getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getOutputFormats;

    public FlowableZip(org.reactivestreams.Publisher<? extends T>[] publisherArr, java.lang.Iterable<? extends org.reactivestreams.Publisher<? extends T>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = publisherArr;
        this.Camera2StreamConfigurationMap = iterable;
        this.getOutputFormats = function;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        int length;
        org.reactivestreams.Publisher<? extends T>[] publisherArr = this.getHighSpeedVideoFpsRangesFor;
        if (publisherArr == null) {
            publisherArr = new org.reactivestreams.Publisher[8];
            length = 0;
            for (org.reactivestreams.Publisher<? extends T> publisher : this.Camera2StreamConfigurationMap) {
                if (length == publisherArr.length) {
                    org.reactivestreams.Publisher<? extends T>[] publisherArr2 = new org.reactivestreams.Publisher[(length >> 2) + length];
                    java.lang.System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                    publisherArr = publisherArr2;
                }
                publisherArr[length] = publisher;
                length++;
            }
        } else {
            length = publisherArr.length;
        }
        int i = length;
        if (i == 0) {
            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator zipCoordinator = new io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator(subscriber, this.getOutputFormats, i, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        subscriber.onSubscribe(zipCoordinator);
        io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] zipSubscriberArr = zipCoordinator.getInputSizeshNQ4ISI;
        for (int i2 = 0; i2 < i && !zipCoordinator.Camera2StreamConfigurationMap; i2++) {
            if (!zipCoordinator.getHighSpeedVideoFpsRangesFor && zipCoordinator.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                return;
            }
            publisherArr[i2].subscribe(zipSubscriberArr[i2]);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipCoordinator<T, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -2434867452883857743L;
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.internal.util.AtomicThrowable getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final java.lang.Object[] getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getInputFormats;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] getInputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicLong getOutputFormats;

        ZipCoordinator(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function, int i, int i2, boolean z) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRangesFor = z;
            io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] zipSubscriberArr = new io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<>(this, i2);
            }
            this.getHighSpeedVideoSizes = new java.lang.Object[i];
            this.getInputSizeshNQ4ISI = zipSubscriberArr;
            this.getOutputFormats = new java.util.concurrent.atomic.AtomicLong();
            this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputFormats, j);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber : this.getInputSizeshNQ4ISI) {
                zipSubscriber.cancel();
            }
        }

        final void getHighSpeedVideoFpsRangesFor(io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber, java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th)) {
                zipSubscriber.getHighResolutionOutputSizeshNQ4ISI = true;
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            boolean z;
            T poll;
            boolean z2;
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.getHighSpeedVideoFpsRanges;
                io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R>[] zipSubscriberArr = this.getInputSizeshNQ4ISI;
                int length = zipSubscriberArr.length;
                java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
                int i = 1;
                do {
                    long j = this.getOutputFormats.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (this.Camera2StreamConfigurationMap) {
                            return;
                        }
                        if (!this.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                            for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber : this.getInputSizeshNQ4ISI) {
                                zipSubscriber.cancel();
                            }
                            subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                            return;
                        }
                        boolean z3 = false;
                        for (int i2 = 0; i2 < length; i2++) {
                            io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i2];
                            if (objArr[i2] == null) {
                                try {
                                    z = zipSubscriber2.getHighResolutionOutputSizeshNQ4ISI;
                                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = zipSubscriber2.getHighSpeedVideoSizesFor;
                                    poll = simpleQueue != null ? simpleQueue.poll() : null;
                                    z2 = poll == null;
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th);
                                    if (!this.getHighSpeedVideoFpsRangesFor) {
                                        for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber3 : this.getInputSizeshNQ4ISI) {
                                            zipSubscriber3.cancel();
                                        }
                                        subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                        return;
                                    }
                                }
                                if (z && z2) {
                                    for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber4 : this.getInputSizeshNQ4ISI) {
                                        zipSubscriber4.cancel();
                                    }
                                    if (this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                                        subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (!z2) {
                                    objArr[i2] = poll;
                                }
                                z3 = true;
                            }
                        }
                        if (z3) {
                            break;
                        }
                        try {
                            subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(objArr.clone()), "The zipper returned a null value"));
                            j2++;
                            java.util.Arrays.fill(objArr, (java.lang.Object) null);
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber5 : this.getInputSizeshNQ4ISI) {
                                zipSubscriber5.cancel();
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th2);
                            subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                            return;
                        }
                    }
                    if (j == j2) {
                        if (this.Camera2StreamConfigurationMap) {
                            return;
                        }
                        if (!this.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                            for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber6 : this.getInputSizeshNQ4ISI) {
                                zipSubscriber6.cancel();
                            }
                            subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                            return;
                        }
                        for (int i3 = 0; i3 < length; i3++) {
                            io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber7 = zipSubscriberArr[i3];
                            if (objArr[i3] == null) {
                                try {
                                    boolean z4 = zipSubscriber7.getHighResolutionOutputSizeshNQ4ISI;
                                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = zipSubscriber7.getHighSpeedVideoSizesFor;
                                    T poll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                    boolean z5 = poll2 == null;
                                    if (z4 && z5) {
                                        for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber8 : this.getInputSizeshNQ4ISI) {
                                            zipSubscriber8.cancel();
                                        }
                                        if (this.getHighResolutionOutputSizeshNQ4ISI.get() != null) {
                                            subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                            return;
                                        } else {
                                            subscriber.onComplete();
                                            return;
                                        }
                                    }
                                    if (!z5) {
                                        objArr[i3] = poll2;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                    this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th3);
                                    if (!this.getHighSpeedVideoFpsRangesFor) {
                                        for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber9 : this.getInputSizeshNQ4ISI) {
                                            zipSubscriber9.cancel();
                                        }
                                        subscriber.onError(this.getHighResolutionOutputSizeshNQ4ISI.terminate());
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    if (j2 != 0) {
                        for (io.reactivex.internal.operators.flowable.FlowableZip.ZipSubscriber<T, R> zipSubscriber10 : zipSubscriberArr) {
                            zipSubscriber10.request(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.getOutputFormats.addAndGet(-j2);
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4627193790118206028L;
        final io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;
        io.reactivex.internal.fuseable.SimpleQueue<T> getHighSpeedVideoSizesFor;
        int getOutputMinFrameDuration;

        ZipSubscriber(io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator<T, R> zipCoordinator, int i) {
            this.Camera2StreamConfigurationMap = zipCoordinator;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getOutputMinFrameDuration = requestFusion;
                        this.getHighSpeedVideoSizesFor = queueSubscription;
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputMinFrameDuration = requestFusion;
                        this.getHighSpeedVideoSizesFor = queueSubscription;
                        subscription.request(this.getHighSpeedVideoFpsRangesFor);
                        return;
                    }
                }
                this.getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.SpscArrayQueue(this.getHighSpeedVideoFpsRangesFor);
                subscription.request(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getOutputMinFrameDuration != 2) {
                this.getHighSpeedVideoSizesFor.offer(t);
            }
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this, th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (this.getOutputMinFrameDuration != 1) {
                long j2 = this.getHighSpeedVideoSizes + j;
                if (j2 >= this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoSizes = 0L;
                    get().request(j2);
                } else {
                    this.getHighSpeedVideoSizes = j2;
                }
            }
        }
    }
}
