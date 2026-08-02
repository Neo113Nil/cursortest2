package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableLimit<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final long getHighResolutionOutputSizeshNQ4ISI;

    public FlowableLimit(io.reactivex.Flowable<T> flowable, long j) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableLimit.LimitSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class LimitSubscriber<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 2288246011222124525L;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;

        LimitSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, long j) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoSizes = j;
            lazySet(j);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription)) {
                if (this.getHighSpeedVideoSizes == 0) {
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.complete(this.getHighSpeedVideoFpsRanges);
                } else {
                    this.getHighSpeedVideoFpsRangesFor = subscription;
                    this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoSizes;
            if (j > 0) {
                long j2 = j - 1;
                this.getHighSpeedVideoSizes = j2;
                this.getHighSpeedVideoFpsRanges.onNext(t);
                if (j2 == 0) {
                    this.getHighSpeedVideoFpsRangesFor.cancel();
                    this.getHighSpeedVideoFpsRanges.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes > 0) {
                this.getHighSpeedVideoSizes = 0L;
                this.getHighSpeedVideoFpsRanges.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes > 0) {
                this.getHighSpeedVideoSizes = 0L;
                this.getHighSpeedVideoFpsRanges.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            long j2;
            long j3;
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        j3 = j2 <= j ? j2 : j;
                    }
                } while (!compareAndSet(j2, j2 - j3));
                this.getHighSpeedVideoFpsRangesFor.request(j3);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRangesFor.cancel();
        }
    }
}
