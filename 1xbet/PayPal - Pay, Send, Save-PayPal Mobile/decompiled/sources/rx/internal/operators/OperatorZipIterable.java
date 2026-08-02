package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorZipIterable<T1, T2, R> implements rx.Observable.Operator<R, T1> {
    final java.lang.Iterable<? extends T2> Camera2StreamConfigurationMap;
    final rx.functions.Func2<? super T1, ? super T2, ? extends R> getHighSpeedVideoFpsRangesFor;

    public OperatorZipIterable(java.lang.Iterable<? extends T2> iterable, rx.functions.Func2<? super T1, ? super T2, ? extends R> func2) {
        this.Camera2StreamConfigurationMap = iterable;
        this.getHighSpeedVideoFpsRangesFor = func2;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T1> call(final rx.Subscriber<? super R> subscriber) {
        final java.util.Iterator<? extends T2> it = this.Camera2StreamConfigurationMap.iterator();
        try {
            if (!it.hasNext()) {
                subscriber.onCompleted();
                return rx.observers.Subscribers.empty();
            }
            return new rx.Subscriber<T1>(subscriber) { // from class: rx.internal.operators.OperatorZipIterable.1
                boolean getHighSpeedVideoFpsRangesFor;

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRangesFor = true;
                    subscriber.onCompleted();
                }

                @Override // rx.Observer
                public void onError(java.lang.Throwable th) {
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        rx.exceptions.Exceptions.throwIfFatal(th);
                    } else {
                        this.getHighSpeedVideoFpsRangesFor = true;
                        subscriber.onError(th);
                    }
                }

                @Override // rx.Observer
                public void onNext(T1 t1) {
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                    try {
                        subscriber.onNext(rx.internal.operators.OperatorZipIterable.this.getHighSpeedVideoFpsRangesFor.call(t1, (java.lang.Object) it.next()));
                        if (it.hasNext()) {
                            return;
                        }
                        onCompleted();
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwOrReport(th, this);
                    }
                }
            };
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
            return rx.observers.Subscribers.empty();
        }
    }
}
