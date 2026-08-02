package rx.internal.operators;

/* loaded from: classes18.dex */
public final class CompletableFromEmitter implements rx.Completable.OnSubscribe {
    final rx.functions.Action1<rx.CompletableEmitter> Camera2StreamConfigurationMap;

    public CompletableFromEmitter(rx.functions.Action1<rx.CompletableEmitter> action1) {
        this.Camera2StreamConfigurationMap = action1;
    }

    @Override // rx.functions.Action1
    public final void call(rx.CompletableSubscriber completableSubscriber) {
        rx.internal.operators.CompletableFromEmitter.FromEmitter fromEmitter = new rx.internal.operators.CompletableFromEmitter.FromEmitter(completableSubscriber);
        completableSubscriber.onSubscribe(fromEmitter);
        try {
            this.Camera2StreamConfigurationMap.call(fromEmitter);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            fromEmitter.onError(th);
        }
    }

    static final class FromEmitter extends java.util.concurrent.atomic.AtomicBoolean implements rx.CompletableEmitter, rx.Subscription {
        private static final long serialVersionUID = 5539301318568668881L;
        final rx.internal.subscriptions.SequentialSubscription getHighSpeedVideoFpsRangesFor = new rx.internal.subscriptions.SequentialSubscription();
        final rx.CompletableSubscriber getHighSpeedVideoSizes;

        public FromEmitter(rx.CompletableSubscriber completableSubscriber) {
            this.getHighSpeedVideoSizes = completableSubscriber;
        }

        @Override // rx.CompletableEmitter
        public final void onCompleted() {
            if (compareAndSet(false, true)) {
                try {
                    this.getHighSpeedVideoSizes.onCompleted();
                } finally {
                    this.getHighSpeedVideoFpsRangesFor.unsubscribe();
                }
            }
        }

        @Override // rx.CompletableEmitter
        public final void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                try {
                    this.getHighSpeedVideoSizes.onError(th);
                    return;
                } finally {
                    this.getHighSpeedVideoFpsRangesFor.unsubscribe();
                }
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.CompletableEmitter
        public final void setSubscription(rx.Subscription subscription) {
            this.getHighSpeedVideoFpsRangesFor.update(subscription);
        }

        @Override // rx.CompletableEmitter
        public final void setCancellation(rx.functions.Cancellable cancellable) {
            setSubscription(new rx.internal.subscriptions.CancellableSubscription(cancellable));
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRangesFor.unsubscribe();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return get();
        }
    }
}
