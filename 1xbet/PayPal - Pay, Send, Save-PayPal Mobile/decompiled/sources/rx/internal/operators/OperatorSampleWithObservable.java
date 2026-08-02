package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSampleWithObservable<T, U> implements rx.Observable.Operator<T, T> {
    static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    final rx.Observable<U> getHighSpeedVideoSizes;

    public OperatorSampleWithObservable(rx.Observable<U> observable) {
        this.getHighSpeedVideoSizes = observable;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(getHighSpeedVideoFpsRanges);
        final java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
        final rx.Subscriber<U> subscriber2 = new rx.Subscriber<U>() { // from class: rx.internal.operators.OperatorSampleWithObservable.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.Observer
            public void onNext(U u) {
                java.lang.Object andSet = atomicReference.getAndSet(rx.internal.operators.OperatorSampleWithObservable.getHighSpeedVideoFpsRanges);
                if (andSet != rx.internal.operators.OperatorSampleWithObservable.getHighSpeedVideoFpsRanges) {
                    serializedSubscriber.onNext(andSet);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
                ((rx.Subscription) atomicReference2.get()).unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                onNext(null);
                serializedSubscriber.onCompleted();
                ((rx.Subscription) atomicReference2.get()).unsubscribe();
            }
        };
        rx.Subscriber<T> subscriber3 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorSampleWithObservable.2
            @Override // rx.Observer
            public void onNext(T t) {
                atomicReference.set(t);
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
                subscriber2.unsubscribe();
            }

            @Override // rx.Observer
            public void onCompleted() {
                subscriber2.onNext(null);
                serializedSubscriber.onCompleted();
                subscriber2.unsubscribe();
            }
        };
        atomicReference2.lazySet(subscriber3);
        subscriber.add(subscriber3);
        subscriber.add(subscriber2);
        this.getHighSpeedVideoSizes.unsafeSubscribe(subscriber2);
        return subscriber3;
    }
}
