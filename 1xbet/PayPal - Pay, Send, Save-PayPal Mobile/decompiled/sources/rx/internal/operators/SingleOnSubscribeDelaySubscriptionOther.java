package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleOnSubscribeDelaySubscriptionOther<T> implements rx.Single.OnSubscribe<T> {
    final rx.Observable<?> getHighSpeedVideoFpsRanges;
    final rx.Single<? extends T> getHighSpeedVideoSizes;

    public SingleOnSubscribeDelaySubscriptionOther(rx.Single<? extends T> single, rx.Observable<?> observable) {
        this.getHighSpeedVideoSizes = single;
        this.getHighSpeedVideoFpsRanges = observable;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.SingleSubscriber<? super T> singleSubscriber) {
        final rx.SingleSubscriber<T> singleSubscriber2 = new rx.SingleSubscriber<T>() { // from class: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.1
            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                singleSubscriber.onSuccess(t);
            }

            @Override // rx.SingleSubscriber
            public void onError(java.lang.Throwable th) {
                singleSubscriber.onError(th);
            }
        };
        final rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        singleSubscriber.add(serialSubscription);
        rx.Subscriber<? super java.lang.Object> subscriber = new rx.Subscriber<java.lang.Object>() { // from class: rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.2
            boolean getHighSpeedVideoFpsRanges;

            @Override // rx.Observer
            public void onNext(java.lang.Object obj) {
                onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (this.getHighSpeedVideoFpsRanges) {
                    rx.plugins.RxJavaHooks.onError(th);
                } else {
                    this.getHighSpeedVideoFpsRanges = true;
                    singleSubscriber2.onError(th);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                serialSubscription.set(singleSubscriber2);
                rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther.this.getHighSpeedVideoSizes.subscribe(singleSubscriber2);
            }
        };
        serialSubscription.set(subscriber);
        this.getHighSpeedVideoFpsRanges.subscribe(subscriber);
    }
}
