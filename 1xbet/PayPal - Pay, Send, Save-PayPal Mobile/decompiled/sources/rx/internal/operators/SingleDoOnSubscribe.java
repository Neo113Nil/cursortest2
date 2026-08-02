package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleDoOnSubscribe<T> implements rx.Single.OnSubscribe<T> {
    final rx.Single.OnSubscribe<T> Camera2StreamConfigurationMap;
    final rx.functions.Action0 getHighSpeedVideoFpsRanges;

    public SingleDoOnSubscribe(rx.Single.OnSubscribe<T> onSubscribe, rx.functions.Action0 action0) {
        this.Camera2StreamConfigurationMap = onSubscribe;
        this.getHighSpeedVideoFpsRanges = action0;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        try {
            this.getHighSpeedVideoFpsRanges.call();
            this.Camera2StreamConfigurationMap.call(singleSubscriber);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}
