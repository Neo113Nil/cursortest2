package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTimestamp<T> implements rx.Observable.Operator<rx.schedulers.Timestamped<T>, T> {
    final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;

    public OperatorTimestamp(rx.Scheduler scheduler) {
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super rx.schedulers.Timestamped<T>> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorTimestamp.1
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
                subscriber.onNext(new rx.schedulers.Timestamped(rx.internal.operators.OperatorTimestamp.this.getHighResolutionOutputSizeshNQ4ISI.now(), t));
            }
        };
    }
}
