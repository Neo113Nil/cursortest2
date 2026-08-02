package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableGenerate<T, S> extends io.reactivex.Flowable<T> {
    final java.util.concurrent.Callable<S> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super S> getHighSpeedVideoSizes;

    public FlowableGenerate(java.util.concurrent.Callable<S> callable, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer) {
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
        this.getHighSpeedVideoFpsRangesFor = biFunction;
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        try {
            subscriber.onSubscribe(new io.reactivex.internal.operators.flowable.FlowableGenerate.GeneratorSubscription(subscriber, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.call()));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class GeneratorSubscription<T, S> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Emitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7565982551505011832L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Consumer<? super S> getHighSpeedVideoSizes;
        S getHighSpeedVideoSizesFor;
        boolean getInputFormats;

        GeneratorSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer, S s) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
            this.getHighSpeedVideoSizes = consumer;
            this.getHighSpeedVideoSizesFor = s;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
        
            r9.getHighSpeedVideoSizesFor = r0;
            r10 = addAndGet(-r4);
         */
        @Override // org.reactivestreams.Subscription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) && io.reactivex.internal.util.BackpressureHelper.add(this, j) == 0) {
                S s = this.getHighSpeedVideoSizesFor;
                io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction = this.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    long j2 = 0;
                    while (true) {
                        if (j2 != j) {
                            if (this.getHighSpeedVideoFpsRanges) {
                                this.getHighSpeedVideoSizesFor = null;
                                try {
                                    this.getHighSpeedVideoSizes.accept(s);
                                    return;
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                                    return;
                                }
                            }
                            this.getHighSpeedVideoFpsRangesFor = false;
                            try {
                                s = biFunction.apply(s, this);
                                if (this.getInputFormats) {
                                    this.getHighSpeedVideoFpsRanges = true;
                                    this.getHighSpeedVideoSizesFor = null;
                                    try {
                                        this.getHighSpeedVideoSizes.accept(s);
                                        return;
                                    } catch (java.lang.Throwable th2) {
                                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                        io.reactivex.plugins.RxJavaPlugins.onError(th2);
                                        return;
                                    }
                                }
                                j2++;
                            } catch (java.lang.Throwable th3) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                this.getHighSpeedVideoFpsRanges = true;
                                this.getHighSpeedVideoSizesFor = null;
                                onError(th3);
                                try {
                                    this.getHighSpeedVideoSizes.accept(s);
                                    return;
                                } catch (java.lang.Throwable th4) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                                    io.reactivex.plugins.RxJavaPlugins.onError(th4);
                                    return;
                                }
                            }
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    }
                } while (j != 0);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (io.reactivex.internal.util.BackpressureHelper.add(this, 1L) == 0) {
                S s = this.getHighSpeedVideoSizesFor;
                this.getHighSpeedVideoSizesFor = null;
                try {
                    this.getHighSpeedVideoSizes.accept(s);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (this.getInputFormats) {
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                onError(new java.lang.IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.Camera2StreamConfigurationMap.onNext(t);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable th) {
            if (this.getInputFormats) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.getInputFormats = true;
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.getInputFormats) {
                return;
            }
            this.getInputFormats = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}
