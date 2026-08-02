package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableMergeWithSingle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoSizes;

    public FlowableMergeWithSingle(io.reactivex.Flowable<T> flowable, io.reactivex.SingleSource<? extends T> singleSource) {
        super(flowable);
        this.getHighSpeedVideoSizes = singleSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver mergeWithObserver = new io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver(subscriber);
        subscriber.onSubscribe(mergeWithObserver);
        this.source.subscribe((io.reactivex.FlowableSubscriber) mergeWithObserver);
        this.getHighSpeedVideoSizes.subscribe(mergeWithObserver.getInputSizeshNQ4ISI);
    }

    /* loaded from: classes17.dex */
    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4592979584110982903L;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        volatile boolean getHighSpeedVideoSizesFor;
        volatile int getOutputFormats;
        final int getOutputMinFrameDuration;
        final int getOutputMinFrameDurationlomOqCM;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> getOutputSizes;
        T getOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getInputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver.OtherObserver<T> getInputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver.OtherObserver<>(this);
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getOutputStallDuration = new java.util.concurrent.atomic.AtomicLong();

        MergeWithObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            int bufferSize = io.reactivex.Flowable.bufferSize();
            this.getOutputMinFrameDurationlomOqCM = bufferSize;
            this.getOutputMinFrameDuration = bufferSize - (bufferSize >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getInputFormats, subscription, this.getOutputMinFrameDurationlomOqCM);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.getHighSpeedVideoFpsRanges;
                if (this.getOutputStallDuration.get() != j) {
                    io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getOutputSizes;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.getHighSpeedVideoFpsRanges = j + 1;
                        this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                        int i = this.getHighSpeedVideoFpsRangesFor + 1;
                        if (i == this.getOutputMinFrameDuration) {
                            this.getHighSpeedVideoFpsRangesFor = 0;
                            this.getInputFormats.get().request(i);
                        } else {
                            this.getHighSpeedVideoFpsRangesFor = i;
                        }
                    } else {
                        simplePlainQueue.offer(t);
                    }
                } else {
                    io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue = this.getOutputSizes;
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new io.reactivex.internal.queue.SpscArrayQueue(io.reactivex.Flowable.bufferSize());
                        this.getOutputSizes = spscArrayQueue;
                    }
                    spscArrayQueue.offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscArrayQueue spscArrayQueue2 = this.getOutputSizes;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new io.reactivex.internal.queue.SpscArrayQueue(io.reactivex.Flowable.bufferSize());
                    this.getOutputSizes = spscArrayQueue2;
                }
                spscArrayQueue2.offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getInputFormats);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoSizes();
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.getHighSpeedVideoSizesFor = true;
            if (getAndIncrement() == 0) {
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputStallDuration, j);
            if (getAndIncrement() == 0) {
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getInputFormats);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            if (getAndIncrement() == 0) {
                this.getOutputSizes = null;
                this.getOutputSizeshNQ4ISI = null;
            }
        }

        final void getHighSpeedVideoSizes() {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.getOutputMinFrameDuration;
            int i3 = 1;
            int i4 = 1;
            while (true) {
                long j2 = this.getOutputStallDuration.get();
                while (j != j2) {
                    if (this.getHighSpeedVideoSizes) {
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputSizes = null;
                        return;
                    }
                    if (this.Camera2StreamConfigurationMap.get() != null) {
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputSizes = null;
                        subscriber.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    }
                    int i5 = this.getOutputFormats;
                    if (i5 == i3) {
                        T t = this.getOutputSizeshNQ4ISI;
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputFormats = 2;
                        subscriber.onNext(t);
                        j++;
                    } else {
                        boolean z = this.getHighSpeedVideoSizesFor;
                        io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getOutputSizes;
                        amex.AMEXKernel poll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z2 = poll == null;
                        if (!z || !z2 || i5 != 2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j++;
                            i++;
                            if (i == i2) {
                                this.getInputFormats.get().request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        } else {
                            this.getOutputSizes = null;
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j == j2) {
                    if (this.getHighSpeedVideoSizes) {
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputSizes = null;
                        return;
                    }
                    if (this.Camera2StreamConfigurationMap.get() != null) {
                        this.getOutputSizeshNQ4ISI = null;
                        this.getOutputSizes = null;
                        subscriber.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    }
                    boolean z3 = this.getHighSpeedVideoSizesFor;
                    io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue2 = this.getOutputSizes;
                    boolean z4 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z3 && z4 && this.getOutputFormats == 2) {
                        this.getOutputSizes = null;
                        subscriber.onComplete();
                        return;
                    }
                }
                this.getHighSpeedVideoFpsRanges = j;
                this.getHighSpeedVideoFpsRangesFor = i;
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver<T> getHighSpeedVideoFpsRangesFor;

            OtherObserver(io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver<T> mergeWithObserver) {
                this.getHighSpeedVideoFpsRangesFor = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t) {
                io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoFpsRangesFor;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j = mergeWithObserver.getHighSpeedVideoFpsRanges;
                    if (mergeWithObserver.getOutputStallDuration.get() != j) {
                        mergeWithObserver.getHighSpeedVideoFpsRanges = j + 1;
                        mergeWithObserver.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                        mergeWithObserver.getOutputFormats = 2;
                    } else {
                        mergeWithObserver.getOutputSizeshNQ4ISI = t;
                        mergeWithObserver.getOutputFormats = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.getOutputSizeshNQ4ISI = t;
                    mergeWithObserver.getOutputFormats = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.getHighSpeedVideoSizes();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableMergeWithSingle.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoFpsRangesFor;
                if (mergeWithObserver.Camera2StreamConfigurationMap.addThrowable(th)) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(mergeWithObserver.getInputFormats);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.getHighSpeedVideoSizes();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
