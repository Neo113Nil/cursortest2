package rx.observers;

/* loaded from: classes18.dex */
public final class SafeCompletableSubscriber implements rx.CompletableSubscriber, rx.Subscription {
    boolean Camera2StreamConfigurationMap;
    rx.Subscription getHighSpeedVideoFpsRanges;
    final rx.CompletableSubscriber getHighSpeedVideoFpsRangesFor;

    public SafeCompletableSubscriber(rx.CompletableSubscriber completableSubscriber) {
        this.getHighSpeedVideoFpsRangesFor = completableSubscriber;
    }

    @Override // rx.CompletableSubscriber
    public final void onCompleted() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        try {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            throw new rx.exceptions.OnCompletedFailedException(th);
        }
    }

    @Override // rx.CompletableSubscriber
    public final void onError(java.lang.Throwable th) {
        if (this.Camera2StreamConfigurationMap) {
            rx.plugins.RxJavaHooks.onError(th);
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        try {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        } catch (java.lang.Throwable th2) {
            rx.exceptions.Exceptions.throwIfFatal(th2);
            throw new rx.exceptions.OnErrorFailedException(new rx.exceptions.CompositeException(th, th2));
        }
    }

    @Override // rx.CompletableSubscriber
    public final void onSubscribe(rx.Subscription subscription) {
        this.getHighSpeedVideoFpsRanges = subscription;
        try {
            this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            subscription.unsubscribe();
            onError(th);
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighSpeedVideoFpsRanges.unsubscribe();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRanges.isUnsubscribed();
    }
}
