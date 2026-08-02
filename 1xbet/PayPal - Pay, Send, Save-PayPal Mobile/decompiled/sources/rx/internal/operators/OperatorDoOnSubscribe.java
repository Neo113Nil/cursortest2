package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorDoOnSubscribe<T> implements rx.Observable.Operator<T, T> {
    private final rx.functions.Action0 getHighResolutionOutputSizeshNQ4ISI;

    public OperatorDoOnSubscribe(rx.functions.Action0 action0) {
        this.getHighResolutionOutputSizeshNQ4ISI = action0;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        this.getHighResolutionOutputSizeshNQ4ISI.call();
        return rx.observers.Subscribers.wrap(subscriber);
    }
}
