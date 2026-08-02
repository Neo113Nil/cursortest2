package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDelay<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public FlowableDelay(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, boolean z) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber(!this.Camera2StreamConfigurationMap ? new io.reactivex.subscribers.SerializedSubscriber(subscriber) : subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor.createWorker(), this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class DelaySubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getInputSizeshNQ4ISI;

        DelaySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, boolean z) {
            this.getHighSpeedVideoSizes = subscriber;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.Camera2StreamConfigurationMap = timeUnit;
            this.getInputSizeshNQ4ISI = worker;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getInputSizeshNQ4ISI.schedule(new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.OnNext(t), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getInputSizeshNQ4ISI.schedule(new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.OnError(th), this.getHighSpeedVideoFpsRanges ? this.getHighSpeedVideoFpsRangesFor : 0L, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getInputSizeshNQ4ISI.schedule(new io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.OnComplete(), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getInputSizeshNQ4ISI.dispose();
        }

        final class OnNext implements java.lang.Runnable {
            private final T Camera2StreamConfigurationMap;

            OnNext(T t) {
                this.Camera2StreamConfigurationMap = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.getHighSpeedVideoSizes.onNext(this.Camera2StreamConfigurationMap);
            }
        }

        final class OnError implements java.lang.Runnable {
            private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

            OnError(java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI = th;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.getHighSpeedVideoSizes.onError(this.getHighResolutionOutputSizeshNQ4ISI);
                } finally {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.getInputSizeshNQ4ISI.dispose();
                }
            }
        }

        final class OnComplete implements java.lang.Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.getHighSpeedVideoSizes.onComplete();
                } finally {
                    io.reactivex.internal.operators.flowable.FlowableDelay.DelaySubscriber.this.getInputSizeshNQ4ISI.dispose();
                }
            }
        }
    }
}
