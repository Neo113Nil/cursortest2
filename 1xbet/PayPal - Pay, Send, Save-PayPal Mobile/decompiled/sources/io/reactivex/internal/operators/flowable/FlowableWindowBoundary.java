package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWindowBoundary<T, B> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.Flowable<T>> {
    final org.reactivestreams.Publisher<B> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;

    public FlowableWindowBoundary(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<B> publisher, int i) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = publisher;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber windowBoundaryMainSubscriber = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(windowBoundaryMainSubscriber);
        windowBoundaryMainSubscriber.getHighSpeedVideoSizesFor.offer(io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.getHighSpeedVideoSizes);
        windowBoundaryMainSubscriber.getHighSpeedVideoSizes();
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(windowBoundaryMainSubscriber.getHighResolutionOutputSizeshNQ4ISI);
        this.source.subscribe((io.reactivex.FlowableSubscriber) windowBoundaryMainSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryMainSubscriber<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        long getOutputMinFrameDuration;
        io.reactivex.processors.UnicastProcessor<T> getOutputSizes;
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryInnerSubscriber<T, B> getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryInnerSubscriber<>(this);
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputStallDuration = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();

        WindowBoundaryMainSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber, int i) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputStallDuration, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizesFor.offer(t);
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            if (this.getOutputFormats.addThrowable(th)) {
                this.getHighSpeedVideoFpsRanges = true;
                getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighSpeedVideoFpsRanges = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDuration);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getInputFormats, j);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDuration);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super io.reactivex.Flowable<T>> subscriber = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> mpscLinkedQueue = this.getHighSpeedVideoSizesFor;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getOutputFormats;
                long j = this.getOutputMinFrameDuration;
                int i = 1;
                while (this.getOutputSizeshNQ4ISI.get() != 0) {
                    io.reactivex.processors.UnicastProcessor<T> unicastProcessor = this.getOutputSizes;
                    boolean z = this.getHighSpeedVideoFpsRanges;
                    if (z && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        java.lang.Throwable terminate = atomicThrowable.terminate();
                        if (unicastProcessor != 0) {
                            this.getOutputSizes = null;
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
                                this.getOutputSizes = null;
                                unicastProcessor.onComplete();
                            }
                            subscriber.onComplete();
                            return;
                        }
                        if (unicastProcessor != 0) {
                            this.getOutputSizes = null;
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
                                this.getOutputSizes = null;
                                unicastProcessor.onComplete();
                            }
                            if (!this.getInputSizeshNQ4ISI.get()) {
                                io.reactivex.processors.UnicastProcessor<T> create = io.reactivex.processors.UnicastProcessor.create(this.getHighSpeedVideoFpsRangesFor, this);
                                this.getOutputSizes = create;
                                this.getOutputSizeshNQ4ISI.getAndIncrement();
                                if (j != this.getInputFormats.get()) {
                                    j++;
                                    subscriber.onNext(create);
                                } else {
                                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputStallDuration);
                                    this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                                    atomicThrowable.addThrowable(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver a window due to lack of requests"));
                                    this.getHighSpeedVideoFpsRanges = true;
                                }
                            }
                        }
                    } else {
                        this.getOutputMinFrameDuration = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                mpscLinkedQueue.clear();
                this.getOutputSizes = null;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryInnerSubscriber<T, B> extends io.reactivex.subscribers.DisposableSubscriber<B> {
        final io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRangesFor;

        WindowBoundaryInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = windowBoundaryMainSubscriber;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            windowBoundaryMainSubscriber.getHighSpeedVideoSizesFor.offer(io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber.getHighSpeedVideoSizes);
            windowBoundaryMainSubscriber.getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(windowBoundaryMainSubscriber.getOutputStallDuration);
            if (windowBoundaryMainSubscriber.getOutputFormats.addThrowable(th)) {
                windowBoundaryMainSubscriber.getHighSpeedVideoFpsRanges = true;
                windowBoundaryMainSubscriber.getHighSpeedVideoSizes();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            io.reactivex.internal.operators.flowable.FlowableWindowBoundary.WindowBoundaryMainSubscriber<T, B> windowBoundaryMainSubscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(windowBoundaryMainSubscriber.getOutputStallDuration);
            windowBoundaryMainSubscriber.getHighSpeedVideoFpsRanges = true;
            windowBoundaryMainSubscriber.getHighSpeedVideoSizes();
        }
    }
}
