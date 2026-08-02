package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelPeek<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.Consumer<? super T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Action getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Action getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Action getHighSpeedVideoSizes;
    final io.reactivex.functions.Consumer<? super T> getInputFormats;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> getInputSizeshNQ4ISI;
    final io.reactivex.functions.LongConsumer getOutputFormats;
    final io.reactivex.parallel.ParallelFlowable<T> getOutputMinFrameDuration;

    public ParallelPeek(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable, io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.Consumer<? super T> consumer2, io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer3, io.reactivex.functions.Action action, io.reactivex.functions.Action action2, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer4, io.reactivex.functions.LongConsumer longConsumer, io.reactivex.functions.Action action3) {
        this.getOutputMinFrameDuration = parallelFlowable;
        this.getInputFormats = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.Camera2StreamConfigurationMap = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.getHighSpeedVideoFpsRangesFor = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.getHighResolutionOutputSizeshNQ4ISI = (io.reactivex.functions.Action) io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "onComplete is null");
        this.getHighSpeedVideoFpsRanges = (io.reactivex.functions.Action) io.reactivex.internal.functions.ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.getInputSizeshNQ4ISI = (io.reactivex.functions.Consumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.getOutputFormats = (io.reactivex.functions.LongConsumer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.getHighSpeedVideoSizes = (io.reactivex.functions.Action) io.reactivex.internal.functions.ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            org.reactivestreams.Subscriber<? super T>[] subscriberArr2 = new org.reactivestreams.Subscriber[length];
            for (int i = 0; i < length; i++) {
                subscriberArr2[i] = new io.reactivex.internal.operators.parallel.ParallelPeek.ParallelPeekSubscriber(subscriberArr[i], this);
            }
            this.getOutputMinFrameDuration.subscribe(subscriberArr2);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public final int parallelism() {
        return this.getOutputMinFrameDuration.parallelism();
    }

    /* loaded from: classes17.dex */
    static final class ParallelPeekSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        org.reactivestreams.Subscription Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.parallel.ParallelPeek<T> getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;

        ParallelPeekSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.parallel.ParallelPeek<T> parallelPeek) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoFpsRanges = parallelPeek;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            try {
                this.getHighSpeedVideoFpsRanges.getOutputFormats.accept(j);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.Camera2StreamConfigurationMap.request(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            try {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes.run();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
            this.Camera2StreamConfigurationMap.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.Camera2StreamConfigurationMap, subscription)) {
                this.Camera2StreamConfigurationMap = subscription;
                try {
                    this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI.accept(subscription);
                    this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    subscription.cancel();
                    this.getHighSpeedVideoFpsRangesFor.onSubscribe(io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.getInputFormats.accept(t);
                this.getHighSpeedVideoFpsRangesFor.onNext(t);
                try {
                    this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap.accept(t);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            try {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor.accept(th);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                th = new io.reactivex.exceptions.CompositeException(th, th2);
            }
            this.getHighSpeedVideoFpsRangesFor.onError(th);
            try {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.run();
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            try {
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.run();
                this.getHighSpeedVideoFpsRangesFor.onComplete();
                try {
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.run();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoFpsRangesFor.onError(th2);
            }
        }
    }
}
