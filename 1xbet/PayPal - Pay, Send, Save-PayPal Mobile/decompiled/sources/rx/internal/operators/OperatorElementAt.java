package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorElementAt<T> implements rx.Observable.Operator<T, T> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final T getHighSpeedVideoFpsRangesFor;

    public OperatorElementAt(int i) {
        this(i, null, false);
    }

    public OperatorElementAt(int i, T t) {
        this(i, t, true);
    }

    private OperatorElementAt(int i, T t, boolean z) {
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" is out of bounds");
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorElementAt.1
            private int getHighSpeedVideoFpsRanges;

            @Override // rx.Observer
            public void onNext(T t) {
                int i = this.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = i + 1;
                if (i == rx.internal.operators.OperatorElementAt.this.getHighResolutionOutputSizeshNQ4ISI) {
                    subscriber.onNext(t);
                    subscriber.onCompleted();
                    unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRanges <= rx.internal.operators.OperatorElementAt.this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (rx.internal.operators.OperatorElementAt.this.getHighSpeedVideoFpsRanges) {
                        subscriber.onNext(rx.internal.operators.OperatorElementAt.this.getHighSpeedVideoFpsRangesFor);
                        subscriber.onCompleted();
                        return;
                    }
                    rx.Subscriber subscriber3 = subscriber;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(rx.internal.operators.OperatorElementAt.this.getHighResolutionOutputSizeshNQ4ISI);
                    sb.append(" is out of bounds");
                    subscriber3.onError(new java.lang.IndexOutOfBoundsException(sb.toString()));
                }
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(rx.Producer producer) {
                subscriber.setProducer(new rx.internal.operators.OperatorElementAt.InnerProducer(producer));
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }

    static class InnerProducer extends java.util.concurrent.atomic.AtomicBoolean implements rx.Producer {
        private static final long serialVersionUID = 1;
        final rx.Producer getHighSpeedVideoFpsRangesFor;

        public InnerProducer(rx.Producer producer) {
            this.getHighSpeedVideoFpsRangesFor = producer;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required");
            }
            if (j <= 0 || !compareAndSet(false, true)) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.request(Long.MAX_VALUE);
        }
    }
}
