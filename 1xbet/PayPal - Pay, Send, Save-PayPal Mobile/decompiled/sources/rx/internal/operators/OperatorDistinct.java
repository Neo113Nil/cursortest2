package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDistinct<T, U> implements rx.Observable.Operator<T, T> {
    final rx.functions.Func1<? super T, ? extends U> getHighResolutionOutputSizeshNQ4ISI;

    static final class Holder {
        static final rx.internal.operators.OperatorDistinct<?, ?> Camera2StreamConfigurationMap = new rx.internal.operators.OperatorDistinct<>(rx.internal.util.UtilityFunctions.identity());

        Holder() {
        }
    }

    public static <T> rx.internal.operators.OperatorDistinct<T, T> instance() {
        return (rx.internal.operators.OperatorDistinct<T, T>) rx.internal.operators.OperatorDistinct.Holder.Camera2StreamConfigurationMap;
    }

    public OperatorDistinct(rx.functions.Func1<? super T, ? extends U> func1) {
        this.getHighResolutionOutputSizeshNQ4ISI = func1;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDistinct.1
            java.util.Set<U> getHighSpeedVideoSizes = new java.util.HashSet();

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.getHighSpeedVideoSizes.add(rx.internal.operators.OperatorDistinct.this.getHighResolutionOutputSizeshNQ4ISI.call(t))) {
                    subscriber.onNext(t);
                } else {
                    request(1L);
                }
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                this.getHighSpeedVideoSizes = null;
                subscriber.onError(th);
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.getHighSpeedVideoSizes = null;
                subscriber.onCompleted();
            }
        };
    }
}
