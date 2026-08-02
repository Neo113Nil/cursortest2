package io.reactivex.internal.operators.flowable;

/* loaded from: classes17.dex */
public final class FlowableToList<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> Camera2StreamConfigurationMap;

    public FlowableToList(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<U> callable) {
        super(flowable);
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        try {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableToList.ToListSubscriber(subscriber, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    static final class ToListSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<U> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -8134157938864266736L;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Multi-variable type inference failed */
        ToListSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, U u) {
            super(subscriber);
            this.value = u;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            java.util.Collection collection = (java.util.Collection) this.value;
            if (collection != null) {
                collection.add(t);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.value = null;
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            complete(this.value);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }
    }
}
