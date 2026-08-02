package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableScanSeed<T, R> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final java.util.concurrent.Callable<R> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<R, ? super T, R> getHighSpeedVideoFpsRangesFor;

    public FlowableScanSeed(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = biFunction;
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
        try {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableScanSeed.ScanSeedSubscriber(subscriber, this.getHighSpeedVideoFpsRangesFor, io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The seed supplied is null"), bufferSize()));
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class ScanSeedSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -1776795561228106469L;
        final org.reactivestreams.Subscriber<? super R> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiFunction<R, ? super T, R> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor;
        java.lang.Throwable getInputFormats;
        final int getInputSizeshNQ4ISI;
        final int getOutputFormats;
        final io.reactivex.internal.fuseable.SimplePlainQueue<R> getOutputMinFrameDuration;
        R getOutputMinFrameDurationlomOqCM;
        org.reactivestreams.Subscription getOutputSizes;

        ScanSeedSubscriber(org.reactivestreams.Subscriber<? super R> subscriber, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction, R r, int i) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getHighSpeedVideoFpsRanges = biFunction;
            this.getOutputMinFrameDurationlomOqCM = r;
            this.getInputSizeshNQ4ISI = i;
            this.getOutputFormats = i - (i >> 2);
            io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(i);
            this.getOutputMinFrameDuration = spscArrayQueue;
            spscArrayQueue.offer(r);
            this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputSizes, subscription)) {
                this.getOutputSizes = subscription;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
                subscription.request(this.getInputSizeshNQ4ISI - 1);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            try {
                R r = (R) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(this.getOutputMinFrameDurationlomOqCM, t), "The accumulator returned a null value");
                this.getOutputMinFrameDurationlomOqCM = r;
                this.getOutputMinFrameDuration.offer(r);
                Camera2StreamConfigurationMap();
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputSizes.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getInputFormats = th;
            this.getHighSpeedVideoSizes = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            Camera2StreamConfigurationMap();
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getOutputSizes.cancel();
            if (getAndIncrement() == 0) {
                this.getOutputMinFrameDuration.clear();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighSpeedVideoSizesFor, j);
                Camera2StreamConfigurationMap();
            }
        }

        private void Camera2StreamConfigurationMap() {
            java.lang.Throwable th;
            if (getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super R> subscriber = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.fuseable.SimplePlainQueue<R> simplePlainQueue = this.getOutputMinFrameDuration;
                int i = this.getOutputFormats;
                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = 1;
                do {
                    long j = this.getHighSpeedVideoSizesFor.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.getHighSpeedVideoFpsRangesFor) {
                            simplePlainQueue.clear();
                            return;
                        }
                        boolean z = this.getHighSpeedVideoSizes;
                        if (z && (th = this.getInputFormats) != null) {
                            simplePlainQueue.clear();
                            subscriber.onError(th);
                            return;
                        }
                        R poll = simplePlainQueue.poll();
                        boolean z2 = poll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                            i2++;
                            if (i2 == i) {
                                this.getOutputSizes.request(i);
                                i2 = 0;
                            }
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (j2 == j && this.getHighSpeedVideoSizes) {
                        java.lang.Throwable th2 = this.getInputFormats;
                        if (th2 != null) {
                            simplePlainQueue.clear();
                            subscriber.onError(th2);
                            return;
                        } else if (simplePlainQueue.isEmpty()) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (j2 != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(this.getHighSpeedVideoSizesFor, j2);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = i2;
                    i3 = addAndGet(-i3);
                } while (i3 != 0);
            }
        }
    }
}
