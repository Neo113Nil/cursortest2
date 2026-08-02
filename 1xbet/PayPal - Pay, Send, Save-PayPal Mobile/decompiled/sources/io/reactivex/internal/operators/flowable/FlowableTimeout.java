package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTimeout<T, U, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final org.reactivestreams.Publisher<? extends T> Camera2StreamConfigurationMap;
    final org.reactivestreams.Publisher<U> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface TimeoutSelectorSupport extends io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Throwable th);
    }

    public FlowableTimeout(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<U> publisher, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<V>> function, org.reactivestreams.Publisher<? extends T> publisher2) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = publisher2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (this.Camera2StreamConfigurationMap == null) {
            io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSubscriber timeoutSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSubscriber(subscriber, this.getHighSpeedVideoSizes);
            subscriber.onSubscribe(timeoutSubscriber);
            org.reactivestreams.Publisher<U> publisher = this.getHighSpeedVideoFpsRangesFor;
            if (publisher != null) {
                io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(0L, timeoutSubscriber);
                if (timeoutSubscriber.Camera2StreamConfigurationMap.replace(timeoutConsumer)) {
                    publisher.subscribe(timeoutConsumer);
                }
            }
            this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutSubscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutFallbackSubscriber timeoutFallbackSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutFallbackSubscriber(subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        subscriber.onSubscribe(timeoutFallbackSubscriber);
        org.reactivestreams.Publisher<U> publisher2 = this.getHighSpeedVideoFpsRangesFor;
        if (publisher2 != null) {
            io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer2 = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(0L, timeoutFallbackSubscriber);
            if (timeoutFallbackSubscriber.getOutputMinFrameDuration.replace(timeoutConsumer2)) {
                publisher2.subscribe(timeoutConsumer2);
            }
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutFallbackSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> getHighSpeedVideoSizes;
        final io.reactivex.internal.disposables.SequentialDisposable Camera2StreamConfigurationMap = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoSizes = function;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.Camera2StreamConfigurationMap.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                    try {
                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(j2, this);
                        if (this.Camera2StreamConfigurationMap.replace(timeoutConsumer)) {
                            publisher.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoFpsRanges.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Camera2StreamConfigurationMap.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Camera2StreamConfigurationMap.dispose();
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void Camera2StreamConfigurationMap(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(new java.util.concurrent.TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap.dispose();
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutFallbackSubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long Camera2StreamConfigurationMap;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final io.reactivex.internal.disposables.SequentialDisposable getOutputMinFrameDuration = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();

        TimeoutFallbackSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<?>> function, org.reactivestreams.Publisher<? extends T> publisher) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
            this.getHighSpeedVideoFpsRanges = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighSpeedVideoSizesFor, subscription)) {
                setSubscription(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoFpsRangesFor.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(j, j2)) {
                    io.reactivex.disposables.Disposable disposable = this.getOutputMinFrameDuration.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.Camera2StreamConfigurationMap++;
                    this.getHighSpeedVideoSizes.onNext(t);
                    try {
                        org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                        io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer timeoutConsumer = new io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutConsumer(j2, this);
                        if (this.getOutputMinFrameDuration.replace(timeoutConsumer)) {
                            publisher.subscribe(timeoutConsumer);
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoSizesFor.get().cancel();
                        this.getHighSpeedVideoFpsRangesFor.getAndSet(Long.MAX_VALUE);
                        this.getHighSpeedVideoSizes.onError(th);
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getOutputMinFrameDuration.dispose();
                this.getHighSpeedVideoSizes.onError(th);
                this.getOutputMinFrameDuration.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getOutputMinFrameDuration.dispose();
                this.getHighSpeedVideoSizes.onComplete();
                this.getOutputMinFrameDuration.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void Camera2StreamConfigurationMap(long j) {
            if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizesFor);
                org.reactivestreams.Publisher<? extends T> publisher = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = null;
                long j2 = this.Camera2StreamConfigurationMap;
                if (j2 != 0) {
                    produced(j2);
                }
                publisher.subscribe(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.FallbackSubscriber(this.getHighSpeedVideoSizes, this));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public final void getHighResolutionOutputSizeshNQ4ISI(long j, java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoSizesFor);
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getOutputMinFrameDuration.dispose();
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutConsumer extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport getHighSpeedVideoSizes;

        TimeoutConsumer(long j, io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport timeoutSelectorSupport) {
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoSizes = timeoutSelectorSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            org.reactivestreams.Subscription subscription = (org.reactivestreams.Subscription) get();
            if (subscription != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                subscription.cancel();
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get() != io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED) {
                lazySet(io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED);
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(get());
        }
    }
}
