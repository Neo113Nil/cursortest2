package rx.observers;

/* loaded from: classes18.dex */
public abstract class AsyncCompletableSubscriber implements rx.CompletableSubscriber, rx.Subscription {
    static final rx.observers.AsyncCompletableSubscriber.Unsubscribed getHighResolutionOutputSizeshNQ4ISI = new rx.observers.AsyncCompletableSubscriber.Unsubscribed();
    private final java.util.concurrent.atomic.AtomicReference<rx.Subscription> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();

    protected void onStart() {
    }

    @Override // rx.CompletableSubscriber
    public final void onSubscribe(rx.Subscription subscription) {
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, subscription)) {
            subscription.unsubscribe();
            if (this.getHighSpeedVideoSizes.get() != getHighResolutionOutputSizeshNQ4ISI) {
                rx.plugins.RxJavaHooks.onError(new java.lang.IllegalStateException("Subscription already set!"));
                return;
            }
            return;
        }
        onStart();
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighSpeedVideoSizes.get() == getHighResolutionOutputSizeshNQ4ISI;
    }

    protected final void clear() {
        this.getHighSpeedVideoSizes.set(getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        rx.Subscription andSet;
        rx.Subscription subscription = this.getHighSpeedVideoSizes.get();
        rx.observers.AsyncCompletableSubscriber.Unsubscribed unsubscribed = getHighResolutionOutputSizeshNQ4ISI;
        if (subscription == unsubscribed || (andSet = this.getHighSpeedVideoSizes.getAndSet(unsubscribed)) == null || andSet == unsubscribed) {
            return;
        }
        andSet.unsubscribe();
    }

    static final class Unsubscribed implements rx.Subscription {
        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return true;
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
        }

        Unsubscribed() {
        }
    }
}
