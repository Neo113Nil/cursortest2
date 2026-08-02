package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeLift<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.Observable.OnSubscribe<T> Camera2StreamConfigurationMap;
    final rx.Observable.Operator<? extends R, ? super T> getHighResolutionOutputSizeshNQ4ISI;

    public OnSubscribeLift(rx.Observable.OnSubscribe<T> onSubscribe, rx.Observable.Operator<? extends R, ? super T> operator) {
        this.Camera2StreamConfigurationMap = onSubscribe;
        this.getHighResolutionOutputSizeshNQ4ISI = operator;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        try {
            rx.Subscriber<? super T> call = rx.plugins.RxJavaHooks.onObservableLift(this.getHighResolutionOutputSizeshNQ4ISI).call(subscriber);
            try {
                call.onStart();
                this.Camera2StreamConfigurationMap.call(call);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                call.onError(th);
            }
        } catch (java.lang.Throwable th2) {
            rx.exceptions.Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }
}
