package rx.internal.operators;

/* loaded from: classes18.dex */
public final class OperatorGroupByEvicting<T, K, V> implements rx.Observable.Operator<rx.observables.GroupedObservable<K, V>, T> {
    final rx.functions.Func1<? super T, ? extends V> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<rx.functions.Action1<java.lang.Object>, java.util.Map<K, java.lang.Object>> getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    final rx.functions.Func1<? super T, ? extends K> getHighSpeedVideoSizes;

    public OperatorGroupByEvicting(rx.functions.Func1<? super T, ? extends K> func1) {
        this(func1, rx.internal.util.UtilityFunctions.identity(), rx.internal.util.RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupByEvicting(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
        this(func1, func12, rx.internal.util.RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupByEvicting(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, int i, boolean z, rx.functions.Func1<rx.functions.Action1<java.lang.Object>, java.util.Map<K, java.lang.Object>> func13) {
        this.getHighSpeedVideoSizes = func1;
        this.Camera2StreamConfigurationMap = func12;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getHighSpeedVideoFpsRanges = func13;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.Map<K, java.lang.Object> call;
        if (this.getHighSpeedVideoFpsRanges == null) {
            call = new java.util.concurrent.ConcurrentHashMap<>();
            concurrentLinkedQueue = null;
        } else {
            concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
            try {
                call = this.getHighSpeedVideoFpsRanges.call(new rx.internal.operators.OperatorGroupByEvicting.EvictionAction(concurrentLinkedQueue));
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwOrReport(th, subscriber);
                rx.Subscriber<? super T> empty = rx.observers.Subscribers.empty();
                empty.unsubscribe();
                return empty;
            }
        }
        final rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber groupBySubscriber = new rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber(subscriber, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, call, concurrentLinkedQueue);
        subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorGroupByEvicting.1
            @Override // rx.functions.Action0
            public void call() {
                groupBySubscriber.cancel();
            }
        }));
        subscriber.setProducer(groupBySubscriber.getOutputStallDurationlomOqCM);
        return groupBySubscriber;
    }

    public static final class GroupByProducer implements rx.Producer {
        final rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber<?, ?, ?> getHighResolutionOutputSizeshNQ4ISI;

        public GroupByProducer(rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = groupBySubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.requestMore(j);
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends rx.Subscriber<T> {
        static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        final rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;
        final java.util.Map<K, rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> getHighSpeedVideoSizesFor;
        final java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> getInputFormats;
        volatile boolean getInputSizeshNQ4ISI;
        java.lang.Throwable getOutputFormats;
        final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration;
        final rx.internal.producers.ProducerArbiter getOutputMinFrameDurationlomOqCM;
        final rx.functions.Func1<? super T, ? extends K> getOutputSizes;
        final java.util.concurrent.atomic.AtomicLong getOutputSizeshNQ4ISI;
        final java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> getOutputStallDuration = new java.util.concurrent.ConcurrentLinkedQueue();
        final rx.internal.operators.OperatorGroupByEvicting.GroupByProducer getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicInteger getValidOutputFormatsForInputhNQ4ISI;
        final rx.functions.Func1<? super T, ? extends V> isOutputSupportedForhNQ4ISI;

        public GroupBySubscriber(rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, int i, boolean z, java.util.Map<K, rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> map, java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> queue) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
            this.getOutputSizes = func1;
            this.isOutputSupportedForhNQ4ISI = func12;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = z;
            rx.internal.producers.ProducerArbiter producerArbiter = new rx.internal.producers.ProducerArbiter();
            this.getOutputMinFrameDurationlomOqCM = producerArbiter;
            producerArbiter.request(i);
            this.getOutputStallDurationlomOqCM = new rx.internal.operators.OperatorGroupByEvicting.GroupByProducer(this);
            this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();
            this.getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
            this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicInteger(1);
            this.getValidOutputFormatsForInputhNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
            this.getHighSpeedVideoSizesFor = map;
            this.getInputFormats = queue;
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.getOutputMinFrameDurationlomOqCM.setProducer(producer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public final void onNext(T t) {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> queue = this.getOutputStallDuration;
            rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                K call = this.getOutputSizes.call(t);
                java.lang.Object obj = call != null ? call : Camera2StreamConfigurationMap;
                rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V> groupedUnicast = this.getHighSpeedVideoSizesFor.get(obj);
                if (groupedUnicast == null) {
                    if (this.getHighSpeedVideoSizes.get()) {
                        return;
                    }
                    groupedUnicast = rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast.getHighResolutionOutputSizeshNQ4ISI(call, this, this.getHighSpeedVideoFpsRanges);
                    this.getHighSpeedVideoSizesFor.put(obj, groupedUnicast);
                    this.getOutputMinFrameDuration.getAndIncrement();
                    queue.offer(groupedUnicast);
                    getHighSpeedVideoFpsRanges();
                }
                try {
                    V call2 = this.isOutputSupportedForhNQ4ISI.call(t);
                    rx.internal.operators.OperatorGroupByEvicting.State<V, K> state = groupedUnicast.Camera2StreamConfigurationMap;
                    if (call2 == null) {
                        state.getHighResolutionOutputSizeshNQ4ISI = new java.lang.NullPointerException();
                        state.getHighSpeedVideoFpsRangesFor = true;
                    } else {
                        state.getOutputMinFrameDuration.offer(rx.internal.operators.NotificationLite.next(call2));
                    }
                    state.getHighSpeedVideoFpsRanges();
                    if (this.getInputFormats == null) {
                        return;
                    }
                    while (true) {
                        rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V> poll = this.getInputFormats.poll();
                        if (poll == null) {
                            return;
                        }
                        rx.internal.operators.OperatorGroupByEvicting.State<V, K> state2 = poll.Camera2StreamConfigurationMap;
                        state2.getHighSpeedVideoFpsRangesFor = true;
                        state2.getHighSpeedVideoFpsRanges();
                    }
                } catch (java.lang.Throwable th) {
                    unsubscribe();
                    getHighSpeedVideoSizes(subscriber, queue, th);
                }
            } catch (java.lang.Throwable th2) {
                unsubscribe();
                getHighSpeedVideoSizes(subscriber, queue, th2);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getInputSizeshNQ4ISI) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            this.getOutputFormats = th;
            this.getInputSizeshNQ4ISI = true;
            this.getOutputMinFrameDuration.decrementAndGet();
            getHighSpeedVideoFpsRanges();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getInputSizeshNQ4ISI) {
                return;
            }
            java.util.Iterator<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> it = this.getHighSpeedVideoSizesFor.values().iterator();
            while (it.hasNext()) {
                rx.internal.operators.OperatorGroupByEvicting.State<V, K> state = it.next().Camera2StreamConfigurationMap;
                state.getHighSpeedVideoFpsRangesFor = true;
                state.getHighSpeedVideoFpsRanges();
            }
            this.getHighSpeedVideoSizesFor.clear();
            java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> queue = this.getInputFormats;
            if (queue != null) {
                queue.clear();
            }
            this.getInputSizeshNQ4ISI = true;
            this.getOutputMinFrameDuration.decrementAndGet();
            getHighSpeedVideoFpsRanges();
        }

        public final void requestMore(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getOutputSizeshNQ4ISI, j);
            getHighSpeedVideoFpsRanges();
        }

        public final void cancel() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true) && this.getOutputMinFrameDuration.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = (K) Camera2StreamConfigurationMap;
            }
            if (this.getHighSpeedVideoSizesFor.remove(k) == null || this.getOutputMinFrameDuration.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }

        private void getHighSpeedVideoFpsRanges() {
            if (this.getValidOutputFormatsForInputhNQ4ISI.getAndIncrement() == 0) {
                java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> queue = this.getOutputStallDuration;
                rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                int i = 1;
                while (!Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, queue.isEmpty(), subscriber, queue)) {
                    long j = this.getOutputSizeshNQ4ISI.get();
                    boolean z = j == Long.MAX_VALUE;
                    long j2 = 0;
                    while (j != 0) {
                        boolean z2 = this.getInputSizeshNQ4ISI;
                        rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V> poll = queue.poll();
                        boolean z3 = poll == null;
                        if (!Camera2StreamConfigurationMap(z2, z3, subscriber, queue)) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j--;
                            j2--;
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        if (!z) {
                            this.getOutputSizeshNQ4ISI.addAndGet(j2);
                        }
                        this.getOutputMinFrameDurationlomOqCM.request(-j2);
                    }
                    i = this.getValidOutputFormatsForInputhNQ4ISI.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        private void getHighSpeedVideoSizes(rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber, java.util.Queue<?> queue, java.lang.Throwable th) {
            queue.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoSizesFor.values());
            this.getHighSpeedVideoSizesFor.clear();
            java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> queue2 = this.getInputFormats;
            if (queue2 != null) {
                queue2.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rx.internal.operators.OperatorGroupByEvicting.State<T, K> state = ((rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast) it.next()).Camera2StreamConfigurationMap;
                state.getHighResolutionOutputSizeshNQ4ISI = th;
                state.getHighSpeedVideoFpsRangesFor = true;
                state.getHighSpeedVideoFpsRanges();
            }
            subscriber.onError(th);
        }

        private boolean Camera2StreamConfigurationMap(boolean z, boolean z2, rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber, java.util.Queue<?> queue) {
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getOutputFormats;
            if (th != null) {
                getHighSpeedVideoSizes(subscriber, queue, th);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onCompleted();
            return true;
        }
    }

    static class EvictionAction<K, V> implements rx.functions.Action1<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> {
        final java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> Camera2StreamConfigurationMap;

        @Override // rx.functions.Action1
        public /* synthetic */ void call(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap.offer((rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast) obj);
        }

        EvictionAction(java.util.Queue<rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, V>> queue) {
            this.Camera2StreamConfigurationMap = queue;
        }
    }

    static final class GroupedUnicast<K, T> extends rx.observables.GroupedObservable<K, T> {
        final rx.internal.operators.OperatorGroupByEvicting.State<T, K> Camera2StreamConfigurationMap;

        public static <T, K> rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<K, T> getHighResolutionOutputSizeshNQ4ISI(K k, rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new rx.internal.operators.OperatorGroupByEvicting.GroupedUnicast<>(k, new rx.internal.operators.OperatorGroupByEvicting.State(groupBySubscriber, k, z));
        }

        private GroupedUnicast(K k, rx.internal.operators.OperatorGroupByEvicting.State<T, K> state) {
            super(k, state);
            this.Camera2StreamConfigurationMap = state;
        }
    }

    static final class State<T, K> extends java.util.concurrent.atomic.AtomicInteger implements rx.Producer, rx.Subscription, rx.Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final boolean getHighSpeedVideoSizes;
        final rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber<?, K, T> getHighSpeedVideoSizesFor;
        final K getOutputFormats;
        final java.util.Queue<java.lang.Object> getOutputMinFrameDuration = new java.util.concurrent.ConcurrentLinkedQueue();
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicReference<rx.Subscriber<? super T>> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicLong getInputFormats = new java.util.concurrent.atomic.AtomicLong();

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber<? super T> subscriber = (rx.Subscriber) obj;
            if (this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
                subscriber.add(this);
                subscriber.setProducer(this);
                this.Camera2StreamConfigurationMap.lazySet(subscriber);
                getHighSpeedVideoFpsRanges();
                return;
            }
            subscriber.onError(new java.lang.IllegalStateException("Only one Subscriber allowed!"));
        }

        public State(rx.internal.operators.OperatorGroupByEvicting.GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.getHighSpeedVideoSizesFor = groupBySubscriber;
            this.getOutputFormats = k;
            this.getHighSpeedVideoSizes = z;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j != 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getInputFormats, j);
                getHighSpeedVideoFpsRanges();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.getHighSpeedVideoFpsRanges.get();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.getHighSpeedVideoSizesFor.cancel(this.getOutputFormats);
            }
        }

        final void getHighSpeedVideoFpsRanges() {
            if (getAndIncrement() != 0) {
                return;
            }
            java.util.Queue<java.lang.Object> queue = this.getOutputMinFrameDuration;
            boolean z = this.getHighSpeedVideoSizes;
            rx.Subscriber<? super T> subscriber = this.Camera2StreamConfigurationMap.get();
            int i = 1;
            while (true) {
                if (subscriber != null) {
                    if (getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, queue.isEmpty(), subscriber, z)) {
                        return;
                    }
                    long j = this.getInputFormats.get();
                    boolean z2 = j == Long.MAX_VALUE;
                    long j2 = 0;
                    while (j != 0) {
                        boolean z3 = this.getHighSpeedVideoFpsRangesFor;
                        java.lang.Object poll = queue.poll();
                        boolean z4 = poll == null;
                        if (!getHighSpeedVideoFpsRanges(z3, z4, subscriber, z)) {
                            if (z4) {
                                break;
                            }
                            subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                            j--;
                            j2--;
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        if (!z2) {
                            this.getInputFormats.addAndGet(j2);
                        }
                        this.getHighSpeedVideoSizesFor.getOutputMinFrameDurationlomOqCM.request(-j2);
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

        private boolean getHighSpeedVideoFpsRanges(boolean z, boolean z2, rx.Subscriber<? super T> subscriber, boolean z3) {
            if (this.getHighSpeedVideoFpsRanges.get()) {
                this.getOutputMinFrameDuration.clear();
                this.getHighSpeedVideoSizesFor.cancel(this.getOutputFormats);
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
                    subscriber.onCompleted();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th2 != null) {
                this.getOutputMinFrameDuration.clear();
                subscriber.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            subscriber.onCompleted();
            return true;
        }
    }
}
