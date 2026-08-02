package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTakeTimed<T> implements rx.Observable.Operator<T, T> {
    final rx.Scheduler Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public OperatorTakeTimed(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRangesFor = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = this.Camera2StreamConfigurationMap.createWorker();
        subscriber.add(createWorker);
        rx.internal.operators.OperatorTakeTimed.TakeSubscriber takeSubscriber = new rx.internal.operators.OperatorTakeTimed.TakeSubscriber(new rx.observers.SerializedSubscriber(subscriber));
        createWorker.schedule(takeSubscriber, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        return takeSubscriber;
    }

    static final class TakeSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        public TakeSubscriber(rx.Subscriber<? super T> subscriber) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = subscriber;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.onNext(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            this.getHighSpeedVideoFpsRangesFor.onCompleted();
            unsubscribe();
        }

        @Override // rx.functions.Action0
        public final void call() {
            onCompleted();
        }
    }
}
