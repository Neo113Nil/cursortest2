package io.reactivex.processors;

/* loaded from: classes17.dex */
public final class BehaviorProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    long getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.locks.Lock getHighSpeedVideoSizesFor;
    final java.util.concurrent.locks.ReadWriteLock getInputFormats;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getInputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getOutputFormats;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[]> getOutputMinFrameDuration;
    final java.util.concurrent.locks.Lock getOutputMinFrameDurationlomOqCM;
    static final java.lang.Object[] getHighSpeedVideoSizes = new java.lang.Object[0];
    static final io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] Camera2StreamConfigurationMap = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[0];
    static final io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.BehaviorProcessor<T> create() {
        return new io.reactivex.processors.BehaviorProcessor<>();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.BehaviorProcessor<T> createDefault(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "defaultValue is null");
        return new io.reactivex.processors.BehaviorProcessor<>(t);
    }

    BehaviorProcessor() {
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.getInputFormats = reentrantReadWriteLock;
        this.getHighSpeedVideoSizesFor = reentrantReadWriteLock.readLock();
        this.getOutputMinFrameDurationlomOqCM = reentrantReadWriteLock.writeLock();
        this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>(Camera2StreamConfigurationMap);
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
    }

    private BehaviorProcessor(T t) {
        this();
        this.getInputSizeshNQ4ISI.lazySet(io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "defaultValue is null"));
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr;
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] behaviorSubscriptionArr2;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<>(subscriber, this);
        subscriber.onSubscribe(behaviorSubscription);
        do {
            behaviorSubscriptionArr = this.getOutputMinFrameDuration.get();
            if (behaviorSubscriptionArr == getHighResolutionOutputSizeshNQ4ISI) {
                java.lang.Throwable th = this.getOutputFormats.get();
                if (th == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    subscriber.onComplete();
                    return;
                } else {
                    subscriber.onError(th);
                    return;
                }
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[length + 1];
            java.lang.System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        if (behaviorSubscription.getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI((io.reactivex.processors.BehaviorProcessor.BehaviorSubscription) behaviorSubscription);
            return;
        }
        if (behaviorSubscription.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (behaviorSubscription) {
            if (behaviorSubscription.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (behaviorSubscription.getHighSpeedVideoSizesFor) {
                return;
            }
            io.reactivex.processors.BehaviorProcessor<T> behaviorProcessor = behaviorSubscription.getOutputMinFrameDuration;
            java.util.concurrent.locks.Lock lock = behaviorProcessor.getHighSpeedVideoSizesFor;
            lock.lock();
            behaviorSubscription.getHighSpeedVideoSizes = behaviorProcessor.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj = behaviorProcessor.getInputSizeshNQ4ISI.get();
            lock.unlock();
            behaviorSubscription.getHighSpeedVideoFpsRangesFor = obj != null;
            behaviorSubscription.getHighSpeedVideoSizesFor = true;
            if (obj == null || behaviorSubscription.test(obj)) {
                return;
            }
            while (!behaviorSubscription.getHighSpeedVideoFpsRanges) {
                synchronized (behaviorSubscription) {
                    appendOnlyLinkedArrayList = behaviorSubscription.getInputSizeshNQ4ISI;
                    if (appendOnlyLinkedArrayList == null) {
                        behaviorSubscription.getHighSpeedVideoFpsRangesFor = false;
                        return;
                    }
                    behaviorSubscription.getInputSizeshNQ4ISI = null;
                }
                appendOnlyLinkedArrayList.forEachWhile(behaviorSubscription);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.getOutputFormats.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getOutputFormats.get() == null) {
            java.lang.Object next = io.reactivex.internal.util.NotificationLite.next(t);
            getHighSpeedVideoSizes(next);
            for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : this.getOutputMinFrameDuration.get()) {
                behaviorSubscription.getHighResolutionOutputSizeshNQ4ISI(next, this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputFormats, null, th)) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        java.lang.Object error = io.reactivex.internal.util.NotificationLite.error(th);
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : getHighResolutionOutputSizeshNQ4ISI(error)) {
            behaviorSubscription.getHighResolutionOutputSizeshNQ4ISI(error, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputFormats, null, io.reactivex.internal.util.ExceptionHelper.TERMINATED)) {
            java.lang.Object complete = io.reactivex.internal.util.NotificationLite.complete();
            for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : getHighResolutionOutputSizeshNQ4ISI(complete)) {
                behaviorSubscription.getHighResolutionOutputSizeshNQ4ISI(complete, this.getHighSpeedVideoFpsRangesFor);
            }
        }
    }

    public final boolean offer(T t) {
        if (t == null) {
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr = this.getOutputMinFrameDuration.get();
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription : behaviorSubscriptionArr) {
            if (behaviorSubscription.get() == 0) {
                return false;
            }
        }
        java.lang.Object next = io.reactivex.internal.util.NotificationLite.next(t);
        getHighSpeedVideoSizes(next);
        for (io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription2 : behaviorSubscriptionArr) {
            behaviorSubscription2.getHighResolutionOutputSizeshNQ4ISI(next, this.getHighSpeedVideoFpsRangesFor);
        }
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.getOutputMinFrameDuration.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.getInputSizeshNQ4ISI.get();
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public final T getValue() {
        java.lang.Object obj = this.getInputSizeshNQ4ISI.get();
        if (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return null;
        }
        return (T) io.reactivex.internal.util.NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public final java.lang.Object[] getValues() {
        java.lang.Object[] objArr = getHighSpeedVideoSizes;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public final T[] getValues(T[] tArr) {
        java.lang.Object obj = this.getInputSizeshNQ4ISI.get();
        if (obj == null || io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
        } else {
            java.lang.Object value = io.reactivex.internal.util.NotificationLite.getValue(obj);
            if (tArr.length != 0) {
                tArr[0] = value;
                if (tArr.length != 1) {
                    tArr[1] = 0;
                    return tArr;
                }
            } else {
                T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = value;
                return tArr2;
            }
        }
        return tArr;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return io.reactivex.internal.util.NotificationLite.isComplete(this.getInputSizeshNQ4ISI.get());
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return io.reactivex.internal.util.NotificationLite.isError(this.getInputSizeshNQ4ISI.get());
    }

    public final boolean hasValue() {
        java.lang.Object obj = this.getInputSizeshNQ4ISI.get();
        return (obj == null || io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? false : true;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T> behaviorSubscription) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr;
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.getOutputMinFrameDuration.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorSubscriptionArr[i] == behaviorSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = Camera2StreamConfigurationMap;
            } else {
                io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[] behaviorSubscriptionArr3 = new io.reactivex.processors.BehaviorProcessor.BehaviorSubscription[length - 1];
                java.lang.System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i);
                java.lang.System.arraycopy(behaviorSubscriptionArr, i + 1, behaviorSubscriptionArr3, i, (length - i) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    private io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr = this.getOutputMinFrameDuration.get();
        io.reactivex.processors.BehaviorProcessor.BehaviorSubscription<T>[] behaviorSubscriptionArr2 = getHighResolutionOutputSizeshNQ4ISI;
        if (behaviorSubscriptionArr != behaviorSubscriptionArr2 && (behaviorSubscriptionArr = this.getOutputMinFrameDuration.getAndSet(behaviorSubscriptionArr2)) != behaviorSubscriptionArr2) {
            getHighSpeedVideoSizes(obj);
        }
        return behaviorSubscriptionArr;
    }

    private void getHighSpeedVideoSizes(java.lang.Object obj) {
        java.util.concurrent.locks.Lock lock = this.getOutputMinFrameDurationlomOqCM;
        lock.lock();
        this.getHighSpeedVideoFpsRangesFor++;
        this.getInputSizeshNQ4ISI.lazySet(obj);
        lock.unlock();
    }

    static final class BehaviorSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        final org.reactivestreams.Subscriber<? super T> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        long getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> getInputSizeshNQ4ISI;
        final io.reactivex.processors.BehaviorProcessor<T> getOutputMinFrameDuration;

        BehaviorSubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.BehaviorProcessor<T> behaviorProcessor) {
            this.Camera2StreamConfigurationMap = subscriber;
            this.getOutputMinFrameDuration = behaviorProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI((io.reactivex.processors.BehaviorProcessor.BehaviorSubscription) this);
        }

        final void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, long j) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                synchronized (this) {
                    if (this.getHighSpeedVideoFpsRanges) {
                        return;
                    }
                    if (this.getHighSpeedVideoSizes == j) {
                        return;
                    }
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getInputSizeshNQ4ISI;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                            this.getInputSizeshNQ4ISI = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(obj);
                        return;
                    }
                    this.getHighSpeedVideoSizesFor = true;
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public final boolean test(java.lang.Object obj) {
            if (this.getHighSpeedVideoFpsRanges) {
                return true;
            }
            if (io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                this.Camera2StreamConfigurationMap.onComplete();
                return true;
            }
            if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
                this.Camera2StreamConfigurationMap.onError(io.reactivex.internal.util.NotificationLite.getError(obj));
                return true;
            }
            long j = get();
            if (j != 0) {
                this.Camera2StreamConfigurationMap.onNext((java.lang.Object) io.reactivex.internal.util.NotificationLite.getValue(obj));
                if (j == Long.MAX_VALUE) {
                    return false;
                }
                decrementAndGet();
                return false;
            }
            cancel();
            this.Camera2StreamConfigurationMap.onError(new io.reactivex.exceptions.MissingBackpressureException("Could not deliver value due to lack of requests"));
            return true;
        }
    }
}
