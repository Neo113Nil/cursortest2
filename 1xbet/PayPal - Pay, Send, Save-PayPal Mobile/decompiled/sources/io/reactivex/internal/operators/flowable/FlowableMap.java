package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableMap<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends U> Camera2StreamConfigurationMap;

    public FlowableMap(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends U> function) {
        super(flowable);
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableMap.MapConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableMap.MapSubscriber(subscriber, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static final class MapSubscriber<T, U> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> getHighSpeedVideoFpsRangesFor;

        MapSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, io.reactivex.functions.Function<? super T, ? extends U> function) {
            super(subscriber);
            this.getHighSpeedVideoFpsRangesFor = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.actual.onNext(null);
                return;
            }
            try {
                this.actual.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final U poll() throws java.lang.Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                return (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* loaded from: classes17.dex */
    static final class MapConditionalSubscriber<T, U> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> getHighSpeedVideoFpsRanges;

        MapConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super U> conditionalSubscriber, io.reactivex.functions.Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.actual.onNext(null);
                return;
            }
            try {
                this.actual.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            try {
                return this.actual.tryOnNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper function returned a null value."));
            } catch (java.lang.Throwable th) {
                fail(th);
                return true;
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final U poll() throws java.lang.Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                return (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
