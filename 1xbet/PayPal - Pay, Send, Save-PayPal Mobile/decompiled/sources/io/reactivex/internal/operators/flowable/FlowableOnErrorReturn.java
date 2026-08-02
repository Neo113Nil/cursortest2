package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableOnErrorReturn<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> getHighSpeedVideoSizes;

    public FlowableOnErrorReturn(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
        super(flowable);
        this.getHighSpeedVideoSizes = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableOnErrorReturn.OnErrorReturnSubscriber(subscriber, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class OnErrorReturnSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> getHighSpeedVideoSizes;

        OnErrorReturnSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> function) {
            super(subscriber);
            this.getHighSpeedVideoSizes = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.produced++;
            this.actual.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            try {
                complete(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(th), "The valueSupplier returned a null value"));
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.actual.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.actual.onComplete();
        }
    }
}
