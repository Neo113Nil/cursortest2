package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableMapNotification<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final java.util.concurrent.Callable<? extends R> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRangesFor;

    public FlowableMapNotification(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> function2, java.util.concurrent.Callable<? extends R> callable) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableMapNotification.MapNotificationSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class MapNotificationSubscriber<T, R> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;
        final io.reactivex.functions.Function<? super T, ? extends R> Camera2StreamConfigurationMap;
        final java.util.concurrent.Callable<? extends R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> getHighSpeedVideoSizes;

        MapNotificationSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends R> function2, java.util.concurrent.Callable<? extends R> callable) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = function;
            this.getHighSpeedVideoSizes = function2;
            this.getHighResolutionOutputSizeshNQ4ISI = callable;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            try {
                java.lang.Object requireNonNull = io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The onNext publisher returned is null");
                this.produced++;
                this.actual.onNext(requireNonNull);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.actual.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            try {
                complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(th), "The onError publisher returned is null"));
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.actual.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The onComplete publisher returned is null"));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.actual.onError(th);
            }
        }
    }
}
