package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFromCallable<T> extends io.reactivex.Flowable<T> implements java.util.concurrent.Callable<T> {
    final java.util.concurrent.Callable<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableFromCallable(java.util.concurrent.Callable<? extends T> callable) {
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.subscriptions.DeferredScalarSubscription deferredScalarSubscription = new io.reactivex.internal.subscriptions.DeferredScalarSubscription(subscriber);
        subscriber.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The callable returned a null value"));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws java.lang.Exception {
        return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The callable returned a null value");
    }
}
