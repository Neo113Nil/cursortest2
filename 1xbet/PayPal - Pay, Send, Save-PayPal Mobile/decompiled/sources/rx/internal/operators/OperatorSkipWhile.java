package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorSkipWhile<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Func2<? super T, java.lang.Integer, java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public OperatorSkipWhile(rx.functions.Func2<? super T, java.lang.Integer, java.lang.Boolean> func2) {
        this.getHighSpeedVideoFpsRangesFor = func2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorSkipWhile.1
            int Camera2StreamConfigurationMap;
            boolean getHighSpeedVideoFpsRanges = true;

            @Override // rx.Observer
            public void onNext(T t) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    subscriber.onNext(t);
                    return;
                }
                try {
                    rx.functions.Func2<? super T, java.lang.Integer, java.lang.Boolean> func2 = rx.internal.operators.OperatorSkipWhile.this.getHighSpeedVideoFpsRangesFor;
                    int i = this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = i + 1;
                    if (!func2.call(t, java.lang.Integer.valueOf(i)).booleanValue()) {
                        this.getHighSpeedVideoFpsRanges = false;
                        subscriber.onNext(t);
                    } else {
                        request(1L);
                    }
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwOrReport(th, subscriber, t);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                subscriber.onCompleted();
            }
        };
    }

    public static <T> rx.functions.Func2<T, java.lang.Integer, java.lang.Boolean> toPredicate2(final rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return new rx.functions.Func2<T, java.lang.Integer, java.lang.Boolean>() { // from class: rx.internal.operators.OperatorSkipWhile.2
            @Override // rx.functions.Func2
            public final /* bridge */ /* synthetic */ java.lang.Boolean call(java.lang.Object obj, java.lang.Integer num) {
                return (java.lang.Boolean) rx.functions.Func1.this.call(obj);
            }
        };
    }
}
