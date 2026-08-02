package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorWithLatestFrom<T, U, R> implements rx.Observable.Operator<R, T> {
    static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    final rx.functions.Func2<? super T, ? super U, ? extends R> getHighSpeedVideoFpsRangesFor;
    final rx.Observable<? extends U> getHighSpeedVideoSizes;

    public OperatorWithLatestFrom(rx.Observable<? extends U> observable, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
        this.getHighSpeedVideoSizes = observable;
        this.getHighSpeedVideoFpsRangesFor = func2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super R> subscriber) {
        final rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber, false);
        subscriber.add(serializedSubscriber);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(Camera2StreamConfigurationMap);
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>(serializedSubscriber) { // from class: rx.internal.operators.OperatorWithLatestFrom.1
            @Override // rx.Observer
            public void onNext(T t) {
                java.lang.Object obj = atomicReference.get();
                if (obj != rx.internal.operators.OperatorWithLatestFrom.Camera2StreamConfigurationMap) {
                    try {
                        serializedSubscriber.onNext(rx.internal.operators.OperatorWithLatestFrom.this.getHighSpeedVideoFpsRangesFor.call(t, obj));
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, this);
                    }
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
                serializedSubscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                serializedSubscriber.onCompleted();
                serializedSubscriber.unsubscribe();
            }
        };
        rx.Subscriber<U> subscriber3 = new rx.Subscriber<U>() { // from class: rx.internal.operators.OperatorWithLatestFrom.2
            @Override // rx.Observer
            public void onNext(U u) {
                atomicReference.set(u);
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
                serializedSubscriber.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (atomicReference.get() == rx.internal.operators.OperatorWithLatestFrom.Camera2StreamConfigurationMap) {
                    serializedSubscriber.onCompleted();
                    serializedSubscriber.unsubscribe();
                }
            }
        };
        serializedSubscriber.add(subscriber2);
        serializedSubscriber.add(subscriber3);
        this.getHighSpeedVideoSizes.unsafeSubscribe(subscriber3);
        return subscriber2;
    }
}
