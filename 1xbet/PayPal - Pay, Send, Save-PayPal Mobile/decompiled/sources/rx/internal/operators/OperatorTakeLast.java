package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTakeLast<T> implements rx.Observable.Operator<T, T> {
    final int getHighSpeedVideoSizes;

    public OperatorTakeLast(int i) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("count cannot be negative");
        }
        this.getHighSpeedVideoSizes = i;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OperatorTakeLast.TakeLastSubscriber takeLastSubscriber = new rx.internal.operators.OperatorTakeLast.TakeLastSubscriber(subscriber, this.getHighSpeedVideoSizes);
        subscriber.add(takeLastSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorTakeLast.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OperatorTakeLast.TakeLastSubscriber takeLastSubscriber2 = takeLastSubscriber;
                if (j > 0) {
                    rx.internal.operators.BackpressureUtils.postCompleteRequest(takeLastSubscriber2.getHighSpeedVideoFpsRanges, j, takeLastSubscriber2.Camera2StreamConfigurationMap, takeLastSubscriber2.getHighSpeedVideoFpsRangesFor, takeLastSubscriber2);
                }
            }
        });
        return takeLastSubscriber;
    }

    static final class TakeLastSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Func1<java.lang.Object, T> {
        final int getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong();
        final java.util.ArrayDeque<java.lang.Object> Camera2StreamConfigurationMap = new java.util.ArrayDeque<>();

        public TakeLastSubscriber(rx.Subscriber<? super T> subscriber, int i) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap.size() == this.getHighResolutionOutputSizeshNQ4ISI) {
                this.Camera2StreamConfigurationMap.poll();
            }
            this.Camera2StreamConfigurationMap.offer(rx.internal.operators.NotificationLite.next(t));
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.clear();
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            rx.internal.operators.BackpressureUtils.postCompleteDone(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this);
        }

        @Override // rx.functions.Func1
        public final T call(java.lang.Object obj) {
            return (T) rx.internal.operators.NotificationLite.getValue(obj);
        }
    }
}
