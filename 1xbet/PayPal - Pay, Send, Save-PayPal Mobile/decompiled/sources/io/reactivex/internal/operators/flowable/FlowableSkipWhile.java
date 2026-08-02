package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableSkipWhile<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;

    public FlowableSkipWhile(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = predicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableSkipWhile.SkipWhileSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class SkipWhileSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        boolean Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;

        SkipWhileSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoFpsRangesFor = predicate;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
                return;
            }
            try {
                if (this.getHighSpeedVideoFpsRangesFor.test(t)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.request(1L);
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRanges.onNext(t);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighResolutionOutputSizeshNQ4ISI.cancel();
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
