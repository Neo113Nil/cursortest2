package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableGroupBy<T, K, V> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, io.reactivex.flowables.GroupedFlowable<K, V>> {
    final io.reactivex.functions.Function<? super T, ? extends K> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> getHighSpeedVideoSizes;
    final io.reactivex.functions.Function<? super T, ? extends V> getInputSizeshNQ4ISI;

    public FlowableGroupBy(io.reactivex.Flowable<T> flowable, io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, int i, boolean z, io.reactivex.functions.Function<? super io.reactivex.functions.Consumer<java.lang.Object>, ? extends java.util.Map<K, java.lang.Object>> function3) {
        super(flowable);
        this.Camera2StreamConfigurationMap = function;
        this.getInputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoSizes = function3;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> subscriber) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.Map<K, java.lang.Object> apply;
        try {
            if (this.getHighSpeedVideoSizes == null) {
                apply = new java.util.concurrent.ConcurrentHashMap<>();
                concurrentLinkedQueue = null;
            } else {
                concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                apply = this.getHighSpeedVideoSizes.apply(new io.reactivex.internal.operators.flowable.FlowableGroupBy.EvictionAction(concurrentLinkedQueue));
            }
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, apply, concurrentLinkedQueue));
        } catch (java.lang.Exception e) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(e);
            subscriber.onSubscribe(io.reactivex.internal.util.EmptyComponent.INSTANCE);
            subscriber.onError(e);
        }
    }

    /* loaded from: classes17.dex */
    public static final class GroupBySubscriber<T, K, V> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<io.reactivex.flowables.GroupedFlowable<K, V>> implements io.reactivex.FlowableSubscriber<T> {
        static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizesFor;
        final java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> getInputFormats;
        final java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> getInputSizeshNQ4ISI;
        volatile boolean getOutputFormats;
        final io.reactivex.functions.Function<? super T, ? extends K> getOutputMinFrameDurationlomOqCM;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> getOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getOutputStallDuration;
        boolean getOutputStallDurationlomOqCM;
        final io.reactivex.functions.Function<? super T, ? extends V> toString;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicLong getOutputSizes = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicInteger(1);

        public GroupBySubscriber(org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> subscriber, io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, int i, boolean z, java.util.Map<java.lang.Object, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> map, java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> queue) {
            this.getHighSpeedVideoFpsRangesFor = subscriber;
            this.getOutputMinFrameDurationlomOqCM = function;
            this.toString = function2;
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getInputFormats = map;
            this.getInputSizeshNQ4ISI = queue;
            this.getOutputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputStallDuration, subscription)) {
                this.getOutputStallDuration = subscription;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
                subscription.request(this.getHighSpeedVideoFpsRanges);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            boolean z;
            if (this.getOutputFormats) {
                return;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> spscLinkedArrayQueue = this.getOutputSizeshNQ4ISI;
            try {
                K apply = this.getOutputMinFrameDurationlomOqCM.apply(t);
                java.lang.Object obj = apply != null ? apply : Camera2StreamConfigurationMap;
                io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V> groupedUnicast = this.getInputFormats.get(obj);
                if (groupedUnicast != null) {
                    z = false;
                } else {
                    if (this.getHighSpeedVideoSizes.get()) {
                        return;
                    }
                    groupedUnicast = io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast.getHighResolutionOutputSizeshNQ4ISI(apply, this.getHighSpeedVideoFpsRanges, this, this.getHighResolutionOutputSizeshNQ4ISI);
                    this.getInputFormats.put(obj, groupedUnicast);
                    this.getOutputMinFrameDuration.getAndIncrement();
                    z = true;
                }
                try {
                    java.lang.Object requireNonNull = io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.toString.apply(t), "The valueSelector returned null");
                    io.reactivex.internal.operators.flowable.FlowableGroupBy.State<V, K> state = groupedUnicast.getHighResolutionOutputSizeshNQ4ISI;
                    state.getOutputSizes.offer(requireNonNull);
                    if (state.getAndIncrement() == 0) {
                        if (state.getInputSizeshNQ4ISI) {
                            state.getHighSpeedVideoFpsRangesFor();
                        } else {
                            state.getHighResolutionOutputSizeshNQ4ISI();
                        }
                    }
                    if (this.getInputSizeshNQ4ISI != null) {
                        while (true) {
                            io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V> poll = this.getInputSizeshNQ4ISI.poll();
                            if (poll == null) {
                                break;
                            }
                            io.reactivex.internal.operators.flowable.FlowableGroupBy.State<V, K> state2 = poll.getHighResolutionOutputSizeshNQ4ISI;
                            state2.getHighSpeedVideoFpsRangesFor = true;
                            if (state2.getAndIncrement() == 0) {
                                if (state2.getInputSizeshNQ4ISI) {
                                    state2.getHighSpeedVideoFpsRangesFor();
                                } else {
                                    state2.getHighResolutionOutputSizeshNQ4ISI();
                                }
                            }
                        }
                    }
                    if (z) {
                        spscLinkedArrayQueue.offer(groupedUnicast);
                        getHighSpeedVideoSizes();
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getOutputStallDuration.cancel();
                    onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getOutputStallDuration.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            java.util.Iterator<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> it = this.getInputFormats.values().iterator();
            while (it.hasNext()) {
                io.reactivex.internal.operators.flowable.FlowableGroupBy.State<V, K> state = it.next().getHighResolutionOutputSizeshNQ4ISI;
                state.getHighResolutionOutputSizeshNQ4ISI = th;
                state.getHighSpeedVideoFpsRangesFor = true;
                if (state.getAndIncrement() == 0) {
                    if (state.getInputSizeshNQ4ISI) {
                        state.getHighSpeedVideoFpsRangesFor();
                    } else {
                        state.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
            }
            this.getInputFormats.clear();
            java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> queue = this.getInputSizeshNQ4ISI;
            if (queue != null) {
                queue.clear();
            }
            this.getHighSpeedVideoSizesFor = th;
            this.getOutputFormats = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.getOutputFormats) {
                return;
            }
            java.util.Iterator<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> it = this.getInputFormats.values().iterator();
            while (it.hasNext()) {
                io.reactivex.internal.operators.flowable.FlowableGroupBy.State<V, K> state = it.next().getHighResolutionOutputSizeshNQ4ISI;
                state.getHighSpeedVideoFpsRangesFor = true;
                if (state.getAndIncrement() == 0) {
                    if (state.getInputSizeshNQ4ISI) {
                        state.getHighSpeedVideoFpsRangesFor();
                    } else {
                        state.getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
            }
            this.getInputFormats.clear();
            java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> queue = this.getInputSizeshNQ4ISI;
            if (queue != null) {
                queue.clear();
            }
            this.getOutputFormats = true;
            getHighSpeedVideoSizes();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputSizes, j);
                getHighSpeedVideoSizes();
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true) && this.getOutputMinFrameDuration.decrementAndGet() == 0) {
                this.getOutputStallDuration.cancel();
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = (K) Camera2StreamConfigurationMap;
            }
            this.getInputFormats.remove(k);
            if (this.getOutputMinFrameDuration.decrementAndGet() == 0) {
                this.getOutputStallDuration.cancel();
                if (getAndIncrement() == 0) {
                    this.getOutputSizeshNQ4ISI.clear();
                }
            }
        }

        private void getHighSpeedVideoSizes() {
            java.lang.Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            int i = 1;
            if (this.getOutputStallDurationlomOqCM) {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> spscLinkedArrayQueue = this.getOutputSizeshNQ4ISI;
                org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> subscriber = this.getHighSpeedVideoFpsRangesFor;
                while (!this.getHighSpeedVideoSizes.get()) {
                    boolean z = this.getOutputFormats;
                    if (z && !this.getHighResolutionOutputSizeshNQ4ISI && (th = this.getHighSpeedVideoSizesFor) != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    subscriber.onNext(null);
                    if (z) {
                        java.lang.Throwable th2 = this.getHighSpeedVideoSizesFor;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                spscLinkedArrayQueue.clear();
                return;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> spscLinkedArrayQueue2 = this.getOutputSizeshNQ4ISI;
            org.reactivestreams.Subscriber<? super io.reactivex.flowables.GroupedFlowable<K, V>> subscriber2 = this.getHighSpeedVideoFpsRangesFor;
            int i2 = 1;
            do {
                long j = this.getOutputSizes.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z2 = this.getOutputFormats;
                    io.reactivex.flowables.GroupedFlowable<K, V> poll = spscLinkedArrayQueue2.poll();
                    boolean z3 = poll == null;
                    if (!getHighSpeedVideoSizes(z2, z3, subscriber2, spscLinkedArrayQueue2)) {
                        if (z3) {
                            break;
                        }
                        subscriber2.onNext(poll);
                        j2++;
                    } else {
                        return;
                    }
                }
                if (j2 == j && getHighSpeedVideoSizes(this.getOutputFormats, spscLinkedArrayQueue2.isEmpty(), subscriber2, spscLinkedArrayQueue2)) {
                    return;
                }
                if (j2 != 0) {
                    if (j != Long.MAX_VALUE) {
                        this.getOutputSizes.addAndGet(-j2);
                    }
                    this.getOutputStallDuration.request(j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        private boolean getHighSpeedVideoSizes(boolean z, boolean z2, org.reactivestreams.Subscriber<?> subscriber, io.reactivex.internal.queue.SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.getHighSpeedVideoSizes.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (!z || !z2) {
                    return false;
                }
                java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            if (!z) {
                return false;
            }
            java.lang.Throwable th2 = this.getHighSpeedVideoSizesFor;
            if (th2 != null) {
                spscLinkedArrayQueue.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getOutputStallDurationlomOqCM = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final io.reactivex.flowables.GroupedFlowable<K, V> poll() {
            return this.getOutputSizeshNQ4ISI.poll();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getOutputSizeshNQ4ISI.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getOutputSizeshNQ4ISI.isEmpty();
        }
    }

    /* loaded from: classes17.dex */
    static final class EvictionAction<K, V> implements io.reactivex.functions.Consumer<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> {
        final java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> Camera2StreamConfigurationMap;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(java.lang.Object obj) throws java.lang.Exception {
            this.Camera2StreamConfigurationMap.offer((io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast) obj);
        }

        EvictionAction(java.util.Queue<io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, V>> queue) {
            this.Camera2StreamConfigurationMap = queue;
        }
    }

    /* loaded from: classes17.dex */
    static final class GroupedUnicast<K, T> extends io.reactivex.flowables.GroupedFlowable<K, T> {
        final io.reactivex.internal.operators.flowable.FlowableGroupBy.State<T, K> getHighResolutionOutputSizeshNQ4ISI;

        public static <T, K> io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<K, T> getHighResolutionOutputSizeshNQ4ISI(K k, int i, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupedUnicast<>(k, new io.reactivex.internal.operators.flowable.FlowableGroupBy.State(i, groupBySubscriber, k, z));
        }

        private GroupedUnicast(K k, io.reactivex.internal.operators.flowable.FlowableGroupBy.State<T, K> state) {
            super(k);
            this.getHighResolutionOutputSizeshNQ4ISI = state;
        }

        @Override // io.reactivex.Flowable
        public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class State<T, K> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements org.reactivestreams.Publisher<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber<?, K, T> getHighSpeedVideoSizesFor;
        boolean getInputSizeshNQ4ISI;
        final K getOutputFormats;
        int getOutputMinFrameDuration;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getOutputSizes;
        final java.util.concurrent.atomic.AtomicLong getOutputMinFrameDurationlomOqCM = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscriber<? super T>> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicBoolean getInputFormats = new java.util.concurrent.atomic.AtomicBoolean();

        State(int i, io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.getOutputSizes = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.getHighSpeedVideoSizesFor = groupBySubscriber;
            this.getOutputFormats = k;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this.getOutputMinFrameDurationlomOqCM, j);
                if (getAndIncrement() == 0) {
                    if (this.getInputSizeshNQ4ISI) {
                        getHighSpeedVideoFpsRangesFor();
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizesFor.cancel(this.getOutputFormats);
            }
        }

        @Override // org.reactivestreams.Publisher
        public final void subscribe(org.reactivestreams.Subscriber<? super T> subscriber) {
            if (this.getInputFormats.compareAndSet(false, true)) {
                subscriber.onSubscribe(this);
                this.Camera2StreamConfigurationMap.lazySet(subscriber);
                if (getAndIncrement() == 0) {
                    if (this.getInputSizeshNQ4ISI) {
                        getHighSpeedVideoFpsRangesFor();
                        return;
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                }
                return;
            }
            io.reactivex.internal.subscriptions.EmptySubscription.error(new java.lang.IllegalStateException("Only one Subscriber allowed!"), subscriber);
        }

        final void getHighSpeedVideoFpsRangesFor() {
            java.lang.Throwable th;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getOutputSizes;
            org.reactivestreams.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap.get();
            int i = 1;
            while (true) {
                if (subscriber != null) {
                    if (this.getHighSpeedVideoSizes.get()) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z = this.getHighSpeedVideoFpsRangesFor;
                    if (z && !this.getHighSpeedVideoFpsRanges && (th = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                        spscLinkedArrayQueue.clear();
                        subscriber.onError(th);
                        return;
                    }
                    subscriber.onNext(null);
                    if (z) {
                        java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (th2 != null) {
                            subscriber.onError(th2);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.Camera2StreamConfigurationMap.get();
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getOutputSizes;
            boolean z = this.getHighSpeedVideoFpsRanges;
            org.reactivestreams.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap.get();
            int i = 1;
            while (true) {
                if (subscriber != null) {
                    long j = this.getOutputMinFrameDurationlomOqCM.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.getHighSpeedVideoFpsRangesFor;
                        T poll = spscLinkedArrayQueue.poll();
                        boolean z3 = poll == null;
                        if (!getHighSpeedVideoFpsRangesFor(z2, z3, subscriber, z)) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, spscLinkedArrayQueue.isEmpty(), subscriber, z)) {
                        return;
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            this.getOutputMinFrameDurationlomOqCM.addAndGet(-j2);
                        }
                        this.getHighSpeedVideoSizesFor.getOutputStallDuration.request(j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.Camera2StreamConfigurationMap.get();
                }
            }
        }

        private boolean getHighSpeedVideoFpsRangesFor(boolean z, boolean z2, org.reactivestreams.Subscriber<? super T> subscriber, boolean z3) {
            if (this.getHighSpeedVideoSizes.get()) {
                this.getOutputSizes.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th2 != null) {
                this.getOutputSizes.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.getInputSizeshNQ4ISI = true;
            return 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            T poll = this.getOutputSizes.poll();
            if (poll != null) {
                this.getOutputMinFrameDuration++;
                return poll;
            }
            int i = this.getOutputMinFrameDuration;
            if (i == 0) {
                return null;
            }
            this.getOutputMinFrameDuration = 0;
            this.getHighSpeedVideoSizesFor.getOutputStallDuration.request(i);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getOutputSizes.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getOutputSizes.clear();
        }
    }
}
