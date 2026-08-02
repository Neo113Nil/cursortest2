package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class FlowableConcatMapSingle<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.Flowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.internal.util.ErrorMode getHighSpeedVideoSizes;

    public FlowableConcatMapSingle(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowable;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoSizes = errorMode;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapSingleSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        R getHighSpeedVideoSizesFor;
        final io.reactivex.internal.util.ErrorMode getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getOutputMinFrameDuration;
        volatile int getOutputMinFrameDurationlomOqCM;
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getOutputSizes;
        final int getOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicLong getOutputStallDuration = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber.ConcatMapSingleObserver<R> getInputFormats = new io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber.ConcatMapSingleObserver<>(this);

        ConcatMapSingleSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, int i, io.reactivex.internal.util.ErrorMode errorMode) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getOutputMinFrameDuration = function;
            this.getOutputSizeshNQ4ISI = i;
            this.getInputSizeshNQ4ISI = errorMode;
            this.getOutputSizes = new io.reactivex.internal.queue.SpscArrayQueue(i);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDurationlomOqCM, subscription)) {
                this.getOutputStallDurationlomOqCM = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
                subscription.request(this.getOutputSizeshNQ4ISI);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (!this.getOutputSizes.offer(t)) {
                this.getOutputStallDurationlomOqCM.cancel();
                onError(new io.reactivex.exceptions.MissingBackpressureException("queue full?!"));
            } else {
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats.addThrowable(th)) {
                if (this.getInputSizeshNQ4ISI == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
                }
                this.Camera2StreamConfigurationMap = true;
                getHighSpeedVideoSizes();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputStallDuration, j);
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputStallDurationlomOqCM.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputFormats);
            if (getAndIncrement() == 0) {
                this.getOutputSizes.clear();
                this.getHighSpeedVideoSizesFor = null;
            }
        }

        final void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.util.ErrorMode errorMode = this.getInputSizeshNQ4ISI;
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getOutputSizes;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getOutputFormats;
                java.util.concurrent.atomic.AtomicLong atomicLong = this.getOutputStallDuration;
                int i = this.getOutputSizeshNQ4ISI;
                int i2 = i - (i >> 1);
                int i3 = 1;
                while (true) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        simplePlainQueue.clear();
                        this.getHighSpeedVideoSizesFor = null;
                    }
                    int i4 = this.getOutputMinFrameDurationlomOqCM;
                    if (atomicThrowable.get() == null || (errorMode != io.reactivex.internal.util.ErrorMode.IMMEDIATE && (errorMode != io.reactivex.internal.util.ErrorMode.BOUNDARY || i4 != 0))) {
                        if (i4 == 0) {
                            boolean z = this.Camera2StreamConfigurationMap;
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
                                int i5 = this.getHighSpeedVideoSizes + 1;
                                if (i5 == i2) {
                                    this.getHighSpeedVideoSizes = 0;
                                    this.getOutputStallDurationlomOqCM.request(i2);
                                } else {
                                    this.getHighSpeedVideoSizes = i5;
                                }
                                try {
                                    io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(poll), "The mapper returned a null SingleSource");
                                    this.getOutputMinFrameDurationlomOqCM = 1;
                                    singleSource.subscribe(this.getInputFormats);
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    this.getOutputStallDurationlomOqCM.cancel();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th);
                                    subscriber.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i4 == 2) {
                            long j = this.getHighSpeedVideoFpsRangesFor;
                            if (j != atomicLong.get()) {
                                R r = this.getHighSpeedVideoSizesFor;
                                this.getHighSpeedVideoSizesFor = null;
                                subscriber.onNext(r);
                                this.getHighSpeedVideoFpsRangesFor = j + 1;
                                this.getOutputMinFrameDurationlomOqCM = 0;
                            }
                        }
                        i3 = addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                simplePlainQueue.clear();
                this.getHighSpeedVideoSizesFor = null;
                subscriber.onError(atomicThrowable.terminate());
            }
        }

        static final class ConcatMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber<?, R> getHighSpeedVideoFpsRangesFor;

            ConcatMapSingleObserver(io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber) {
                this.getHighSpeedVideoFpsRangesFor = concatMapSingleSubscriber;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber = this.getHighSpeedVideoFpsRangesFor;
                concatMapSingleSubscriber.getHighSpeedVideoSizesFor = r;
                concatMapSingleSubscriber.getOutputMinFrameDurationlomOqCM = 2;
                concatMapSingleSubscriber.getHighSpeedVideoSizes();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.FlowableConcatMapSingle.ConcatMapSingleSubscriber<?, R> concatMapSingleSubscriber = this.getHighSpeedVideoFpsRangesFor;
                if (concatMapSingleSubscriber.getOutputFormats.addThrowable(th)) {
                    if (concatMapSingleSubscriber.getInputSizeshNQ4ISI != io.reactivex.internal.util.ErrorMode.END) {
                        concatMapSingleSubscriber.getOutputStallDurationlomOqCM.cancel();
                    }
                    concatMapSingleSubscriber.getOutputMinFrameDurationlomOqCM = 0;
                    concatMapSingleSubscriber.getHighSpeedVideoSizes();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
