package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableReplay<T> extends io.reactivex.flowables.ConnectableFlowable<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T>, io.reactivex.disposables.Disposable {
    static final java.util.concurrent.Callable getHighSpeedVideoSizes = new io.reactivex.internal.operators.flowable.FlowableReplay.DefaultUnboundedFactory();
    final java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> getHighResolutionOutputSizeshNQ4ISI;
    final org.reactivestreams.Publisher<T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Flowable<T> getOutputMinFrameDuration;

    /* loaded from: classes17.dex */
    interface ReplayBuffer<T> {
        void Camera2StreamConfigurationMap(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription);

        void getHighResolutionOutputSizeshNQ4ISI(T t);

        void getHighSpeedVideoFpsRanges(java.lang.Throwable th);

        void getHighSpeedVideoSizes();
    }

    public static <U, R> io.reactivex.Flowable<R> multicastSelector(java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> function) {
        return new io.reactivex.internal.operators.flowable.FlowableReplay.MulticastFlowable(callable, function);
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> observeOn(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable, io.reactivex.Scheduler scheduler) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.flowables.ConnectableFlowable) new io.reactivex.internal.operators.flowable.FlowableReplay.ConnectableFlowableReplay(connectableFlowable, connectableFlowable.observeOn(scheduler)));
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> createFrom(io.reactivex.Flowable<? extends T> flowable) {
        return getHighResolutionOutputSizeshNQ4ISI(flowable, getHighSpeedVideoSizes);
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, int i) {
        if (i == Integer.MAX_VALUE) {
            return createFrom(flowable);
        }
        return getHighResolutionOutputSizeshNQ4ISI(flowable, new io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBufferTask(i));
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return create(flowable, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> create(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return getHighResolutionOutputSizeshNQ4ISI(flowable, new io.reactivex.internal.operators.flowable.FlowableReplay.ScheduledReplayBufferTask(i, j, timeUnit, scheduler));
    }

    private static <T> io.reactivex.flowables.ConnectableFlowable<T> getHighResolutionOutputSizeshNQ4ISI(io.reactivex.Flowable<T> flowable, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> callable) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.flowables.ConnectableFlowable) new io.reactivex.internal.operators.flowable.FlowableReplay(new io.reactivex.internal.operators.flowable.FlowableReplay.ReplayPublisher(atomicReference, callable), flowable, atomicReference, callable));
    }

    private FlowableReplay(org.reactivestreams.Publisher<T> publisher, io.reactivex.Flowable<T> flowable, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> atomicReference, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> callable) {
        this.getHighSpeedVideoFpsRangesFor = publisher;
        this.getOutputMinFrameDuration = flowable;
        this.getHighResolutionOutputSizeshNQ4ISI = atomicReference;
        this.Camera2StreamConfigurationMap = callable;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final org.reactivestreams.Publisher<T> source() {
        return this.getOutputMinFrameDuration;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(subscriber);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.getHighResolutionOutputSizeshNQ4ISI.lazySet(null);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber = this.getHighResolutionOutputSizeshNQ4ISI.get();
        return replaySubscriber == null || replaySubscriber.isDisposed();
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public final void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber;
        while (true) {
            replaySubscriber = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (replaySubscriber != null && !replaySubscriber.isDisposed()) {
                break;
            }
            try {
                io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber2 = new io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<>(this.Camera2StreamConfigurationMap.call());
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, replaySubscriber, replaySubscriber2)) {
                    replaySubscriber = replaySubscriber2;
                    break;
                }
            } finally {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                java.lang.RuntimeException wrapOrThrow = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
            }
        }
        boolean z = !replaySubscriber.getOutputFormats.get() && replaySubscriber.getOutputFormats.compareAndSet(false, true);
        try {
            consumer.accept(replaySubscriber);
            if (z) {
                this.getOutputMinFrameDuration.subscribe((io.reactivex.FlowableSubscriber) replaySubscriber);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                replaySubscriber.getOutputFormats.compareAndSet(true, false);
            }
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplaySubscriber<T> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[0];
        static final io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[0];
        private static final long serialVersionUID = 7224554242710036740L;
        boolean Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> getHighSpeedVideoSizes;
        long getHighSpeedVideoSizesFor;
        long getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[]> getInputFormats = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRanges);
        final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean();

        ReplaySubscriber(io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> replayBuffer) {
            this.getHighSpeedVideoSizes = replayBuffer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputFormats.get() == getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getInputFormats.set(getHighSpeedVideoFpsRangesFor);
            io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(this);
        }

        final void getHighSpeedVideoFpsRangesFor(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] innerSubscriptionArr2;
            do {
                innerSubscriptionArr = this.getInputFormats.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriptionArr[i].equals(innerSubscription)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = getHighSpeedVideoFpsRanges;
                } else {
                    io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] innerSubscriptionArr3 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[length - 1];
                    java.lang.System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                    java.lang.System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputFormats, innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(this, subscription)) {
                getHighSpeedVideoSizes();
                for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.getInputFormats.get()) {
                    this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(innerSubscription);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(t);
            for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.getInputFormats.get()) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(innerSubscription);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (!this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(th);
                for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.getInputFormats.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                    this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(innerSubscription);
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
            for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : this.getInputFormats.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(innerSubscription);
            }
        }

        final void getHighSpeedVideoSizes() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getAndIncrement() == 0) {
                int i = 1;
                while (!isDisposed()) {
                    io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr = this.getInputFormats.get();
                    long j = this.getOutputMinFrameDuration;
                    long j2 = j;
                    for (io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription : innerSubscriptionArr) {
                        j2 = java.lang.Math.max(j2, innerSubscription.getInputSizeshNQ4ISI.get());
                    }
                    long j3 = this.getHighSpeedVideoSizesFor;
                    org.reactivestreams.Subscription subscription = get();
                    long j4 = j2 - j;
                    if (j4 != 0) {
                        this.getOutputMinFrameDuration = j2;
                        if (subscription == null) {
                            long j5 = j3 + j4;
                            if (j5 < 0) {
                                j5 = Long.MAX_VALUE;
                            }
                            this.getHighSpeedVideoSizesFor = j5;
                        } else if (j3 != 0) {
                            this.getHighSpeedVideoSizesFor = 0L;
                            subscription.request(j3 + j4);
                        } else {
                            subscription.request(j4);
                        }
                    } else if (j3 != 0 && subscription != null) {
                        this.getHighSpeedVideoSizesFor = 0L;
                        subscription.request(j3);
                    }
                    i = this.getHighResolutionOutputSizeshNQ4ISI.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class InnerSubscription<T> extends java.util.concurrent.atomic.AtomicLong implements org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4453897557930727610L;
        boolean Camera2StreamConfigurationMap;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();

        InnerSubscription(io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber, org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighSpeedVideoFpsRanges = replaySubscriber;
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (!io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j) || io.reactivex.internal.util.BackpressureHelper.addCancel(this, j) == Long.MIN_VALUE) {
                return;
            }
            io.reactivex.internal.util.BackpressureHelper.add(this.getInputSizeshNQ4ISI, j);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int getHighResolutionOutputSizeshNQ4ISI;

        UnboundedReplayBuffer() {
            super(16);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            add(io.reactivex.internal.util.NotificationLite.next(t));
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            add(io.reactivex.internal.util.NotificationLite.error(th));
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
            add(io.reactivex.internal.util.NotificationLite.complete());
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            synchronized (innerSubscription) {
                if (innerSubscription.Camera2StreamConfigurationMap) {
                    innerSubscription.getHighSpeedVideoFpsRangesFor = true;
                    return;
                }
                innerSubscription.Camera2StreamConfigurationMap = true;
                org.reactivestreams.Subscriber<? super T> subscriber = innerSubscription.getHighResolutionOutputSizeshNQ4ISI;
                while (!innerSubscription.isDisposed()) {
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Integer num = (java.lang.Integer) innerSubscription.getHighSpeedVideoSizes;
                    int intValue = num != null ? num.intValue() : 0;
                    long j = innerSubscription.get();
                    long j2 = j;
                    long j3 = 0;
                    while (j2 != 0 && intValue < i) {
                        java.lang.Object obj = get(intValue);
                        try {
                            if (io.reactivex.internal.util.NotificationLite.accept(obj, subscriber) || innerSubscription.isDisposed()) {
                                return;
                            }
                            intValue++;
                            j2--;
                            j3++;
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            innerSubscription.dispose();
                            if (io.reactivex.internal.util.NotificationLite.isError(obj) || io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                                return;
                            }
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (j3 != 0) {
                        innerSubscription.getHighSpeedVideoSizes = java.lang.Integer.valueOf(intValue);
                        if (j != Long.MAX_VALUE) {
                            io.reactivex.internal.util.BackpressureHelper.producedCancel(innerSubscription, j3);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.getHighSpeedVideoFpsRangesFor) {
                            innerSubscription.Camera2StreamConfigurationMap = false;
                            return;
                        }
                        innerSubscription.getHighSpeedVideoFpsRangesFor = false;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class Node extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final java.lang.Object Camera2StreamConfigurationMap;
        final long getHighSpeedVideoFpsRanges;

        Node(java.lang.Object obj, long j) {
            this.Camera2StreamConfigurationMap = obj;
            this.getHighSpeedVideoFpsRanges = j;
        }
    }

    /* loaded from: classes17.dex */
    static class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.Node> implements io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        long Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;
        io.reactivex.internal.operators.flowable.FlowableReplay.Node getHighSpeedVideoSizes;

        java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return obj;
        }

        void getHighSpeedVideoFpsRanges() {
        }

        java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj) {
            return obj;
        }

        BoundedReplayBuffer() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(null, 0L);
            this.getHighSpeedVideoSizes = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(io.reactivex.internal.util.NotificationLite.next(t));
            long j = this.Camera2StreamConfigurationMap + 1;
            this.Camera2StreamConfigurationMap = j;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(highSpeedVideoSizes, j);
            this.getHighSpeedVideoSizes.set(node);
            this.getHighSpeedVideoSizes = node;
            this.getHighSpeedVideoFpsRangesFor++;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(io.reactivex.internal.util.NotificationLite.error(th));
            long j = this.Camera2StreamConfigurationMap + 1;
            this.Camera2StreamConfigurationMap = j;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(highSpeedVideoSizes, j);
            this.getHighSpeedVideoSizes.set(node);
            this.getHighSpeedVideoSizes = node;
            this.getHighSpeedVideoFpsRangesFor++;
            Camera2StreamConfigurationMap();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
            java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(io.reactivex.internal.util.NotificationLite.complete());
            long j = this.Camera2StreamConfigurationMap + 1;
            this.Camera2StreamConfigurationMap = j;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(highSpeedVideoSizes, j);
            this.getHighSpeedVideoSizes.set(node);
            this.getHighSpeedVideoSizes = node;
            this.getHighSpeedVideoFpsRangesFor++;
            Camera2StreamConfigurationMap();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer
        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription) {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            synchronized (innerSubscription) {
                if (innerSubscription.Camera2StreamConfigurationMap) {
                    innerSubscription.getHighSpeedVideoFpsRangesFor = true;
                    return;
                }
                innerSubscription.Camera2StreamConfigurationMap = true;
                while (!innerSubscription.isDisposed()) {
                    long j = innerSubscription.get();
                    boolean z = j == Long.MAX_VALUE;
                    io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = (io.reactivex.internal.operators.flowable.FlowableReplay.Node) innerSubscription.getHighSpeedVideoSizes;
                    if (node2 == null) {
                        node2 = getHighResolutionOutputSizeshNQ4ISI();
                        innerSubscription.getHighSpeedVideoSizes = node2;
                        io.reactivex.internal.util.BackpressureHelper.add(innerSubscription.getInputSizeshNQ4ISI, node2.getHighSpeedVideoFpsRanges);
                    }
                    long j2 = 0;
                    while (j != 0 && (node = node2.get()) != null) {
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(node.Camera2StreamConfigurationMap);
                        try {
                            if (io.reactivex.internal.util.NotificationLite.accept(highSpeedVideoFpsRanges, innerSubscription.getHighResolutionOutputSizeshNQ4ISI)) {
                                innerSubscription.getHighSpeedVideoSizes = null;
                                return;
                            }
                            j2++;
                            j--;
                            if (innerSubscription.isDisposed()) {
                                return;
                            } else {
                                node2 = node;
                            }
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            innerSubscription.getHighSpeedVideoSizes = null;
                            innerSubscription.dispose();
                            if (io.reactivex.internal.util.NotificationLite.isError(highSpeedVideoFpsRanges) || io.reactivex.internal.util.NotificationLite.isComplete(highSpeedVideoFpsRanges)) {
                                return;
                            }
                            innerSubscription.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                            return;
                        }
                    }
                    if (j2 != 0) {
                        innerSubscription.getHighSpeedVideoSizes = node2;
                        if (!z) {
                            io.reactivex.internal.util.BackpressureHelper.producedCancel(innerSubscription, j2);
                        }
                    }
                    synchronized (innerSubscription) {
                        if (!innerSubscription.getHighSpeedVideoFpsRangesFor) {
                            innerSubscription.Camera2StreamConfigurationMap = false;
                            return;
                        }
                        innerSubscription.getHighSpeedVideoFpsRangesFor = false;
                    }
                }
            }
        }

        io.reactivex.internal.operators.flowable.FlowableReplay.Node getHighResolutionOutputSizeshNQ4ISI() {
            return get();
        }

        void Camera2StreamConfigurationMap() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = get();
            if (node.Camera2StreamConfigurationMap != null) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = new io.reactivex.internal.operators.flowable.FlowableReplay.Node(null, 0L);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SizeBoundReplayBuffer<T> extends io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int getHighResolutionOutputSizeshNQ4ISI;

        SizeBoundReplayBuffer(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        final void getHighSpeedVideoFpsRanges() {
            if (this.getHighSpeedVideoFpsRangesFor > this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node = get().get();
                if (node == null) {
                    throw new java.lang.IllegalStateException("Empty list!");
                }
                this.getHighSpeedVideoFpsRangesFor--;
                set(node);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SizeAndTimeBoundReplayBuffer<T> extends io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoSizesFor;
        final java.util.concurrent.TimeUnit getInputSizeshNQ4ISI;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizesFor = scheduler;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getInputSizeshNQ4ISI = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        final java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj) {
            return new io.reactivex.schedulers.Timed(obj, this.getHighSpeedVideoSizesFor.now(this.getInputSizeshNQ4ISI), this.getInputSizeshNQ4ISI);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return ((io.reactivex.schedulers.Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        final void getHighSpeedVideoFpsRanges() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            long now = this.getHighSpeedVideoSizesFor.now(this.getInputSizeshNQ4ISI);
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = get();
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    if (this.getHighSpeedVideoFpsRangesFor <= this.getHighSpeedVideoFpsRanges) {
                        if (((io.reactivex.schedulers.Timed) node2.Camera2StreamConfigurationMap).time() > now - j) {
                            break;
                        }
                        i++;
                        this.getHighSpeedVideoFpsRangesFor--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.getHighSpeedVideoFpsRangesFor--;
                        node3 = node2.get();
                    }
                } else {
                    break;
                }
            }
            if (i != 0) {
                set(node);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        
            set(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
        
            return;
         */
        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void Camera2StreamConfigurationMap() {
            long now = this.getHighSpeedVideoSizesFor.now(this.getInputSizeshNQ4ISI);
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node = get();
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = node.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node3 = node2;
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node4 = node;
                node = node3;
                if (node == null || this.getHighSpeedVideoFpsRangesFor <= 1 || ((io.reactivex.schedulers.Timed) node.Camera2StreamConfigurationMap).time() > now - j) {
                    break;
                }
                i++;
                this.getHighSpeedVideoFpsRangesFor--;
                node2 = node.get();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableReplay.BoundedReplayBuffer
        final io.reactivex.internal.operators.flowable.FlowableReplay.Node getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node;
            long now = this.getHighSpeedVideoSizesFor.now(this.getInputSizeshNQ4ISI);
            long j = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node2 = get();
            io.reactivex.internal.operators.flowable.FlowableReplay.Node node3 = node2.get();
            while (true) {
                io.reactivex.internal.operators.flowable.FlowableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                io.reactivex.schedulers.Timed timed = (io.reactivex.schedulers.Timed) node2.Camera2StreamConfigurationMap;
                if (io.reactivex.internal.util.NotificationLite.isComplete(timed.value()) || io.reactivex.internal.util.NotificationLite.isError(timed.value()) || timed.time() > now - j) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }
    }

    /* loaded from: classes17.dex */
    static final class MulticastFlowable<R, U> extends io.reactivex.Flowable<R> {
        private final io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> getHighSpeedVideoFpsRangesFor;

        MulticastFlowable(java.util.concurrent.Callable<? extends io.reactivex.flowables.ConnectableFlowable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Flowable<U>, ? extends org.reactivestreams.Publisher<R>> function) {
            this.getHighSpeedVideoFpsRangesFor = callable;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(org.reactivestreams.Subscriber<? super R> subscriber) {
            try {
                io.reactivex.flowables.ConnectableFlowable connectableFlowable = (io.reactivex.flowables.ConnectableFlowable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.call(), "The connectableFactory returned null");
                try {
                    org.reactivestreams.Publisher publisher = (org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(connectableFlowable), "The selector returned a null Publisher");
                    io.reactivex.internal.subscribers.SubscriberResourceWrapper subscriberResourceWrapper = new io.reactivex.internal.subscribers.SubscriberResourceWrapper(subscriber);
                    publisher.subscribe(subscriberResourceWrapper);
                    connectableFlowable.connect(new io.reactivex.internal.operators.flowable.FlowableReplay.MulticastFlowable.DisposableConsumer(subscriberResourceWrapper));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.subscriptions.EmptySubscription.error(th2, subscriber);
            }
        }

        final class DisposableConsumer implements io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
            private final io.reactivex.internal.subscribers.SubscriberResourceWrapper<R> getHighResolutionOutputSizeshNQ4ISI;

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
                this.getHighResolutionOutputSizeshNQ4ISI.setResource(disposable);
            }

            DisposableConsumer(io.reactivex.internal.subscribers.SubscriberResourceWrapper<R> subscriberResourceWrapper) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscriberResourceWrapper;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class ConnectableFlowableReplay<T> extends io.reactivex.flowables.ConnectableFlowable<T> {
        private final io.reactivex.Flowable<T> getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.flowables.ConnectableFlowable<T> getHighSpeedVideoSizes;

        ConnectableFlowableReplay(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable, io.reactivex.Flowable<T> flowable) {
            this.getHighSpeedVideoSizes = connectableFlowable;
            this.getHighResolutionOutputSizeshNQ4ISI = flowable;
        }

        @Override // io.reactivex.flowables.ConnectableFlowable
        public final void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
            this.getHighSpeedVideoSizes.connect(consumer);
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayBufferTask<T> implements java.util.concurrent.Callable<io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> {
        private final int getHighSpeedVideoFpsRanges;

        ReplayBufferTask(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableReplay.SizeBoundReplayBuffer(this.getHighSpeedVideoFpsRanges);
        }
    }

    /* loaded from: classes17.dex */
    static final class ScheduledReplayBufferTask<T> implements java.util.concurrent.Callable<io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> {
        private final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
        private final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        private final long getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoSizes;

        ScheduledReplayBufferTask(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRanges = j;
            this.Camera2StreamConfigurationMap = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableReplay.SizeAndTimeBoundReplayBuffer(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayPublisher<T> implements org.reactivestreams.Publisher<T> {
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> Camera2StreamConfigurationMap;
        private final java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> getHighResolutionOutputSizeshNQ4ISI;

        ReplayPublisher(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T>> atomicReference, java.util.concurrent.Callable<? extends io.reactivex.internal.operators.flowable.FlowableReplay.ReplayBuffer<T>> callable) {
            this.Camera2StreamConfigurationMap = atomicReference;
            this.getHighResolutionOutputSizeshNQ4ISI = callable;
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
            io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber;
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T>[] innerSubscriptionArr;
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[] innerSubscriptionArr2;
            while (true) {
                replaySubscriber = this.Camera2StreamConfigurationMap.get();
                if (replaySubscriber != null) {
                    break;
                }
                try {
                    io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<T> replaySubscriber2 = new io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber<>(this.getHighResolutionOutputSizeshNQ4ISI.call());
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, replaySubscriber2)) {
                        replaySubscriber = replaySubscriber2;
                        break;
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, subscriber);
                    return;
                }
            }
            io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<T> innerSubscription = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription<>(replaySubscriber, subscriber);
            subscriber.onSubscribe(innerSubscription);
            do {
                innerSubscriptionArr = replaySubscriber.getInputFormats.get();
                if (innerSubscriptionArr == io.reactivex.internal.operators.flowable.FlowableReplay.ReplaySubscriber.getHighSpeedVideoFpsRangesFor) {
                    break;
                }
                int length = innerSubscriptionArr.length;
                innerSubscriptionArr2 = new io.reactivex.internal.operators.flowable.FlowableReplay.InnerSubscription[length + 1];
                java.lang.System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
                innerSubscriptionArr2[length] = innerSubscription;
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(replaySubscriber.getInputFormats, innerSubscriptionArr, innerSubscriptionArr2));
            if (innerSubscription.isDisposed()) {
                replaySubscriber.getHighSpeedVideoFpsRangesFor(innerSubscription);
            } else {
                replaySubscriber.getHighSpeedVideoSizes();
                replaySubscriber.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(innerSubscription);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class DefaultUnboundedFactory implements java.util.concurrent.Callable<java.lang.Object> {
        DefaultUnboundedFactory() {
        }

        @Override // java.util.concurrent.Callable
        public final java.lang.Object call() {
            return new io.reactivex.internal.operators.flowable.FlowableReplay.UnboundedReplayBuffer();
        }
    }
}
