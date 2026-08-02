package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleFromEmitter<T> implements rx.Single.OnSubscribe<T> {
    final rx.functions.Action1<rx.SingleEmitter<T>> getHighSpeedVideoFpsRanges;

    public SingleFromEmitter(rx.functions.Action1<rx.SingleEmitter<T>> action1) {
        this.getHighSpeedVideoFpsRanges = action1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        rx.internal.operators.SingleFromEmitter.SingleEmitterImpl singleEmitterImpl = new rx.internal.operators.SingleFromEmitter.SingleEmitterImpl(singleSubscriber);
        singleSubscriber.add(singleEmitterImpl);
        try {
            this.getHighSpeedVideoFpsRanges.call(singleEmitterImpl);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            singleEmitterImpl.onError(th);
        }
    }

    static final class SingleEmitterImpl<T> extends java.util.concurrent.atomic.AtomicBoolean implements rx.SingleEmitter<T>, rx.Subscription {
        private static final long serialVersionUID = 8082834163465882809L;
        final rx.internal.subscriptions.SequentialSubscription Camera2StreamConfigurationMap = new rx.internal.subscriptions.SequentialSubscription();
        final rx.SingleSubscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;

        SingleEmitterImpl(rx.SingleSubscriber<? super T> singleSubscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleSubscriber;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.unsubscribe();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get();
        }

        @Override // rx.SingleEmitter
        public final void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
                } finally {
                    this.Camera2StreamConfigurationMap.unsubscribe();
                }
            }
        }

        @Override // rx.SingleEmitter
        public final void onError(java.lang.Throwable th) {
            if (th == null) {
                th = new java.lang.NullPointerException();
            }
            if (compareAndSet(false, true)) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    return;
                } finally {
                    this.Camera2StreamConfigurationMap.unsubscribe();
                }
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.SingleEmitter
        public final void setSubscription(rx.Subscription subscription) {
            this.Camera2StreamConfigurationMap.update(subscription);
        }

        @Override // rx.SingleEmitter
        public final void setCancellation(rx.functions.Cancellable cancellable) {
            setSubscription(new rx.internal.subscriptions.CancellableSubscription(cancellable));
        }
    }
}
