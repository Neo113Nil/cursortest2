package rx.internal.operators;

/* loaded from: classes18.dex */
public class OperatorSkipLastTimed<T> implements rx.Observable.Operator<T, T> {
    final rx.Scheduler Camera2StreamConfigurationMap;
    final long getHighSpeedVideoSizes;

    public OperatorSkipLastTimed(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = timeUnit.toMillis(j);
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // rx.functions.Func1
    public rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipLastTimed.1
            private java.util.Deque<rx.schedulers.Timestamped<T>> Camera2StreamConfigurationMap = new java.util.ArrayDeque();

            private void getHighSpeedVideoFpsRangesFor(long j) {
                long j2 = rx.internal.operators.OperatorSkipLastTimed.this.getHighSpeedVideoSizes;
                while (!this.Camera2StreamConfigurationMap.isEmpty()) {
                    rx.schedulers.Timestamped<T> first = this.Camera2StreamConfigurationMap.getFirst();
                    if (first.getTimestampMillis() >= j - j2) {
                        return;
                    }
                    this.Camera2StreamConfigurationMap.removeFirst();
                    subscriber.onNext(first.getValue());
                }
            }

            @Override // rx.Observer
            public void onNext(T t) {
                long now = rx.internal.operators.OperatorSkipLastTimed.this.Camera2StreamConfigurationMap.now();
                getHighSpeedVideoFpsRangesFor(now);
                this.Camera2StreamConfigurationMap.offerLast(new rx.schedulers.Timestamped<>(now, t));
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                getHighSpeedVideoFpsRangesFor(rx.internal.operators.OperatorSkipLastTimed.this.Camera2StreamConfigurationMap.now());
                subscriber.onCompleted();
            }
        };
    }
}
