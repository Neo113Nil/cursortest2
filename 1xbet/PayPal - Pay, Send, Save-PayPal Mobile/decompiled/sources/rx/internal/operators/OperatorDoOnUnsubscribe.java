package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorDoOnUnsubscribe<T> implements rx.Observable.Operator<T, T> {
    private final rx.functions.Action0 Camera2StreamConfigurationMap;

    public OperatorDoOnUnsubscribe(rx.functions.Action0 action0) {
        this.Camera2StreamConfigurationMap = action0;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        subscriber.add(rx.subscriptions.Subscriptions.create(this.Camera2StreamConfigurationMap));
        return rx.observers.Subscribers.wrap(subscriber);
    }
}
