package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelReduceFull<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.BiFunction<T, T, T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.parallel.ParallelFlowable<? extends T> getHighSpeedVideoSizes;

    public ParallelReduceFull(io.reactivex.parallel.ParallelFlowable<? extends T> parallelFlowable, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        this.getHighSpeedVideoSizes = parallelFlowable;
        this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber parallelReduceFullMainSubscriber = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber(subscriber, this.getHighSpeedVideoSizes.parallelism(), this.getHighResolutionOutputSizeshNQ4ISI);
        subscriber.onSubscribe(parallelReduceFullMainSubscriber);
        this.getHighSpeedVideoSizes.subscribe(parallelReduceFullMainSubscriber.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* loaded from: classes17.dex */
    static final class ParallelReduceFullMainSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T>> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T>[] getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<T, T, T> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getHighSpeedVideoSizes;

        ParallelReduceFullMainSubscriber(org.reactivestreams.Subscriber<? super T> subscriber, int i, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger();
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>();
            io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T>[] parallelReduceFullInnerSubscriberArr = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber[i];
            for (int i2 = 0; i2 < i; i2++) {
                parallelReduceFullInnerSubscriberArr[i2] = new io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<>(this, biFunction);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = parallelReduceFullInnerSubscriberArr;
            this.getHighSpeedVideoFpsRanges = biFunction;
            this.getHighSpeedVideoFpsRangesFor.lazySet(i);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            for (io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(parallelReduceFullInnerSubscriber);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, null, th)) {
                cancel();
                this.actual.onError(th);
            } else if (th != this.getHighSpeedVideoSizes.get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            int i;
            if (t != null) {
                while (true) {
                    io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> slotPair = this.Camera2StreamConfigurationMap.get();
                    if (slotPair == null) {
                        slotPair = new io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<>();
                        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, slotPair)) {
                            continue;
                        }
                    }
                    while (true) {
                        i = slotPair.get();
                        if (i >= 2) {
                            i = -1;
                            break;
                        } else if (slotPair.compareAndSet(i, i + 1)) {
                            break;
                        }
                    }
                    if (i < 0) {
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, slotPair, null);
                    } else {
                        if (i == 0) {
                            slotPair.getHighResolutionOutputSizeshNQ4ISI = t;
                        } else {
                            slotPair.Camera2StreamConfigurationMap = t;
                        }
                        if (slotPair.getHighSpeedVideoFpsRanges.incrementAndGet() == 2) {
                            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, slotPair, null);
                        } else {
                            slotPair = null;
                        }
                        if (slotPair == null) {
                            break;
                        }
                        try {
                            t = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(slotPair.getHighResolutionOutputSizeshNQ4ISI, slotPair.Camera2StreamConfigurationMap), "The reducer returned a null value");
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            getHighResolutionOutputSizeshNQ4ISI(th);
                            return;
                        }
                    }
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                io.reactivex.internal.operators.parallel.ParallelReduceFull.SlotPair<T> slotPair2 = this.Camera2StreamConfigurationMap.get();
                this.Camera2StreamConfigurationMap.lazySet(null);
                if (slotPair2 != null) {
                    complete(slotPair2.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    this.actual.onComplete();
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ParallelReduceFullInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        final io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T> Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<T, T, T> getHighResolutionOutputSizeshNQ4ISI;
        T getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        ParallelReduceFullInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T> parallelReduceFullMainSubscriber, io.reactivex.functions.BiFunction<T, T, T> biFunction) {
            this.Camera2StreamConfigurationMap = parallelReduceFullMainSubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            T t2 = this.getHighSpeedVideoFpsRangesFor;
            if (t2 == null) {
                this.getHighSpeedVideoFpsRangesFor = t;
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor = (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t2, t), "The reducer returned a null value");
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI((io.reactivex.internal.operators.parallel.ParallelReduceFull.ParallelReduceFullMainSubscriber<T>) this.getHighSpeedVideoFpsRangesFor);
        }
    }

    /* loaded from: classes17.dex */
    static final class SlotPair<T> extends java.util.concurrent.atomic.AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T Camera2StreamConfigurationMap;
        T getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicInteger();

        SlotPair() {
        }
    }
}
