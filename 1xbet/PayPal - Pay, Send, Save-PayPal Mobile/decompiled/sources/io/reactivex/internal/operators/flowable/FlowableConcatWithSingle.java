package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatWithSingle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public FlowableConcatWithSingle(io.reactivex.Flowable<T> flowable, io.reactivex.SingleSource<? extends T> singleSource) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = singleSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatWithSingle.ConcatWithSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class ConcatWithSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        io.reactivex.SingleSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.SingleSource<? extends T> singleSource) {
            super(subscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.produced++;
            this.actual.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.actual.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.s = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.SingleSource<? extends T> singleSource = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            singleSource.subscribe(this);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
        }
    }
}
