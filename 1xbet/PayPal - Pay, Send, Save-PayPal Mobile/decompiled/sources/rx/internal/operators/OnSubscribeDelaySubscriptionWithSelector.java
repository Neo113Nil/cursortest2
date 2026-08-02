package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeDelaySubscriptionWithSelector<T, U> implements rx.Observable.OnSubscribe<T> {
    final rx.functions.Func0<? extends rx.Observable<U>> Camera2StreamConfigurationMap;
    final rx.Observable<? extends T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeDelaySubscriptionWithSelector(rx.Observable<? extends T> observable, rx.functions.Func0<? extends rx.Observable<U>> func0) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.Camera2StreamConfigurationMap = func0;
    }

    @Override // rx.functions.Action1
    public final void call(final rx.Subscriber<? super T> subscriber) {
        try {
            this.Camera2StreamConfigurationMap.call().take(1).unsafeSubscribe(new rx.Subscriber<U>() { // from class: rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector.1
                @Override // rx.Observer
                public void onNext(U u) {
                }

                @Override // rx.Observer
                public void onCompleted() {
                    rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector.this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(rx.observers.Subscribers.wrap(subscriber));
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    subscriber.onError(th);
                }
            });
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
        }
    }
}
