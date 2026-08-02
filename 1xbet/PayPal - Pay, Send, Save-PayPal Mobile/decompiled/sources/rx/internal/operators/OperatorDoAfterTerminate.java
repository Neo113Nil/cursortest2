package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorDoAfterTerminate<T> implements rx.Observable.Operator<T, T> {
    final rx.functions.Action0 getHighResolutionOutputSizeshNQ4ISI;

    public OperatorDoAfterTerminate(rx.functions.Action0 action0) {
        if (action0 == null) {
            throw new java.lang.NullPointerException("Action can not be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = action0;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(final rx.Subscriber<? super T> subscriber) {
        return new rx.Subscriber<T>(subscriber) { // from class: rx.internal.operators.OperatorDoAfterTerminate.1
            @Override // rx.Observer
            public void onNext(T t) {
                subscriber.onNext(t);
            }

            @Override // rx.Observer
            public void onError(java.lang.Throwable th) {
                try {
                    subscriber.onError(th);
                } finally {
                    try {
                        rx.internal.operators.OperatorDoAfterTerminate.this.getHighResolutionOutputSizeshNQ4ISI.call();
                    } catch (java.lang.Throwable th2) {
                        rx.exceptions.Exceptions.throwIfFatal(th2);
                        rx.plugins.RxJavaHooks.onError(th2);
                    }
                }
            }

            @Override // rx.Observer
            public void onCompleted() {
                try {
                    subscriber.onCompleted();
                } finally {
                    try {
                        rx.internal.operators.OperatorDoAfterTerminate.this.getHighResolutionOutputSizeshNQ4ISI.call();
                    } catch (java.lang.Throwable th) {
                        rx.exceptions.Exceptions.throwIfFatal(th);
                        rx.plugins.RxJavaHooks.onError(th);
                    }
                }
            }
        };
    }
}
