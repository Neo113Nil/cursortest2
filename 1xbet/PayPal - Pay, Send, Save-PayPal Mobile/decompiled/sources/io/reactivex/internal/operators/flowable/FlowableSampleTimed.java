package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSampleTimed<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public FlowableSampleTimed(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(flowable);
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.subscribers.SerializedSubscriber serializedSubscriber = new io.reactivex.subscribers.SerializedSubscriber(subscriber);
        if (this.getHighSpeedVideoFpsRangesFor) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedEmitLast(serializedSubscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedNoLast(serializedSubscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class SampleTimedSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final io.reactivex.Scheduler getInputFormats;
        final java.util.concurrent.TimeUnit getOutputFormats;
        final java.util.concurrent.atomic.AtomicLong Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.disposables.SequentialDisposable getInputSizeshNQ4ISI = new io.reactivex.internal.disposables.SequentialDisposable();

        abstract void getHighSpeedVideoFpsRangesFor();

        SampleTimedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getOutputFormats = timeUnit;
            this.getInputFormats = scheduler;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = this.getInputSizeshNQ4ISI;
                io.reactivex.Scheduler scheduler = this.getInputFormats;
                long j = this.getHighSpeedVideoFpsRangesFor;
                sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j, j, this.getOutputFormats));
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            lazySet(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.Camera2StreamConfigurationMap, j);
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.Camera2StreamConfigurationMap.get() != 0) {
                    this.getHighSpeedVideoSizes.onNext(andSet);
                    io.reactivex.internal.util.BackpressureHelper.produced(this.Camera2StreamConfigurationMap, 1L);
                } else {
                    cancel();
                    this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            this.getHighSpeedVideoSizes.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleTimedNoLast<T> extends io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(subscriber, j, timeUnit, scheduler);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // java.lang.Runnable
        public final void run() {
            getHighSpeedVideoFpsRanges();
        }
    }

    /* loaded from: classes17.dex */
    static final class SampleTimedEmitLast<T> extends io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges;

        SampleTimedEmitLast(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(subscriber, j, timeUnit, scheduler);
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        final void getHighSpeedVideoFpsRangesFor() {
            getHighSpeedVideoFpsRanges();
            if (this.getHighSpeedVideoFpsRanges.decrementAndGet() == 0) {
                this.getHighSpeedVideoSizes.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges.incrementAndGet() == 2) {
                getHighSpeedVideoFpsRanges();
                if (this.getHighSpeedVideoFpsRanges.decrementAndGet() == 0) {
                    this.getHighSpeedVideoSizes.onComplete();
                }
            }
        }
    }
}
