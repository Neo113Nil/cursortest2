package retrofit2.adapter.rxjava;

/* loaded from: classes18.dex */
final class CallEnqueueOnSubscribe<T> implements rx.Observable.OnSubscribe<retrofit2.Response<T>> {
    private final retrofit2.Call<T> getHighResolutionOutputSizeshNQ4ISI;

    @Override // rx.functions.Action1
    public final /* synthetic */ void call(java.lang.Object obj) {
        rx.Subscriber subscriber = (rx.Subscriber) obj;
        retrofit2.Call<T> clone = this.getHighResolutionOutputSizeshNQ4ISI.clone();
        final retrofit2.adapter.rxjava.CallArbiter callArbiter = new retrofit2.adapter.rxjava.CallArbiter(clone, subscriber);
        subscriber.add(callArbiter);
        subscriber.setProducer(callArbiter);
        clone.enqueue(new retrofit2.Callback<T>() { // from class: retrofit2.adapter.rxjava.CallEnqueueOnSubscribe.1
            @Override // retrofit2.Callback
            public void onResponse(retrofit2.Call<T> call, retrofit2.Response<T> response) {
                callArbiter.getHighSpeedVideoFpsRanges(response);
            }

            @Override // retrofit2.Callback
            public void onFailure(retrofit2.Call<T> call, java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                callArbiter.getHighSpeedVideoFpsRanges(th);
            }
        });
    }

    CallEnqueueOnSubscribe(retrofit2.Call<T> call) {
        this.getHighResolutionOutputSizeshNQ4ISI = call;
    }
}
