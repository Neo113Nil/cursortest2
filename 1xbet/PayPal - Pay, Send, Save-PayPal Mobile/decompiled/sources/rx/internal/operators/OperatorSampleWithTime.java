package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSampleWithTime<T> implements rx.Observable.Operator<T, T> {
    final long Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final rx.Scheduler getHighSpeedVideoSizes;

    public OperatorSampleWithTime(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.observers.SerializedSubscriber serializedSubscriber = new rx.observers.SerializedSubscriber(subscriber);
        rx.Scheduler.Worker createWorker = this.getHighSpeedVideoSizes.createWorker();
        subscriber.add(createWorker);
        rx.internal.operators.OperatorSampleWithTime.SamplerSubscriber samplerSubscriber = new rx.internal.operators.OperatorSampleWithTime.SamplerSubscriber(serializedSubscriber);
        subscriber.add(samplerSubscriber);
        long j = this.Camera2StreamConfigurationMap;
        createWorker.schedulePeriodically(samplerSubscriber, j, j, this.getHighSpeedVideoFpsRanges);
        return samplerSubscriber;
    }

    static final class SamplerSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Action0 {
        private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        private final rx.Subscriber<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRanges);

        public SamplerSubscriber(rx.Subscriber<? super T> subscriber) {
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRangesFor.set(t);
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            getHighSpeedVideoSizes();
            this.Camera2StreamConfigurationMap.onCompleted();
            unsubscribe();
        }

        @Override // rx.functions.Action0
        public final void call() {
            getHighSpeedVideoSizes();
        }

        private void getHighSpeedVideoSizes() {
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> atomicReference = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj = getHighSpeedVideoFpsRanges;
            java.lang.Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.Camera2StreamConfigurationMap.onNext(andSet);
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this);
                }
            }
        }
    }
}
