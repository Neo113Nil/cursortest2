package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTakeUntil<T, E> implements rx.Observable.Operator<T, T> {
    private final rx.Observable<? extends E> getHighSpeedVideoFpsRangesFor;

    public OperatorTakeUntil(rx.Observable<? extends E> observable) {
        this.getHighSpeedVideoFpsRangesFor = observable;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber, false);
        final rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>(serializedSubscriber) { // from class: rx.internal.operators.OperatorTakeUntil.1
            @Override // rx.Observer
            public void onNext(T t) {
                serializedSubscriber.onNext(t);
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                try {
                    serializedSubscriber.onError(th);
                } finally {
                    serializedSubscriber.unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                try {
                    serializedSubscriber.onCompleted();
                } finally {
                    serializedSubscriber.unsubscribe();
                }
            }
        };
        rx.Subscriber<E> subscriber3 = new rx.Subscriber<E>() { // from class: rx.internal.operators.OperatorTakeUntil.2
            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onCompleted() {
                subscriber2.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber2.onError(th);
            }

            @Override // rx.Observer
            public void onNext(E e) {
                onCompleted();
            }
        };
        serializedSubscriber.add(subscriber2);
        serializedSubscriber.add(subscriber3);
        subscriber.add(serializedSubscriber);
        this.getHighSpeedVideoFpsRangesFor.unsafeSubscribe(subscriber3);
        return subscriber2;
    }
}
