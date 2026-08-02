package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDelayWithSelector<T, V> implements rx.Observable.Operator<T, T> {
    final rx.Observable<? extends T> getHighSpeedVideoFpsRanges;
    final rx.functions.Func1<? super T, ? extends rx.Observable<V>> getHighSpeedVideoFpsRangesFor;

    public OperatorDelayWithSelector(rx.Observable<? extends T> observable, rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1) {
        this.getHighSpeedVideoFpsRanges = observable;
        this.getHighSpeedVideoFpsRangesFor = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        final rx.subjects.PublishSubject create = rx.subjects.PublishSubject.create();
        subscriber.add(rx.Observable.merge(create).unsafeSubscribe(rx.observers.Subscribers.from(serializedSubscriber)));
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDelayWithSelector.1
            @Override // rx.Observer
            public void onCompleted() {
                create.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                serializedSubscriber.onError(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.Observer
            public void onNext(final T t) {
                try {
                    create.onNext(rx.internal.operators.OperatorDelayWithSelector.this.getHighSpeedVideoFpsRangesFor.call(t).take(1).defaultIfEmpty(null).map(new rx.functions.Func1<V, T>() { // from class: rx.internal.operators.OperatorDelayWithSelector.1.1
                        @Override // rx.functions.Func1
                        public T call(V v) {
                            return (T) t;
                        }
                    }));
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }
        };
    }
}
