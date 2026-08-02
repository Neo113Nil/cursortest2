package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorAll<T> implements rx.Observable.Operator<java.lang.Boolean, T> {
    final rx.functions.Func1<? super T, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    public OperatorAll(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super java.lang.Boolean> subscriber) {
        final rx.internal.producers.SingleDelayedProducer singleDelayedProducer = new rx.internal.producers.SingleDelayedProducer(subscriber);
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>() { // from class: rx.internal.operators.OperatorAll.1
            boolean getHighSpeedVideoFpsRangesFor;

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                try {
                    if (rx.internal.operators.OperatorAll.this.getHighResolutionOutputSizeshNQ4ISI.call(t).booleanValue()) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRangesFor = true;
                    singleDelayedProducer.setValue(java.lang.Boolean.FALSE);
                    unsubscribe();
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, this, t);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (!this.getHighSpeedVideoFpsRangesFor) {
                    this.getHighSpeedVideoFpsRangesFor = true;
                    subscriber.onError(th);
                } else {
                    rx.plugins.RxJavaHooks.onError(th);
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                singleDelayedProducer.setValue(java.lang.Boolean.TRUE);
            }
        };
        subscriber.add(subscriber2);
        subscriber.setProducer(singleDelayedProducer);
        return subscriber2;
    }
}
