package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface ConcatMapSupport<T> {
        void Camera2StreamConfigurationMap(java.lang.Throwable th);

        void getHighResolutionOutputSizeshNQ4ISI(T t);

        void getHighSpeedVideoFpsRangesFor();
    }

    public FlowableConcatMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        super(flowable);
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = errorMode;
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[io.reactivex.internal.util.ErrorMode.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[io.reactivex.internal.util.ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[io.reactivex.internal.util.ErrorMode.END.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static <T, R> org.reactivestreams.Subscriber<T> subscribe(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
        int i2 = io.reactivex.internal.operators.flowable.FlowableConcatMap.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[errorMode.ordinal()];
        if (i2 == 1) {
            return new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapDelayed(subscriber, function, i, false);
        }
        if (i2 == 2) {
            return new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapDelayed(subscriber, function, i, true);
        }
        return new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapImmediate(subscriber, function, i);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.getHighSpeedVideoSizes)) {
            return;
        }
        this.source.subscribe(subscribe(subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static abstract class BaseConcatMapSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;
        final int getInputFormats;
        io.reactivex.internal.fuseable.SimpleQueue<T> getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getOutputFormats;
        org.reactivestreams.Subscription getOutputSizes;
        int getOutputStallDuration;
        final io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapInner<R> getOutputMinFrameDuration = new io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapInner<>(this);
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();

        abstract void Camera2StreamConfigurationMap();

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        BaseConcatMapSubscriber(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i) {
            this.getOutputFormats = function;
            this.getInputFormats = i;
            this.getHighSpeedVideoSizesFor = i - (i >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputSizes, subscription)) {
                this.getOutputSizes = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputStallDuration = requestFusion;
                        this.getInputSizeshNQ4ISI = queueSubscription;
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                        Camera2StreamConfigurationMap();
                        getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputStallDuration = requestFusion;
                        this.getInputSizeshNQ4ISI = queueSubscription;
                        Camera2StreamConfigurationMap();
                        subscription.request(this.getInputFormats);
                        return;
                    }
                }
                this.getInputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscArrayQueue(this.getInputFormats);
                Camera2StreamConfigurationMap();
                subscription.request(this.getInputFormats);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getOutputStallDuration != 2 && !this.getInputSizeshNQ4ISI.offer(t)) {
                this.getOutputSizes.cancel();
                onError(new java.lang.IllegalStateException("Queue full?!"));
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRangesFor = false;
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapImmediate<T, R> extends io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final java.util.concurrent.atomic.AtomicInteger getOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super R> getOutputStallDurationlomOqCM;

        ConcatMapImmediate(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i) {
            super(function, i);
            this.getOutputStallDurationlomOqCM = subscriber;
            this.getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        final void Camera2StreamConfigurationMap() {
            this.getOutputStallDurationlomOqCM.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                this.getOutputMinFrameDuration.cancel();
                if (getAndIncrement() == 0) {
                    this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.getOutputStallDurationlomOqCM.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                this.getOutputSizes.cancel();
                if (getAndIncrement() == 0) {
                    this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getOutputMinFrameDuration.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputMinFrameDuration.cancel();
            this.getOutputSizes.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getOutputSizeshNQ4ISI.getAndIncrement() == 0) {
                while (!this.getHighSpeedVideoSizes) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            T poll = this.getInputSizeshNQ4ISI.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.getOutputStallDurationlomOqCM.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(poll), "The mapper returned a null Publisher");
                                    if (this.getOutputStallDuration != 1) {
                                        int i = this.getHighSpeedVideoFpsRanges + 1;
                                        if (i == this.getHighSpeedVideoSizesFor) {
                                            this.getHighSpeedVideoFpsRanges = 0;
                                            this.getOutputSizes.request(i);
                                        } else {
                                            this.getHighSpeedVideoFpsRanges = i;
                                        }
                                    }
                                    if (publisher instanceof java.util.concurrent.Callable) {
                                        try {
                                            java.lang.Object call = ((java.util.concurrent.Callable) publisher).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.getOutputMinFrameDuration.isUnbounded()) {
                                                if (get() == 0 && compareAndSet(0, 1)) {
                                                    this.getOutputStallDurationlomOqCM.onNext(call);
                                                    if (!compareAndSet(1, 0)) {
                                                        this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                                                        return;
                                                    }
                                                }
                                            } else {
                                                this.getHighSpeedVideoFpsRangesFor = true;
                                                this.getOutputMinFrameDuration.setSubscription(new io.reactivex.internal.operators.flowable.FlowableConcatMap.WeakScalarSubscription(call, this.getOutputMinFrameDuration));
                                            }
                                        } catch (java.lang.Throwable th) {
                                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                            this.getOutputSizes.cancel();
                                            this.Camera2StreamConfigurationMap.addThrowable(th);
                                            this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                                            return;
                                        }
                                    } else {
                                        this.getHighSpeedVideoFpsRangesFor = true;
                                        publisher.subscribe(this.getOutputMinFrameDuration);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    this.getOutputSizes.cancel();
                                    this.Camera2StreamConfigurationMap.addThrowable(th2);
                                    this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                            this.getOutputSizes.cancel();
                            this.Camera2StreamConfigurationMap.addThrowable(th3);
                            this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                            return;
                        }
                    }
                    if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WeakScalarSubscription<T> implements org.reactivestreams.Subscription {
        final T Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
        }

        WeakScalarSubscription(T t, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.Camera2StreamConfigurationMap = t;
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (j <= 0 || this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
            subscriber.onNext(this.Camera2StreamConfigurationMap);
            subscriber.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapDelayed<T, R> extends io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final boolean getOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super R> getOutputStallDurationlomOqCM;

        ConcatMapDelayed(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.getOutputStallDurationlomOqCM = subscriber;
            this.getOutputSizeshNQ4ISI = z;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        final void Camera2StreamConfigurationMap() {
            this.getOutputStallDurationlomOqCM.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(R r) {
            this.getOutputStallDurationlomOqCM.onNext(r);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                if (!this.getOutputSizeshNQ4ISI) {
                    this.getOutputSizes.cancel();
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                }
                this.getHighSpeedVideoFpsRangesFor = false;
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getOutputMinFrameDuration.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputMinFrameDuration.cancel();
            this.getOutputSizes.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                while (!this.getHighSpeedVideoSizes) {
                    if (!this.getHighSpeedVideoFpsRangesFor) {
                        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (z && !this.getOutputSizeshNQ4ISI && this.Camera2StreamConfigurationMap.get() != null) {
                            this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                            return;
                        }
                        try {
                            T poll = this.getInputSizeshNQ4ISI.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                java.lang.Throwable terminate = this.Camera2StreamConfigurationMap.terminate();
                                if (terminate != null) {
                                    this.getOutputStallDurationlomOqCM.onError(terminate);
                                    return;
                                } else {
                                    this.getOutputStallDurationlomOqCM.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(poll), "The mapper returned a null Publisher");
                                    if (this.getOutputStallDuration != 1) {
                                        int i = this.getHighSpeedVideoFpsRanges + 1;
                                        if (i == this.getHighSpeedVideoSizesFor) {
                                            this.getHighSpeedVideoFpsRanges = 0;
                                            this.getOutputSizes.request(i);
                                        } else {
                                            this.getHighSpeedVideoFpsRanges = i;
                                        }
                                    }
                                    if (publisher instanceof java.util.concurrent.Callable) {
                                        try {
                                            java.lang.Object call = ((java.util.concurrent.Callable) publisher).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.getOutputMinFrameDuration.isUnbounded()) {
                                                this.getOutputStallDurationlomOqCM.onNext(call);
                                            } else {
                                                this.getHighSpeedVideoFpsRangesFor = true;
                                                this.getOutputMinFrameDuration.setSubscription(new io.reactivex.internal.operators.flowable.FlowableConcatMap.WeakScalarSubscription(call, this.getOutputMinFrameDuration));
                                            }
                                        } catch (java.lang.Throwable th) {
                                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                            this.getOutputSizes.cancel();
                                            this.Camera2StreamConfigurationMap.addThrowable(th);
                                            this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                                            return;
                                        }
                                    } else {
                                        this.getHighSpeedVideoFpsRangesFor = true;
                                        publisher.subscribe(this.getOutputMinFrameDuration);
                                    }
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    this.getOutputSizes.cancel();
                                    this.Camera2StreamConfigurationMap.addThrowable(th2);
                                    this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                            this.getOutputSizes.cancel();
                            this.Camera2StreamConfigurationMap.addThrowable(th3);
                            this.getOutputStallDurationlomOqCM.onError(this.Camera2StreamConfigurationMap.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapInner<R> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        ConcatMapInner(io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport<R> concatMapSupport) {
            this.getHighSpeedVideoFpsRanges = concatMapSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r) {
            this.getHighSpeedVideoSizes++;
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(r);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            long j = this.getHighSpeedVideoSizes;
            if (j != 0) {
                this.getHighSpeedVideoSizes = 0L;
                produced(j);
            }
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            long j = this.getHighSpeedVideoSizes;
            if (j != 0) {
                this.getHighSpeedVideoSizes = 0L;
                produced(j);
            }
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
        }
    }
}
