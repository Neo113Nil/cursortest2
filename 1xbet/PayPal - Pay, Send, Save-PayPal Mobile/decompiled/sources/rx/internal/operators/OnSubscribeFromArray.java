package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeFromArray<T> implements rx.Observable.OnSubscribe<T> {
    final T[] getHighResolutionOutputSizeshNQ4ISI;

    public OnSubscribeFromArray(T[] tArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = tArr;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        subscriber.setProducer(new rx.internal.operators.OnSubscribeFromArray.FromArrayProducer(subscriber, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    static final class FromArrayProducer<T> extends java.util.concurrent.atomic.AtomicLong implements rx.Producer {
        private static final long serialVersionUID = 3534218984725836979L;
        final rx.Subscriber<? super T> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final T[] getHighSpeedVideoFpsRangesFor;

        public FromArrayProducer(rx.Subscriber<? super T> subscriber, T[] tArr) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRangesFor = tArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        
            r10.getHighResolutionOutputSizeshNQ4ISI = r5;
            r11 = addAndGet(r6);
         */
        @Override // rx.Producer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j == Long.MAX_VALUE) {
                if (rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j) == 0) {
                    rx.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap;
                    for (amex.AMEXKernel aMEXKernel : this.getHighSpeedVideoFpsRangesFor) {
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onNext(aMEXKernel);
                    }
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onCompleted();
                    return;
                }
                return;
            }
            if (j == 0 || rx.internal.operators.BackpressureUtils.getAndAddRequest(this, j) != 0) {
                return;
            }
            rx.Subscriber<? super T> subscriber2 = this.Camera2StreamConfigurationMap;
            T[] tArr = this.getHighSpeedVideoFpsRangesFor;
            int length = tArr.length;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                long j2 = 0;
                while (true) {
                    if (j != 0 && i != length) {
                        if (subscriber2.isUnsubscribed()) {
                            return;
                        }
                        subscriber2.onNext(tArr[i]);
                        i++;
                        if (i == length) {
                            if (subscriber2.isUnsubscribed()) {
                                return;
                            }
                            subscriber2.onCompleted();
                            return;
                        }
                        j--;
                        j2--;
                    } else {
                        j = get() + j2;
                        if (j == 0) {
                            break;
                        }
                    }
                }
            } while (j != 0);
        }
    }
}
