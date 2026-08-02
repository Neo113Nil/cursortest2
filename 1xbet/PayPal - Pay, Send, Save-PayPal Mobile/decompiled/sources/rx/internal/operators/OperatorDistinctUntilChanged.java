package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDistinctUntilChanged<T, U> implements rx.Observable.Operator<T, T>, rx.functions.Func2<U, U, java.lang.Boolean> {
    final rx.functions.Func1<? super T, ? extends U> Camera2StreamConfigurationMap;
    final rx.functions.Func2<? super U, ? super U, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    static final class Holder {
        static final rx.internal.operators.OperatorDistinctUntilChanged<?, ?> getHighSpeedVideoFpsRangesFor = new rx.internal.operators.OperatorDistinctUntilChanged<>(rx.internal.util.UtilityFunctions.identity());

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorDistinctUntilChanged<T, T> instance() {
        return (rx.internal.operators.OperatorDistinctUntilChanged<T, T>) rx.internal.operators.OperatorDistinctUntilChanged.Holder.getHighSpeedVideoFpsRangesFor;
    }

    public OperatorDistinctUntilChanged(rx.functions.Func1<? super T, ? extends U> func1) {
        this.Camera2StreamConfigurationMap = func1;
        this.getHighResolutionOutputSizeshNQ4ISI = this;
    }

    public OperatorDistinctUntilChanged(rx.functions.Func2<? super U, ? super U, java.lang.Boolean> func2) {
        this.Camera2StreamConfigurationMap = rx.internal.util.UtilityFunctions.identity();
        this.getHighResolutionOutputSizeshNQ4ISI = func2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // rx.functions.Func2
    public final java.lang.Boolean call(U u, U u2) {
        return java.lang.Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDistinctUntilChanged.1
            U getHighSpeedVideoFpsRangesFor;
            boolean getHighSpeedVideoSizes;

            @Override // rx.Observer
            public void onNext(T t) {
                try {
                    U call = rx.internal.operators.OperatorDistinctUntilChanged.this.Camera2StreamConfigurationMap.call(t);
                    U u = this.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor = call;
                    if (this.getHighSpeedVideoSizes) {
                        try {
                            if (!rx.internal.operators.OperatorDistinctUntilChanged.this.getHighResolutionOutputSizeshNQ4ISI.call(u, call).booleanValue()) {
                                subscriber.onNext(t);
                                return;
                            } else {
                                request(1L);
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            rx.exceptions.Exceptions.throwOrReport(th, subscriber, call);
                            return;
                        }
                    }
                    this.getHighSpeedVideoSizes = true;
                    subscriber.onNext(t);
                } catch (java.lang.Throwable th2) {
                    rx.exceptions.Exceptions.throwOrReport(th2, subscriber, t);
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
}
