package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDematerialize<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<io.reactivex.Notification<T>, T> {
    public FlowableDematerialize(io.reactivex.Flowable<io.reactivex.Notification<T>> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDematerialize.DematerializeSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class DematerializeSubscriber<T> implements io.reactivex.FlowableSubscriber<io.reactivex.Notification<T>>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        @Override // org.reactivestreams.Subscriber
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            io.reactivex.Notification notification = (io.reactivex.Notification) obj;
            if (this.getHighSpeedVideoSizes) {
                if (notification.isOnError()) {
                    io.reactivex.plugins.RxJavaPlugins.onError(notification.getError());
                }
            } else if (notification.isOnError()) {
                this.getHighSpeedVideoFpsRanges.cancel();
                onError(notification.getError());
            } else if (notification.isOnComplete()) {
                this.getHighSpeedVideoFpsRanges.cancel();
                onComplete();
            } else {
                this.getHighSpeedVideoFpsRangesFor.onNext((java.lang.Object) notification.getValue());
            }
        }

        DematerializeSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
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
