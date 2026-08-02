package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorAsObservable<T> implements rx.Observable.Operator<T, T> {
    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        return subscriber;
    }

    static final class Holder {
        static final rx.internal.operators.OperatorAsObservable<java.lang.Object> getHighSpeedVideoSizes = new rx.internal.operators.OperatorAsObservable<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorAsObservable<T> instance() {
        return (rx.internal.operators.OperatorAsObservable<T>) rx.internal.operators.OperatorAsObservable.Holder.getHighSpeedVideoSizes;
    }

    OperatorAsObservable() {
    }
}
