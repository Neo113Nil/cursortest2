package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableMergeWithMaybe<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;

    public FlowableMergeWithMaybe(io.reactivex.Flowable<T> flowable, io.reactivex.MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver mergeWithObserver = new io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver(subscriber);
        subscriber.onSubscribe(mergeWithObserver);
        this.source.subscribe((io.reactivex.FlowableSubscriber) mergeWithObserver);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(mergeWithObserver.getInputSizeshNQ4ISI);
    }

    /* loaded from: classes17.dex */
    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4592979584110982903L;
        int Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        volatile boolean getHighSpeedVideoSizesFor;
        volatile int getInputFormats;
        final int getOutputMinFrameDuration;
        final int getOutputMinFrameDurationlomOqCM;
        volatile io.reactivex.internal.fuseable.SimplePlainQueue<T> getOutputSizes;
        T getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver.OtherObserver<T> getInputSizeshNQ4ISI = new io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver.OtherObserver<>(this);
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRanges = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicLong getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();

        MergeWithObserver(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            int bufferSize = io.reactivex.Flowable.bufferSize();
            this.getOutputMinFrameDurationlomOqCM = bufferSize;
            this.getOutputMinFrameDuration = bufferSize - (bufferSize >> 2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getOutputFormats, subscription, this.getOutputMinFrameDurationlomOqCM);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.getHighResolutionOutputSizeshNQ4ISI;
                if (this.getOutputSizeshNQ4ISI.get() != j) {
                    io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getOutputSizes;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.getHighResolutionOutputSizeshNQ4ISI = j + 1;
                        this.getHighSpeedVideoFpsRangesFor.onNext(t);
                        int i = this.Camera2StreamConfigurationMap + 1;
                        if (i == this.getOutputMinFrameDuration) {
                            this.Camera2StreamConfigurationMap = 0;
                            this.getOutputFormats.get().request(i);
                        } else {
                            this.Camera2StreamConfigurationMap = i;
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
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.addThrowable(th)) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputFormats);
                if (getAndIncrement() == 0) {
                    getHighSpeedVideoFpsRangesFor();
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
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            io.reactivex.internal.util.BackpressureHelper.add(this.getOutputSizeshNQ4ISI, j);
            if (getAndIncrement() == 0) {
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getOutputFormats);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getInputSizeshNQ4ISI);
            if (getAndIncrement() == 0) {
                this.getOutputSizes = null;
                this.getOutputStallDurationlomOqCM = null;
            }
        }

        final void getHighSpeedVideoFpsRangesFor() {
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.Camera2StreamConfigurationMap;
            int i2 = this.getOutputMinFrameDuration;
            int i3 = 1;
            int i4 = 1;
            while (true) {
                long j2 = this.getOutputSizeshNQ4ISI.get();
                while (j != j2) {
                    if (this.getHighSpeedVideoSizes) {
                        this.getOutputStallDurationlomOqCM = null;
                        this.getOutputSizes = null;
                        return;
                    }
                    if (this.getHighSpeedVideoFpsRanges.get() != null) {
                        this.getOutputStallDurationlomOqCM = null;
                        this.getOutputSizes = null;
                        subscriber.onError(this.getHighSpeedVideoFpsRanges.terminate());
                        return;
                    }
                    int i5 = this.getInputFormats;
                    if (i5 == i3) {
                        T t = this.getOutputStallDurationlomOqCM;
                        this.getOutputStallDurationlomOqCM = null;
                        this.getInputFormats = 2;
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
                                this.getOutputFormats.get().request(i2);
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
                        this.getOutputStallDurationlomOqCM = null;
                        this.getOutputSizes = null;
                        return;
                    }
                    if (this.getHighSpeedVideoFpsRanges.get() != null) {
                        this.getOutputStallDurationlomOqCM = null;
                        this.getOutputSizes = null;
                        subscriber.onError(this.getHighSpeedVideoFpsRanges.terminate());
                        return;
                    }
                    boolean z3 = this.getHighSpeedVideoSizesFor;
                    io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue2 = this.getOutputSizes;
                    boolean z4 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z3 && z4 && this.getInputFormats == 2) {
                        this.getOutputSizes = null;
                        subscriber.onComplete();
                        return;
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI = j;
                this.Camera2StreamConfigurationMap = i;
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        static final class OtherObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> getHighSpeedVideoSizes;

            OtherObserver(io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver) {
                this.getHighSpeedVideoSizes = mergeWithObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t) {
                io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoSizes;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    long j = mergeWithObserver.getHighResolutionOutputSizeshNQ4ISI;
                    if (mergeWithObserver.getOutputSizeshNQ4ISI.get() != j) {
                        mergeWithObserver.getHighResolutionOutputSizeshNQ4ISI = j + 1;
                        mergeWithObserver.getHighSpeedVideoFpsRangesFor.onNext(t);
                        mergeWithObserver.getInputFormats = 2;
                    } else {
                        mergeWithObserver.getOutputStallDurationlomOqCM = t;
                        mergeWithObserver.getInputFormats = 1;
                        if (mergeWithObserver.decrementAndGet() == 0) {
                            return;
                        }
                    }
                } else {
                    mergeWithObserver.getOutputStallDurationlomOqCM = t;
                    mergeWithObserver.getInputFormats = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.getHighSpeedVideoFpsRangesFor();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoSizes;
                if (mergeWithObserver.getHighSpeedVideoFpsRanges.addThrowable(th)) {
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(mergeWithObserver.getOutputFormats);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.getHighSpeedVideoFpsRangesFor();
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe.MergeWithObserver<T> mergeWithObserver = this.getHighSpeedVideoSizes;
                mergeWithObserver.getInputFormats = 2;
                if (mergeWithObserver.getAndIncrement() == 0) {
                    mergeWithObserver.getHighSpeedVideoFpsRangesFor();
                }
            }
        }
    }
}
