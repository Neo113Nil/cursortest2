package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorUnsubscribeOn<T> implements rx.Observable.Operator<T, T> {
    final rx.Scheduler Camera2StreamConfigurationMap;

    public OperatorUnsubscribeOn(rx.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        final rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorUnsubscribeOn.1
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

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(rx.Producer producer) {
                subscriber.setProducer(producer);
            }
        };
        subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorUnsubscribeOn.2
            @Override // rx.functions.Action0
            public void call() {
                final rx.Scheduler.Worker createWorker = rx.internal.operators.OperatorUnsubscribeOn.this.Camera2StreamConfigurationMap.createWorker();
                createWorker.schedule(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorUnsubscribeOn.2.1
                    @Override // rx.functions.Action0
                    public void call() {
                        subscriber2.unsubscribe();
                        createWorker.unsubscribe();
                    }
                });
            }
        }));
        return subscriber2;
    }
}
