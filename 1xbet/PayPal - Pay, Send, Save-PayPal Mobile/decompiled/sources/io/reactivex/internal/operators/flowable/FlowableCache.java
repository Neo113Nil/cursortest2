package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableCache<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> getHighSpeedVideoFpsRangesFor;

    public FlowableCache(io.reactivex.Flowable<T> flowable, int i) {
        super(flowable);
        this.getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.flowable.FlowableCache.CacheState<>(flowable, i);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        boolean z;
        io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> replaySubscription = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<>(subscriber, this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(replaySubscription);
        io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> cacheState = this.getHighSpeedVideoFpsRangesFor;
        while (true) {
            io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T>[] replaySubscriptionArr = cacheState.getOutputFormats.get();
            if (replaySubscriptionArr == io.reactivex.internal.operators.flowable.FlowableCache.CacheState.getHighSpeedVideoFpsRangesFor) {
                break;
            }
            int length = replaySubscriptionArr.length;
            io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] replaySubscriptionArr2 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[length + 1];
            java.lang.System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(cacheState.getOutputFormats, replaySubscriptionArr, replaySubscriptionArr2)) {
                if (replaySubscription.getInputSizeshNQ4ISI.get() == Long.MIN_VALUE) {
                    this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(replaySubscription);
                    z = false;
                }
            }
        }
        z = true;
        if (!this.getHighResolutionOutputSizeshNQ4ISI.get() && this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> cacheState2 = this.getHighSpeedVideoFpsRangesFor;
            cacheState2.getHighSpeedVideoSizes.subscribe((io.reactivex.FlowableSubscriber) cacheState2);
            cacheState2.getHighResolutionOutputSizeshNQ4ISI = true;
        }
        if (z) {
            replaySubscription.Camera2StreamConfigurationMap();
        }
    }

    /* loaded from: classes17.dex */
    static final class CacheState<T> extends io.reactivex.internal.util.LinkedArrayList implements io.reactivex.FlowableSubscriber<T> {
        static final io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] Camera2StreamConfigurationMap = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[0];
        static final io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[0];
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> getHighSpeedVideoFpsRanges;
        final io.reactivex.Flowable<T> getHighSpeedVideoSizes;
        boolean getInputFormats;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T>[]> getOutputFormats;

        CacheState(io.reactivex.Flowable<T> flowable, int i) {
            super(i);
            this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoSizes = flowable;
            this.getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>(Camera2StreamConfigurationMap);
        }

        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> replaySubscription) {
            io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T>[] replaySubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] replaySubscriptionArr2;
            do {
                replaySubscriptionArr = this.getOutputFormats.get();
                int length = replaySubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replaySubscriptionArr[i].equals(replaySubscription)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    replaySubscriptionArr2 = Camera2StreamConfigurationMap;
                } else {
                    io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[] replaySubscriptionArr3 = new io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription[length - 1];
                    java.lang.System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i);
                    java.lang.System.arraycopy(replaySubscriptionArr, i + 1, replaySubscriptionArr3, i, (length - i) - 1);
                    replaySubscriptionArr2 = replaySubscriptionArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputFormats, replaySubscriptionArr, replaySubscriptionArr2));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this.getHighSpeedVideoFpsRanges, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.getInputFormats) {
                return;
            }
            add(io.reactivex.internal.util.NotificationLite.next(t));
            for (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> replaySubscription : this.getOutputFormats.get()) {
                replaySubscription.Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.getInputFormats) {
                this.getInputFormats = true;
                add(io.reactivex.internal.util.NotificationLite.error(th));
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
                for (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> replaySubscription : this.getOutputFormats.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                    replaySubscription.Camera2StreamConfigurationMap();
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getInputFormats) {
                return;
            }
            this.getInputFormats = true;
            add(io.reactivex.internal.util.NotificationLite.complete());
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this.getHighSpeedVideoFpsRanges);
            for (io.reactivex.internal.operators.flowable.FlowableCache.ReplaySubscription<T> replaySubscription : this.getOutputFormats.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                replaySubscription.Camera2StreamConfigurationMap();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        int Camera2StreamConfigurationMap;
        java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;
        final io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.internal.operators.flowable.FlowableCache.CacheState<T> cacheState) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getHighSpeedVideoSizesFor = cacheState;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.addCancel(this.getInputSizeshNQ4ISI, j);
                Camera2StreamConfigurationMap();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getInputSizeshNQ4ISI.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(this);
            }
        }

        public final void Camera2StreamConfigurationMap() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor;
            java.util.concurrent.atomic.AtomicLong atomicLong = this.getInputSizeshNQ4ISI;
            long j = this.getHighSpeedVideoSizes;
            int i = 1;
            int i2 = 1;
            while (true) {
                long j2 = atomicLong.get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                int size = this.getHighSpeedVideoSizesFor.size();
                if (size != 0) {
                    java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (objArr == null) {
                        objArr = this.getHighSpeedVideoSizesFor.head();
                        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
                    }
                    int length = objArr.length - i;
                    int i3 = this.getHighSpeedVideoFpsRanges;
                    int i4 = this.Camera2StreamConfigurationMap;
                    while (i3 < size && j != j2) {
                        if (atomicLong.get() == Long.MIN_VALUE) {
                            return;
                        }
                        if (i4 == length) {
                            objArr = (java.lang.Object[]) objArr[length];
                            i4 = 0;
                        }
                        if (io.reactivex.internal.util.NotificationLite.accept(objArr[i4], subscriber)) {
                            return;
                        }
                        i4++;
                        i3++;
                        j++;
                    }
                    if (atomicLong.get() == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == j) {
                        java.lang.Object obj = objArr[i4];
                        if (io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                            subscriber.onComplete();
                            return;
                        } else if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
                            subscriber.onError(io.reactivex.internal.util.NotificationLite.getError(obj));
                            return;
                        }
                    }
                    this.getHighSpeedVideoFpsRanges = i3;
                    this.Camera2StreamConfigurationMap = i4;
                    this.getHighResolutionOutputSizeshNQ4ISI = objArr;
                }
                this.getHighSpeedVideoSizes = j;
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                } else {
                    i = 1;
                }
            }
        }
    }
}
