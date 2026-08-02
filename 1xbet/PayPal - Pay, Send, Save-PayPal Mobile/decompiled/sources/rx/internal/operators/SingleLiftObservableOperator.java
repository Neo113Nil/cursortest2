package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleLiftObservableOperator<T, R> implements rx.Single.OnSubscribe<R> {
    final rx.Observable.Operator<? extends R, ? super T> getHighSpeedVideoFpsRanges;
    final rx.Single.OnSubscribe<T> getHighSpeedVideoFpsRangesFor;

    public SingleLiftObservableOperator(rx.Single.OnSubscribe<T> onSubscribe, rx.Observable.Operator<? extends R, ? super T> operator) {
        this.getHighSpeedVideoFpsRangesFor = onSubscribe;
        this.getHighSpeedVideoFpsRanges = operator;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super R> singleSubscriber) {
        rx.internal.operators.SingleFromObservable.WrapSingleIntoSubscriber wrapSingleIntoSubscriber = new rx.internal.operators.SingleFromObservable.WrapSingleIntoSubscriber(singleSubscriber);
        singleSubscriber.add(wrapSingleIntoSubscriber);
        try {
            rx.Subscriber<? super T> call = rx.plugins.RxJavaHooks.onSingleLift(this.getHighSpeedVideoFpsRanges).call(wrapSingleIntoSubscriber);
            rx.SingleSubscriber wrap = wrap(call);
            call.onStart();
            this.getHighSpeedVideoFpsRangesFor.call(wrap);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, singleSubscriber);
        }
    }

    public static <T> rx.SingleSubscriber<T> wrap(rx.Subscriber<T> subscriber) {
        rx.internal.operators.SingleLiftObservableOperator.WrapSubscriberIntoSingle wrapSubscriberIntoSingle = new rx.internal.operators.SingleLiftObservableOperator.WrapSubscriberIntoSingle(subscriber);
        subscriber.add(wrapSubscriberIntoSingle);
        return wrapSubscriberIntoSingle;
    }

    static final class WrapSubscriberIntoSingle<T> extends rx.SingleSubscriber<T> {
        final rx.Subscriber<? super T> Camera2StreamConfigurationMap;

        WrapSubscriberIntoSingle(rx.Subscriber<? super T> subscriber) {
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // rx.SingleSubscriber
        public final void onSuccess(T t) {
            this.Camera2StreamConfigurationMap.setProducer(new rx.internal.producers.SingleProducer(this.Camera2StreamConfigurationMap, t));
        }

        @Override // rx.SingleSubscriber
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }
    }
}
