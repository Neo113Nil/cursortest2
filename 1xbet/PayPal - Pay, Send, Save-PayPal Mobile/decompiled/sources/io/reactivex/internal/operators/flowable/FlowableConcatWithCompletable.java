package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatWithCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;

    public FlowableConcatWithCompletable(io.reactivex.Flowable<T> flowable, io.reactivex.CompletableSource completableSource) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = completableSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable.ConcatWithSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ConcatWithSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -7346385463600070225L;
        io.reactivex.CompletableSource Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.CompletableSource completableSource) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.Camera2StreamConfigurationMap = completableSource;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.CompletableSource completableSource = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = null;
            completableSource.subscribe(this);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoSizes.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }
    }
}
