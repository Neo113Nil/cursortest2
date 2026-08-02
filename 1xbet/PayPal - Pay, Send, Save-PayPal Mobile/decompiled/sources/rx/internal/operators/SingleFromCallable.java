package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleFromCallable<T> implements rx.Single.OnSubscribe<T> {
    final java.util.concurrent.Callable<? extends T> getHighSpeedVideoFpsRangesFor;

    public SingleFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.getHighSpeedVideoFpsRangesFor = callable;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        try {
            singleSubscriber.onSuccess(this.getHighSpeedVideoFpsRangesFor.call());
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}
