package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTimeoutTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface TimeoutSupport {
        void Camera2StreamConfigurationMap(long j);
    }

    public FlowableTimeoutTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, org.reactivestreams.Publisher<? extends T> publisher) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
        this.getHighSpeedVideoFpsRangesFor = publisher;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSubscriber timeoutSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.createWorker());
            subscriber.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.getHighResolutionOutputSizeshNQ4ISI(0L);
            this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutSubscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutFallbackSubscriber timeoutFallbackSubscriber = new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutFallbackSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.createWorker(), this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.getHighSpeedVideoSizes(0L);
        this.source.subscribe((io.reactivex.FlowableSubscriber) timeoutFallbackSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getOutputFormats;
        final io.reactivex.internal.disposables.SequentialDisposable getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();

        TimeoutSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRanges = timeUnit;
            this.getOutputFormats = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.get().dispose();
                    this.Camera2StreamConfigurationMap.onNext(t);
                    getHighResolutionOutputSizeshNQ4ISI(j2);
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.replace(this.getOutputFormats.schedule(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutTask(j, this), this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                this.Camera2StreamConfigurationMap.onError(th);
                this.getOutputFormats.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                this.Camera2StreamConfigurationMap.onComplete();
                this.getOutputFormats.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void Camera2StreamConfigurationMap(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getInputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.onError(new java.util.concurrent.TimeoutException());
                this.getOutputFormats.dispose();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getInputSizeshNQ4ISI);
            this.getOutputFormats.dispose();
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutTask implements java.lang.Runnable {
        final io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoSizes;

        TimeoutTask(long j, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport timeoutSupport) {
            this.getHighSpeedVideoSizes = j;
            this.getHighResolutionOutputSizeshNQ4ISI = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutFallbackSubscriber<T> extends io.reactivex.internal.subscriptions.SubscriptionArbiter implements io.reactivex.FlowableSubscriber<T>, io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        org.reactivestreams.Publisher<? extends T> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizesFor;
        final io.reactivex.Scheduler.Worker getInputFormats;
        final long getOutputMinFrameDuration;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();

        TimeoutFallbackSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, org.reactivestreams.Publisher<? extends T> publisher) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getOutputMinFrameDuration = j;
            this.getHighSpeedVideoSizesFor = timeUnit;
            this.getInputFormats = worker;
            this.getHighSpeedVideoFpsRanges = publisher;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getInputSizeshNQ4ISI, subscription)) {
                setSubscription(subscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(j, j2)) {
                    this.getHighSpeedVideoFpsRangesFor.get().dispose();
                    this.getHighSpeedVideoSizes++;
                    this.Camera2StreamConfigurationMap.onNext(t);
                    getHighSpeedVideoSizes(j2);
                }
            }
        }

        final void getHighSpeedVideoSizes(long j) {
            this.getHighSpeedVideoFpsRangesFor.replace(this.getInputFormats.schedule(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutTask(j, this), this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRangesFor.dispose();
                this.Camera2StreamConfigurationMap.onError(th);
                this.getInputFormats.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRangesFor.dispose();
                this.Camera2StreamConfigurationMap.onComplete();
                this.getInputFormats.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public final void Camera2StreamConfigurationMap(long j) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getInputSizeshNQ4ISI);
                long j2 = this.getHighSpeedVideoSizes;
                if (j2 != 0) {
                    produced(j2);
                }
                org.reactivestreams.Publisher<? extends T> publisher = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = null;
                publisher.subscribe(new io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.FallbackSubscriber(this.Camera2StreamConfigurationMap, this));
                this.getInputFormats.dispose();
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getInputFormats.dispose();
        }
    }

    /* loaded from: classes17.dex */
    static final class FallbackSubscriber<T> implements io.reactivex.FlowableSubscriber<T> {
        final io.reactivex.internal.subscriptions.SubscriptionArbiter getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        FallbackSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.subscriptions.SubscriptionArbiter subscriptionArbiter) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = subscriptionArbiter;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            this.getHighSpeedVideoFpsRangesFor.setSubscription(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
