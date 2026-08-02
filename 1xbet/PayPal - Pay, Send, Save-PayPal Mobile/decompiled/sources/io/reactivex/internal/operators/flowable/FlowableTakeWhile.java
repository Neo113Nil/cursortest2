package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableTakeWhile<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableTakeWhile(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableTakeWhile.TakeWhileSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class TakeWhileSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;

        TakeWhileSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.Camera2StreamConfigurationMap = predicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            try {
                if (!this.Camera2StreamConfigurationMap.test(t)) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    this.getHighSpeedVideoFpsRanges.cancel();
                    this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
        }
    }
}
