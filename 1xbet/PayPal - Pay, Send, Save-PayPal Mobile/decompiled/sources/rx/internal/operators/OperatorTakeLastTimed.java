package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTakeLastTimed<T> implements rx.Observable.Operator<T, T> {
    final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public OperatorTakeLastTimed(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = timeUnit.toMillis(j);
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = -1;
    }

    public OperatorTakeLastTimed(int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("count could not be negative");
        }
        this.getHighSpeedVideoSizes = timeUnit.toMillis(j);
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        final rx.internal.operators.OperatorTakeLastTimed.TakeLastTimedSubscriber takeLastTimedSubscriber = new rx.internal.operators.OperatorTakeLastTimed.TakeLastTimedSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.add(takeLastTimedSubscriber);
        subscriber.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorTakeLastTimed.1
            @Override // rx.Producer
            public void request(long j) {
                rx.internal.operators.OperatorTakeLastTimed.TakeLastTimedSubscriber takeLastTimedSubscriber2 = takeLastTimedSubscriber;
                rx.internal.operators.BackpressureUtils.postCompleteRequest(takeLastTimedSubscriber2.getHighSpeedVideoSizesFor, j, takeLastTimedSubscriber2.getHighSpeedVideoSizes, takeLastTimedSubscriber2.getHighResolutionOutputSizeshNQ4ISI, takeLastTimedSubscriber2);
            }
        });
        return takeLastTimedSubscriber;
    }

    static final class TakeLastTimedSubscriber<T> extends rx.Subscriber<T> implements rx.functions.Func1<java.lang.Object, T> {
        final rx.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final rx.Scheduler getOutputFormats;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();
        final java.util.ArrayDeque<java.lang.Object> getHighSpeedVideoSizes = new java.util.ArrayDeque<>();
        final java.util.ArrayDeque<java.lang.Long> Camera2StreamConfigurationMap = new java.util.ArrayDeque<>();

        public TakeLastTimedSubscriber(rx.Subscriber<? super T> subscriber, int i, long j, rx.Scheduler scheduler) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getOutputFormats = scheduler;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges != 0) {
                long now = this.getOutputFormats.now();
                if (this.getHighSpeedVideoSizes.size() == this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoSizes.poll();
                    this.Camera2StreamConfigurationMap.poll();
                }
                getHighSpeedVideoFpsRangesFor(now);
                this.getHighSpeedVideoSizes.offer(rx.internal.operators.NotificationLite.next(t));
                this.Camera2StreamConfigurationMap.offer(java.lang.Long.valueOf(now));
            }
        }

        private void getHighSpeedVideoFpsRangesFor(long j) {
            long j2 = this.getHighSpeedVideoFpsRangesFor;
            while (true) {
                java.lang.Long peek = this.Camera2StreamConfigurationMap.peek();
                if (peek == null || peek.longValue() >= j - j2) {
                    return;
                }
                this.getHighSpeedVideoSizes.poll();
                this.Camera2StreamConfigurationMap.poll();
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.clear();
            this.Camera2StreamConfigurationMap.clear();
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // rx.Observer
        public final void onCompleted() {
            getHighSpeedVideoFpsRangesFor(this.getOutputFormats.now());
            this.Camera2StreamConfigurationMap.clear();
            rx.internal.operators.BackpressureUtils.postCompleteDone(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this);
        }

        @Override // rx.functions.Func1
        public final T call(java.lang.Object obj) {
            return (T) rx.internal.operators.NotificationLite.getValue(obj);
        }
    }
}
