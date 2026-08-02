package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDistinct<T, K> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.Callable<? extends java.util.Collection<? super K>> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, K> getHighSpeedVideoFpsRangesFor;

    public FlowableDistinct(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, K> function, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> callable) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = function;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDistinct.DistinctSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class DistinctSubscriber<T, K> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Function<? super T, K> Camera2StreamConfigurationMap;
        final java.util.Collection<? super K> getHighResolutionOutputSizeshNQ4ISI;

        DistinctSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, K> function, java.util.Collection<? super K> collection) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = function;
            this.getHighResolutionOutputSizeshNQ4ISI = collection;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 0) {
                try {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.add(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The keySelector returned a null key"))) {
                        this.actual.onNext(t);
                        return;
                    } else {
                        this.s.request(1L);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    fail(th);
                    return;
                }
            }
            this.actual.onNext(null);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            this.actual.onError(th);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            this.actual.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll;
            while (true) {
                poll = this.qs.poll();
                if (poll == null || this.getHighResolutionOutputSizeshNQ4ISI.add((java.lang.Object) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(poll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.sourceMode == 2) {
                    this.s.request(1L);
                }
            }
            return poll;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            super.clear();
        }
    }
}
