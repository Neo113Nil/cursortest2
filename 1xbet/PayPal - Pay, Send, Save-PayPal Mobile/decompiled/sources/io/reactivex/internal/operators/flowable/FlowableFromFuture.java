package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFromFuture<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Future<? extends T> getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;

    public FlowableFromFuture(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.getHighSpeedVideoFpsRangesFor = future;
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.DeferredScalarSubscription deferredScalarSubscription = new io.reactivex.internal.subscriptions.DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            java.util.concurrent.TimeUnit timeUnit = this.getHighResolutionOutputSizeshNQ4ISI;
            T t = timeUnit != null ? this.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoSizes, timeUnit) : this.getHighSpeedVideoFpsRangesFor.get();
            if (t == null) {
                subscriber.onError(new java.lang.NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            subscriber.onError(th);
        }
    }
}
