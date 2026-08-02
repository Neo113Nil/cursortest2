package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class FlowableConcatMapMaybe<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;
    final io.reactivex.internal.util.ErrorMode getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoSizes;

    public FlowableConcatMapMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.Camera2StreamConfigurationMap = flowable;
        this.getHighSpeedVideoSizes = function;
        this.getHighResolutionOutputSizeshNQ4ISI = errorMode;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.Camera2StreamConfigurationMap.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber(subscriber, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapMaybeSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoSizes;
        final io.reactivex.internal.util.ErrorMode getInputFormats;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getInputSizeshNQ4ISI;
        R getOutputMinFrameDuration;
        org.reactivestreams.Subscription getOutputMinFrameDurationlomOqCM;
        volatile int getOutputSizes;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getOutputSizeshNQ4ISI;
        final int getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicLong getOutputStallDuration = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber.ConcatMapMaybeObserver<R> getHighSpeedVideoSizesFor = new io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber.ConcatMapMaybeObserver<>(this);

        ConcatMapMaybeSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getInputSizeshNQ4ISI = function;
            this.getOutputStallDurationlomOqCM = i;
            this.getInputFormats = errorMode;
            this.getOutputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscArrayQueue(i);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputMinFrameDurationlomOqCM, subscription)) {
                this.getOutputMinFrameDurationlomOqCM = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(this.getOutputStallDurationlomOqCM);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (!this.getOutputSizeshNQ4ISI.offer(t)) {
                this.getOutputMinFrameDurationlomOqCM.cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException("queue full?!"));
            } else {
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats.addThrowable(th)) {
                if (this.getInputFormats == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                Camera2StreamConfigurationMap();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputStallDuration, j);
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap = true;
            this.getOutputMinFrameDurationlomOqCM.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            if (getAndIncrement() == 0) {
                this.getOutputSizeshNQ4ISI.clear();
                this.getOutputMinFrameDuration = null;
            }
        }

        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.getHighSpeedVideoSizes;
                io.reactivex.internal.util.ErrorMode errorMode = this.getInputFormats;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getOutputSizeshNQ4ISI;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getOutputFormats;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputStallDuration;
                int i = this.getOutputStallDurationlomOqCM;
                int i2 = i - (i >> 1);
                int i3 = 1;
                while (true) {
                    if (this.Camera2StreamConfigurationMap) {
                        simplePlainQueue.clear();
                        this.getOutputMinFrameDuration = null;
                    }
                    int i4 = this.getOutputSizes;
                    if (atomicThrowable.get() == null || (errorMode != io.reactivex.internal.util.ErrorMode.IMMEDIATE && (errorMode != io.reactivex.internal.util.ErrorMode.BOUNDARY || i4 != 0))) {
                        if (i4 == 0) {
                            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
                            T poll = simplePlainQueue.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                java.lang.Throwable terminate = atomicThrowable.terminate();
                                if (terminate == null) {
                                    subscriber.onComplete();
                                    return;
                                } else {
                                    subscriber.onError(terminate);
                                    return;
                                }
                            }
                            if (!z2) {
                                int i5 = this.getHighSpeedVideoFpsRangesFor + 1;
                                if (i5 == i2) {
                                    this.getHighSpeedVideoFpsRangesFor = 0;
                                    this.getOutputMinFrameDurationlomOqCM.request(i2);
                                } else {
                                    this.getHighSpeedVideoFpsRangesFor = i5;
                                }
                                try {
                                    io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputSizeshNQ4ISI.apply(poll), "The mapper returned a null MaybeSource");
                                    this.getOutputSizes = 1;
                                    maybeSource.subscribe(this.getHighSpeedVideoSizesFor);
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    this.getOutputMinFrameDurationlomOqCM.cancel();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th);
                                    subscriber.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.getHighSpeedVideoFpsRanges;
                            if (j != atomicLong.get()) {
                                R r = this.getOutputMinFrameDuration;
                                this.getOutputMinFrameDuration = null;
                                subscriber.onNext(r);
                                this.getHighSpeedVideoFpsRanges = j + 1;
                                this.getOutputSizes = 0;
                            }
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                simplePlainQueue.clear();
                this.getOutputMinFrameDuration = null;
                subscriber.onError(atomicThrowable.terminate());
            }
        }

        static final class ConcatMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> Camera2StreamConfigurationMap;

            ConcatMapMaybeObserver(io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.Camera2StreamConfigurationMap = concatMapMaybeSubscriber;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber = this.Camera2StreamConfigurationMap;
                concatMapMaybeSubscriber.getOutputMinFrameDuration = r;
                concatMapMaybeSubscriber.getOutputSizes = 2;
                concatMapMaybeSubscriber.Camera2StreamConfigurationMap();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber = this.Camera2StreamConfigurationMap;
                if (concatMapMaybeSubscriber.getOutputFormats.addThrowable(th)) {
                    if (concatMapMaybeSubscriber.getInputFormats != io.reactivex.internal.util.ErrorMode.END) {
                        concatMapMaybeSubscriber.getOutputMinFrameDurationlomOqCM.cancel();
                    }
                    concatMapMaybeSubscriber.getOutputSizes = 0;
                    concatMapMaybeSubscriber.Camera2StreamConfigurationMap();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe.ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber = this.Camera2StreamConfigurationMap;
                concatMapMaybeSubscriber.getOutputSizes = 0;
                concatMapMaybeSubscriber.Camera2StreamConfigurationMap();
            }
        }
    }
}
