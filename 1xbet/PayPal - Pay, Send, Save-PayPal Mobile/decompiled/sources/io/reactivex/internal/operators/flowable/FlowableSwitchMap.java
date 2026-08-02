package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSwitchMap<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    public FlowableSwitchMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        if (io.reactivex.internal.operators.flowable.FlowableScalarXMap.tryScalarXMapSubscribe(this.source, subscriber, this.getHighSpeedVideoFpsRangesFor)) {
            return;
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> Camera2StreamConfigurationMap;
        private static final long serialVersionUID = -3491074160481096299L;
        final int getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final boolean getHighSpeedVideoSizesFor;
        volatile boolean getOutputFormats;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> getOutputMinFrameDuration;
        volatile long getOutputSizes;
        org.reactivestreams.Subscription getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.util.AtomicThrowable getInputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();

        static {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> switchMapInnerSubscriber = new io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<>(null, -1L, 1);
            Camera2StreamConfigurationMap = switchMapInnerSubscriber;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(switchMapInnerSubscriber);
        }

        SwitchMapSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputMinFrameDuration = function;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizesFor = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDurationlomOqCM, subscription)) {
                this.getOutputStallDurationlomOqCM = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.getOutputFormats) {
                return;
            }
            long j = this.getOutputSizes + 1;
            this.getOutputSizes = j;
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (switchMapInnerSubscriber2 != null) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(switchMapInnerSubscriber2);
            }
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.apply(t), "The publisher returned is null");
                io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber switchMapInnerSubscriber3 = new io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber(this, j, this.getHighSpeedVideoFpsRanges);
                do {
                    switchMapInnerSubscriber = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    if (switchMapInnerSubscriber == Camera2StreamConfigurationMap) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, switchMapInnerSubscriber, switchMapInnerSubscriber3));
                publisher.subscribe(switchMapInnerSubscriber3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputStallDurationlomOqCM.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.getOutputFormats && this.getInputSizeshNQ4ISI.addThrowable(th)) {
                if (!this.getHighSpeedVideoSizesFor) {
                    getHighSpeedVideoFpsRangesFor();
                }
                this.getOutputFormats = true;
                Camera2StreamConfigurationMap();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getOutputFormats) {
                return;
            }
            this.getOutputFormats = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
                if (this.getOutputSizes == 0) {
                    this.getOutputStallDurationlomOqCM.request(Long.MAX_VALUE);
                } else {
                    Camera2StreamConfigurationMap();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputStallDurationlomOqCM.cancel();
            getHighSpeedVideoFpsRangesFor();
        }

        private void getHighSpeedVideoFpsRangesFor() {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> switchMapInnerSubscriber;
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<java.lang.Object, java.lang.Object> switchMapInnerSubscriber3 = Camera2StreamConfigurationMap;
            if (switchMapInnerSubscriber2 == switchMapInnerSubscriber3 || (switchMapInnerSubscriber = (io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber) this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(switchMapInnerSubscriber3)) == switchMapInnerSubscriber3 || switchMapInnerSubscriber == null) {
                return;
            }
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(switchMapInnerSubscriber);
        }

        final void Camera2StreamConfigurationMap() {
            boolean z;
            amex.AMEXKernel aMEXKernel;
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.getHighSpeedVideoFpsRangesFor;
                int i = 1;
                while (!this.getHighSpeedVideoSizes) {
                    if (this.getOutputFormats) {
                        if (this.getHighSpeedVideoSizesFor) {
                            if (this.getHighResolutionOutputSizeshNQ4ISI.get() == null) {
                                if (this.getInputSizeshNQ4ISI.get() != null) {
                                    subscriber.onError(this.getInputSizeshNQ4ISI.terminate());
                                    return;
                                } else {
                                    subscriber.onComplete();
                                    return;
                                }
                            }
                        } else if (this.getInputSizeshNQ4ISI.get() != null) {
                            getHighSpeedVideoFpsRangesFor();
                            subscriber.onError(this.getInputSizeshNQ4ISI.terminate());
                            return;
                        } else if (this.getHighResolutionOutputSizeshNQ4ISI.get() == null) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    io.reactivex.internal.fuseable.SimpleQueue<R> simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.getInputSizeshNQ4ISI : null;
                    if (simpleQueue != null) {
                        if (switchMapInnerSubscriber.Camera2StreamConfigurationMap) {
                            if (!this.getHighSpeedVideoSizesFor) {
                                if (this.getInputSizeshNQ4ISI.get() != null) {
                                    getHighSpeedVideoFpsRangesFor();
                                    subscriber.onError(this.getInputSizeshNQ4ISI.terminate());
                                    return;
                                } else if (simpleQueue.isEmpty()) {
                                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, switchMapInnerSubscriber, null);
                                }
                            } else if (simpleQueue.isEmpty()) {
                                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, switchMapInnerSubscriber, null);
                            }
                        }
                        long j = this.getInputFormats.get();
                        long j2 = 0;
                        while (true) {
                            z = false;
                            if (j2 == j) {
                                break;
                            }
                            if (!this.getHighSpeedVideoSizes) {
                                boolean z2 = switchMapInnerSubscriber.Camera2StreamConfigurationMap;
                                try {
                                    aMEXKernel = simpleQueue.poll();
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(switchMapInnerSubscriber);
                                    this.getInputSizeshNQ4ISI.addThrowable(th);
                                    aMEXKernel = null;
                                    z2 = true;
                                }
                                boolean z3 = aMEXKernel == null;
                                if (switchMapInnerSubscriber != this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                                    break;
                                }
                                if (z2) {
                                    if (!this.getHighSpeedVideoSizesFor) {
                                        if (this.getInputSizeshNQ4ISI.get() == null) {
                                            if (z3) {
                                                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, switchMapInnerSubscriber, null);
                                                break;
                                            }
                                        } else {
                                            subscriber.onError(this.getInputSizeshNQ4ISI.terminate());
                                            return;
                                        }
                                    } else if (z3) {
                                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, switchMapInnerSubscriber, null);
                                        break;
                                    }
                                }
                                if (z3) {
                                    break;
                                }
                                subscriber.onNext(aMEXKernel);
                                j2++;
                            } else {
                                return;
                            }
                        }
                        z = true;
                        if (j2 != 0 && !this.getHighSpeedVideoSizes) {
                            if (j != Long.MAX_VALUE) {
                                this.getInputFormats.addAndGet(-j2);
                            }
                            switchMapInnerSubscriber.get().request(j2);
                        }
                        if (z) {
                            continue;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI.lazySet(null);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapInnerSubscriber<T, R> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        volatile boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> getHighSpeedVideoSizes;
        volatile io.reactivex.internal.fuseable.SimpleQueue<R> getInputSizeshNQ4ISI;

        SwitchMapInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber, long j, int i) {
            this.getHighSpeedVideoSizes = switchMapSubscriber;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    io.reactivex.internal.fuseable.QueueSubscription queueSubscription = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getHighResolutionOutputSizeshNQ4ISI = requestFusion;
                        this.getInputSizeshNQ4ISI = queueSubscription;
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getHighResolutionOutputSizeshNQ4ISI = requestFusion;
                        this.getInputSizeshNQ4ISI = queueSubscription;
                        subscription.request(this.getHighSpeedVideoFpsRangesFor);
                        return;
                    }
                }
                this.getInputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscArrayQueue(this.getHighSpeedVideoFpsRangesFor);
                subscription.request(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r) {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber = this.getHighSpeedVideoSizes;
            if (this.getHighSpeedVideoFpsRanges == switchMapSubscriber.getOutputSizes) {
                if (this.getHighResolutionOutputSizeshNQ4ISI == 0 && !this.getInputSizeshNQ4ISI.offer(r)) {
                    onError(new io.reactivex.exceptions.MissingBackpressureException("Queue full?!"));
                } else {
                    switchMapSubscriber.Camera2StreamConfigurationMap();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber = this.getHighSpeedVideoSizes;
            if (this.getHighSpeedVideoFpsRanges == switchMapSubscriber.getOutputSizes && switchMapSubscriber.getInputSizeshNQ4ISI.addThrowable(th)) {
                if (!switchMapSubscriber.getHighSpeedVideoSizesFor) {
                    switchMapSubscriber.getOutputStallDurationlomOqCM.cancel();
                }
                this.Camera2StreamConfigurationMap = true;
                switchMapSubscriber.Camera2StreamConfigurationMap();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.operators.flowable.FlowableSwitchMap.SwitchMapSubscriber<T, R> switchMapSubscriber = this.getHighSpeedVideoSizes;
            if (this.getHighSpeedVideoFpsRanges == switchMapSubscriber.getOutputSizes) {
                this.Camera2StreamConfigurationMap = true;
                switchMapSubscriber.Camera2StreamConfigurationMap();
            }
        }
    }
}
