package rx.internal.operators;

/* loaded from: classes18.dex */
public final class SingleFromFuture<T> implements rx.Single.OnSubscribe<T> {
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.Future<? extends T> getHighSpeedVideoSizes;

    public SingleFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.getHighSpeedVideoSizes = future;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = timeUnit;
    }

    @Override // rx.functions.Action1
    public final void call(rx.SingleSubscriber<? super T> singleSubscriber) {
        T t;
        java.util.concurrent.Future<? extends T> future = this.getHighSpeedVideoSizes;
        singleSubscriber.add(rx.subscriptions.Subscriptions.from(future));
        try {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j == 0) {
                t = future.get();
            } else {
                t = future.get(j, this.getHighSpeedVideoFpsRanges);
            }
            singleSubscriber.onSuccess(t);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}
