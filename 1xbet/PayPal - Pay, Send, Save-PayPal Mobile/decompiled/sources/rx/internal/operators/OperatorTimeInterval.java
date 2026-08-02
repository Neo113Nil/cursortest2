package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTimeInterval<T> implements rx.Observable.Operator<rx.schedulers.TimeInterval<T>, T> {
    final rx.Scheduler getHighSpeedVideoFpsRanges;

    public OperatorTimeInterval(rx.Scheduler scheduler) {
        this.getHighSpeedVideoFpsRanges = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super rx.schedulers.TimeInterval<T>> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorTimeInterval.1
            private long getHighSpeedVideoFpsRangesFor;

            {
                this.getHighSpeedVideoFpsRangesFor = rx.internal.operators.OperatorTimeInterval.this.getHighSpeedVideoFpsRanges.now();
            }

            @Override // rx.Observer
            public void onNext(T t) {
                long now = rx.internal.operators.OperatorTimeInterval.this.getHighSpeedVideoFpsRanges.now();
                subscriber.onNext(new rx.schedulers.TimeInterval(now - this.getHighSpeedVideoFpsRangesFor, t));
                this.getHighSpeedVideoFpsRangesFor = now;
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
    }
}
