package io.reactivex.disposables;

/* loaded from: classes17.dex */
final class SubscriptionDisposable extends io.reactivex.disposables.ReferenceDisposable<org.reactivestreams.Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected final /* synthetic */ void getHighSpeedVideoSizes(org.reactivestreams.Subscription subscription) {
        subscription.cancel();
    }

    SubscriptionDisposable(org.reactivestreams.Subscription subscription) {
        super(subscription);
    }
}
