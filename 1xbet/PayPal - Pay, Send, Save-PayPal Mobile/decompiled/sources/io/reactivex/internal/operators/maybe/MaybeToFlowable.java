package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeToFlowable<T> extends io.reactivex.Flowable<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeToFlowable(io.reactivex.MaybeSource<T> maybeSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public final io.reactivex.MaybeSource<T> source() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.maybe.MaybeToFlowable.MaybeToFlowableSubscriber(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class MaybeToFlowableSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;

        MaybeToFlowableSubscriber(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.actual.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.actual.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.actual.onComplete();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }
    }
}
