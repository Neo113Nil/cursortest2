package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeRange implements rx.Observable.OnSubscribe<java.lang.Integer> {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public OnSubscribeRange(int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super java.lang.Integer> subscriber) {
        subscriber.setProducer(new rx.internal.operators.OnSubscribeRange.RangeProducer(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
    }

    static final class RangeProducer extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
        private static final long serialVersionUID = 4114392207069098388L;
        private long getHighResolutionOutputSizeshNQ4ISI;
        private final rx.Subscriber<? super java.lang.Integer> getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        RangeProducer(rx.Subscriber<? super java.lang.Integer> subscriber, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = i2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
        
            r12.getHighResolutionOutputSizeshNQ4ISI = r2;
            r13 = addAndGet(-r9);
         */
        @Override // rx.Producer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void request(long j) {
            if (get() != Long.MAX_VALUE) {
                if (j == Long.MAX_VALUE && compareAndSet(0L, Long.MAX_VALUE)) {
                    long j2 = this.getHighSpeedVideoSizes;
                    rx.Subscriber<? super java.lang.Integer> subscriber = this.getHighSpeedVideoFpsRanges;
                    for (long j3 = this.getHighResolutionOutputSizeshNQ4ISI; j3 != j2 + 1; j3++) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onNext(java.lang.Integer.valueOf((int) j3));
                    }
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onCompleted();
                    return;
                }
                if (j <= 0 || rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j) != 0) {
                    return;
                }
                long j4 = this.getHighSpeedVideoSizes + 1;
                long j5 = this.getHighResolutionOutputSizeshNQ4ISI;
                rx.Subscriber<? super java.lang.Integer> subscriber2 = this.getHighSpeedVideoFpsRanges;
                do {
                    long j6 = 0;
                    while (true) {
                        if (j6 != j && j5 != j4) {
                            if (subscriber2.isUnsubscribed()) {
                                return;
                            }
                            subscriber2.onNext(java.lang.Integer.valueOf((int) j5));
                            j5++;
                            j6++;
                        } else {
                            if (subscriber2.isUnsubscribed()) {
                                return;
                            }
                            if (j5 == j4) {
                                subscriber2.onCompleted();
                                return;
                            } else {
                                j = get();
                                if (j == j6) {
                                    break;
                                }
                            }
                        }
                    }
                } while (j != 0);
            }
        }
    }
}
