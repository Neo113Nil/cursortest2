package rx.internal.operators;

@java.lang.Deprecated
/* loaded from: classes18.dex */
public final class OperatorGroupBy<T, K, V> implements rx.Observable.Operator<rx.observables.GroupedObservable<K, V>, T> {
    final rx.functions.Func1<? super T, ? extends K> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final rx.functions.Func1<rx.functions.Action1<K>, java.util.Map<K, java.lang.Object>> getHighSpeedVideoFpsRanges;
    final rx.functions.Func1<? super T, ? extends V> getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public OperatorGroupBy(rx.functions.Func1<? super T, ? extends K> func1) {
        this(func1, rx.internal.util.UtilityFunctions.identity(), rx.internal.util.RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
        this(func1, func12, rx.internal.util.RxRingBuffer.SIZE, false, null);
    }

    public OperatorGroupBy(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func1<rx.functions.Action1<K>, java.util.Map<K, java.lang.Object>> func13) {
        this(func1, func12, rx.internal.util.RxRingBuffer.SIZE, false, func13);
    }

    public OperatorGroupBy(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, int i, boolean z, rx.functions.Func1<rx.functions.Action1<K>, java.util.Map<K, java.lang.Object>> func13) {
        this.Camera2StreamConfigurationMap = func1;
        this.getHighSpeedVideoFpsRangesFor = func12;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = func13;
    }

    @Override // rx.functions.Func1
    public final rx.Subscriber<? super T> call(rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber) {
        try {
            final rx.internal.operators.OperatorGroupBy.GroupBySubscriber groupBySubscriber = new rx.internal.operators.OperatorGroupBy.GroupBySubscriber(subscriber, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
            subscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.internal.operators.OperatorGroupBy.1
                @Override // rx.functions.Action0
                public void call() {
                    groupBySubscriber.cancel();
                }
            }));
            subscriber.setProducer(groupBySubscriber.getOutputStallDurationlomOqCM);
            return groupBySubscriber;
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwOrReport(th, subscriber);
            rx.Subscriber<? super T> empty = rx.observers.Subscribers.empty();
            empty.unsubscribe();
            return empty;
        }
    }

    public static final class GroupByProducer implements rx.Producer {
        final rx.internal.operators.OperatorGroupBy.GroupBySubscriber<?, ?, ?> getHighResolutionOutputSizeshNQ4ISI;

        public GroupByProducer(rx.internal.operators.OperatorGroupBy.GroupBySubscriber<?, ?, ?> groupBySubscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = groupBySubscriber;
        }

        @Override // rx.Producer
        public final void request(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI.requestMore(j);
        }
    }

    public static final class GroupBySubscriber<T, K, V> extends rx.Subscriber<T> {
        static final java.lang.Object getHighSpeedVideoSizes = new java.lang.Object();
        final int Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;
        final rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        java.lang.Throwable getHighSpeedVideoSizesFor;
        final java.util.concurrent.atomic.AtomicInteger getInputFormats;
        final java.util.Map<java.lang.Object, rx.internal.operators.OperatorGroupBy.GroupedUnicast<K, V>> getInputSizeshNQ4ISI;
        volatile boolean getOutputFormats;
        final java.util.Queue<K> getOutputMinFrameDuration;
        final java.util.Map<java.lang.Object, rx.internal.operators.OperatorGroupBy.GroupedUnicast<K, V>> getOutputMinFrameDurationlomOqCM;
        final java.util.Queue<rx.observables.GroupedObservable<K, V>> getOutputSizes = new java.util.concurrent.ConcurrentLinkedQueue();
        final java.util.concurrent.atomic.AtomicLong getOutputSizeshNQ4ISI;
        final rx.functions.Func1<? super T, ? extends K> getOutputStallDuration;
        final rx.internal.operators.OperatorGroupBy.GroupByProducer getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicInteger getValidOutputFormatsForInputhNQ4ISI;
        final rx.internal.producers.ProducerArbiter isOutputSupportedFor;
        final rx.functions.Func1<? super T, ? extends V> toString;

        public GroupBySubscriber(rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber, rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, int i, boolean z, rx.functions.Func1<rx.functions.Action1<K>, java.util.Map<K, java.lang.Object>> func13) {
            this.getHighSpeedVideoFpsRanges = subscriber;
            this.getOutputStallDuration = func1;
            this.toString = func12;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRangesFor = z;
            rx.internal.producers.ProducerArbiter producerArbiter = new rx.internal.producers.ProducerArbiter();
            this.isOutputSupportedFor = producerArbiter;
            producerArbiter.request(i);
            this.getOutputStallDurationlomOqCM = new rx.internal.operators.OperatorGroupBy.GroupByProducer(this);
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
            this.getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong();
            this.getInputFormats = new java.util.concurrent.atomic.AtomicInteger(1);
            this.getValidOutputFormatsForInputhNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
            if (func13 == null) {
                this.getInputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap();
                this.getOutputMinFrameDuration = null;
            } else {
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                this.getOutputMinFrameDuration = concurrentLinkedQueue;
                this.getInputSizeshNQ4ISI = func13.call(new rx.internal.operators.OperatorGroupBy.GroupBySubscriber.EvictionAction(concurrentLinkedQueue));
            }
            this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.ConcurrentHashMap();
        }

        static class EvictionAction<K> implements rx.functions.Action1<K> {
            final java.util.Queue<K> getHighSpeedVideoSizes;

            EvictionAction(java.util.Queue<K> queue) {
                this.getHighSpeedVideoSizes = queue;
            }

            @Override // rx.functions.Action1
            public void call(K k) {
                this.getHighSpeedVideoSizes.offer(k);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public final void setProducer(rx.Producer producer) {
            this.isOutputSupportedFor.setProducer(producer);
        }

        @Override // rx.Observer
        public final void onNext(T t) {
            boolean z;
            if (this.getOutputFormats) {
                return;
            }
            java.util.Queue<?> queue = this.getOutputSizes;
            rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber = this.getHighSpeedVideoFpsRanges;
            try {
                K call = this.getOutputStallDuration.call(t);
                java.lang.Object obj = call != null ? call : getHighSpeedVideoSizes;
                rx.internal.operators.OperatorGroupBy.GroupedUnicast<K, V> groupedUnicast = this.getInputSizeshNQ4ISI.get(obj);
                if (groupedUnicast != null) {
                    z = false;
                } else {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.get()) {
                        return;
                    }
                    groupedUnicast = rx.internal.operators.OperatorGroupBy.GroupedUnicast.Camera2StreamConfigurationMap(call, this, this.getHighSpeedVideoFpsRangesFor);
                    this.getInputSizeshNQ4ISI.put(obj, groupedUnicast);
                    if (this.getOutputMinFrameDuration != null) {
                        this.getOutputMinFrameDurationlomOqCM.put(obj, groupedUnicast);
                    }
                    this.getInputFormats.getAndIncrement();
                    z = true;
                }
                try {
                    V call2 = this.toString.call(t);
                    rx.internal.operators.OperatorGroupBy.State<V, K> state = groupedUnicast.getHighSpeedVideoFpsRangesFor;
                    if (call2 == null) {
                        state.getHighSpeedVideoFpsRanges = new java.lang.NullPointerException();
                        state.getHighSpeedVideoSizes = true;
                    } else {
                        state.getOutputMinFrameDuration.offer(rx.internal.operators.NotificationLite.next(call2));
                    }
                    state.getHighSpeedVideoFpsRangesFor();
                    if (this.getOutputMinFrameDuration != null) {
                        while (true) {
                            K poll = this.getOutputMinFrameDuration.poll();
                            if (poll == null) {
                                break;
                            }
                            rx.internal.operators.OperatorGroupBy.GroupedUnicast<K, V> remove = this.getOutputMinFrameDurationlomOqCM.remove(poll);
                            if (remove != null) {
                                rx.internal.operators.OperatorGroupBy.State<V, K> state2 = remove.getHighSpeedVideoFpsRangesFor;
                                state2.getHighSpeedVideoSizes = true;
                                state2.getHighSpeedVideoFpsRangesFor();
                            }
                        }
                    }
                    if (z) {
                        queue.offer(groupedUnicast);
                        Camera2StreamConfigurationMap();
                    }
                } catch (java.lang.Throwable th) {
                    unsubscribe();
                    getHighSpeedVideoFpsRanges(subscriber, queue, th);
                }
            } catch (java.lang.Throwable th2) {
                unsubscribe();
                getHighSpeedVideoFpsRanges(subscriber, queue, th2);
            }
        }

        @Override // rx.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputFormats) {
                rx.plugins.RxJavaHooks.onError(th);
                return;
            }
            this.getHighSpeedVideoSizesFor = th;
            this.getOutputFormats = true;
            this.getInputFormats.decrementAndGet();
            Camera2StreamConfigurationMap();
        }

        @Override // rx.Observer
        public final void onCompleted() {
            if (this.getOutputFormats) {
                return;
            }
            java.util.Iterator<rx.internal.operators.OperatorGroupBy.GroupedUnicast<K, V>> it = this.getInputSizeshNQ4ISI.values().iterator();
            while (it.hasNext()) {
                rx.internal.operators.OperatorGroupBy.State<V, K> state = it.next().getHighSpeedVideoFpsRangesFor;
                state.getHighSpeedVideoSizes = true;
                state.getHighSpeedVideoFpsRangesFor();
            }
            this.getInputSizeshNQ4ISI.clear();
            if (this.getOutputMinFrameDuration != null) {
                this.getOutputMinFrameDurationlomOqCM.clear();
                this.getOutputMinFrameDuration.clear();
            }
            this.getOutputFormats = true;
            this.getInputFormats.decrementAndGet();
            Camera2StreamConfigurationMap();
        }

        public final void requestMore(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= 0 required but it was ".concat(java.lang.String.valueOf(j)));
            }
            rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getOutputSizeshNQ4ISI, j);
            Camera2StreamConfigurationMap();
        }

        public final void cancel() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true) && this.getInputFormats.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public final void cancel(K k) {
            if (k == null) {
                k = (K) getHighSpeedVideoSizes;
            }
            if (this.getInputSizeshNQ4ISI.remove(k) != null && this.getInputFormats.decrementAndGet() == 0) {
                unsubscribe();
            }
            if (this.getOutputMinFrameDuration != null) {
                this.getOutputMinFrameDurationlomOqCM.remove(k);
            }
        }

        private void Camera2StreamConfigurationMap() {
            if (this.getValidOutputFormatsForInputhNQ4ISI.getAndIncrement() == 0) {
                java.util.Queue<rx.observables.GroupedObservable<K, V>> queue = this.getOutputSizes;
                rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber = this.getHighSpeedVideoFpsRanges;
                int i = 1;
                while (!getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats, queue.isEmpty(), subscriber, queue)) {
                    long j = this.getOutputSizeshNQ4ISI.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.getOutputFormats;
                        rx.observables.GroupedObservable<K, V> poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!getHighResolutionOutputSizeshNQ4ISI(z, z2, subscriber, queue)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            rx.internal.operators.BackpressureUtils.produced(this.getOutputSizeshNQ4ISI, j2);
                        }
                        this.isOutputSupportedFor.request(j2);
                    }
                    i = this.getValidOutputFormatsForInputhNQ4ISI.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        private void getHighSpeedVideoFpsRanges(rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber, java.util.Queue<?> queue, java.lang.Throwable th) {
            queue.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getInputSizeshNQ4ISI.values());
            this.getInputSizeshNQ4ISI.clear();
            if (this.getOutputMinFrameDuration != null) {
                this.getOutputMinFrameDurationlomOqCM.clear();
                this.getOutputMinFrameDuration.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rx.internal.operators.OperatorGroupBy.State<T, K> state = ((rx.internal.operators.OperatorGroupBy.GroupedUnicast) it.next()).getHighSpeedVideoFpsRangesFor;
                state.getHighSpeedVideoFpsRanges = th;
                state.getHighSpeedVideoSizes = true;
                state.getHighSpeedVideoFpsRangesFor();
            }
            subscriber.onError(th);
        }

        private boolean getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2, rx.Subscriber<? super rx.observables.GroupedObservable<K, V>> subscriber, java.util.Queue<?> queue) {
            if (!z) {
                return false;
            }
            java.lang.Throwable th = this.getHighSpeedVideoSizesFor;
            if (th != null) {
                getHighSpeedVideoFpsRanges(subscriber, queue, th);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges.onCompleted();
            return true;
        }
    }

    static final class GroupedUnicast<K, T> extends rx.observables.GroupedObservable<K, T> {
        final rx.internal.operators.OperatorGroupBy.State<T, K> getHighSpeedVideoFpsRangesFor;

        public static <T, K> rx.internal.operators.OperatorGroupBy.GroupedUnicast<K, T> Camera2StreamConfigurationMap(K k, rx.internal.operators.OperatorGroupBy.GroupBySubscriber<?, K, T> groupBySubscriber, boolean z) {
            return new rx.internal.operators.OperatorGroupBy.GroupedUnicast<>(k, new rx.internal.operators.OperatorGroupBy.State(groupBySubscriber, k, z));
        }

        private GroupedUnicast(K k, rx.internal.operators.OperatorGroupBy.State<T, K> state) {
            super(k, state);
            this.getHighSpeedVideoFpsRangesFor = state;
        }
    }

    static final class State<T, K> extends java.util.concurrent.atomic.AtomicInteger implements rx.Producer, rx.Subscription, rx.Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        final rx.internal.operators.OperatorGroupBy.GroupBySubscriber<?, K, T> getInputFormats;
        final K getOutputFormats;
        final java.util.Queue<java.lang.Object> getOutputMinFrameDuration = new java.util.concurrent.ConcurrentLinkedQueue();
        final java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicReference<rx.Subscriber<? super T>> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicLong();

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Object obj) {
            rx.Subscriber<? super T> subscriber = (rx.Subscriber) obj;
            if (this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
                subscriber.add(this);
                subscriber.setProducer(this);
                this.getHighSpeedVideoFpsRangesFor.lazySet(subscriber);
                getHighSpeedVideoFpsRangesFor();
                return;
            }
            subscriber.onError(new java.lang.IllegalStateException("Only one Subscriber allowed!"));
        }

        public State(rx.internal.operators.OperatorGroupBy.GroupBySubscriber<?, K, T> groupBySubscriber, K k, boolean z) {
            this.getInputFormats = groupBySubscriber;
            this.getOutputFormats = k;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        @Override // rx.Producer
        public final void request(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("n >= required but it was ".concat(java.lang.String.valueOf(j)));
            }
            if (j != 0) {
                rx.internal.operators.BackpressureUtils.getAndAddRequest(this.getHighSpeedVideoSizesFor, j);
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // rx.Subscription
        public final boolean isUnsubscribed() {
            return this.Camera2StreamConfigurationMap.get();
        }

        @Override // rx.Subscription
        public final void unsubscribe() {
            if (this.Camera2StreamConfigurationMap.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.getInputFormats.cancel(this.getOutputFormats);
            }
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() != 0) {
                return;
            }
            java.util.Queue<java.lang.Object> queue = this.getOutputMinFrameDuration;
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            rx.Subscriber<? super T> subscriber = this.getHighSpeedVideoFpsRangesFor.get();
            int i = 1;
            while (true) {
                if (subscriber != null) {
                    if (Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, queue.isEmpty(), subscriber, z)) {
                        return;
                    }
                    long j = this.getHighSpeedVideoSizesFor.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z2 = this.getHighSpeedVideoSizes;
                        java.lang.Object poll = queue.poll();
                        boolean z3 = poll == null;
                        if (!Camera2StreamConfigurationMap(z2, z3, subscriber, z)) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext((java.lang.Object) rx.internal.operators.NotificationLite.getValue(poll));
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            rx.internal.operators.BackpressureUtils.produced(this.getHighSpeedVideoSizesFor, j2);
                        }
                        this.getInputFormats.isOutputSupportedFor.request(j2);
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (subscriber == null) {
                    subscriber = this.getHighSpeedVideoFpsRangesFor.get();
                }
            }
        }

        private boolean Camera2StreamConfigurationMap(boolean z, boolean z2, rx.Subscriber<? super T> subscriber, boolean z3) {
            if (this.Camera2StreamConfigurationMap.get()) {
                this.getOutputMinFrameDuration.clear();
                this.getInputFormats.cancel(this.getOutputFormats);
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onCompleted();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getHighSpeedVideoFpsRanges;
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
