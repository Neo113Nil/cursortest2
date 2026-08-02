package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;

    public FlowableWindowBoundarySupplier(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable, int i) {
        super(flowable);
        this.Camera2StreamConfigurationMap = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryMainSubscriber<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<java.lang.Object, java.lang.Object> Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<>(null);
        static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizesFor;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> getInputFormats;
        final java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> getOutputFormats;
        org.reactivestreams.Subscription getOutputSizeshNQ4ISI;
        io.reactivex.processors.UnicastProcessor<T> getOutputStallDuration;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B>> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getOutputStallDurationlomOqCM = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> getOutputMinFrameDuration = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable getInputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean getOutputSizes = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, int i, java.util.concurrent.Callable<? extends org.reactivestreams.Publisher<B>> callable) {
            this.getInputFormats = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getOutputFormats = callable;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputSizeshNQ4ISI, subscription)) {
                this.getOutputSizeshNQ4ISI = subscription;
                this.getInputFormats.onSubscribe(this);
                this.getOutputMinFrameDuration.offer(getHighSpeedVideoSizes);
                Camera2StreamConfigurationMap();
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getOutputMinFrameDuration.offer(t);
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            getHighResolutionOutputSizeshNQ4ISI();
            if (this.getInputSizeshNQ4ISI.addThrowable(th)) {
                this.getHighSpeedVideoFpsRangesFor = true;
                Camera2StreamConfigurationMap();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRangesFor = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getOutputSizes.compareAndSet(false, true)) {
                getHighResolutionOutputSizeshNQ4ISI();
                if (this.getOutputStallDurationlomOqCM.decrementAndGet() == 0) {
                    this.getOutputSizeshNQ4ISI.cancel();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDurationlomOqCM, j);
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<T, B>> atomicReference = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber<java.lang.Object, java.lang.Object> windowBoundaryInnerSubscriber = Camera2StreamConfigurationMap;
            io.reactivex.disposables.Disposable disposable = (io.reactivex.disposables.Disposable) atomicReference.getAndSet(windowBoundaryInnerSubscriber);
            if (disposable == null || disposable == windowBoundaryInnerSubscriber) {
                return;
            }
            disposable.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getOutputStallDurationlomOqCM.decrementAndGet() == 0) {
                this.getOutputSizeshNQ4ISI.cancel();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber = this.getInputFormats;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> mpscLinkedQueue = this.getOutputMinFrameDuration;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getInputSizeshNQ4ISI;
                long j = this.getHighSpeedVideoSizesFor;
                int i = 1;
                while (this.getOutputStallDurationlomOqCM.get() != 0) {
                    io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputStallDuration;
                    boolean z = this.getHighSpeedVideoFpsRangesFor;
                    if (z && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        java.lang.Throwable terminate = atomicThrowable.terminate();
                        if (unicastProcessor != 0) {
                            this.getOutputStallDuration = null;
                            unicastProcessor.onError(terminate);
                        }
                        subscriber.onError(terminate);
                        return;
                    }
                    java.lang.Object poll = mpscLinkedQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        java.lang.Throwable terminate2 = atomicThrowable.terminate();
                        if (terminate2 == null) {
                            if (unicastProcessor != 0) {
                                this.getOutputStallDuration = null;
                                unicastProcessor.onComplete();
                            }
                            subscriber.onComplete();
                            return;
                        }
                        if (unicastProcessor != 0) {
                            this.getOutputStallDuration = null;
                            unicastProcessor.onError(terminate2);
                        }
                        subscriber.onError(terminate2);
                        return;
                    }
                    if (!z2) {
                        if (poll != getHighSpeedVideoSizes) {
                            unicastProcessor.onNext(poll);
                        } else {
                            if (unicastProcessor != 0) {
                                this.getOutputStallDuration = null;
                                unicastProcessor.onComplete();
                            }
                            if (!this.getOutputSizes.get()) {
                                if (j != this.getOutputMinFrameDurationlomOqCM.get()) {
                                    io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.getHighResolutionOutputSizeshNQ4ISI, this);
                                    this.getOutputStallDuration = create;
                                    this.getOutputStallDurationlomOqCM.getAndIncrement();
                                    try {
                                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.call(), "The other Callable returned a null Publisher");
                                        io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber windowBoundaryInnerSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryInnerSubscriber(this);
                                        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, null, windowBoundaryInnerSubscriber)) {
                                            publisher.subscribe(windowBoundaryInnerSubscriber);
                                            j++;
                                            subscriber.onNext(create);
                                        }
                                    } catch (java.lang.Throwable th) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                        atomicThrowable.addThrowable(th);
                                        this.getHighSpeedVideoFpsRangesFor = true;
                                    }
                                } else {
                                    this.getOutputSizeshNQ4ISI.cancel();
                                    getHighResolutionOutputSizeshNQ4ISI();
                                    atomicThrowable.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                    this.getHighSpeedVideoFpsRangesFor = true;
                                }
                            }
                        }
                    } else {
                        this.getHighSpeedVideoSizesFor = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                mpscLinkedQueue.clear();
                this.getOutputStallDuration = null;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryInnerSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRanges;

        WindowBoundaryInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.Camera2StreamConfigurationMap = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            dispose();
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.Camera2StreamConfigurationMap;
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(windowBoundaryMainSubscriber.getHighSpeedVideoFpsRanges, this, null);
            windowBoundaryMainSubscriber.getOutputMinFrameDuration.offer(io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber.getHighSpeedVideoSizes);
            windowBoundaryMainSubscriber.Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.Camera2StreamConfigurationMap;
            windowBoundaryMainSubscriber.getOutputSizeshNQ4ISI.cancel();
            if (windowBoundaryMainSubscriber.getInputSizeshNQ4ISI.addThrowable(th)) {
                windowBoundaryMainSubscriber.getHighSpeedVideoFpsRangesFor = true;
                windowBoundaryMainSubscriber.Camera2StreamConfigurationMap();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.Camera2StreamConfigurationMap;
            windowBoundaryMainSubscriber.getOutputSizeshNQ4ISI.cancel();
            windowBoundaryMainSubscriber.getHighSpeedVideoFpsRangesFor = true;
            windowBoundaryMainSubscriber.Camera2StreamConfigurationMap();
        }
    }
}
