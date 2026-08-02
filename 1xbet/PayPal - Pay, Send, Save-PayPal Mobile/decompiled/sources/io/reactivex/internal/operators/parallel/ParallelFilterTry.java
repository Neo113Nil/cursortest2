package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelFilterTry<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.parallel.ParallelFlowable<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> getHighSpeedVideoFpsRangesFor;

    public ParallelFilterTry(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        this.getHighResolutionOutputSizeshNQ4ISI = parallelFlowable;
        this.getHighSpeedVideoFpsRanges = predicate;
        this.getHighSpeedVideoFpsRangesFor = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super T> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelFilterTry.ParallelFilterSubscriber(subscriber, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighResolutionOutputSizeshNQ4ISI.parallelism();
    }

    /* loaded from: classes17.dex */
    static abstract class BaseFilterSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.Predicate<? super T> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> getHighSpeedVideoFpsRangesFor;

        BaseFilterSubscriber(io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.Camera2StreamConfigurationMap = predicate;
            this.getHighSpeedVideoFpsRangesFor = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRanges.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRanges.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoFpsRanges.request(1L);
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelFilterSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoSizes;

        ParallelFilterSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.getHighSpeedVideoSizes = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            int i;
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                long j = 0;
                do {
                    try {
                        if (!this.Camera2StreamConfigurationMap.test(t)) {
                            return false;
                        }
                        this.getHighSpeedVideoSizes.onNext(t);
                        return true;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        try {
                            j++;
                            i = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.getHighSpeedVideoSizes[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            cancel();
                            onError(new io.reactivex.exceptions.CompositeException(th, th2));
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
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[io.reactivex.parallel.ParallelFailureHandling.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[io.reactivex.parallel.ParallelFailureHandling.RETRY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[io.reactivex.parallel.ParallelFailureHandling.SKIP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[io.reactivex.parallel.ParallelFailureHandling.STOP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelFilterConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber<T> {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getHighSpeedVideoSizes;

        ParallelFilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            super(predicate, biFunction);
            this.getHighSpeedVideoSizes = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            int i;
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                long j = 0;
                do {
                    try {
                        return this.Camera2StreamConfigurationMap.test(t) && this.getHighSpeedVideoSizes.tryOnNext(t);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        try {
                            j++;
                            i = io.reactivex.internal.operators.parallel.ParallelFilterTry.AnonymousClass1.getHighSpeedVideoSizes[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            cancel();
                            onError(new io.reactivex.exceptions.CompositeException(th, th2));
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
            return false;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
