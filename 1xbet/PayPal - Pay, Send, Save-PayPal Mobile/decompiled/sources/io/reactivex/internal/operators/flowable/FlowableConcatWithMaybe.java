package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableConcatWithMaybe<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableConcatWithMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe.ConcatWithSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class ConcatWithSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        boolean Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.MaybeSource<? extends T> getHighSpeedVideoFpsRanges;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.MaybeSource<? extends T> maybeSource) {
            super(subscriber);
            this.getHighSpeedVideoFpsRanges = maybeSource;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
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

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                this.actual.onComplete();
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.s = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            io.reactivex.MaybeSource<? extends T> maybeSource = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = null;
            maybeSource.subscribe(this);
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
