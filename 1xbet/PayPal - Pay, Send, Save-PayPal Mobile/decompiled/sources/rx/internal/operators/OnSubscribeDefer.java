package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeDefer<T> implements rx.Observable.OnSubscribe<T> {
    final rx.functions.Func0<? extends rx.Observable<? extends T>> getHighResolutionOutputSizeshNQ4ISI;

    public OnSubscribeDefer(rx.functions.Func0<? extends rx.Observable<? extends T>> func0) {
        this.getHighResolutionOutputSizeshNQ4ISI = func0;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super T> subscriber) {
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.call().unsafeSubscribe(rx.observers.Subscribers.wrap(subscriber));
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
        }
    }
}
