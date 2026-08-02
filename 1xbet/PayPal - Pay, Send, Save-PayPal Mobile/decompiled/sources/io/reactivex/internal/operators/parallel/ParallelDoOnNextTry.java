package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelDoOnNextTry<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Consumer<? super T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.parallel.ParallelFlowable<T> getHighSpeedVideoFpsRangesFor;

    public ParallelDoOnNextTry(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        this.getHighSpeedVideoFpsRangesFor = parallelFlowable;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        this.Camera2StreamConfigurationMap = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super T> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.ParallelDoOnNextConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.ParallelDoOnNextSubscriber(subscriber, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                }
            }
            this.getHighSpeedVideoFpsRangesFor.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getHighSpeedVideoFpsRangesFor.parallelism();
    }

    /* loaded from: classes17.dex */
    static final class ParallelDoOnNextSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Consumer<? super T> getHighSpeedVideoSizes;

        ParallelDoOnNextSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoSizes = consumer;
            this.getHighSpeedVideoFpsRangesFor = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            int i;
            if (this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.getHighSpeedVideoSizes.accept(t);
                    this.Camera2StreamConfigurationMap.onNext(t);
                    return true;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    try {
                        j++;
                        i = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.AnonymousClass1.getHighSpeedVideoFpsRanges[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
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
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$1, reason: invalid class name */
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
    static final class ParallelDoOnNextConditionalSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.Consumer<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getHighSpeedVideoSizes;

        ParallelDoOnNextConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
            this.getHighSpeedVideoSizes = conditionalSubscriber;
            this.Camera2StreamConfigurationMap = consumer;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.getHighSpeedVideoFpsRangesFor.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRangesFor.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRangesFor, subscription)) {
                this.getHighSpeedVideoFpsRangesFor = subscription;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            int i;
            if (this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            long j = 0;
            do {
                try {
                    this.Camera2StreamConfigurationMap.accept(t);
                    return this.getHighSpeedVideoSizes.tryOnNext(t);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    try {
                        j++;
                        i = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.AnonymousClass1.getHighSpeedVideoFpsRanges[((io.reactivex.parallel.ParallelFailureHandling) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(java.lang.Long.valueOf(j), th), "The errorHandler returned a null item")).ordinal()];
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
            if (this.getHighSpeedVideoFpsRanges) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizes.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
