package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowablePublish<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, int i) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.flowables.ConnectableFlowable) new io.reactivex.internal.operators.flowable.FlowablePublish(new io.reactivex.internal.operators.flowable.FlowablePublish.FlowablePublisher(atomicReference, i), flowable, atomicReference, i));
    }

    private FlowablePublish(org.reactivestreams.Publisher<T> publisher, io.reactivex.Flowable<T> flowable, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> atomicReference, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
        this.getHighSpeedVideoFpsRangesFor = flowable;
        this.Camera2StreamConfigurationMap = atomicReference;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final org.reactivestreams.Publisher<T> source() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriber);
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public final void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.Camera2StreamConfigurationMap.get();
            if (publishSubscriber != null && !publishSubscriber.isDisposed()) {
                break;
            }
            io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber2 = new io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<>(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z = false;
        if (!publishSubscriber.getOutputMinFrameDuration.get() && publishSubscriber.getOutputMinFrameDuration.compareAndSet(false, true)) {
            z = true;
        }
        try {
            consumer.accept(publishSubscriber);
            if (z) {
                this.getHighSpeedVideoFpsRangesFor.subscribe((io.reactivex.FlowableSubscriber) publishSubscriber);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class PublishSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -202316842419149694L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> getHighSpeedVideoFpsRangesFor;
        int getInputFormats;
        volatile java.lang.Object getOutputFormats;
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[0];
        static final io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[0];
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[]> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
        final java.util.concurrent.atomic.AtomicBoolean getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicBoolean();

        PublishSubscriber(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> atomicReference, int i) {
            this.getHighSpeedVideoFpsRangesFor = atomicReference;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr = this.getInputSizeshNQ4ISI.get();
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr2 = Camera2StreamConfigurationMap;
            if (innerSubscriberArr == innerSubscriberArr2 || this.getInputSizeshNQ4ISI.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, this, null);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizesFor);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputSizeshNQ4ISI.get() == Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighSpeedVideoSizesFor, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getInputFormats = requestFusion;
                        this.getHighSpeedVideoFpsRanges = queueSubscription;
                        this.getOutputFormats = io.reactivex.internal.util.NotificationLite.complete();
                        getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getInputFormats = requestFusion;
                        this.getHighSpeedVideoFpsRanges = queueSubscription;
                        subscription.request(this.getHighResolutionOutputSizeshNQ4ISI);
                        return;
                    }
                }
                this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.queue.SpscArrayQueue(this.getHighResolutionOutputSizeshNQ4ISI);
                subscription.request(this.getHighResolutionOutputSizeshNQ4ISI);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getInputFormats == 0 && !this.getHighSpeedVideoFpsRanges.offer(t)) {
                onError(new io.reactivex.exceptions.MissingBackpressureException("Prefetch queue is full?!"));
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = io.reactivex.internal.util.NotificationLite.error(th);
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = io.reactivex.internal.util.NotificationLite.complete();
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.getInputSizeshNQ4ISI.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriberArr[i].equals(innerSubscriber)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = getHighSpeedVideoSizes;
                } else {
                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] innerSubscriberArr3 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[length - 1];
                    java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i);
                    java.lang.System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr3, i, (length - i) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, innerSubscriberArr, innerSubscriberArr2));
        }

        private boolean getHighSpeedVideoSizes(java.lang.Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                    java.lang.Throwable error = io.reactivex.internal.util.NotificationLite.getError(obj);
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, this, null);
                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] andSet = this.getInputSizeshNQ4ISI.getAndSet(Camera2StreamConfigurationMap);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].getHighSpeedVideoSizes.onError(error);
                            i++;
                        }
                    } else {
                        io.reactivex.plugins.RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z) {
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, this, null);
                    io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] andSet2 = this.getInputSizeshNQ4ISI.getAndSet(Camera2StreamConfigurationMap);
                    int length2 = andSet2.length;
                    while (i < length2) {
                        andSet2[i].getHighSpeedVideoSizes.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
        
            r4 = r0;
            r3 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighResolutionOutputSizeshNQ4ISI() {
            T t;
            long j;
            T t2;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[]> atomicReference = this.getInputSizeshNQ4ISI;
            boolean z2 = true;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr = atomicReference.get();
            int i = 1;
            while (true) {
                java.lang.Object obj = this.getOutputFormats;
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRanges;
                boolean z3 = (simpleQueue2 == null || simpleQueue2.isEmpty()) ? z2 : false;
                if (getHighSpeedVideoSizes(obj, z3)) {
                    return;
                }
                if (!z3) {
                    int length = innerSubscriberArr.length;
                    int i2 = 0;
                    long j2 = Long.MAX_VALUE;
                    for (io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber : innerSubscriberArr) {
                        long j3 = innerSubscriber.get();
                        if (j3 != Long.MIN_VALUE) {
                            j2 = java.lang.Math.min(j2, j3 - innerSubscriber.getHighSpeedVideoFpsRanges);
                        } else {
                            i2++;
                        }
                    }
                    if (length == i2) {
                        java.lang.Object obj2 = this.getOutputFormats;
                        try {
                            t = simpleQueue2.poll();
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            this.getHighSpeedVideoSizesFor.get().cancel();
                            obj2 = io.reactivex.internal.util.NotificationLite.error(th);
                            this.getOutputFormats = obj2;
                            t = null;
                        }
                        if (getHighSpeedVideoSizes(obj2, t == null ? z2 : false)) {
                            return;
                        }
                        if (this.getInputFormats != z2) {
                            this.getHighSpeedVideoSizesFor.get().request(1L);
                        }
                    } else {
                        int i3 = 0;
                        while (true) {
                            j = i3;
                            if (j >= j2) {
                                break;
                            }
                            java.lang.Object obj3 = this.getOutputFormats;
                            try {
                                t2 = simpleQueue2.poll();
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.getHighSpeedVideoSizesFor.get().cancel();
                                obj3 = io.reactivex.internal.util.NotificationLite.error(th2);
                                this.getOutputFormats = obj3;
                                t2 = null;
                            }
                            boolean z4 = t2 != null ? false : z2;
                            if (getHighSpeedVideoSizes(obj3, z4)) {
                                return;
                            }
                            if (z4) {
                                z3 = z4;
                                break;
                            }
                            java.lang.Object value = io.reactivex.internal.util.NotificationLite.getValue(t2);
                            int length2 = innerSubscriberArr.length;
                            int i4 = 0;
                            boolean z5 = false;
                            while (i4 < length2) {
                                io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr[i4];
                                long j4 = innerSubscriber2.get();
                                if (j4 != Long.MIN_VALUE) {
                                    if (j4 != Long.MAX_VALUE) {
                                        simpleQueue = simpleQueue2;
                                        z = z4;
                                        innerSubscriber2.getHighSpeedVideoFpsRanges++;
                                    } else {
                                        simpleQueue = simpleQueue2;
                                        z = z4;
                                    }
                                    innerSubscriber2.getHighSpeedVideoSizes.onNext(value);
                                } else {
                                    simpleQueue = simpleQueue2;
                                    z = z4;
                                    z5 = true;
                                }
                                i4++;
                                simpleQueue2 = simpleQueue;
                                z4 = z;
                            }
                            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue3 = simpleQueue2;
                            boolean z6 = z4;
                            i3++;
                            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
                            if (z5 || innerSubscriberArr2 != innerSubscriberArr) {
                                break;
                            }
                            simpleQueue2 = simpleQueue3;
                            z3 = z6;
                            z2 = true;
                        }
                        if (i3 > 0) {
                            z2 = true;
                            if (this.getInputFormats != 1) {
                                this.getHighSpeedVideoSizesFor.get().request(j);
                            }
                        } else {
                            z2 = true;
                        }
                        if (j2 != 0 && !z3) {
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                } else {
                    innerSubscriberArr = atomicReference.get();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class InnerSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4453897557930727610L;
        volatile io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        InnerSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this, j);
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                if (publishSubscriber != null) {
                    publishSubscriber.getHighResolutionOutputSizeshNQ4ISI();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.getHighResolutionOutputSizeshNQ4ISI) == null) {
                return;
            }
            publishSubscriber.Camera2StreamConfigurationMap(this);
            publishSubscriber.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* loaded from: classes17.dex */
    static final class FlowablePublisher<T> implements org.reactivestreams.Publisher<T> {
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;

        FlowablePublisher(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T>> atomicReference, int i) {
            this.Camera2StreamConfigurationMap = atomicReference;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0008, code lost:
        
            continue;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
        @Override // org.reactivestreams.Publisher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T>[] innerSubscriberArr;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[] innerSubscriberArr2;
            io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<T> innerSubscriber = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber<>(subscriber);
            subscriber.onSubscribe(innerSubscriber);
            loop0: while (true) {
                io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber = this.Camera2StreamConfigurationMap.get();
                if (publishSubscriber == null || publishSubscriber.isDisposed()) {
                    io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<T> publishSubscriber2 = new io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber<>(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    } else {
                        continue;
                    }
                }
                do {
                    innerSubscriberArr = publishSubscriber.getInputSizeshNQ4ISI.get();
                    if (innerSubscriberArr == io.reactivex.internal.operators.flowable.FlowablePublish.PublishSubscriber.Camera2StreamConfigurationMap) {
                        break;
                    }
                    int length = innerSubscriberArr.length;
                    innerSubscriberArr2 = new io.reactivex.internal.operators.flowable.FlowablePublish.InnerSubscriber[length + 1];
                    java.lang.System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(publishSubscriber.getInputSizeshNQ4ISI, innerSubscriberArr, innerSubscriberArr2));
                if (innerSubscriber.get() != Long.MIN_VALUE) {
                    publishSubscriber.Camera2StreamConfigurationMap(innerSubscriber);
                } else {
                    innerSubscriber.getHighResolutionOutputSizeshNQ4ISI = publishSubscriber;
                }
                publishSubscriber.getHighResolutionOutputSizeshNQ4ISI();
            }
            if (innerSubscriber.get() != Long.MIN_VALUE) {
            }
            publishSubscriber.getHighResolutionOutputSizeshNQ4ISI();
        }
    }
}
