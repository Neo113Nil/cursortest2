package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDoAfterNext<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

    public FlowableDoAfterNext(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super T> consumer) {
        super(flowable);
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoAfterNext.DoAfterConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoSizes));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoAfterNext.DoAfterSubscriber(subscriber, this.getHighSpeedVideoSizes));
        }
    }

    /* loaded from: classes17.dex */
    static final class DoAfterSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Consumer<? super T> getHighResolutionOutputSizeshNQ4ISI;

        DoAfterSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super T> consumer) {
            super(subscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            this.actual.onNext(t);
            if (this.sourceMode == 0) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.accept(t);
                } catch (java.lang.Throwable th) {
                    fail(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(poll);
            }
            return poll;
        }
    }

    /* loaded from: classes17.dex */
    static final class DoAfterConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

        DoAfterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Consumer<? super T> consumer) {
            super(conditionalSubscriber);
            this.getHighSpeedVideoSizes = consumer;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.actual.onNext(t);
            if (this.sourceMode == 0) {
                try {
                    this.getHighSpeedVideoSizes.accept(t);
                } catch (java.lang.Throwable th) {
                    fail(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            boolean tryOnNext = this.actual.tryOnNext(t);
            try {
                this.getHighSpeedVideoSizes.accept(t);
                return tryOnNext;
            } catch (java.lang.Throwable th) {
                fail(th);
                return tryOnNext;
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.qs.poll();
            if (poll != null) {
                this.getHighSpeedVideoSizes.accept(poll);
            }
            return poll;
        }
    }
}
