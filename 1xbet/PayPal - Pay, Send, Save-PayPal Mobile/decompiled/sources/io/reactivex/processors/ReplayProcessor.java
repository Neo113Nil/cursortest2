package io.reactivex.processors;

/* loaded from: classes17.dex */
public final class ReplayProcessor<T> extends io.reactivex.processors.FlowableProcessor<T> {
    final io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[]> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
    private static final java.lang.Object[] getHighSpeedVideoSizesFor = new java.lang.Object[0];
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] getHighSpeedVideoSizes = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[0];
    static final io.reactivex.processors.ReplayProcessor.ReplaySubscription[] Camera2StreamConfigurationMap = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[0];

    interface ReplayBuffer<T> {
        int Camera2StreamConfigurationMap();

        boolean getHighResolutionOutputSizeshNQ4ISI();

        java.lang.Throwable getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRanges(java.lang.Throwable th);

        T[] getHighSpeedVideoFpsRanges(T[] tArr);

        void getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoFpsRangesFor(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription);

        void getHighSpeedVideoFpsRangesFor(T t);

        T getHighSpeedVideoSizes();

        void getHighSpeedVideoSizesFor();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> create() {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.UnboundedReplayBuffer(16));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> create(int i) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.UnboundedReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithSize(int i) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeBoundReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTime(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.processors.ReplayProcessor<T> createWithTimeAndSize(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return new io.reactivex.processors.ReplayProcessor<>(new io.reactivex.processors.ReplayProcessor.SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    private ReplayProcessor(io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer) {
        this.getHighResolutionOutputSizeshNQ4ISI = replayBuffer;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription = new io.reactivex.processors.ReplayProcessor.ReplaySubscription<>(subscriber, this);
        subscriber.onSubscribe(replaySubscription);
        while (true) {
            io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr = this.getOutputMinFrameDuration.get();
            if (replaySubscriptionArr == Camera2StreamConfigurationMap) {
                break;
            }
            int length = replaySubscriptionArr.length;
            io.reactivex.processors.ReplayProcessor.ReplaySubscription[] replaySubscriptionArr2 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[length + 1];
            java.lang.System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, replaySubscriptionArr, replaySubscriptionArr2)) {
                if (replaySubscription.getHighSpeedVideoSizes) {
                    getHighSpeedVideoFpsRangesFor(replaySubscription);
                    return;
                }
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor((io.reactivex.processors.ReplayProcessor.ReplaySubscription) replaySubscription);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onSubscribe(org.reactivestreams.Subscription subscription) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.getHighResolutionOutputSizeshNQ4ISI;
        replayBuffer.getHighSpeedVideoFpsRangesFor((io.reactivex.processors.ReplayProcessor.ReplayBuffer<T>) t);
        for (io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription : this.getOutputMinFrameDuration.get()) {
            replayBuffer.getHighSpeedVideoFpsRangesFor((io.reactivex.processors.ReplayProcessor.ReplaySubscription) replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoFpsRangesFor) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.getHighResolutionOutputSizeshNQ4ISI;
        replayBuffer.getHighSpeedVideoFpsRanges(th);
        for (io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription : this.getOutputMinFrameDuration.getAndSet(Camera2StreamConfigurationMap)) {
            replayBuffer.getHighSpeedVideoFpsRangesFor((io.reactivex.processors.ReplayProcessor.ReplaySubscription) replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.getHighResolutionOutputSizeshNQ4ISI;
        replayBuffer.getHighSpeedVideoFpsRangesFor();
        for (io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription : this.getOutputMinFrameDuration.getAndSet(Camera2StreamConfigurationMap)) {
            replayBuffer.getHighSpeedVideoFpsRangesFor((io.reactivex.processors.ReplayProcessor.ReplaySubscription) replaySubscription);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.getOutputMinFrameDuration.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final java.lang.Throwable getThrowable() {
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (replayBuffer.getHighResolutionOutputSizeshNQ4ISI()) {
            return replayBuffer.getHighSpeedVideoFpsRanges();
        }
        return null;
    }

    public final void cleanupBuffer() {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor();
    }

    public final T getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object[] getValues() {
        java.lang.Object[] objArr = getHighSpeedVideoSizesFor;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    public final T[] getValues(T[] tArr) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(tArr);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.getHighResolutionOutputSizeshNQ4ISI;
        return replayBuffer.getHighResolutionOutputSizeshNQ4ISI() && replayBuffer.getHighSpeedVideoFpsRanges() == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> replayBuffer = this.getHighResolutionOutputSizeshNQ4ISI;
        return replayBuffer.getHighResolutionOutputSizeshNQ4ISI() && replayBuffer.getHighSpeedVideoFpsRanges() != null;
    }

    public final boolean hasValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap() != 0;
    }

    final void getHighSpeedVideoFpsRangesFor(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
        io.reactivex.processors.ReplayProcessor.ReplaySubscription<T>[] replaySubscriptionArr;
        io.reactivex.processors.ReplayProcessor.ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.getOutputMinFrameDuration.get();
            if (replaySubscriptionArr == Camera2StreamConfigurationMap || replaySubscriptionArr == getHighSpeedVideoSizes) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replaySubscriptionArr[i] == replaySubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = getHighSpeedVideoSizes;
            } else {
                io.reactivex.processors.ReplayProcessor.ReplaySubscription[] replaySubscriptionArr3 = new io.reactivex.processors.ReplayProcessor.ReplaySubscription[length - 1];
                java.lang.System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i);
                java.lang.System.arraycopy(replaySubscriptionArr, i + 1, replaySubscriptionArr3, i, (length - i) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputMinFrameDuration, replaySubscriptionArr, replaySubscriptionArr2));
    }

    static final class ReplaySubscription<T> extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
        private static final long serialVersionUID = 466549804534799122L;
        java.lang.Object Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicLong getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
        long getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super T> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.processors.ReplayProcessor<T> getOutputFormats;

        ReplaySubscription(org.reactivestreams.Subscriber<? super T> subscriber, io.reactivex.processors.ReplayProcessor<T> replayProcessor) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputFormats = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getHighResolutionOutputSizeshNQ4ISI, j);
                this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor((io.reactivex.processors.ReplayProcessor.ReplaySubscription) this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputFormats.getHighSpeedVideoFpsRangesFor(this);
        }
    }

    static final class UnboundedReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        volatile boolean Camera2StreamConfigurationMap;
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        final java.util.List<T> getHighSpeedVideoFpsRanges;
        volatile int getHighSpeedVideoSizes;

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoSizesFor() {
        }

        UnboundedReplayBuffer(int i) {
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            this.getHighSpeedVideoFpsRanges.add(t);
            this.getHighSpeedVideoSizes++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor() {
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final T getHighSpeedVideoSizes() {
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                return null;
            }
            return this.getHighSpeedVideoFpsRanges.get(i - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final T[] getHighSpeedVideoFpsRanges(T[] tArr) {
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            java.util.List<T> list = this.getHighSpeedVideoFpsRanges;
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = list.get(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
            int i;
            if (replaySubscription.getAndIncrement() == 0) {
                java.util.List<T> list = this.getHighSpeedVideoFpsRanges;
                org.reactivestreams.Subscriber<? super T> subscriber = replaySubscription.getHighSpeedVideoFpsRangesFor;
                java.lang.Integer num = (java.lang.Integer) replaySubscription.Camera2StreamConfigurationMap;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                    replaySubscription.Camera2StreamConfigurationMap = 0;
                }
                long j = replaySubscription.getHighSpeedVideoFpsRanges;
                int i2 = 1;
                do {
                    long j2 = replaySubscription.getHighResolutionOutputSizeshNQ4ISI.get();
                    while (j != j2) {
                        if (replaySubscription.getHighSpeedVideoSizes) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            return;
                        }
                        boolean z = this.Camera2StreamConfigurationMap;
                        int i3 = this.getHighSpeedVideoSizes;
                        if (!z || i != i3) {
                            if (i == i3) {
                                break;
                            }
                            subscriber.onNext(list.get(i));
                            i++;
                            j++;
                        } else {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            replaySubscription.getHighSpeedVideoSizes = true;
                            java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (th == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th);
                                return;
                            }
                        }
                    }
                    if (j == j2) {
                        if (replaySubscription.getHighSpeedVideoSizes) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            return;
                        }
                        boolean z2 = this.Camera2StreamConfigurationMap;
                        int i4 = this.getHighSpeedVideoSizes;
                        if (z2 && i == i4) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            replaySubscription.getHighSpeedVideoSizes = true;
                            java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
                            if (th2 == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
                    replaySubscription.getHighSpeedVideoFpsRanges = j;
                    i2 = replaySubscription.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final int Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final java.lang.Throwable getHighSpeedVideoFpsRanges() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T getHighResolutionOutputSizeshNQ4ISI;

        Node(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
        }
    }

    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.processors.ReplayProcessor.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T Camera2StreamConfigurationMap;
        final long getHighSpeedVideoFpsRangesFor;

        TimedNode(T t, long j) {
            this.Camera2StreamConfigurationMap = t;
            this.getHighSpeedVideoFpsRangesFor = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        volatile io.reactivex.processors.ReplayProcessor.Node<T> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        io.reactivex.processors.ReplayProcessor.Node<T> getOutputFormats;

        SizeBoundReplayBuffer(int i) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            io.reactivex.processors.ReplayProcessor.Node<T> node = new io.reactivex.processors.ReplayProcessor.Node<>(null);
            this.getOutputFormats = node;
            this.Camera2StreamConfigurationMap = node;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            io.reactivex.processors.ReplayProcessor.Node<T> node = new io.reactivex.processors.ReplayProcessor.Node<>(t);
            io.reactivex.processors.ReplayProcessor.Node<T> node2 = this.getOutputFormats;
            this.getOutputFormats = node;
            this.getHighResolutionOutputSizeshNQ4ISI++;
            node2.set(node);
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i > this.getHighSpeedVideoFpsRanges) {
                this.getHighResolutionOutputSizeshNQ4ISI = i - 1;
                this.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = th;
            getHighSpeedVideoSizesFor();
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor() {
            getHighSpeedVideoSizesFor();
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoSizesFor() {
            if (this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI != null) {
                io.reactivex.processors.ReplayProcessor.Node<T> node = new io.reactivex.processors.ReplayProcessor.Node<>(null);
                node.lazySet(this.Camera2StreamConfigurationMap.get());
                this.Camera2StreamConfigurationMap = node;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final java.lang.Throwable getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final T getHighSpeedVideoSizes() {
            io.reactivex.processors.ReplayProcessor.Node<T> node = this.Camera2StreamConfigurationMap;
            while (true) {
                io.reactivex.processors.ReplayProcessor.Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.getHighResolutionOutputSizeshNQ4ISI;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final T[] getHighSpeedVideoFpsRanges(T[] tArr) {
            io.reactivex.processors.ReplayProcessor.Node<T> node = this.Camera2StreamConfigurationMap;
            io.reactivex.processors.ReplayProcessor.Node<T> node2 = node;
            int i = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i++;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                node = node.get();
                tArr[i2] = node.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = replaySubscription.getHighSpeedVideoFpsRangesFor;
                io.reactivex.processors.ReplayProcessor.Node<T> node = (io.reactivex.processors.ReplayProcessor.Node) replaySubscription.Camera2StreamConfigurationMap;
                if (node == null) {
                    node = this.Camera2StreamConfigurationMap;
                }
                long j = replaySubscription.getHighSpeedVideoFpsRanges;
                int i = 1;
                do {
                    long j2 = replaySubscription.getHighResolutionOutputSizeshNQ4ISI.get();
                    while (j != j2) {
                        if (replaySubscription.getHighSpeedVideoSizes) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            return;
                        }
                        boolean z = this.getHighSpeedVideoFpsRangesFor;
                        io.reactivex.processors.ReplayProcessor.Node<T> node2 = node.get();
                        boolean z2 = node2 == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(node2.getHighResolutionOutputSizeshNQ4ISI);
                            j++;
                            node = node2;
                        } else {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            replaySubscription.getHighSpeedVideoSizes = true;
                            java.lang.Throwable th = this.getHighSpeedVideoSizes;
                            if (th == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th);
                                return;
                            }
                        }
                    }
                    if (j == j2) {
                        if (replaySubscription.getHighSpeedVideoSizes) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            return;
                        }
                        if (this.getHighSpeedVideoFpsRangesFor && node.get() == null) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            replaySubscription.getHighSpeedVideoSizes = true;
                            java.lang.Throwable th2 = this.getHighSpeedVideoSizes;
                            if (th2 == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.Camera2StreamConfigurationMap = node;
                    replaySubscription.getHighSpeedVideoFpsRanges = j;
                    i = replaySubscription.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final int Camera2StreamConfigurationMap() {
            io.reactivex.processors.ReplayProcessor.Node<T> node = this.Camera2StreamConfigurationMap;
            int i = 0;
            while (i != Integer.MAX_VALUE && (node = node.get()) != null) {
                i++;
            }
            return i;
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> implements io.reactivex.processors.ReplayProcessor.ReplayBuffer<T> {
        final int Camera2StreamConfigurationMap;
        volatile io.reactivex.processors.ReplayProcessor.TimedNode<T> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizes;
        io.reactivex.processors.ReplayProcessor.TimedNode<T> getHighSpeedVideoSizesFor;
        int getInputSizeshNQ4ISI;
        final java.util.concurrent.TimeUnit getOutputFormats;
        final io.reactivex.Scheduler getOutputMinFrameDuration;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.functions.ObjectHelper.verifyPositive(j, "maxAge");
            this.getOutputFormats = (java.util.concurrent.TimeUnit) io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.getOutputMinFrameDuration = (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
            this.getHighSpeedVideoSizesFor = timedNode;
            this.getHighResolutionOutputSizeshNQ4ISI = timedNode;
        }

        private void getInputSizeshNQ4ISI() {
            long now = this.getOutputMinFrameDuration.now(this.getOutputFormats);
            long j = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.Camera2StreamConfigurationMap != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = timedNode;
                        return;
                    }
                }
                if (timedNode2.getHighSpeedVideoFpsRangesFor > now - j) {
                    if (timedNode.Camera2StreamConfigurationMap != null) {
                        io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode3 = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
                        timedNode3.lazySet(timedNode.get());
                        this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                        return;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = timedNode;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoSizesFor() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap != null) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = new io.reactivex.processors.ReplayProcessor.TimedNode<>(null, 0L);
                timedNode.lazySet(this.getHighResolutionOutputSizeshNQ4ISI.get());
                this.getHighResolutionOutputSizeshNQ4ISI = timedNode;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = new io.reactivex.processors.ReplayProcessor.TimedNode<>(t, this.getOutputMinFrameDuration.now(this.getOutputFormats));
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = timedNode;
            this.getInputSizeshNQ4ISI++;
            timedNode2.set(timedNode);
            int i = this.getInputSizeshNQ4ISI;
            if (i > this.Camera2StreamConfigurationMap) {
                this.getInputSizeshNQ4ISI = i - 1;
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.get();
            }
            long now = this.getOutputMinFrameDuration.now(this.getOutputFormats);
            long j = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode3 = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode4 = timedNode3.get();
                if (timedNode4 == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                    return;
                } else {
                    if (timedNode4.getHighSpeedVideoFpsRangesFor > now - j) {
                        this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                        return;
                    }
                    timedNode3 = timedNode4;
                }
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            getInputSizeshNQ4ISI();
            this.getHighSpeedVideoSizes = th;
            this.getHighSpeedVideoFpsRanges = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor() {
            getInputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRanges = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final T getHighSpeedVideoSizes() {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.getHighSpeedVideoFpsRangesFor < this.getOutputMinFrameDuration.now(this.getOutputFormats) - this.getHighSpeedVideoFpsRangesFor) {
                return null;
            }
            return timedNode.Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final T[] getHighSpeedVideoFpsRanges(T[] tArr) {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> inputFormats = getInputFormats();
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = inputFormats;
            int i = 0;
            while (i != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i++;
            }
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < i) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 != i; i2++) {
                inputFormats = inputFormats.get();
                tArr[i2] = inputFormats.Camera2StreamConfigurationMap;
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        private io.reactivex.processors.ReplayProcessor.TimedNode<T> getInputFormats() {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = this.getHighResolutionOutputSizeshNQ4ISI;
            long now = this.getOutputMinFrameDuration.now(this.getOutputFormats);
            long j = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.getHighSpeedVideoFpsRangesFor > now - j) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = replaySubscription.getHighSpeedVideoFpsRangesFor;
                io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode = (io.reactivex.processors.ReplayProcessor.TimedNode) replaySubscription.Camera2StreamConfigurationMap;
                if (timedNode == null) {
                    timedNode = getInputFormats();
                }
                long j = replaySubscription.getHighSpeedVideoFpsRanges;
                int i = 1;
                do {
                    long j2 = replaySubscription.getHighResolutionOutputSizeshNQ4ISI.get();
                    while (j != j2) {
                        if (replaySubscription.getHighSpeedVideoSizes) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            return;
                        }
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        io.reactivex.processors.ReplayProcessor.TimedNode<T> timedNode2 = timedNode.get();
                        boolean z2 = timedNode2 == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(timedNode2.Camera2StreamConfigurationMap);
                            j++;
                            timedNode = timedNode2;
                        } else {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            replaySubscription.getHighSpeedVideoSizes = true;
                            java.lang.Throwable th = this.getHighSpeedVideoSizes;
                            if (th == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th);
                                return;
                            }
                        }
                    }
                    if (j == j2) {
                        if (replaySubscription.getHighSpeedVideoSizes) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            return;
                        }
                        if (this.getHighSpeedVideoFpsRanges && timedNode.get() == null) {
                            replaySubscription.Camera2StreamConfigurationMap = null;
                            replaySubscription.getHighSpeedVideoSizes = true;
                            java.lang.Throwable th2 = this.getHighSpeedVideoSizes;
                            if (th2 == null) {
                                subscriber.onComplete();
                                return;
                            } else {
                                subscriber.onError(th2);
                                return;
                            }
                        }
                    }
                    replaySubscription.Camera2StreamConfigurationMap = timedNode;
                    replaySubscription.getHighSpeedVideoFpsRanges = j;
                    i = replaySubscription.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final int Camera2StreamConfigurationMap() {
            io.reactivex.processors.ReplayProcessor.TimedNode<T> inputFormats = getInputFormats();
            int i = 0;
            while (i != Integer.MAX_VALUE && (inputFormats = inputFormats.get()) != null) {
                i++;
            }
            return i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final java.lang.Throwable getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }
}
