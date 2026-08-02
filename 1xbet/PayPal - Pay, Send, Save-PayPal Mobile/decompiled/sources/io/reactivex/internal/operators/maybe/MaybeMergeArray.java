package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeMergeArray<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.MaybeSource<? extends T>[] getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface SimpleQueueWithConsumerIndex<T> extends io.reactivex.internal.fuseable.SimpleQueue<T> {
        void Camera2StreamConfigurationMap();

        int getHighSpeedVideoFpsRanges();

        int getHighSpeedVideoSizes();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        T poll();
    }

    public MaybeMergeArray(io.reactivex.MaybeSource<? extends T>[] maybeSourceArr) {
        this.getHighSpeedVideoSizes = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex clqSimpleQueue;
        io.reactivex.MaybeSource[] maybeSourceArr = this.getHighSpeedVideoSizes;
        int length = maybeSourceArr.length;
        if (length <= bufferSize()) {
            clqSimpleQueue = new io.reactivex.internal.operators.maybe.MaybeMergeArray.MpscFillOnceSimpleQueue(length);
        } else {
            clqSimpleQueue = new io.reactivex.internal.operators.maybe.MaybeMergeArray.ClqSimpleQueue();
        }
        io.reactivex.internal.operators.maybe.MaybeMergeArray.MergeMaybeObserver mergeMaybeObserver = new io.reactivex.internal.operators.maybe.MaybeMergeArray.MergeMaybeObserver(subscriber, length, clqSimpleQueue);
        subscriber.onSubscribe(mergeMaybeObserver);
        io.reactivex.internal.util.AtomicThrowable atomicThrowable = mergeMaybeObserver.Camera2StreamConfigurationMap;
        for (io.reactivex.MaybeSource maybeSource : maybeSourceArr) {
            if (mergeMaybeObserver.getHighSpeedVideoSizes || atomicThrowable.get() != null) {
                return;
            }
            maybeSource.subscribe(mergeMaybeObserver);
        }
    }

    /* loaded from: classes17.dex */
    static final class MergeMaybeObserver<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -660395290758764731L;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<java.lang.Object> getHighSpeedVideoSizesFor;
        final int getOutputFormats;
        final io.reactivex.disposables.CompositeDisposable getOutputMinFrameDuration = new io.reactivex.disposables.CompositeDisposable();
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();

        MergeMaybeObserver(org.reactivestreams.Subscriber<? super T> subscriber, int i, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<java.lang.Object> simpleQueueWithConsumerIndex) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getOutputFormats = i;
            this.getHighSpeedVideoSizesFor = simpleQueueWithConsumerIndex;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            T t;
            do {
                t = (T) this.getHighSpeedVideoSizesFor.poll();
            } while (t == io.reactivex.internal.util.NotificationLite.COMPLETE);
            return t;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoSizesFor.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoSizesFor.clear();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputMinFrameDuration.dispose();
            if (getAndIncrement() == 0) {
                this.getHighSpeedVideoSizesFor.clear();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getOutputMinFrameDuration.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizesFor.offer(t);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                this.getOutputMinFrameDuration.dispose();
                this.getHighSpeedVideoSizesFor.offer(io.reactivex.internal.util.NotificationLite.COMPLETE);
                getHighResolutionOutputSizeshNQ4ISI();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizesFor.offer(io.reactivex.internal.util.NotificationLite.COMPLETE);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRanges;
                io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<java.lang.Object> simpleQueueWithConsumerIndex = this.getHighSpeedVideoSizesFor;
                int i2 = 1;
                while (!this.getHighSpeedVideoSizes) {
                    java.lang.Throwable th = this.Camera2StreamConfigurationMap.get();
                    if (th != null) {
                        simpleQueueWithConsumerIndex.clear();
                        subscriber.onError(th);
                        return;
                    }
                    boolean z = simpleQueueWithConsumerIndex.getHighSpeedVideoSizes() == this.getOutputFormats;
                    if (!simpleQueueWithConsumerIndex.isEmpty()) {
                        subscriber.onNext(null);
                    }
                    if (z) {
                        subscriber.onComplete();
                        return;
                    } else {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                simpleQueueWithConsumerIndex.clear();
                return;
            }
            org.reactivestreams.Subscriber<? super T> subscriber2 = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<java.lang.Object> simpleQueueWithConsumerIndex2 = this.getHighSpeedVideoSizesFor;
            long j = this.getHighSpeedVideoFpsRangesFor;
            do {
                long j2 = this.getInputSizeshNQ4ISI.get();
                while (j != j2) {
                    if (this.getHighSpeedVideoSizes) {
                        simpleQueueWithConsumerIndex2.clear();
                        return;
                    }
                    if (this.Camera2StreamConfigurationMap.get() != null) {
                        simpleQueueWithConsumerIndex2.clear();
                        subscriber2.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    } else {
                        if (simpleQueueWithConsumerIndex2.getHighSpeedVideoFpsRanges() == this.getOutputFormats) {
                            subscriber2.onComplete();
                            return;
                        }
                        java.lang.Object poll = simpleQueueWithConsumerIndex2.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != io.reactivex.internal.util.NotificationLite.COMPLETE) {
                            subscriber2.onNext(poll);
                            j++;
                        }
                    }
                }
                if (j == j2) {
                    if (this.Camera2StreamConfigurationMap.get() != null) {
                        simpleQueueWithConsumerIndex2.clear();
                        subscriber2.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    } else {
                        while (simpleQueueWithConsumerIndex2.peek() == io.reactivex.internal.util.NotificationLite.COMPLETE) {
                            simpleQueueWithConsumerIndex2.Camera2StreamConfigurationMap();
                        }
                        if (simpleQueueWithConsumerIndex2.getHighSpeedVideoFpsRanges() == this.getOutputFormats) {
                            subscriber2.onComplete();
                            return;
                        }
                    }
                }
                this.getHighSpeedVideoFpsRangesFor = j;
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    /* loaded from: classes17.dex */
    static final class MpscFillOnceSimpleQueue<T> extends java.util.concurrent.atomic.AtomicReferenceArray<T> implements io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        int getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;

        MpscFillOnceSimpleQueue(int i) {
            super(i);
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t) {
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "value is null");
            int andIncrement = this.getHighSpeedVideoSizes.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t, T t2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == length()) {
                return null;
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = this.getHighSpeedVideoSizes;
            do {
                T t = get(i);
                if (t != null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                    lazySet(i, null);
                    return t;
                }
            } while (atomicInteger.get() != i);
            return null;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final T peek() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == length()) {
                return null;
            }
            return get(i);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final void Camera2StreamConfigurationMap() {
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            lazySet(i, null);
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoSizes.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final int getHighSpeedVideoFpsRanges() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final int getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes.get();
        }
    }

    /* loaded from: classes17.dex */
    static final class ClqSimpleQueue<T> extends java.util.concurrent.ConcurrentLinkedQueue<T> implements io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();
        int getHighResolutionOutputSizeshNQ4ISI;

        ClqSimpleQueue() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t, T t2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t) {
            this.Camera2StreamConfigurationMap.getAndIncrement();
            return super.offer(t);
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex, io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            T t = (T) super.poll();
            if (t != null) {
                this.getHighResolutionOutputSizeshNQ4ISI++;
            }
            return t;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final int getHighSpeedVideoFpsRanges() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final int getHighSpeedVideoSizes() {
            return this.Camera2StreamConfigurationMap.get();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.SimpleQueueWithConsumerIndex
        public final void Camera2StreamConfigurationMap() {
            poll();
        }
    }
}
