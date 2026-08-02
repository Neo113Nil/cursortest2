package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDoFinally<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Action Camera2StreamConfigurationMap;

    public FlowableDoFinally(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Action action) {
        super(flowable);
        this.Camera2StreamConfigurationMap = action;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoFinally.DoFinallyConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.Camera2StreamConfigurationMap));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoFinally.DoFinallySubscriber(subscriber, this.Camera2StreamConfigurationMap));
        }
    }

    /* loaded from: classes17.dex */
    static final class DoFinallySubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.functions.Action Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        io.reactivex.internal.fuseable.QueueSubscription<T> getHighSpeedVideoSizes;

        DoFinallySubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Action action) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.Camera2StreamConfigurationMap = action;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    this.getHighSpeedVideoSizes = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.Camera2StreamConfigurationMap.run();
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            if (compareAndSet(0, 1)) {
                try {
                    this.Camera2StreamConfigurationMap.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
            if (compareAndSet(0, 1)) {
                try {
                    this.Camera2StreamConfigurationMap.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = this.getHighSpeedVideoSizes;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueSubscription.requestFusion(i);
            if (requestFusion != 0) {
                this.getHighSpeedVideoFpsRangesFor = requestFusion == 1;
            }
            return requestFusion;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoSizes.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoSizes.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.getHighSpeedVideoSizes.poll();
            if (poll == null && this.getHighSpeedVideoFpsRangesFor && compareAndSet(0, 1)) {
                try {
                    this.Camera2StreamConfigurationMap.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
            return poll;
        }
    }

    /* loaded from: classes17.dex */
    static final class DoFinallyConditionalSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        io.reactivex.internal.fuseable.QueueSubscription<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getHighSpeedVideoSizes;

        DoFinallyConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Action action) {
            this.getHighSpeedVideoSizes = conditionalSubscriber;
            this.getHighSpeedVideoFpsRanges = action;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                if (subscription instanceof io.reactivex.internal.fuseable.QueueSubscription) {
                    this.getHighResolutionOutputSizeshNQ4ISI = (io.reactivex.internal.fuseable.QueueSubscription) subscription;
                }
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            return this.getHighSpeedVideoSizes.tryOnNext(t);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap.cancel();
            if (compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.Camera2StreamConfigurationMap.request(j);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            io.reactivex.internal.fuseable.QueueSubscription<T> queueSubscription = this.getHighResolutionOutputSizeshNQ4ISI;
            if (queueSubscription == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueSubscription.requestFusion(i);
            if (requestFusion != 0) {
                this.getHighSpeedVideoFpsRangesFor = requestFusion == 1;
            }
            return requestFusion;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T poll = this.getHighResolutionOutputSizeshNQ4ISI.poll();
            if (poll == null && this.getHighSpeedVideoFpsRangesFor && compareAndSet(0, 1)) {
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
            return poll;
        }
    }
}
