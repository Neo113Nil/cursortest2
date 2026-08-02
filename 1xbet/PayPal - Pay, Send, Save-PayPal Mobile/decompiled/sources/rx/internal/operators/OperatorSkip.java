package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSkip<T> implements rx.Observable.Operator<T, T> {
    final int getHighSpeedVideoFpsRangesFor;

    public OperatorSkip(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkip.1
            int getHighResolutionOutputSizeshNQ4ISI;

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.getHighResolutionOutputSizeshNQ4ISI >= rx.internal.operators.OperatorSkip.this.getHighSpeedVideoFpsRangesFor) {
                    subscriber.onNext(t);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI++;
                }
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(rx.Producer producer) {
                subscriber.setProducer(producer);
                producer.request(rx.internal.operators.OperatorSkip.this.getHighSpeedVideoFpsRangesFor);
            }
        };
    }
}
