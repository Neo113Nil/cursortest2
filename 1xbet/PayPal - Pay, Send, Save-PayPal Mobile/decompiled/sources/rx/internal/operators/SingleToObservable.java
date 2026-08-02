package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleToObservable<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> getHighSpeedVideoSizes;

    public SingleToObservable(rx.Single.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoSizes = onSubscribe;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.SingleLiftObservableOperator.WrapSubscriberIntoSingle wrapSubscriberIntoSingle = new rx.internal.operators.SingleLiftObservableOperator.WrapSubscriberIntoSingle(subscriber);
        subscriber.add(wrapSubscriberIntoSingle);
        this.getHighSpeedVideoSizes.call(wrapSubscriberIntoSingle);
    }
}
