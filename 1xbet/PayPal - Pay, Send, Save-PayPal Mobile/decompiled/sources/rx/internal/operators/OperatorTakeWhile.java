package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorTakeWhile<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Func2<? super T, ? super java.lang.Integer, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public OperatorTakeWhile(final rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        this(new rx.functions.Func2<T, java.lang.Integer, java.lang.Boolean>() { // from class: rx.internal.operators.OperatorTakeWhile.1
            @Override // rx.functions.Func2
            public /* bridge */ /* synthetic */ java.lang.Boolean call(java.lang.Object obj, java.lang.Integer num) {
                return (java.lang.Boolean) rx.functions.Func1.this.call(obj);
            }
        });
    }

    public OperatorTakeWhile(rx.functions.Func2<? super T, ? super java.lang.Integer, java.lang.Boolean> func2) {
        this.getHighSpeedVideoFpsRangesFor = func2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        rx.Subscriber<T> subscriber2 = new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorTakeWhile.2
            private int getHighResolutionOutputSizeshNQ4ISI;
            private boolean getHighSpeedVideoSizes;

            @Override // rx.Observer
            public void onNext(T t) {
                try {
                    rx.functions.Func2<? super T, ? super java.lang.Integer, java.lang.Boolean> func2 = rx.internal.operators.OperatorTakeWhile.this.getHighSpeedVideoFpsRangesFor;
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                    if (func2.call(t, java.lang.Integer.valueOf(i)).booleanValue()) {
                        subscriber.onNext(t);
                        return;
                    }
                    this.getHighSpeedVideoSizes = true;
                    subscriber.onCompleted();
                    unsubscribe();
                } catch (java.lang.Throwable th) {
                    this.getHighSpeedVideoSizes = true;
                    rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                    unsubscribe();
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                subscriber.onCompleted();
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                if (this.getHighSpeedVideoSizes) {
                    return;
                }
                subscriber.onError(th);
            }
        };
        subscriber.add(subscriber2);
        return subscriber2;
    }
}
