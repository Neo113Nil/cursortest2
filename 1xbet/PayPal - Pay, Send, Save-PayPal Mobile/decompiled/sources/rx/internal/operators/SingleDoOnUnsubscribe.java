package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleDoOnUnsubscribe<T> implements rx.Single.OnSubscribe<T> {
    final rx.functions.Action0 Camera2StreamConfigurationMap;
    final rx.Single.OnSubscribe<T> getHighResolutionOutputSizeshNQ4ISI;

    public SingleDoOnUnsubscribe(rx.Single.OnSubscribe<T> onSubscribe, rx.functions.Action0 action0) {
        this.getHighResolutionOutputSizeshNQ4ISI = onSubscribe;
        this.Camera2StreamConfigurationMap = action0;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        singleSubscriber.add(rx.subscriptions.Subscriptions.create(this.Camera2StreamConfigurationMap));
        this.getHighResolutionOutputSizeshNQ4ISI.call(singleSubscriber);
    }
}
