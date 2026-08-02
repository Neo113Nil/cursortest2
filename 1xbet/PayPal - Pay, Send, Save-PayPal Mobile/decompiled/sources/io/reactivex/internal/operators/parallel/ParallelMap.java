package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelMap<T, R> extends io.reactivex.parallel.ParallelFlowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRanges;
    final io.reactivex.parallel.ParallelFlowable<T> getHighSpeedVideoFpsRangesFor;

    public ParallelMap(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Function<? super T, ? extends R> function) {
        this.getHighSpeedVideoFpsRangesFor = parallelFlowable;
        this.getHighSpeedVideoFpsRanges = function;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super R> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelMap.ParallelMapConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoFpsRanges);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelMap.ParallelMapSubscriber(subscriber, this.getHighSpeedVideoFpsRanges);
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
    static final class ParallelMapSubscriber<T, R> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.functions.Function<? super T, ? extends R> getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        org.reactivestreams.Subscription getHighSpeedVideoSizes;

        ParallelMapSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super T, ? extends R> function) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
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
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t), "The mapper returned a null value"));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelMapConditionalSubscriber<T, R> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoFpsRanges;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        ParallelMapConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> conditionalSubscriber, io.reactivex.functions.Function<? super T, ? extends R> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = conditionalSubscriber;
            this.getHighSpeedVideoFpsRanges = function;
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
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper returned a null value"));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return false;
            }
            try {
                return this.getHighResolutionOutputSizeshNQ4ISI.tryOnNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper returned a null value"));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }
}
