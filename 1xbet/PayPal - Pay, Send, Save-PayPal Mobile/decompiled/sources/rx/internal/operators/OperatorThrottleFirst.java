package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorThrottleFirst<T> implements rx.Observable.Operator<T, T> {
    final rx.Scheduler Camera2StreamConfigurationMap;
    final long getHighSpeedVideoSizes;

    public OperatorThrottleFirst(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = timeUnit.toMillis(j);
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorThrottleFirst.1
            private long getHighSpeedVideoSizes = -1;

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void onStart() {
                request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                long now = rx.internal.operators.OperatorThrottleFirst.this.Camera2StreamConfigurationMap.now();
                long j = this.getHighSpeedVideoSizes;
                if (j == -1 || now < j || now - j >= rx.internal.operators.OperatorThrottleFirst.this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoSizes = now;
                    subscriber.onNext(t);
                }
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
