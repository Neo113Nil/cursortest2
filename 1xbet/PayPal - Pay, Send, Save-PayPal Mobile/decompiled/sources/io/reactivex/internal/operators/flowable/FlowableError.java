package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableError<T> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Callable<? extends java.lang.Throwable> getHighSpeedVideoSizes;

    public FlowableError(java.util.concurrent.Callable<? extends java.lang.Throwable> callable) {
        this.getHighSpeedVideoSizes = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            th = (java.lang.Throwable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (java.lang.Throwable th) {
            th = th;
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
        }
        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
    }
}
