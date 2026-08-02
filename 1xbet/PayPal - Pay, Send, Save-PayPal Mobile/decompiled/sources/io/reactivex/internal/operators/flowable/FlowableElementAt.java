package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableElementAt<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long Camera2StreamConfigurationMap;
    final boolean getHighSpeedVideoFpsRangesFor;
    final T getHighSpeedVideoSizes;

    public FlowableElementAt(io.reactivex.Flowable<T> flowable, long j, T t, boolean z) {
        super(flowable);
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoSizes = t;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableElementAt.ElementAtSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
    }

    static final class ElementAtSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        final long Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final T getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        org.reactivestreams.Subscription getOutputFormats;

        ElementAtSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j, T t, boolean z) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = t;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputFormats, subscription)) {
                this.getOutputFormats = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            if (j == this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoSizes = true;
                this.getOutputFormats.cancel();
                complete(t);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = j + 1;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.actual.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            T t = this.getHighSpeedVideoFpsRangesFor;
            if (t == null) {
                if (this.getHighSpeedVideoFpsRanges) {
                    this.actual.onError(new java.util.NoSuchElementException());
                    return;
                } else {
                    this.actual.onComplete();
                    return;
                }
            }
            complete(t);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getOutputFormats.cancel();
        }
    }
}
