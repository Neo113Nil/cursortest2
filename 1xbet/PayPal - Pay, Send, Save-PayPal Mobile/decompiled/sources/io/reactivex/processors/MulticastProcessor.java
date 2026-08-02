package io.reactivex.processors;

@io.reactivex.annotations.SchedulerSupport("none")
@io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
/* loaded from: classes3.dex */
public final class MulticastProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final int Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizesFor;
    final int getInputFormats;
    int getInputSizeshNQ4ISI;
    volatile java.lang.Throwable getOutputFormats;
    volatile boolean getOutputMinFrameDuration;
    final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDurationlomOqCM;
    volatile io.reactivex.internal.fuseable.SimpleQueue<T> getOutputSizes;
    final boolean getOutputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[]> getOutputStallDuration;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputStallDurationlomOqCM;
    static final io.reactivex.processors.MulticastProcessor.MulticastSubscription[] getHighSpeedVideoSizes = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[0];
    static final io.reactivex.processors.MulticastProcessor.MulticastSubscription[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create() {
        return new io.reactivex.processors.MulticastProcessor<>(bufferSize(), false);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(boolean z) {
        return new io.reactivex.processors.MulticastProcessor<>(bufferSize(), z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(int i) {
        return new io.reactivex.processors.MulticastProcessor<>(i, false);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.MulticastProcessor<T> create(int i, boolean z) {
        return new io.reactivex.processors.MulticastProcessor<>(i, z);
    }

    private MulticastProcessor(int i, boolean z) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "bufferSize");
        this.Camera2StreamConfigurationMap = i;
        this.getInputFormats = i - (i >> 2);
        this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicInteger();
        this.getOutputStallDuration = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
        this.getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicReference<>();
        this.getOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final void start() {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputStallDurationlomOqCM, io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE)) {
            this.getOutputSizes = new io.reactivex.internal.queue.SpscArrayQueue(this.Camera2StreamConfigurationMap);
        }
    }

    public final void startUnbounded() {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputStallDurationlomOqCM, io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE)) {
            this.getOutputSizes = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.Camera2StreamConfigurationMap);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputStallDurationlomOqCM, subscription)) {
            if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.getInputSizeshNQ4ISI = requestFusion;
                    this.getOutputSizes = queueSubscription;
                    this.getOutputMinFrameDuration = true;
                    getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                if (requestFusion == 2) {
                    this.getInputSizeshNQ4ISI = requestFusion;
                    this.getOutputSizes = queueSubscription;
                    subscription.request(this.Camera2StreamConfigurationMap);
                    return;
                }
            }
            this.getOutputSizes = new io.reactivex.internal.queue.SpscArrayQueue(this.Camera2StreamConfigurationMap);
            subscription.request(this.Camera2StreamConfigurationMap);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        if (this.getHighSpeedVideoSizesFor.get()) {
            return;
        }
        if (this.getInputSizeshNQ4ISI == 0) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.getOutputSizes.offer(t)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM);
                onError(new io.reactivex.exceptions.MissingBackpressureException());
                return;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final boolean offer(T t) {
        if (this.getHighSpeedVideoSizesFor.get()) {
            return false;
        }
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getInputSizeshNQ4ISI != 0 || !this.getOutputSizes.offer(t)) {
            return false;
        }
        getHighResolutionOutputSizeshNQ4ISI();
        return true;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
            this.getOutputFormats = th;
            this.getOutputMinFrameDuration = true;
            getHighResolutionOutputSizeshNQ4ISI();
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
            this.getOutputMinFrameDuration = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.getOutputStallDuration.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.getHighSpeedVideoSizesFor.get() && this.getOutputFormats != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.getHighSpeedVideoSizesFor.get() && this.getOutputFormats == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        if (this.getHighSpeedVideoSizesFor.get()) {
            return this.getOutputFormats;
        }
        return null;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr;
        java.lang.Throwable th;
        io.reactivex.processors.MulticastProcessor.MulticastSubscription[] multicastSubscriptionArr2;
        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription = new io.reactivex.processors.MulticastProcessor.MulticastSubscription<>(subscriber, this);
        subscriber.onSubscribe(multicastSubscription);
        do {
            multicastSubscriptionArr = this.getOutputStallDuration.get();
            if (multicastSubscriptionArr == getHighResolutionOutputSizeshNQ4ISI) {
                if ((this.getHighSpeedVideoSizesFor.get() || !this.getOutputSizeshNQ4ISI) && (th = this.getOutputFormats) != null) {
                    subscriber.onError(th);
                    return;
                } else {
                    subscriber.onComplete();
                    return;
                }
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[length + 1];
            java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputStallDuration, multicastSubscriptionArr, multicastSubscriptionArr2));
        if (multicastSubscription.get() == Long.MIN_VALUE) {
            getHighSpeedVideoFpsRanges(multicastSubscription);
        } else {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    final void getHighSpeedVideoFpsRanges(io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription) {
        while (true) {
            io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr = this.getOutputStallDuration.get();
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
                if (this.getOutputSizeshNQ4ISI) {
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputStallDuration, multicastSubscriptionArr, getHighResolutionOutputSizeshNQ4ISI)) {
                        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM);
                        this.getHighSpeedVideoSizesFor.set(true);
                        return;
                    }
                } else if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputStallDuration, multicastSubscriptionArr, getHighSpeedVideoSizes)) {
                    return;
                }
            } else {
                io.reactivex.processors.MulticastProcessor.MulticastSubscription[] multicastSubscriptionArr2 = new io.reactivex.processors.MulticastProcessor.MulticastSubscription[length - 1];
                java.lang.System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i);
                java.lang.System.arraycopy(multicastSubscriptionArr, i + 1, multicastSubscriptionArr2, i, (length - i) - 1);
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputStallDuration, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013c, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x013f, code lost:
    
        r0 = r2.getAndSet(r10);
        r2 = r0.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0147, code lost:
    
        if (r12 >= r2) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0149, code lost:
    
        r3 = r0[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0153, code lost:
    
        if (r3.get() == Long.MIN_VALUE) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0155, code lost:
    
        r3.Camera2StreamConfigurationMap.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x015a, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x015d, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x010a, code lost:
    
        r7.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x010d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        if (r14 != 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0100, code lost:
    
        r0 = r2.get();
        r10 = io.reactivex.processors.MulticastProcessor.getHighResolutionOutputSizeshNQ4ISI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0108, code lost:
    
        if (r0 != r10) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x010e, code lost:
    
        if (r8 == r0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0115, code lost:
    
        if (r22.getOutputMinFrameDuration == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011b, code lost:
    
        if (r7.isEmpty() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011d, code lost:
    
        r0 = r22.getOutputFormats;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011f, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0121, code lost:
    
        r2 = r2.getAndSet(r10);
        r3 = r2.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0129, code lost:
    
        if (r12 >= r3) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012b, code lost:
    
        r4 = r2[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0135, code lost:
    
        if (r4.get() == Long.MIN_VALUE) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0137, code lost:
    
        r4.Camera2StreamConfigurationMap.onError(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighResolutionOutputSizeshNQ4ISI() {
        T t;
        if (this.getOutputMinFrameDurationlomOqCM.getAndIncrement() != 0) {
            return;
        }
        java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[]> atomicReference = this.getOutputStallDuration;
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.getInputFormats;
        int i3 = this.getInputSizeshNQ4ISI;
        boolean z = true;
        int i4 = 1;
        while (true) {
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputSizes;
            if (simpleQueue != null) {
                io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int length = multicastSubscriptionArr.length;
                    long j = -1;
                    long j2 = -1;
                    int i5 = 0;
                    while (i5 < length) {
                        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i5];
                        long j3 = multicastSubscription.get();
                        if (j3 >= 0) {
                            if (j2 == j) {
                                j2 = j3 - multicastSubscription.getHighResolutionOutputSizeshNQ4ISI;
                            } else {
                                j2 = java.lang.Math.min(j2, j3 - multicastSubscription.getHighResolutionOutputSizeshNQ4ISI);
                            }
                        }
                        i5++;
                        j = -1;
                    }
                    int i6 = i;
                    while (true) {
                        long j4 = Long.MIN_VALUE;
                        if (j2 <= 0) {
                            break;
                        }
                        io.reactivex.processors.MulticastProcessor.MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                        if (multicastSubscriptionArr2 == getHighResolutionOutputSizeshNQ4ISI) {
                            simpleQueue.clear();
                            return;
                        }
                        if (multicastSubscriptionArr != multicastSubscriptionArr2) {
                            break;
                        }
                        boolean z2 = this.getOutputMinFrameDuration;
                        try {
                            t = simpleQueue.poll();
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDurationlomOqCM);
                            this.getOutputFormats = th;
                            this.getOutputMinFrameDuration = z;
                            t = null;
                            z2 = z;
                        }
                        boolean z3 = t == null ? z : false;
                        if (z2 && z3) {
                            java.lang.Throwable th2 = this.getOutputFormats;
                            if (th2 != null) {
                                for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription2 : atomicReference.getAndSet(getHighResolutionOutputSizeshNQ4ISI)) {
                                    if (multicastSubscription2.get() != Long.MIN_VALUE) {
                                        multicastSubscription2.Camera2StreamConfigurationMap.onError(th2);
                                    }
                                }
                                return;
                            }
                            for (io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription3 : atomicReference.getAndSet(getHighResolutionOutputSizeshNQ4ISI)) {
                                if (multicastSubscription3.get() != Long.MIN_VALUE) {
                                    multicastSubscription3.Camera2StreamConfigurationMap.onComplete();
                                }
                            }
                            return;
                        }
                        if (z3) {
                            break;
                        }
                        int length2 = multicastSubscriptionArr.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            io.reactivex.processors.MulticastProcessor.MulticastSubscription<T> multicastSubscription4 = multicastSubscriptionArr[i7];
                            if (multicastSubscription4.get() != j4) {
                                multicastSubscription4.getHighResolutionOutputSizeshNQ4ISI++;
                                multicastSubscription4.Camera2StreamConfigurationMap.onNext(t);
                            }
                            i7++;
                            j4 = Long.MIN_VALUE;
                        }
                        j2--;
                        z = true;
                        if (i3 != 1 && (i6 = i6 + 1) == i2) {
                            this.getOutputStallDurationlomOqCM.get().request(i2);
                            i6 = 0;
                        }
                    }
                    i = i6;
                }
            }
            i4 = this.getOutputMinFrameDurationlomOqCM.addAndGet(-i4);
            if (i4 == 0) {
                return;
            }
        }
    }

    static final class MulticastSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -363282618957264509L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.processors.MulticastProcessor<T> getHighSpeedVideoFpsRanges;

        MulticastSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.MulticastProcessor<T> multicastProcessor) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRanges = multicastProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long j3;
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j3 = j2 + j;
                    }
                } while (!compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(this);
            }
        }
    }
}
