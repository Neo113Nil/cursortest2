package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.SingleSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public SingleToFlowable(io.reactivex.SingleSource<? extends T> singleSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = singleSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.single.SingleToFlowable.SingleToFlowableObserver(subscriber));
    }

    /* loaded from: classes17.dex */
    static final class SingleToFlowableObserver<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        SingleToFlowableObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.actual.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            complete(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.actual.onError(th);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighSpeedVideoSizes.dispose();
        }
    }
}
