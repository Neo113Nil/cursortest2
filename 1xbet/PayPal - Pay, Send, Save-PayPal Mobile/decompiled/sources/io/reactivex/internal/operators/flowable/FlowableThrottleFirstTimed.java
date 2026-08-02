package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableThrottleFirstTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final long getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public FlowableThrottleFirstTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed.DebounceTimedSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.createWorker()));
    }

    /* loaded from: classes17.dex */
    static final class DebounceTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean Camera2StreamConfigurationMap;
        final long getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizesFor = new io.reactivex.internal.disposables.SequentialDisposable();
        final io.reactivex.Scheduler.Worker getInputSizeshNQ4ISI;
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

        DebounceTimedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getOutputMinFrameDuration = timeUnit;
            this.getInputSizeshNQ4ISI = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (get() != 0) {
                this.getHighSpeedVideoFpsRangesFor.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoSizesFor.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.getHighSpeedVideoSizesFor.replace(this.getInputSizeshNQ4ISI.schedule(this, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration));
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            cancel();
            this.getHighSpeedVideoFpsRangesFor.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver value due to lack of requests"));
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighSpeedVideoFpsRanges = false;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
            this.getInputSizeshNQ4ISI.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes.cancel();
            this.getInputSizeshNQ4ISI.dispose();
        }
    }
}
