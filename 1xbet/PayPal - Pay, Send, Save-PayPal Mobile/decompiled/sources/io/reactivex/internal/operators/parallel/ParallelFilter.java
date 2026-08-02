package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelFilter<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.parallel.ParallelFlowable<T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoSizes;

    public ParallelFilter(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Predicate<? super T> predicate) {
        this.Camera2StreamConfigurationMap = parallelFlowable;
        this.getHighSpeedVideoSizes = predicate;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                org.reactivestreams.Subscriber<? super T> subscriber = subscriberArr[i];
                if (subscriber instanceof io.reactivex.internal.fuseable.ConditionalSubscriber) {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelFilter.ParallelFilterConditionalSubscriber((io.reactivex.internal.fuseable.ConditionalSubscriber) subscriber, this.getHighSpeedVideoSizes);
                } else {
                    subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelFilter.ParallelFilterSubscriber(subscriber, this.getHighSpeedVideoSizes);
                }
            }
            this.Camera2StreamConfigurationMap.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.Camera2StreamConfigurationMap.parallelism();
    }

    /* loaded from: classes17.dex */
    static abstract class BaseFilterSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        final io.reactivex.functions.Predicate<? super T> getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoSizes;

        BaseFilterSubscriber(io.reactivex.functions.Predicate<? super T> predicate) {
            this.getHighResolutionOutputSizeshNQ4ISI = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            this.Camera2StreamConfigurationMap.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.Camera2StreamConfigurationMap.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.getHighSpeedVideoSizes) {
                return;
            }
            this.Camera2StreamConfigurationMap.request(1L);
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelFilterSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;

        ParallelFilterSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            super(predicate);
            this.getHighSpeedVideoFpsRanges = subscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return false;
            }
            try {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.test(t)) {
                    return false;
                }
                this.getHighSpeedVideoFpsRanges.onNext(t);
                return true;
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
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelFilterConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber<T> {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> getHighSpeedVideoFpsRanges;

        ParallelFilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> conditionalSubscriber, io.reactivex.functions.Predicate<? super T> predicate) {
            super(predicate);
            this.getHighSpeedVideoFpsRanges = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return false;
            }
            try {
                if (this.getHighResolutionOutputSizeshNQ4ISI.test(t)) {
                    return this.getHighSpeedVideoFpsRanges.tryOnNext(t);
                }
                return false;
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
                this.getHighSpeedVideoFpsRanges.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
