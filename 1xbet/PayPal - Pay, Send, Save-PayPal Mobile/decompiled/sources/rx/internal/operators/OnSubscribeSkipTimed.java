package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeSkipTimed<T> implements rx.Observable.OnSubscribe<T> {
    final rx.Observable<T> Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final rx.Scheduler getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public OnSubscribeSkipTimed(rx.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoFpsRangesFor.createWorker();
        rx.internal.operators.OnSubscribeSkipTimed.SkipTimedSubscriber skipTimedSubscriber = new rx.internal.operators.OnSubscribeSkipTimed.SkipTimedSubscriber(subscriber);
        skipTimedSubscriber.add(createWorker);
        subscriber.add(skipTimedSubscriber);
        createWorker.schedule(skipTimedSubscriber, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        this.Camera2StreamConfigurationMap.unsafeSubscribe(skipTimedSubscriber);
    }

    static final class SkipTimedSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        volatile boolean Camera2StreamConfigurationMap;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRanges;

        SkipTimedSubscriber(rx.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRanges = subscriber;
        }

        @Override // rx.functions.Action0
        public final void call() {
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            try {
                this.getHighSpeedVideoFpsRanges.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // rx.Observer
        public final void onCompleted() {
            try {
                this.getHighSpeedVideoFpsRanges.onCompleted();
            } finally {
                unsubscribe();
            }
        }
    }
}
