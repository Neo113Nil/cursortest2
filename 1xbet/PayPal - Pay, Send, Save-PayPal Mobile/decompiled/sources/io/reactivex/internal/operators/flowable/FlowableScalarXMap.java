package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableScalarXMap {
    private FlowableScalarXMap() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, R> boolean tryScalarXMapSubscribe(org.reactivestreams.Publisher<T> publisher, org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function) {
        if (!(publisher instanceof java.util.concurrent.Callable)) {
            return false;
        }
        try {
            a.d dVar = (java.lang.Object) ((java.util.concurrent.Callable) publisher).call();
            if (dVar == null) {
                io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                return true;
            }
            try {
                org.reactivestreams.Publisher publisher2 = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(function.apply(dVar), "The mapper returned a null Publisher");
                if (publisher2 instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object call = ((java.util.concurrent.Callable) publisher2).call();
                        if (call == null) {
                            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                            return true;
                        }
                        subscriber.onSubscribe(new io.reactivex.internal.subscriptions.ScalarSubscription(subscriber, call));
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                        return true;
                    }
                } else {
                    publisher2.subscribe(subscriber);
                }
                return true;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
                return true;
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th3, subscriber);
            return true;
        }
    }

    public static <T, U> io.reactivex.Flowable<U> scalarXMap(T t, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.flowable.FlowableScalarXMap.ScalarXMapFlowable(t, function));
    }

    /* loaded from: classes17.dex */
    static final class ScalarXMapFlowable<T, R> extends io.reactivex.Flowable<R> {
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> Camera2StreamConfigurationMap;
        final T getHighResolutionOutputSizeshNQ4ISI;

        ScalarXMapFlowable(T t, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.Camera2StreamConfigurationMap = function;
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
            try {
                org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(this.getHighResolutionOutputSizeshNQ4ISI), "The mapper returned a null Publisher");
                if (publisher instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object call = ((java.util.concurrent.Callable) publisher).call();
                        if (call == null) {
                            io.reactivex.internal.subscriptions.EmptySubscription.complete(subscriber);
                            return;
                        } else {
                            subscriber.onSubscribe(new io.reactivex.internal.subscriptions.ScalarSubscription(subscriber, call));
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                        return;
                    }
                }
                publisher.subscribe(subscriber);
            } catch (java.lang.Throwable th2) {
                io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
            }
        }
    }
}
