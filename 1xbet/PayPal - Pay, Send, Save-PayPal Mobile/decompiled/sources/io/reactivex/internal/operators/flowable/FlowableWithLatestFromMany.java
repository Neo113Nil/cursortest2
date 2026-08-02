package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableWithLatestFromMany<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super java.lang.Object[], R> Camera2StreamConfigurationMap;
    final java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<?>[] getHighSpeedVideoSizes;

    public FlowableWithLatestFromMany(io.reactivex.Flowable<T> flowable, org.reactivestreams.Publisher<?>[] publisherArr, io.reactivex.functions.Function<? super java.lang.Object[], R> function) {
        super(flowable);
        this.getHighSpeedVideoSizes = publisherArr;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = function;
    }

    public FlowableWithLatestFromMany(io.reactivex.Flowable<T> flowable, java.lang.Iterable<? extends org.reactivestreams.Publisher<?>> iterable, io.reactivex.functions.Function<? super java.lang.Object[], R> function) {
        super(flowable);
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        int length;
        org.reactivestreams.Publisher<?>[] publisherArr = this.getHighSpeedVideoSizes;
        if (publisherArr == null) {
            publisherArr = new org.reactivestreams.Publisher[8];
            try {
                length = 0;
                for (org.reactivestreams.Publisher<?> publisher : this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (length == publisherArr.length) {
                        publisherArr = (org.reactivestreams.Publisher[]) java.util.Arrays.copyOf(publisherArr, (length >> 1) + length);
                    }
                    publisherArr[length] = publisher;
                    length++;
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                return;
            }
        } else {
            length = publisherArr.length;
        }
        if (length == 0) {
            new io.reactivex.internal.operators.flowable.FlowableMap(this.source, new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.SingletonArrayFunc()).subscribeActual(subscriber);
            return;
        }
        io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber withLatestFromSubscriber = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber(subscriber, this.Camera2StreamConfigurationMap, length);
        subscriber.onSubscribe(withLatestFromSubscriber);
        io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = withLatestFromSubscriber.getOutputFormats;
        java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> atomicReference = withLatestFromSubscriber.getOutputMinFrameDuration;
        for (int i = 0; i < length && !io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(atomicReference.get()); i++) {
            publisherArr[i].subscribe(withLatestInnerSubscriberArr[i]);
        }
        this.source.subscribe((io.reactivex.FlowableSubscriber) withLatestFromSubscriber);
    }

    /* loaded from: classes17.dex */
    static final class WithLatestFromSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 1577321883966341961L;
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super R> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super java.lang.Object[], R> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> getInputSizeshNQ4ISI;
        final io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] getOutputFormats;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputMinFrameDuration;

        WithLatestFromSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.Function<? super java.lang.Object[], R> function, int i) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getHighSpeedVideoFpsRangesFor = function;
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[i];
            for (int i2 = 0; i2 < i; i2++) {
                withLatestInnerSubscriberArr[i2] = new io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber(this, i2);
            }
            this.getOutputFormats = withLatestInnerSubscriberArr;
            this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
            this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicLong();
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (tryOnNext(t) || this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getOutputMinFrameDuration.get().request(1L);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return false;
            }
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.getInputSizeshNQ4ISI;
            int length = atomicReferenceArray.length();
            java.lang.Object[] objArr = new java.lang.Object[length + 1];
            objArr[0] = t;
            int i = 0;
            while (i < length) {
                java.lang.Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return false;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                io.reactivex.internal.util.HalfSerializer.onNext(this.getHighSpeedVideoFpsRanges, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(objArr), "The combiner returned a null value"), this, this.Camera2StreamConfigurationMap);
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
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.getOutputFormats;
            for (int i = 0; i < withLatestInnerSubscriberArr.length; i++) {
                if (i != -1) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestInnerSubscriberArr[i]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onError(this.getHighSpeedVideoFpsRanges, th, this, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.getOutputFormats;
            for (int i = 0; i < withLatestInnerSubscriberArr.length; i++) {
                if (i != -1) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestInnerSubscriberArr[i]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onComplete(this.getHighSpeedVideoFpsRanges, this, this.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputMinFrameDuration);
            for (io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber withLatestInnerSubscriber : this.getOutputFormats) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestInnerSubscriber);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WithLatestInnerSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> getHighSpeedVideoSizes;

        WithLatestInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> withLatestFromSubscriber, int i) {
            this.getHighSpeedVideoSizes = withLatestFromSubscriber;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(java.lang.Object obj) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> withLatestFromSubscriber = this.getHighSpeedVideoSizes;
            withLatestFromSubscriber.getInputSizeshNQ4ISI.set(this.getHighSpeedVideoFpsRanges, obj);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> withLatestFromSubscriber = this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoFpsRanges;
            withLatestFromSubscriber.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestFromSubscriber.getOutputMinFrameDuration);
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = withLatestFromSubscriber.getOutputFormats;
            for (int i2 = 0; i2 < withLatestInnerSubscriberArr.length; i2++) {
                if (i2 != i) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestInnerSubscriberArr[i2]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onError(withLatestFromSubscriber.getHighSpeedVideoFpsRanges, th, withLatestFromSubscriber, withLatestFromSubscriber.Camera2StreamConfigurationMap);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestFromSubscriber<?, ?> withLatestFromSubscriber = this.getHighSpeedVideoSizes;
            int i = this.getHighSpeedVideoFpsRanges;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            withLatestFromSubscriber.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestFromSubscriber.getOutputMinFrameDuration);
            io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = withLatestFromSubscriber.getOutputFormats;
            for (int i2 = 0; i2 < withLatestInnerSubscriberArr.length; i2++) {
                if (i2 != i) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(withLatestInnerSubscriberArr[i2]);
                }
            }
            io.reactivex.internal.util.HalfSerializer.onComplete(withLatestFromSubscriber.getHighSpeedVideoFpsRanges, withLatestFromSubscriber, withLatestFromSubscriber.Camera2StreamConfigurationMap);
        }
    }

    /* loaded from: classes17.dex */
    final class SingletonArrayFunc implements io.reactivex.functions.Function<T, R> {
        SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public final R apply(T t) throws java.lang.Exception {
            return (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany.this.Camera2StreamConfigurationMap.apply(new java.lang.Object[]{t}), "The combiner returned a null value");
        }
    }
}
