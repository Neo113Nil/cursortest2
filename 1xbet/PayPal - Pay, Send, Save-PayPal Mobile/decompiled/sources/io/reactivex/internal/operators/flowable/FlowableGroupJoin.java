package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<TLeft, R> {
    final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> getHighSpeedVideoFpsRangesFor;
    final org.reactivestreams.Publisher<? extends TRight> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface JoinSupport {
        void Camera2StreamConfigurationMap(boolean z, io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber);

        void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th);

        void getHighSpeedVideoFpsRanges(java.lang.Throwable th);

        void getHighSpeedVideoSizes(io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber);

        void getHighSpeedVideoSizes(boolean z, java.lang.Object obj);
    }

    public FlowableGroupJoin(io.reactivex.Flowable<TLeft> flowable, org.reactivestreams.Publisher<? extends TRight> publisher, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> biFunction) {
        super(flowable);
        this.getHighSpeedVideoSizes = publisher;
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription groupJoinSubscription = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.GroupJoinSubscription(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.onSubscribe(groupJoinSubscription);
        io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.getInputSizeshNQ4ISI.add(leftRightSubscriber);
        io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber(groupJoinSubscription, false);
        groupJoinSubscription.getInputSizeshNQ4ISI.add(leftRightSubscriber2);
        this.source.subscribe((io.reactivex.FlowableSubscriber) leftRightSubscriber);
        this.getHighSpeedVideoSizes.subscribe(leftRightSubscriber2);
    }

    /* loaded from: classes17.dex */
    static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean getHighSpeedVideoSizesFor;
        final org.reactivestreams.Subscriber<? super R> getInputFormats;
        final io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> getOutputFormats;
        final io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> getOutputMinFrameDurationlomOqCM;
        int getOutputStallDuration;
        final io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> isOutputSupportedFor;
        int isOutputSupportedForhNQ4ISI;
        static final java.lang.Integer Camera2StreamConfigurationMap = 1;
        static final java.lang.Integer getHighSpeedVideoFpsRangesFor = 2;
        static final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI = 3;
        static final java.lang.Integer getHighSpeedVideoSizes = 4;
        final java.util.concurrent.atomic.AtomicLong getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.disposables.CompositeDisposable getInputSizeshNQ4ISI = new io.reactivex.disposables.CompositeDisposable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> getOutputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(io.reactivex.Flowable.bufferSize());
        final java.util.Map<java.lang.Integer, io.reactivex.processors.UnicastProcessor<TRight>> getOutputSizes = new java.util.LinkedHashMap();
        final java.util.Map<java.lang.Integer, TRight> toString = new java.util.LinkedHashMap();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(2);

        GroupJoinSubscription(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super TLeft, ? extends org.reactivestreams.Publisher<TLeftEnd>> function, io.reactivex.functions.Function<? super TRight, ? extends org.reactivestreams.Publisher<TRightEnd>> function2, io.reactivex.functions.BiFunction<? super TLeft, ? super io.reactivex.Flowable<TRight>, ? extends R> biFunction) {
            this.getInputFormats = subscriber;
            this.getOutputFormats = function;
            this.isOutputSupportedFor = function2;
            this.getOutputMinFrameDurationlomOqCM = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputStallDurationlomOqCM, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.getHighSpeedVideoSizesFor = true;
            this.getInputSizeshNQ4ISI.dispose();
            if (getAndIncrement() == 0) {
                this.getOutputSizeshNQ4ISI.clear();
            }
        }

        private void getHighSpeedVideoFpsRangesFor(org.reactivestreams.Subscriber<?> subscriber) {
            java.lang.Throwable terminate = io.reactivex.internal.util.ExceptionHelper.terminate(this.getOutputMinFrameDuration);
            java.util.Iterator<io.reactivex.processors.UnicastProcessor<TRight>> it = this.getOutputSizes.values().iterator();
            while (it.hasNext()) {
                it.next().onError(terminate);
            }
            this.getOutputSizes.clear();
            this.toString.clear();
            subscriber.onError(terminate);
        }

        private void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> spscLinkedArrayQueue = this.getOutputSizeshNQ4ISI;
                org.reactivestreams.Subscriber<? super R> subscriber = this.getInputFormats;
                int i = 1;
                while (!this.getHighSpeedVideoSizesFor) {
                    if (this.getOutputMinFrameDuration.get() != null) {
                        spscLinkedArrayQueue.clear();
                        this.getInputSizeshNQ4ISI.dispose();
                        getHighSpeedVideoFpsRangesFor(subscriber);
                        return;
                    }
                    boolean z = this.getHighSpeedVideoFpsRanges.get() == 0;
                    java.lang.Integer num = (java.lang.Integer) spscLinkedArrayQueue.poll();
                    boolean z2 = num == null;
                    if (z && z2) {
                        java.util.Iterator<io.reactivex.processors.UnicastProcessor<TRight>> it = this.getOutputSizes.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.getOutputSizes.clear();
                        this.toString.clear();
                        this.getInputSizeshNQ4ISI.dispose();
                        subscriber.onComplete();
                        return;
                    }
                    if (!z2) {
                        java.lang.Object poll = spscLinkedArrayQueue.poll();
                        if (num == Camera2StreamConfigurationMap) {
                            io.reactivex.processors.UnicastProcessor create = io.reactivex.processors.UnicastProcessor.create();
                            int i2 = this.getOutputStallDuration;
                            this.getOutputStallDuration = i2 + 1;
                            this.getOutputSizes.put(java.lang.Integer.valueOf(i2), create);
                            try {
                                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(poll), "The leftEnd returned a null Publisher");
                                io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber(this, true, i2);
                                this.getInputSizeshNQ4ISI.add(leftRightEndSubscriber);
                                publisher.subscribe(leftRightEndSubscriber);
                                if (this.getOutputMinFrameDuration.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getInputSizeshNQ4ISI.dispose();
                                    getHighSpeedVideoFpsRangesFor(subscriber);
                                    return;
                                }
                                try {
                                    amex.AMEXKernel aMEXKernel = (java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDurationlomOqCM.apply(poll, create), "The resultSelector returned a null value");
                                    if (this.getOutputStallDurationlomOqCM.get() != 0) {
                                        subscriber.onNext(aMEXKernel);
                                        io.reactivex.internal.util.BackpressureHelper.produced(this.getOutputStallDurationlomOqCM, 1L);
                                        java.util.Iterator<TRight> it2 = this.toString.values().iterator();
                                        while (it2.hasNext()) {
                                            create.onNext(it2.next());
                                        }
                                    } else {
                                        io.reactivex.exceptions.MissingBackpressureException missingBackpressureException = new io.reactivex.exceptions.MissingBackpressureException("Could not emit value due to lack of requests");
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(missingBackpressureException);
                                        io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, missingBackpressureException);
                                        spscLinkedArrayQueue.clear();
                                        this.getInputSizeshNQ4ISI.dispose();
                                        getHighSpeedVideoFpsRangesFor(subscriber);
                                        return;
                                    }
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th);
                                    spscLinkedArrayQueue.clear();
                                    this.getInputSizeshNQ4ISI.dispose();
                                    getHighSpeedVideoFpsRangesFor(subscriber);
                                    return;
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th2);
                                spscLinkedArrayQueue.clear();
                                this.getInputSizeshNQ4ISI.dispose();
                                getHighSpeedVideoFpsRangesFor(subscriber);
                                return;
                            }
                        } else if (num == getHighSpeedVideoFpsRangesFor) {
                            int i3 = this.isOutputSupportedForhNQ4ISI;
                            this.isOutputSupportedForhNQ4ISI = i3 + 1;
                            this.toString.put(java.lang.Integer.valueOf(i3), poll);
                            try {
                                org.reactivestreams.Publisher publisher2 = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.isOutputSupportedFor.apply(poll), "The rightEnd returned a null Publisher");
                                io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber(this, false, i3);
                                this.getInputSizeshNQ4ISI.add(leftRightEndSubscriber2);
                                publisher2.subscribe(leftRightEndSubscriber2);
                                if (this.getOutputMinFrameDuration.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    this.getInputSizeshNQ4ISI.dispose();
                                    getHighSpeedVideoFpsRangesFor(subscriber);
                                    return;
                                } else {
                                    java.util.Iterator<io.reactivex.processors.UnicastProcessor<TRight>> it3 = this.getOutputSizes.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(poll);
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th3);
                                spscLinkedArrayQueue.clear();
                                this.getInputSizeshNQ4ISI.dispose();
                                getHighSpeedVideoFpsRangesFor(subscriber);
                                return;
                            }
                        } else if (num == getHighResolutionOutputSizeshNQ4ISI) {
                            io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) poll;
                            io.reactivex.processors.UnicastProcessor<TRight> remove = this.getOutputSizes.remove(java.lang.Integer.valueOf(leftRightEndSubscriber3.Camera2StreamConfigurationMap));
                            this.getInputSizeshNQ4ISI.remove(leftRightEndSubscriber3);
                            if (remove != null) {
                                remove.onComplete();
                            }
                        } else if (num == getHighSpeedVideoSizes) {
                            io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber) poll;
                            this.toString.remove(java.lang.Integer.valueOf(leftRightEndSubscriber4.Camera2StreamConfigurationMap));
                            this.getInputSizeshNQ4ISI.remove(leftRightEndSubscriber4);
                        }
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
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th)) {
                this.getHighSpeedVideoFpsRanges.decrementAndGet();
                getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighSpeedVideoSizes(io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.getInputSizeshNQ4ISI.delete(leftRightSubscriber);
            this.getHighSpeedVideoFpsRanges.decrementAndGet();
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighSpeedVideoSizes(boolean z, java.lang.Object obj) {
            synchronized (this) {
                this.getOutputSizeshNQ4ISI.offer(z ? Camera2StreamConfigurationMap : getHighSpeedVideoFpsRangesFor, obj);
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void Camera2StreamConfigurationMap(boolean z, io.reactivex.internal.operators.flowable.FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                this.getOutputSizeshNQ4ISI.offer(z ? getHighResolutionOutputSizeshNQ4ISI : getHighSpeedVideoSizes, leftRightEndSubscriber);
            }
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            if (io.reactivex.internal.util.ExceptionHelper.addThrowable(this.getOutputMinFrameDuration, th)) {
                getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class LeftRightSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport getHighSpeedVideoFpsRanges;

        LeftRightSubscriber(io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport joinSupport, boolean z) {
            this.getHighSpeedVideoFpsRanges = joinSupport;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(get());
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, obj);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this);
        }
    }

    /* loaded from: classes17.dex */
    static final class LeftRightEndSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int Camera2StreamConfigurationMap;
        final boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport getHighSpeedVideoSizes;

        LeftRightEndSubscriber(io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport joinSupport, boolean z, int i) {
            this.getHighSpeedVideoSizes = joinSupport;
            this.getHighSpeedVideoFpsRanges = z;
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(get());
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this)) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, this);
        }
    }
}
