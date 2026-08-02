package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableGroupBy<T, K, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.observables.GroupedObservable<K, V>> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends V> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super T, ? extends K> getHighSpeedVideoFpsRangesFor;

    public ObservableGroupBy(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, int i, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    public static final class GroupByObserver<T, K, V> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
        private static final long serialVersionUID = -3688291656102519502L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, V>> getHighSpeedVideoSizesFor = new java.util.concurrent.ConcurrentHashMap();
        final io.reactivex.functions.Function<? super T, ? extends V> getInputSizeshNQ4ISI;
        final io.reactivex.functions.Function<? super T, ? extends K> getOutputFormats;
        io.reactivex.disposables.Disposable getOutputMinFrameDuration;

        public GroupByObserver(io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> observer, io.reactivex.functions.Function<? super T, ? extends K> function, io.reactivex.functions.Function<? super T, ? extends V> function2, int i, boolean z) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getOutputFormats = function;
            this.getInputSizeshNQ4ISI = function2;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = z;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputMinFrameDuration, disposable)) {
                this.getOutputMinFrameDuration = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            try {
                K apply = this.getOutputFormats.apply(t);
                java.lang.Object obj = apply != null ? apply : Camera2StreamConfigurationMap;
                io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, V> groupedUnicast = this.getHighSpeedVideoSizesFor.get(obj);
                if (groupedUnicast == null) {
                    if (this.getHighSpeedVideoSizes.get()) {
                        return;
                    }
                    groupedUnicast = io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast.getHighSpeedVideoFpsRangesFor(apply, this.getHighResolutionOutputSizeshNQ4ISI, this, this.getHighSpeedVideoFpsRangesFor);
                    this.getHighSpeedVideoSizesFor.put(obj, groupedUnicast);
                    getAndIncrement();
                    this.getHighSpeedVideoFpsRanges.onNext(groupedUnicast);
                }
                try {
                    java.lang.Object requireNonNull = io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputSizeshNQ4ISI.apply(t), "The value supplied is null");
                    io.reactivex.internal.operators.observable.ObservableGroupBy.State<V, K> state = groupedUnicast.getHighSpeedVideoSizes;
                    state.getOutputMinFrameDuration.offer(requireNonNull);
                    state.getHighResolutionOutputSizeshNQ4ISI();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getOutputMinFrameDuration.dispose();
                    onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getOutputMinFrameDuration.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoSizesFor.values());
            this.getHighSpeedVideoSizesFor.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> state = ((io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) it.next()).getHighSpeedVideoSizes;
                state.getHighResolutionOutputSizeshNQ4ISI = th;
                state.getHighSpeedVideoSizes = true;
                state.getHighResolutionOutputSizeshNQ4ISI();
            }
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighSpeedVideoSizesFor.values());
            this.getHighSpeedVideoSizesFor.clear();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> state = ((io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) it.next()).getHighSpeedVideoSizes;
                state.getHighSpeedVideoSizes = true;
                state.getHighResolutionOutputSizeshNQ4ISI();
            }
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoSizes.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.getOutputMinFrameDuration.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.get();
        }

        public final void cancel(K k) {
            if (k == null) {
                k = (K) Camera2StreamConfigurationMap;
            }
            this.getHighSpeedVideoSizesFor.remove(k);
            if (decrementAndGet() == 0) {
                this.getOutputMinFrameDuration.dispose();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class GroupedUnicast<K, T> extends io.reactivex.observables.GroupedObservable<K, T> {
        final io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> getHighSpeedVideoSizes;

        public static <T, K> io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, T> getHighSpeedVideoFpsRangesFor(K k, int i, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> groupByObserver, boolean z) {
            return new io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<>(k, new io.reactivex.internal.operators.observable.ObservableGroupBy.State(i, groupByObserver, k, z));
        }

        private GroupedUnicast(K k, io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> state) {
            super(k);
            this.getHighSpeedVideoSizes = state;
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoSizes.subscribe(observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class State<T, K> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.ObservableSource<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final boolean Camera2StreamConfigurationMap;
        java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> getHighSpeedVideoSizesFor;
        final K getInputFormats;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getOutputMinFrameDuration;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();

        State(int i, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> groupByObserver, K k, boolean z) {
            this.getOutputMinFrameDuration = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.getHighSpeedVideoSizesFor = groupByObserver;
            this.getInputFormats = k;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                this.getHighSpeedVideoSizesFor.cancel(this.getInputFormats);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.get();
        }

        @Override // io.reactivex.ObservableSource
        public final void subscribe(io.reactivex.Observer<? super T> observer) {
            if (this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
                observer.onSubscribe(this);
                this.getHighSpeedVideoFpsRangesFor.lazySet(observer);
                if (this.getHighSpeedVideoFpsRanges.get()) {
                    this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                    return;
                } else {
                    getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
            }
            io.reactivex.internal.disposables.EmptyDisposable.error(new java.lang.IllegalStateException("Only one Observer allowed!"), observer);
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getOutputMinFrameDuration;
            boolean z = this.Camera2StreamConfigurationMap;
            io.reactivex.Observer<? super T> observer = this.getHighSpeedVideoFpsRangesFor.get();
            int i = 1;
            while (true) {
                if (observer != null) {
                    while (true) {
                        boolean z2 = this.getHighSpeedVideoSizes;
                        T poll = spscLinkedArrayQueue.poll();
                        boolean z3 = poll == null;
                        if (!getHighSpeedVideoSizes(z2, z3, observer, z)) {
                            if (z3) {
                                break;
                            } else {
                                observer.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
                if (observer == null) {
                    observer = this.getHighSpeedVideoFpsRangesFor.get();
                }
            }
        }

        private boolean getHighSpeedVideoSizes(boolean z, boolean z2, io.reactivex.Observer<? super T> observer, boolean z3) {
            if (this.getHighSpeedVideoFpsRanges.get()) {
                this.getOutputMinFrameDuration.clear();
                this.getHighSpeedVideoSizesFor.cancel(this.getInputFormats);
                this.getHighSpeedVideoFpsRangesFor.lazySet(null);
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
                this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                return true;
            }
            java.lang.Throwable th2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (th2 != null) {
                this.getOutputMinFrameDuration.clear();
                this.getHighSpeedVideoFpsRangesFor.lazySet(null);
                observer.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.getHighSpeedVideoFpsRangesFor.lazySet(null);
            observer.onComplete();
            return true;
        }
    }
}
