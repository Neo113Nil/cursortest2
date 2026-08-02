package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableInterval extends io.reactivex.Flowable<java.lang.Long> {
    final long Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;

    public FlowableInterval(long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableInterval.IntervalSubscriber intervalSubscriber = new io.reactivex.internal.operators.flowable.FlowableInterval.IntervalSubscriber(subscriber);
        subscriber.onSubscribe(intervalSubscriber);
        io.reactivex.Scheduler scheduler = this.getHighSpeedVideoSizes;
        if (scheduler instanceof io.reactivex.internal.schedulers.TrampolineScheduler) {
            io.reactivex.Scheduler.Worker createWorker = scheduler.createWorker();
            io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalSubscriber.getHighSpeedVideoFpsRanges, createWorker);
            createWorker.schedulePeriodically(intervalSubscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
        } else {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(intervalSubscriber.getHighSpeedVideoFpsRanges, scheduler.schedulePeriodicallyDirect(intervalSubscriber, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* loaded from: classes17.dex */
    static final class IntervalSubscriber extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, java.lang.Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final org.reactivestreams.Subscriber<? super java.lang.Long> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        long getHighSpeedVideoFpsRangesFor;

        IntervalSubscriber(org.reactivestreams.Subscriber<? super java.lang.Long> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
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
                if (get() != 0) {
                    org.reactivestreams.Subscriber<? super java.lang.Long> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                    long j = this.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor = j + 1;
                    subscriber.onNext(java.lang.Long.valueOf(j));
                    io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
                    return;
                }
                org.reactivestreams.Subscriber<? super java.lang.Long> subscriber2 = this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't deliver value ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                sb.append(" due to lack of requests");
                subscriber2.onError(new io.reactivex.exceptions.MissingBackpressureException(sb.toString()));
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            }
        }
    }
}
