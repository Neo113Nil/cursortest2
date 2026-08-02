package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OnSubscribeReduceSeed<T, R> implements rx.Observable.OnSubscribe<R> {
    final rx.Observable<T> Camera2StreamConfigurationMap;
    final rx.functions.Func2<R, ? super T, R> getHighResolutionOutputSizeshNQ4ISI;
    final R getHighSpeedVideoFpsRanges;

    public OnSubscribeReduceSeed(rx.Observable<T> observable, R r, rx.functions.Func2<R, ? super T, R> func2) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoFpsRanges = r;
        this.getHighResolutionOutputSizeshNQ4ISI = func2;
    }

    @Override // rx.functions.Action1
    public final void call(rx.Subscriber<? super R> subscriber) {
        new rx.internal.operators.OnSubscribeReduceSeed.ReduceSeedSubscriber(subscriber, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI).subscribeTo(this.Camera2StreamConfigurationMap);
    }

    static final class ReduceSeedSubscriber<T, R> extends rx.internal.operators.DeferredScalarSubscriber<T, R> {
        final rx.functions.Func2<R, ? super T, R> getHighSpeedVideoSizes;

        public ReduceSeedSubscriber(rx.Subscriber<? super R> subscriber, R r, rx.functions.Func2<R, ? super T, R> func2) {
            super(subscriber);
            this.value = r;
            this.hasValue = true;
            this.getHighSpeedVideoSizes = func2;
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            try {
                this.value = this.getHighSpeedVideoSizes.call(this.value, t);
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                unsubscribe();
                this.actual.onError(th);
            }
        }
    }
}
