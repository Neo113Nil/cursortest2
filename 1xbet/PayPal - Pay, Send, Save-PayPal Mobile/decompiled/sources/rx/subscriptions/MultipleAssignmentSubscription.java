package rx.subscriptions;

/* loaded from: classes18.dex */
public final class MultipleAssignmentSubscription implements rx.Subscription {
    final rx.internal.subscriptions.SequentialSubscription getHighResolutionOutputSizeshNQ4ISI = new rx.internal.subscriptions.SequentialSubscription();

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isUnsubscribed();
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.getHighResolutionOutputSizeshNQ4ISI.unsubscribe();
    }

    public final void set(rx.Subscription subscription) {
        if (subscription == null) {
            throw new java.lang.IllegalArgumentException("Subscription can not be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI.replace(subscription);
    }

    public final rx.Subscription get() {
        return this.getHighResolutionOutputSizeshNQ4ISI.current();
    }
}
