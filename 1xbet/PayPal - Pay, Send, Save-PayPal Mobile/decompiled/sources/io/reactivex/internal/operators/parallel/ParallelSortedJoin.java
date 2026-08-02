package io.reactivex.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class ParallelSortedJoin<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.parallel.ParallelFlowable<java.util.List<T>> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.Comparator<? super T> getHighSpeedVideoFpsRangesFor;

    public ParallelSortedJoin(io.reactivex.parallel.ParallelFlowable<java.util.List<T>> parallelFlowable, java.util.Comparator<? super T> comparator) {
        this.getHighResolutionOutputSizeshNQ4ISI = parallelFlowable;
        this.getHighSpeedVideoFpsRangesFor = comparator;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription sortedJoinSubscription = new io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription(subscriber, this.getHighResolutionOutputSizeshNQ4ISI.parallelism(), this.getHighSpeedVideoFpsRangesFor);
        subscriber.onSubscribe(sortedJoinSubscription);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(sortedJoinSubscription.getHighSpeedVideoSizesFor);
    }

    /* loaded from: classes17.dex */
    static final class SortedJoinSubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3481980673745556697L;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final int[] getHighSpeedVideoFpsRanges;
        final java.util.Comparator<? super T> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T>[] getHighSpeedVideoSizesFor;
        final java.util.List<T>[] getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicInteger getInputFormats = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();

        SortedJoinSubscription(org.reactivestreams.Subscriber<? super T> subscriber, int i, java.util.Comparator<? super T> comparator) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getHighSpeedVideoFpsRangesFor = comparator;
            io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T>[] sortedJoinInnerSubscriberArr = new io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber[i];
            for (int i2 = 0; i2 < i; i2++) {
                sortedJoinInnerSubscriberArr[i2] = new io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<>(this, i2);
            }
            this.getHighSpeedVideoSizesFor = sortedJoinInnerSubscriberArr;
            this.getOutputMinFrameDuration = new java.util.List[i];
            this.getHighSpeedVideoFpsRanges = new int[i];
            this.getInputFormats.lazySet(i);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
                if (this.getInputFormats.get() == 0) {
                    getHighSpeedVideoSizes();
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            for (io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.getHighSpeedVideoSizesFor) {
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(sortedJoinInnerSubscriber);
            }
            if (getAndIncrement() == 0) {
                java.util.Arrays.fill(this.getOutputMinFrameDuration, (java.lang.Object) null);
            }
        }

        final void getHighSpeedVideoSizes() {
            T t;
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List<T>[] listArr = this.getOutputMinFrameDuration;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int length = iArr.length;
            int i = 1;
            while (true) {
                long j = this.getInputSizeshNQ4ISI.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.getHighSpeedVideoSizes) {
                        java.util.Arrays.fill(listArr, (java.lang.Object) null);
                        return;
                    }
                    java.lang.Throwable th = this.Camera2StreamConfigurationMap.get();
                    if (th != null) {
                        for (io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber : this.getHighSpeedVideoSizesFor) {
                            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(sortedJoinInnerSubscriber);
                        }
                        java.util.Arrays.fill(listArr, (java.lang.Object) null);
                        subscriber.onError(th);
                        return;
                    }
                    int i2 = -1;
                    amex.AMEXKernel aMEXKernel = null;
                    for (int i3 = 0; i3 < length; i3++) {
                        java.util.List<T> list = listArr[i3];
                        int i4 = iArr[i3];
                        if (list.size() != i4) {
                            if (aMEXKernel == null) {
                                t = list.get(i4);
                            } else {
                                t = list.get(i4);
                                try {
                                    if (this.getHighSpeedVideoFpsRangesFor.compare(aMEXKernel, t) <= 0) {
                                    }
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    for (io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber2 : this.getHighSpeedVideoSizesFor) {
                                        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(sortedJoinInnerSubscriber2);
                                    }
                                    java.util.Arrays.fill(listArr, (java.lang.Object) null);
                                    if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, th2)) {
                                        io.reactivex.plugins.RxJavaPlugins.onError(th2);
                                    }
                                    subscriber.onError(this.Camera2StreamConfigurationMap.get());
                                    return;
                                }
                            }
                            aMEXKernel = (java.lang.Object) t;
                            i2 = i3;
                        }
                    }
                    if (aMEXKernel == null) {
                        java.util.Arrays.fill(listArr, (java.lang.Object) null);
                        subscriber.onComplete();
                        return;
                    } else {
                        subscriber.onNext(aMEXKernel);
                        iArr[i2] = iArr[i2] + 1;
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (this.getHighSpeedVideoSizes) {
                        java.util.Arrays.fill(listArr, (java.lang.Object) null);
                        return;
                    }
                    java.lang.Throwable th3 = this.Camera2StreamConfigurationMap.get();
                    if (th3 == null) {
                        for (int i5 = 0; i5 < length; i5++) {
                            if (iArr[i5] == listArr[i5].size()) {
                            }
                        }
                        java.util.Arrays.fill(listArr, (java.lang.Object) null);
                        subscriber.onComplete();
                        return;
                    }
                    for (io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinInnerSubscriber<T> sortedJoinInnerSubscriber3 : this.getHighSpeedVideoSizesFor) {
                        io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(sortedJoinInnerSubscriber3);
                    }
                    java.util.Arrays.fill(listArr, (java.lang.Object) null);
                    subscriber.onError(th3);
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.getInputSizeshNQ4ISI.addAndGet(-j2);
                }
                int i6 = get();
                if (i6 == i && (i6 = addAndGet(-i)) == 0) {
                    return;
                } else {
                    i = i6;
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SortedJoinInnerSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.util.List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription<T> getHighSpeedVideoFpsRangesFor;

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public final /* synthetic */ void onNext(java.lang.Object obj) {
            io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription<T> sortedJoinSubscription = this.getHighSpeedVideoFpsRangesFor;
            int i = this.getHighSpeedVideoFpsRanges;
            sortedJoinSubscription.getOutputMinFrameDuration[i] = (java.util.List) obj;
            if (sortedJoinSubscription.getInputFormats.decrementAndGet() == 0) {
                sortedJoinSubscription.getHighSpeedVideoSizes();
            }
        }

        SortedJoinInnerSubscriber(io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription<T> sortedJoinSubscription, int i) {
            this.getHighSpeedVideoFpsRangesFor = sortedJoinSubscription;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.parallel.ParallelSortedJoin.SortedJoinSubscription<T> sortedJoinSubscription = this.getHighSpeedVideoFpsRangesFor;
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(sortedJoinSubscription.Camera2StreamConfigurationMap, null, th)) {
                sortedJoinSubscription.getHighSpeedVideoSizes();
            } else if (th != sortedJoinSubscription.Camera2StreamConfigurationMap.get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
