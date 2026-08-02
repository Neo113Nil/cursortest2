package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTake<T> implements rx.Observable.Operator<T, T> {
    final int Camera2StreamConfigurationMap;

    public OperatorTake(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("limit >= 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        this.Camera2StreamConfigurationMap = i;
    }

    /* renamed from: rx.internal.operators.OperatorTake$1, reason: invalid class name */
    class AnonymousClass1 extends rx.Subscriber<T> {
        int getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final /* synthetic */ rx.Subscriber getHighSpeedVideoSizes;

        AnonymousClass1(rx.Subscriber subscriber) {
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes.onCompleted();
        }

        @Override // rx.Observer
        public void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = true;
                try {
                    this.getHighSpeedVideoSizes.onError(th);
                    return;
                } finally {
                    unsubscribe();
                }
            }
            rx.plugins.RxJavaHooks.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (isUnsubscribed()) {
                return;
            }
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            if (i < rx.internal.operators.OperatorTake.this.Camera2StreamConfigurationMap) {
                boolean z = this.getHighResolutionOutputSizeshNQ4ISI == rx.internal.operators.OperatorTake.this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes.onNext(t);
                if (!z || this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                try {
                    this.getHighSpeedVideoSizes.onCompleted();
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(final rx.Producer producer) {
            this.getHighSpeedVideoSizes.setProducer(new rx.Producer() { // from class: rx.internal.operators.OperatorTake.1.1
                final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicLong(0);

                @Override // rx.Producer
                public void request(long j) {
                    long j2;
                    long min;
                    if (j <= 0 || rx.internal.operators.OperatorTake.AnonymousClass1.this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    do {
                        j2 = this.getHighSpeedVideoFpsRanges.get();
                        min = java.lang.Math.min(j, rx.internal.operators.OperatorTake.this.Camera2StreamConfigurationMap - j2);
                        if (min == 0) {
                            return;
                        }
                    } while (!this.getHighSpeedVideoFpsRanges.compareAndSet(j2, j2 + min));
                    producer.request(min);
                }
            });
        }
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super T> subscriber) {
        rx.internal.operators.OperatorTake.AnonymousClass1 anonymousClass1 = new rx.internal.operators.OperatorTake.AnonymousClass1(subscriber);
        if (this.Camera2StreamConfigurationMap == 0) {
            subscriber.onCompleted();
            anonymousClass1.unsubscribe();
        }
        subscriber.add(anonymousClass1);
        return anonymousClass1;
    }
}
