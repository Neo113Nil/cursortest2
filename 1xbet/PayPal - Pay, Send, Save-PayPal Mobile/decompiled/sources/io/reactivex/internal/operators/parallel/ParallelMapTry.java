package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelMapTry<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> Camera2StreamConfigurationMap;
    final io.reactivex.parallel.ParallelFlowable<T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRangesFor;

    public ParallelMapTry(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        this.getHighSpeedVideoFpsRanges = parallelFlowable;
        this.getHighSpeedVideoFpsRangesFor = function;
        this.Camera2StreamConfigurationMap = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super R> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelMapTry.ParallelMapTryConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelMapTry.ParallelMapTrySubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
                }
            }
            this.getHighSpeedVideoFpsRanges.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighSpeedVideoFpsRanges.parallelism();
    }

    /* loaded from: classes17.dex */
    static final class ParallelMapTrySubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super R> Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        ParallelMapTrySubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRanges = function;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoSizes.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoSizes.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            int i;
            if (this.getHighSpeedVideoFpsRangesFor) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.Camera2StreamConfigurationMap.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper returned a null value"));
                    return true;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    try {
                        j++;
                        i = io.reactivex.internal.operators.parallel.ParallelMapTry.AnonymousClass1.getHighSpeedVideoFpsRanges[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        cancel();
                        onError(new io.reactivex.exceptions.CompositeException(th, th2));
                        return false;
                    }
                }
            } while (i == 1);
            if (i != 2) {
                if (i == 3) {
                    cancel();
                    onComplete();
                } else {
                    cancel();
                    onError(th);
                    return false;
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[io.reactivex.parallel.ParallelFailureHandling.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[io.reactivex.parallel.ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[io.reactivex.parallel.ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[io.reactivex.parallel.ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelMapTryConditionalSubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.Function<? super T, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        ParallelMapTryConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> conditionalSubscriber, io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.getHighSpeedVideoFpsRangesFor = conditionalSubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
            this.getHighSpeedVideoFpsRanges = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoSizes.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoSizes, subscription)) {
                this.getHighSpeedVideoSizes = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.Camera2StreamConfigurationMap) {
                return;
            }
            this.getHighSpeedVideoSizes.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            int i;
            if (this.Camera2StreamConfigurationMap) {
                return false;
            }
            long j = 0;
            do {
                try {
                    return this.getHighSpeedVideoFpsRangesFor.tryOnNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t), "The mapper returned a null value"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    try {
                        j++;
                        i = io.reactivex.internal.operators.parallel.ParallelMapTry.AnonymousClass1.getHighSpeedVideoFpsRanges[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        cancel();
                        onError(new io.reactivex.exceptions.CompositeException(th, th2));
                        return false;
                    }
                }
            } while (i == 1);
            if (i != 2) {
                if (i == 3) {
                    cancel();
                    onComplete();
                } else {
                    cancel();
                    onError(th);
                    return false;
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }
}
