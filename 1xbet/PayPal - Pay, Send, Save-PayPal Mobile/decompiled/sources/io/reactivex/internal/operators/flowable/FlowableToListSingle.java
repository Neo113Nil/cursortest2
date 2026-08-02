package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableToListSingle<T, U extends java.util.Collection<? super T>> extends io.reactivex.Single<U> implements io.reactivex.internal.fuseable.FuseToFlowable<U> {
    final io.reactivex.Flowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRanges;

    public FlowableToListSingle(io.reactivex.Flowable<T> flowable) {
        this(flowable, io.reactivex.internal.util.ArrayListSupplier.asCallable());
    }

    public FlowableToListSingle(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<U> callable) {
        this.getHighResolutionOutputSizeshNQ4ISI = flowable;
        this.getHighSpeedVideoFpsRanges = callable;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super U> singleObserver) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableToListSingle.ToListSubscriber(singleObserver, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
        }
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public final io.reactivex.Flowable<U> fuseToFlowable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableToList(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class ToListSubscriber<T, U extends java.util.Collection<? super T>> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        U getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final io.reactivex.SingleObserver<? super U> getHighSpeedVideoSizes;

        ToListSubscriber(io.reactivex.SingleObserver<? super U> singleObserver, U u) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = u;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
            this.getHighSpeedVideoSizes.onSuccess(this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges.cancel();
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges == io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED;
        }
    }
}
