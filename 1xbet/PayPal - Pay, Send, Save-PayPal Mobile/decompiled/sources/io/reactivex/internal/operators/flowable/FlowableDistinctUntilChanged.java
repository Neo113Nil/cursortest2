package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, K> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiPredicate<? super K, ? super K> getHighSpeedVideoSizes;

    public FlowableDistinctUntilChanged(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoSizes = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged.DistinctUntilChangedConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged.DistinctUntilChangedSubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
        }
    }

    /* loaded from: classes17.dex */
    static final class DistinctUntilChangedSubscriber<T, K> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T> {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiPredicate<? super K, ? super K> getHighSpeedVideoFpsRanges;
        K getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Function<? super T, K> getHighSpeedVideoSizes;

        DistinctUntilChangedSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
            super(subscriber);
            this.getHighSpeedVideoSizes = function;
            this.getHighSpeedVideoFpsRanges = biPredicate;
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
                this.actual.onNext(t);
                return true;
            }
            try {
                K apply = this.getHighSpeedVideoSizes.apply(t);
                if (this.Camera2StreamConfigurationMap) {
                    boolean test = this.getHighSpeedVideoFpsRanges.test(this.getHighSpeedVideoFpsRangesFor, apply);
                    this.getHighSpeedVideoFpsRangesFor = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRangesFor = apply;
                }
                this.actual.onNext(t);
                return true;
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
            while (true) {
                T poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.getHighSpeedVideoSizes.apply(poll);
                if (!this.Camera2StreamConfigurationMap) {
                    this.Camera2StreamConfigurationMap = true;
                    this.getHighSpeedVideoFpsRangesFor = apply;
                    return poll;
                }
                if (!this.getHighSpeedVideoFpsRanges.test(this.getHighSpeedVideoFpsRangesFor, apply)) {
                    this.getHighSpeedVideoFpsRangesFor = apply;
                    return poll;
                }
                this.getHighSpeedVideoFpsRangesFor = apply;
                if (this.sourceMode != 1) {
                    this.s.request(1L);
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class DistinctUntilChangedConditionalSubscriber<T, K> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.BiPredicate<? super K, ? super K> Camera2StreamConfigurationMap;
        final io.reactivex.functions.Function<? super T, K> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        K getHighSpeedVideoFpsRangesFor;

        DistinctUntilChangedConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Function<? super T, K> function, io.reactivex.functions.BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = function;
            this.Camera2StreamConfigurationMap = biPredicate;
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
                return this.actual.tryOnNext(t);
            }
            try {
                K apply = this.getHighResolutionOutputSizeshNQ4ISI.apply(t);
                if (this.getHighSpeedVideoFpsRanges) {
                    boolean test = this.Camera2StreamConfigurationMap.test(this.getHighSpeedVideoFpsRangesFor, apply);
                    this.getHighSpeedVideoFpsRangesFor = apply;
                    if (test) {
                        return false;
                    }
                } else {
                    this.getHighSpeedVideoFpsRanges = true;
                    this.getHighSpeedVideoFpsRangesFor = apply;
                }
                this.actual.onNext(t);
                return true;
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
            while (true) {
                T poll = this.qs.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.getHighResolutionOutputSizeshNQ4ISI.apply(poll);
                if (!this.getHighSpeedVideoFpsRanges) {
                    this.getHighSpeedVideoFpsRanges = true;
                    this.getHighSpeedVideoFpsRangesFor = apply;
                    return poll;
                }
                if (!this.Camera2StreamConfigurationMap.test(this.getHighSpeedVideoFpsRangesFor, apply)) {
                    this.getHighSpeedVideoFpsRangesFor = apply;
                    return poll;
                }
                this.getHighSpeedVideoFpsRangesFor = apply;
                if (this.sourceMode != 1) {
                    this.s.request(1L);
                }
            }
        }
    }
}
