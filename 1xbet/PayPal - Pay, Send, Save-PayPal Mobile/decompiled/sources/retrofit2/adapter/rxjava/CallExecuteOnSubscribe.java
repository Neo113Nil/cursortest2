package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
final class CallExecuteOnSubscribe<T> implements rx.Observable.OnSubscribe<retrofit2.Response<T>> {
    private final retrofit2.Call<T> Camera2StreamConfigurationMap;

    @Override // rx.functions.Action1
    public final /* synthetic */ void call(java.lang.Object obj) {
        rx.Subscriber subscriber = (rx.Subscriber) obj;
        retrofit2.Call<T> clone = this.Camera2StreamConfigurationMap.clone();
        retrofit2.adapter.rxjava.CallArbiter callArbiter = new retrofit2.adapter.rxjava.CallArbiter(clone, subscriber);
        subscriber.add(callArbiter);
        subscriber.setProducer(callArbiter);
        try {
            callArbiter.getHighSpeedVideoFpsRanges(clone.execute());
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            callArbiter.getHighSpeedVideoFpsRanges(th);
        }
    }

    CallExecuteOnSubscribe(retrofit2.Call<T> call) {
        this.Camera2StreamConfigurationMap = call;
    }
}
