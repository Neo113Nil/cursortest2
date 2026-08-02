package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeCollect<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.Observable<T> getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func0<R> getHighSpeedVideoFpsRanges;
    final rx.functions.Action2<R, ? super T> getHighSpeedVideoFpsRangesFor;

    public OnSubscribeCollect(rx.Observable<T> observable, rx.functions.Func0<R> func0, rx.functions.Action2<R, ? super T> action2) {
        this.getHighResolutionOutputSizeshNQ4ISI = observable;
        this.getHighSpeedVideoFpsRanges = func0;
        this.getHighSpeedVideoFpsRangesFor = action2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        try {
            new rx.internal.operators.OnSubscribeCollect.CollectSubscriber(subscriber, this.getHighSpeedVideoFpsRanges.call(), this.getHighSpeedVideoFpsRangesFor).subscribeTo(this.getHighResolutionOutputSizeshNQ4ISI);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    static final class CollectSubscriber<T, R> extends rx.internal.operators.DeferredScalarSubscriberSafe<T, R> {
        final rx.functions.Action2<R, ? super T> getHighSpeedVideoFpsRanges;

        public CollectSubscriber(rx.Subscriber<? super R> subscriber, R r, rx.functions.Action2<R, ? super T> action2) {
            super(subscriber);
            this.value = r;
            this.hasValue = true;
            this.getHighSpeedVideoFpsRanges = action2;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.call(this.value, t);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }
}
