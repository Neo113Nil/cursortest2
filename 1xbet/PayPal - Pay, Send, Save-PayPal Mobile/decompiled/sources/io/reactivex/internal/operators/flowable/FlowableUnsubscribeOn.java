package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableUnsubscribeOn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

    public FlowableUnsubscribeOn(io.reactivex.Flowable<T> flowable, io.reactivex.Scheduler scheduler) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn.UnsubscribeSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class UnsubscribeSubscriber<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 1015244841293359600L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoSizes;

        UnsubscribeSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = scheduler;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (get()) {
                return;
            }
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.Camera2StreamConfigurationMap.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.scheduleDirect(new io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn.UnsubscribeSubscriber.Cancellation());
            }
        }

        final class Cancellation implements java.lang.Runnable {
            Cancellation() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn.UnsubscribeSubscriber.this.getHighSpeedVideoFpsRanges.cancel();
            }
        }
    }
}
