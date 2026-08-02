package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<? extends TRight> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> getHighSpeedVideoSizes;

    public FlowableJoin(io.reactivex.Flowable<TLeft> flowable, org.reactivestreams.Publisher<? extends TRight> publisher, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.Camera2StreamConfigurationMap = function;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = biFunction;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription joinSubscription = new io.reactivex.internal.operators.flowable.FlowableJoin.JoinSubscription(subscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        subscriber.onSubscribe(joinSubscription);
        io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.getInputFormats.add(leftRightSubscriber);
        io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false);
        joinSubscription.getInputFormats.add(leftRightSubscriber2);
        this.source.subscribe((io.reactivex.FlowableSubscriber) leftRightSubscriber);
        this.getHighSpeedVideoFpsRangesFor.subscribe(leftRightSubscriber2);
    }

    /* loaded from: classes17.dex */
    static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean getHighSpeedVideoSizesFor;
        final org.reactivestreams.Subscriber<? super R> getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> getOutputMinFrameDuration;
        int getOutputMinFrameDurationlomOqCM;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> getOutputSizes;
        final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> isOutputSupportedForhNQ4ISI;
        int unwrapAs;
        static final java.lang.Integer getHighSpeedVideoFpsRanges = 1;
        static final java.lang.Integer Camera2StreamConfigurationMap = 2;
        static final java.lang.Integer getHighSpeedVideoSizes = 3;
        static final java.lang.Integer getHighSpeedVideoFpsRangesFor = 4;
        final java.util.concurrent.atomic.AtomicLong getOutputStallDuration = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.disposables.CompositeDisposable getInputFormats = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getOutputStallDurationlomOqCM = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Flowable.bufferSize());
        final java.util.Map<java.lang.Integer, TLeft> getOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
        final java.util.Map<java.lang.Integer, TRight> toString = new java.util.LinkedHashMap();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(2);

        JoinSubscription(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.getInputSizeshNQ4ISI = subscriber;
            this.getOutputMinFrameDuration = function;
            this.isOutputSupportedForhNQ4ISI = function2;
            this.getOutputSizes = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputStallDuration, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.getHighSpeedVideoSizesFor = true;
            this.getInputFormats.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputStallDurationlomOqCM.clear();
            }
        }

        private void Camera2StreamConfigurationMap(org.reactivestreams.Subscriber<?> subscriber) {
            java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputFormats);
            this.getOutputSizeshNQ4ISI.clear();
            this.toString.clear();
            subscriber.onError(terminate);
        }

        private void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputStallDurationlomOqCM;
                org.reactivestreams.Subscriber<? super R> subscriber = this.getInputSizeshNQ4ISI;
                boolean z = true;
                int i = 1;
                while (!this.getHighSpeedVideoSizesFor) {
                    if (this.getOutputFormats.get() != null) {
                        spscLinkedArrayQueue.clear();
                        this.getInputFormats.dispose();
                        Camera2StreamConfigurationMap(subscriber);
                        return;
                    }
                    boolean z2 = this.getHighResolutionOutputSizeshNQ4ISI.get() == 0 ? z : false;
                    java.lang.Integer num = (java.lang.Integer) spscLinkedArrayQueue.poll();
                    boolean z3 = num == null ? z : false;
                    if (z2 && z3) {
                        this.getOutputSizeshNQ4ISI.clear();
                        this.toString.clear();
                        this.getInputFormats.dispose();
                        subscriber.onComplete();
                        return;
                    }
                    if (!z3) {
                        java.lang.Object poll = spscLinkedArrayQueue.poll();
                        if (num == getHighSpeedVideoFpsRanges) {
                            int i2 = this.getOutputMinFrameDurationlomOqCM;
                            this.getOutputMinFrameDurationlomOqCM = i2 + 1;
                            this.getOutputSizeshNQ4ISI.put(java.lang.Integer.valueOf(i2), poll);
                            try {
                                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(poll), "The leftEnd returned a null Publisher");
                                io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber(this, z, i2);
                                this.getInputFormats.add(leftRightEndSubscriber);
                                publisher.subscribe(leftRightEndSubscriber);
                                if (this.getOutputFormats.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getInputFormats.dispose();
                                    Camera2StreamConfigurationMap(subscriber);
                                    return;
                                }
                                long j = this.getOutputStallDuration.get();
                                java.util.Iterator<TRight> it = this.toString.values().iterator();
                                long j2 = 0;
                                while (it.hasNext()) {
                                    try {
                                        amex.AMEXKernel aMEXKernel = (java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(poll, it.next()), "The resultSelector returned a null value");
                                        if (j2 != j) {
                                            subscriber.onNext(aMEXKernel);
                                            j2++;
                                        } else {
                                            io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests"));
                                            spscLinkedArrayQueue.clear();
                                            this.getInputFormats.dispose();
                                            Camera2StreamConfigurationMap(subscriber);
                                            return;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th);
                                        spscLinkedArrayQueue.clear();
                                        this.getInputFormats.dispose();
                                        Camera2StreamConfigurationMap(subscriber);
                                        return;
                                    }
                                }
                                if (j2 != 0) {
                                    io.reactivex.internal.util.BackpressureHelper.produced(this.getOutputStallDuration, j2);
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th2);
                                spscLinkedArrayQueue.clear();
                                this.getInputFormats.dispose();
                                Camera2StreamConfigurationMap(subscriber);
                                return;
                            }
                        } else if (num == Camera2StreamConfigurationMap) {
                            int i3 = this.unwrapAs;
                            this.unwrapAs = i3 + 1;
                            this.toString.put(java.lang.Integer.valueOf(i3), poll);
                            try {
                                org.reactivestreams.Publisher publisher2 = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.isOutputSupportedForhNQ4ISI.apply(poll), "The rightEnd returned a null Publisher");
                                io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber(this, false, i3);
                                this.getInputFormats.add(leftRightEndSubscriber2);
                                publisher2.subscribe(leftRightEndSubscriber2);
                                if (this.getOutputFormats.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getInputFormats.dispose();
                                    Camera2StreamConfigurationMap(subscriber);
                                    return;
                                }
                                long j3 = this.getOutputStallDuration.get();
                                java.util.Iterator<TLeft> it2 = this.getOutputSizeshNQ4ISI.values().iterator();
                                long j4 = 0;
                                while (it2.hasNext()) {
                                    try {
                                        amex.AMEXKernel aMEXKernel2 = (java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputSizes.apply(it2.next(), poll), "The resultSelector returned a null value");
                                        if (j4 != j3) {
                                            subscriber.onNext(aMEXKernel2);
                                            j4++;
                                        } else {
                                            io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests"));
                                            spscLinkedArrayQueue.clear();
                                            this.getInputFormats.dispose();
                                            Camera2StreamConfigurationMap(subscriber);
                                            return;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th3);
                                        spscLinkedArrayQueue.clear();
                                        this.getInputFormats.dispose();
                                        Camera2StreamConfigurationMap(subscriber);
                                        return;
                                    }
                                }
                                if (j4 != 0) {
                                    io.reactivex.internal.util.BackpressureHelper.produced(this.getOutputStallDuration, j4);
                                }
                            } catch (java.lang.Throwable th4) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th4);
                                spscLinkedArrayQueue.clear();
                                this.getInputFormats.dispose();
                                Camera2StreamConfigurationMap(subscriber);
                                return;
                            }
                        } else if (num == getHighSpeedVideoSizes) {
                            io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) poll;
                            this.getOutputSizeshNQ4ISI.remove(java.lang.Integer.valueOf(leftRightEndSubscriber3.Camera2StreamConfigurationMap));
                            this.getInputFormats.remove(leftRightEndSubscriber3);
                        } else if (num == getHighSpeedVideoFpsRangesFor) {
                            io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) poll;
                            this.toString.remove(java.lang.Integer.valueOf(leftRightEndSubscriber4.Camera2StreamConfigurationMap));
                            this.getInputFormats.remove(leftRightEndSubscriber4);
                        }
                        z = true;
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th)) {
                this.getHighResolutionOutputSizeshNQ4ISI.decrementAndGet();
                getHighSpeedVideoFpsRanges();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighSpeedVideoSizes(io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.getInputFormats.delete(leftRightSubscriber);
            this.getHighResolutionOutputSizeshNQ4ISI.decrementAndGet();
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighSpeedVideoSizes(boolean z, java.lang.Object obj) {
            synchronized (this) {
                this.getOutputStallDurationlomOqCM.offer(z ? getHighSpeedVideoFpsRanges : Camera2StreamConfigurationMap, obj);
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(boolean z, io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.getOutputStallDurationlomOqCM.offer(z ? getHighSpeedVideoSizes : getHighSpeedVideoFpsRangesFor, leftRightEndSubscriber);
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputFormats, th)) {
                getHighSpeedVideoFpsRanges();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
