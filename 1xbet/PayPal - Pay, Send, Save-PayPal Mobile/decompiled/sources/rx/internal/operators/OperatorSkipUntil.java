package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSkipUntil<T, U> implements rx.Observable.Operator<T, T> {
    final rx.Observable<U> getHighSpeedVideoFpsRanges;

    public OperatorSkipUntil(rx.Observable<U> observable) {
        this.getHighSpeedVideoFpsRanges = observable;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        rx.Subscriber<U> subscriber2 = new rx.Subscriber<U>() { // from class: rx.internal.operators.OperatorSkipUntil.1
            @Override // rx.Observer
            public void onNext(U u) {
                atomicBoolean.set(true);
                unsubscribe();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
                serializedSubscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                unsubscribe();
            }
        };
        subscriber.add(subscriber2);
        this.getHighSpeedVideoFpsRanges.unsafeSubscribe(subscriber2);
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipUntil.2
            @Override // rx.Observer
            public void onNext(T t) {
                if (atomicBoolean.get()) {
                    serializedSubscriber.onNext(t);
                } else {
                    request(1L);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
                unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                serializedSubscriber.onCompleted();
                unsubscribe();
            }
        };
    }
}
