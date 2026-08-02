package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeDelaySubscriptionOther<T, U> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<U> getHighSpeedVideoFpsRanges;
    final rx.Observable<? extends T> getHighSpeedVideoSizes;

    public OnSubscribeDelaySubscriptionOther(rx.Observable<? extends T> observable, rx.Observable<U> observable2) {
        this.getHighSpeedVideoSizes = observable;
        this.getHighSpeedVideoFpsRanges = observable2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        final rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
        subscriber.add(serialSubscription);
        final rx.Subscriber wrap = rx.observers.Subscribers.wrap(subscriber);
        rx.Subscriber<U> subscriber2 = new rx.Subscriber<U>() { // from class: rx.internal.operators.OnSubscribeDelaySubscriptionOther.1
            boolean getHighSpeedVideoFpsRanges;

            @Override // rx.Observer
            public void onNext(U u) {
                onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (this.getHighSpeedVideoFpsRanges) {
                    rx.plugins.RxJavaHooks.onError(th);
                } else {
                    this.getHighSpeedVideoFpsRanges = true;
                    wrap.onError(th);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                serialSubscription.set(rx.subscriptions.Subscriptions.unsubscribed());
                rx.internal.operators.OnSubscribeDelaySubscriptionOther.this.getHighSpeedVideoSizes.unsafeSubscribe(wrap);
            }
        };
        serialSubscription.set(subscriber2);
        this.getHighSpeedVideoFpsRanges.unsafeSubscribe(subscriber2);
    }
}
