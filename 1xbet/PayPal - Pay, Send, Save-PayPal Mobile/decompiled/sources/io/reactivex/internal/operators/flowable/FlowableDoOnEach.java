package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableDoOnEach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Consumer<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Action getHighSpeedVideoSizes;

    public FlowableDoOnEach(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        this.Camera2StreamConfigurationMap = consumer2;
        this.getHighSpeedVideoFpsRangesFor = action;
        this.getHighSpeedVideoSizes = action2;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableDoOnEach.DoOnEachSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes));
        }
    }

    /* loaded from: classes17.dex */
    static final class DoOnEachSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Consumer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Action getHighSpeedVideoSizes;

        DoOnEachSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
            super(subscriber);
            this.getHighResolutionOutputSizeshNQ4ISI = consumer;
            this.getHighSpeedVideoFpsRanges = consumer2;
            this.getHighSpeedVideoFpsRangesFor = action;
            this.getHighSpeedVideoSizes = action2;
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
                this.getHighResolutionOutputSizeshNQ4ISI.accept(t);
                this.actual.onNext(t);
            } catch (java.lang.Throwable th) {
                fail(th);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            try {
                this.getHighSpeedVideoFpsRanges.accept(th);
                this.actual.onError(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.actual.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
            try {
                this.getHighSpeedVideoSizes.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.run();
                this.done = true;
                this.actual.onComplete();
                try {
                    this.getHighSpeedVideoSizes.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            io.reactivex.exceptions.CompositeException compositeException;
            try {
                T poll = this.qs.poll();
                if (poll != null) {
                    try {
                        this.getHighResolutionOutputSizeshNQ4ISI.accept(poll);
                        return poll;
                    } catch (java.lang.Throwable th) {
                        try {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            try {
                                this.getHighSpeedVideoFpsRanges.accept(th);
                                throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th);
                            } finally {
                            }
                        } finally {
                            this.getHighSpeedVideoSizes.run();
                        }
                    }
                }
                if (this.sourceMode == 1) {
                    this.getHighSpeedVideoFpsRangesFor.run();
                }
                return poll;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                try {
                    this.getHighSpeedVideoFpsRanges.accept(th2);
                    throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th2);
                } finally {
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class DoOnEachConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Action getHighSpeedVideoSizes;

        DoOnEachConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer2, io.reactivex.functions.Action action, io.reactivex.functions.Action action2) {
            super(conditionalSubscriber);
            this.getHighSpeedVideoFpsRangesFor = consumer;
            this.getHighResolutionOutputSizeshNQ4ISI = consumer2;
            this.getHighSpeedVideoSizes = action;
            this.getHighSpeedVideoFpsRanges = action2;
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
                this.getHighSpeedVideoFpsRangesFor.accept(t);
                this.actual.onNext(t);
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
                this.getHighSpeedVideoFpsRangesFor.accept(t);
                return this.actual.tryOnNext(t);
            } catch (java.lang.Throwable th) {
                fail(th);
                return false;
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.accept(th);
                this.actual.onError(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.actual.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
            try {
                this.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            try {
                this.getHighSpeedVideoSizes.run();
                this.done = true;
                this.actual.onComplete();
                try {
                    this.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return transitiveBoundaryFusion(i);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            io.reactivex.exceptions.CompositeException compositeException;
            try {
                T poll = this.qs.poll();
                if (poll != null) {
                    try {
                        this.getHighSpeedVideoFpsRangesFor.accept(poll);
                        return poll;
                    } catch (java.lang.Throwable th) {
                        try {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            try {
                                this.getHighResolutionOutputSizeshNQ4ISI.accept(th);
                                throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th);
                            } finally {
                            }
                        } finally {
                            this.getHighSpeedVideoFpsRanges.run();
                        }
                    }
                }
                if (this.sourceMode == 1) {
                    this.getHighSpeedVideoSizes.run();
                }
                return poll;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.accept(th2);
                    throw io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(th2);
                } finally {
                }
            }
        }
    }
}
