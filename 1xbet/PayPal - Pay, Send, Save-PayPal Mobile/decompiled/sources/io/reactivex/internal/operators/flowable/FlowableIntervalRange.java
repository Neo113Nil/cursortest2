package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableIntervalRange extends io.reactivex.Flowable<java.lang.Long> {
    final long Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final long getHighSpeedVideoSizesFor;
    final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

    public FlowableIntervalRange(long j, long j2, long j3, long j4, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = j3;
        this.getHighSpeedVideoSizes = j4;
        this.getOutputMinFrameDuration = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoSizesFor = j;
        this.Camera2StreamConfigurationMap = j2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableIntervalRange.IntervalRangeSubscriber intervalRangeSubscriber = new io.reactivex.internal.operators.flowable.FlowableIntervalRange.IntervalRangeSubscriber(subscriber, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap);
        subscriber.onSubscribe(intervalRangeSubscriber);
        io.reactivex.Scheduler scheduler = this.getHighSpeedVideoFpsRangesFor;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker createWorker = scheduler.createWorker();
            io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalRangeSubscriber.getHighSpeedVideoFpsRanges, createWorker);
            createWorker.schedulePeriodically(intervalRangeSubscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration);
        } else {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalRangeSubscriber.getHighSpeedVideoFpsRanges, scheduler.schedulePeriodicallyDirect(intervalRangeSubscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration));
        }
    }

    /* loaded from: classes17.dex */
    static final class IntervalRangeSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final long getHighSpeedVideoFpsRangesFor;

        IntervalRangeSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber, long j, long j2) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = j2;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges.get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                long j = get();
                if (j != 0) {
                    long j2 = this.Camera2StreamConfigurationMap;
                    this.getHighResolutionOutputSizeshNQ4ISI.onNext(java.lang.Long.valueOf(j2));
                    if (j2 == this.getHighSpeedVideoFpsRangesFor) {
                        if (this.getHighSpeedVideoFpsRanges.get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                        }
                        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
                        return;
                    } else {
                        this.Camera2StreamConfigurationMap = j2 + 1;
                        if (j != Long.MAX_VALUE) {
                            decrementAndGet();
                            return;
                        }
                        return;
                    }
                }
                org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't deliver value ");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(" due to lack of requests");
                subscriber.onError(new io.reactivex.exceptions.MissingBackpressureException(sb.toString()));
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            }
        }
    }
}
