package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorIgnoreElements<T> implements rx.Observable.Operator<T, T> {

    static final class Holder {
        static final rx.internal.operators.OperatorIgnoreElements<?> Camera2StreamConfigurationMap = new rx.internal.operators.OperatorIgnoreElements<>();

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorIgnoreElements<T> instance() {
        return (rx.internal.operators.OperatorIgnoreElements<T>) rx.internal.operators.OperatorIgnoreElements.Holder.Camera2StreamConfigurationMap;
    }

    OperatorIgnoreElements() {
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorIgnoreElements.1
            @Override // rx.Observer
            public void onNext(T t) {
            }

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }
}
