package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSerialize<T> implements rx.Observable.Operator<T, T> {

    static final class Holder {
        static final rx.internal.operators.OperatorSerialize<java.lang.Object> getHighSpeedVideoSizes = new rx.internal.operators.OperatorSerialize<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorSerialize<T> instance() {
        return (rx.internal.operators.OperatorSerialize<T>) rx.internal.operators.OperatorSerialize.Holder.getHighSpeedVideoSizes;
    }

    OperatorSerialize() {
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.observers.SerializedSubscriber(new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSerialize.1
            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                subscriber.onNext(t);
            }
        });
    }
}
