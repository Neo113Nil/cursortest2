package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTimeInterval<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.schedulers.Timed<T>> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public FlowableTimeInterval(io.reactivex.Flowable<T> flowable, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.Camera2StreamConfigurationMap = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTimeInterval.TimeIntervalSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class TimeIntervalSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> Camera2StreamConfigurationMap;
        final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Scheduler getHighSpeedVideoSizes;

        TimeIntervalSubscriber(org.reactivestreams.Subscriber<? super io.reactivex.schedulers.Timed<T>> subscriber, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = scheduler;
            this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription)) {
                this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.now(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRangesFor = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long now = this.getHighSpeedVideoSizes.now(this.getHighResolutionOutputSizeshNQ4ISI);
            long j = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = now;
            this.Camera2StreamConfigurationMap.onNext(new io.reactivex.schedulers.Timed(t, now - j, this.getHighResolutionOutputSizeshNQ4ISI));
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRangesFor.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRangesFor.cancel();
        }
    }
}
