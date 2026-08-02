package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFlattenIterable<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> Camera2StreamConfigurationMap;
    final int getHighSpeedVideoSizes;

    public FlowableFlattenIterable(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function, int i) {
        super(flowable);
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (this.source instanceof java.util.concurrent.Callable) {
            try {
                java.lang.Object call = ((java.util.concurrent.Callable) this.source).call();
                if (call == null) {
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                    return;
                }
                try {
                    io.reactivex.internal.operators.flowable.FlowableFromIterable.subscribe(subscriber, this.Camera2StreamConfigurationMap.apply(call).iterator());
                    return;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    return;
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
                return;
            }
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class FlattenIterableSubscriber<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean Camera2StreamConfigurationMap;
        java.util.Iterator<? extends R> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final int getHighSpeedVideoSizesFor;
        final int getInputFormats;
        int getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> getOutputFormats;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();
        org.reactivestreams.Subscription getOutputSizes;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputStallDurationlomOqCM;

        FlattenIterableSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> function, int i) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
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
                        this.getInputSizeshNQ4ISI = requestFusion;
                        this.getOutputStallDurationlomOqCM = queueSubscription;
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getInputSizeshNQ4ISI = requestFusion;
                        this.getOutputStallDurationlomOqCM = queueSubscription;
                        this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                        subscription.request(this.getInputFormats);
                        return;
                    }
                }
                this.getOutputStallDurationlomOqCM = new io.reactivex.internal.queue.SpscArrayQueue(this.getInputFormats);
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(this.getInputFormats);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            if (this.getInputSizeshNQ4ISI == 0 && !this.getOutputStallDurationlomOqCM.offer(t)) {
                onError(new io.reactivex.exceptions.MissingBackpressureException("Queue is full?!"));
            } else {
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.Camera2StreamConfigurationMap && io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th)) {
                this.Camera2StreamConfigurationMap = true;
                Camera2StreamConfigurationMap();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDurationlomOqCM, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputSizes.cancel();
            if (getAndIncrement() == 0) {
                this.getOutputStallDurationlomOqCM.clear();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
        
            if (r13 != r9) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
        
            r5 = r18.Camera2StreamConfigurationMap;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
        
            if (r3.isEmpty() == false) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
        
            if (r8 != null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
        
            if (getHighSpeedVideoFpsRangesFor(r5, r6, r2, r3) != false) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
        
            if (r13 == 0) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
        
            if (r9 == Long.MAX_VALUE) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0116, code lost:
        
            r18.getOutputMinFrameDurationlomOqCM.addAndGet(-r13);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x011c, code lost:
        
            r6 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        
            if (r8 == null) goto L69;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void Camera2StreamConfigurationMap() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<?> subscriber = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getOutputStallDurationlomOqCM;
            boolean z = true;
            boolean z2 = this.getInputSizeshNQ4ISI != 1;
            java.util.Iterator<? extends R> it = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = 1;
            while (true) {
                java.util.Iterator<? extends R> it2 = null;
                if (it == null) {
                    boolean z3 = this.Camera2StreamConfigurationMap;
                    try {
                        T poll = simpleQueue.poll();
                        if (getHighSpeedVideoFpsRangesFor(z3, poll == null ? z : false, subscriber, simpleQueue)) {
                            return;
                        }
                        if (poll != null) {
                            try {
                                it = this.getOutputFormats.apply(poll).iterator();
                                if (!it.hasNext()) {
                                    getHighSpeedVideoFpsRanges(z2);
                                    it = null;
                                } else {
                                    this.getHighResolutionOutputSizeshNQ4ISI = it;
                                }
                            } catch (java.lang.Throwable th) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                this.getOutputSizes.cancel();
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th);
                                subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputMinFrameDuration));
                                return;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        this.getOutputSizes.cancel();
                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th2);
                        java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputMinFrameDuration);
                        this.getHighResolutionOutputSizeshNQ4ISI = null;
                        simpleQueue.clear();
                        subscriber.onError(terminate);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.getOutputMinFrameDurationlomOqCM.get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            it2 = it;
                            break;
                        }
                        if (getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, false, subscriber, simpleQueue)) {
                            return;
                        }
                        try {
                            subscriber.onNext((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, false, subscriber, simpleQueue)) {
                                return;
                            }
                            j2++;
                            try {
                                if (!it.hasNext()) {
                                    getHighSpeedVideoFpsRanges(z2);
                                    this.getHighResolutionOutputSizeshNQ4ISI = null;
                                    break;
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                this.getHighResolutionOutputSizeshNQ4ISI = null;
                                this.getOutputSizes.cancel();
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th3);
                                subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputMinFrameDuration));
                                return;
                            }
                        } catch (java.lang.Throwable th4) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                            this.getHighResolutionOutputSizeshNQ4ISI = null;
                            this.getOutputSizes.cancel();
                            io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th4);
                            subscriber.onError(io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputMinFrameDuration));
                            return;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                z = true;
            }
        }

        private void getHighSpeedVideoFpsRanges(boolean z) {
            if (z) {
                int i = this.getHighSpeedVideoFpsRanges + 1;
                if (i == this.getHighSpeedVideoSizesFor) {
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getOutputSizes.request(i);
                } else {
                    this.getHighSpeedVideoFpsRanges = i;
                }
            }
        }

        private boolean getHighSpeedVideoFpsRangesFor(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.fuseable.SimpleQueue<?> simpleQueue) {
            if (this.getHighSpeedVideoSizes) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                simpleQueue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.getOutputMinFrameDuration.get() == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onComplete();
                return true;
            }
            java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputMinFrameDuration);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            simpleQueue.clear();
            subscriber.onError(terminate);
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighResolutionOutputSizeshNQ4ISI == null && this.getOutputStallDurationlomOqCM.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final R poll() throws java.lang.Exception {
            java.util.Iterator<? extends R> it = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                if (it == null) {
                    T poll = this.getOutputStallDurationlomOqCM.poll();
                    if (poll != null) {
                        it = this.getOutputFormats.apply(poll).iterator();
                        if (it.hasNext()) {
                            this.getHighResolutionOutputSizeshNQ4ISI = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            return r;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return ((i & 1) == 0 || this.getInputSizeshNQ4ISI != 1) ? 0 : 1;
        }
    }
}
