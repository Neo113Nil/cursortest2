package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableFilter<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;

    public FlowableFilter(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Predicate<? super T> predicate) {
        super(flowable);
        this.Camera2StreamConfigurationMap = predicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFilter.FilterConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableFilter.FilterSubscriber(subscriber, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static final class FilterSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T> {
        final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;

        FilterSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = predicate;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.s.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.actual.onNext(null);
                return true;
            }
            try {
                boolean test = this.Camera2StreamConfigurationMap.test(t);
                if (test) {
                    this.actual.onNext(t);
                }
                return test;
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
        public final T poll() throws java.lang.Exception {
            io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = this.qs;
            io.reactivex.functions.Predicate<? super T> predicate = this.Camera2StreamConfigurationMap;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class FilterConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRangesFor;

        FilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.getHighSpeedVideoFpsRangesFor = predicate;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.s.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.actual.tryOnNext(null);
            }
            try {
                return this.getHighSpeedVideoFpsRangesFor.test(t) && this.actual.tryOnNext(t);
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
        public final T poll() throws java.lang.Exception {
            io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = this.qs;
            io.reactivex.functions.Predicate<? super T> predicate = this.getHighSpeedVideoFpsRangesFor;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.test(poll)) {
                    return poll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }
}
