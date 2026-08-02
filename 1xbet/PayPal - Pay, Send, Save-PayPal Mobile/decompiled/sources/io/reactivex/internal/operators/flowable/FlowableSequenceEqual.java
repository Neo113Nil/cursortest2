package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableSequenceEqual<T> extends io.reactivex.Flowable<java.lang.Boolean> {
    final org.reactivestreams.Publisher<? extends T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    interface EqualCoordinatorHelper {
        void Camera2StreamConfigurationMap(java.lang.Throwable th);

        void getHighSpeedVideoFpsRanges();
    }

    public FlowableSequenceEqual(org.reactivestreams.Publisher<? extends T> publisher, org.reactivestreams.Publisher<? extends T> publisher2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.Camera2StreamConfigurationMap = publisher2;
        this.getHighResolutionOutputSizeshNQ4ISI = biPredicate;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Boolean> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinator(subscriber, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.onSubscribe(equalCoordinator);
        org.reactivestreams.Publisher<? extends T> publisher = this.getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Publisher<? extends T> publisher2 = this.Camera2StreamConfigurationMap;
        publisher.subscribe(equalCoordinator.getHighResolutionOutputSizeshNQ4ISI);
        publisher2.subscribe(equalCoordinator.getHighSpeedVideoFpsRanges);
    }

    static final class EqualCoordinator<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<java.lang.Boolean> implements io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRangesFor;
        T getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizesFor;
        T getOutputFormats;

        EqualCoordinator(org.reactivestreams.Subscriber<? super java.lang.Boolean> subscriber, int i, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = biPredicate;
            this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicInteger();
            this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<>(this, i);
            this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<>(this, i);
            this.getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.util.AtomicThrowable();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            if (this.getHighSpeedVideoSizesFor.getAndIncrement() == 0) {
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                if (simpleQueue != null) {
                    simpleQueue.clear();
                }
                io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
                if (simpleQueue2 != null) {
                    simpleQueue2.clear();
                }
            }
        }

        private void Camera2StreamConfigurationMap() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighResolutionOutputSizeshNQ4ISI);
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
            if (simpleQueue2 != null) {
                simpleQueue2.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void getHighSpeedVideoFpsRanges() {
            if (this.getHighSpeedVideoSizesFor.getAndIncrement() == 0) {
                int i = 1;
                do {
                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                    io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue2 = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
                    if (simpleQueue != null && simpleQueue2 != null) {
                        while (!isCancelled()) {
                            if (this.getHighSpeedVideoFpsRangesFor.get() != null) {
                                Camera2StreamConfigurationMap();
                                this.actual.onError(this.getHighSpeedVideoFpsRangesFor.terminate());
                                return;
                            }
                            boolean z = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                            T t = this.getHighSpeedVideoSizes;
                            if (t == null) {
                                try {
                                    t = simpleQueue.poll();
                                    this.getHighSpeedVideoSizes = t;
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    Camera2StreamConfigurationMap();
                                    this.getHighSpeedVideoFpsRangesFor.addThrowable(th);
                                    this.actual.onError(this.getHighSpeedVideoFpsRangesFor.terminate());
                                    return;
                                }
                            }
                            boolean z2 = t == null;
                            boolean z3 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
                            T t2 = this.getOutputFormats;
                            if (t2 == null) {
                                try {
                                    t2 = simpleQueue2.poll();
                                    this.getOutputFormats = t2;
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    Camera2StreamConfigurationMap();
                                    this.getHighSpeedVideoFpsRangesFor.addThrowable(th2);
                                    this.actual.onError(this.getHighSpeedVideoFpsRangesFor.terminate());
                                    return;
                                }
                            }
                            boolean z4 = t2 == null;
                            if (z && z3 && z2 && z4) {
                                complete(java.lang.Boolean.TRUE);
                                return;
                            }
                            if (z && z3 && z2 != z4) {
                                Camera2StreamConfigurationMap();
                                complete(java.lang.Boolean.FALSE);
                                return;
                            }
                            if (!z2 && !z4) {
                                try {
                                    if (!this.Camera2StreamConfigurationMap.test(t, t2)) {
                                        Camera2StreamConfigurationMap();
                                        complete(java.lang.Boolean.FALSE);
                                        return;
                                    } else {
                                        this.getHighSpeedVideoSizes = null;
                                        this.getOutputFormats = null;
                                        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                                        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
                                    }
                                } catch (java.lang.Throwable th3) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                    Camera2StreamConfigurationMap();
                                    this.getHighSpeedVideoFpsRangesFor.addThrowable(th3);
                                    this.actual.onError(this.getHighSpeedVideoFpsRangesFor.terminate());
                                    return;
                                }
                            }
                        }
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue3 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                        if (simpleQueue3 != null) {
                            simpleQueue3.clear();
                        }
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue4 = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
                        if (simpleQueue4 != null) {
                            simpleQueue4.clear();
                            return;
                        }
                        return;
                    }
                    if (!isCancelled()) {
                        if (this.getHighSpeedVideoFpsRangesFor.get() != null) {
                            Camera2StreamConfigurationMap();
                            this.actual.onError(this.getHighSpeedVideoFpsRangesFor.terminate());
                            return;
                        }
                    } else {
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue5 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                        if (simpleQueue5 != null) {
                            simpleQueue5.clear();
                        }
                        io.reactivex.internal.fuseable.SimpleQueue<T> simpleQueue6 = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
                        if (simpleQueue6 != null) {
                            simpleQueue6.clear();
                            return;
                        }
                        return;
                    }
                    i = this.getHighSpeedVideoSizesFor.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.addThrowable(th)) {
                getHighSpeedVideoFpsRanges();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }

    static final class EqualSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        volatile boolean Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        int getInputSizeshNQ4ISI;
        volatile io.reactivex.internal.fuseable.SimpleQueue<T> getOutputMinFrameDuration;

        EqualSubscriber(io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper equalCoordinatorHelper, int i) {
            this.getHighSpeedVideoFpsRanges = equalCoordinatorHelper;
            this.getHighResolutionOutputSizeshNQ4ISI = i - (i >> 2);
            this.getHighSpeedVideoSizes = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getInputSizeshNQ4ISI = requestFusion;
                        this.getOutputMinFrameDuration = queueSubscription;
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getInputSizeshNQ4ISI = requestFusion;
                        this.getOutputMinFrameDuration = queueSubscription;
                        subscription.request(this.getHighSpeedVideoSizes);
                        return;
                    }
                }
                this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscArrayQueue(this.getHighSpeedVideoSizes);
                subscription.request(this.getHighSpeedVideoSizes);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getInputSizeshNQ4ISI == 0 && !this.getOutputMinFrameDuration.offer(t)) {
                onError(new io.reactivex.exceptions.MissingBackpressureException());
            } else {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        }

        public final void getHighSpeedVideoFpsRanges() {
            if (this.getInputSizeshNQ4ISI != 1) {
                long j = this.getHighSpeedVideoFpsRangesFor + 1;
                if (j >= this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighSpeedVideoFpsRangesFor = 0L;
                    get().request(j);
                } else {
                    this.getHighSpeedVideoFpsRangesFor = j;
                }
            }
        }
    }
}
