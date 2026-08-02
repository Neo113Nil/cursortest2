package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableReplay<T> extends io.reactivex.observables.ConnectableObservable<T> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T>, io.reactivex.disposables.Disposable {
    static final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableReplay.UnBoundedFactory();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRanges;
    final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface BufferSupplier<T> {
        io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> getHighSpeedVideoFpsRanges();
    }

    /* loaded from: classes17.dex */
    interface ReplayBuffer<T> {
        void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable);

        void getHighSpeedVideoFpsRangesFor(T t);

        void getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(java.lang.Throwable th);
    }

    public static <U, R> io.reactivex.Observable<R> multicastSelector(java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> function) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableReplay.MulticastReplay(callable, function));
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> observeOn(io.reactivex.observables.ConnectableObservable<T> connectableObservable, io.reactivex.Scheduler scheduler) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.observables.ConnectableObservable) new io.reactivex.internal.operators.observable.ObservableReplay.Replay(connectableObservable, connectableObservable.observeOn(scheduler)));
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> createFrom(io.reactivex.ObservableSource<? extends T> observableSource) {
        return getHighSpeedVideoSizes(observableSource, getHighResolutionOutputSizeshNQ4ISI);
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, int i) {
        if (i == Integer.MAX_VALUE) {
            return createFrom(observableSource);
        }
        return getHighSpeedVideoSizes(observableSource, new io.reactivex.internal.operators.observable.ObservableReplay.ReplayBufferSupplier(i));
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return create(observableSource, j, timeUnit, scheduler, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return getHighSpeedVideoSizes(observableSource, new io.reactivex.internal.operators.observable.ObservableReplay.ScheduledReplaySupplier(i, j, timeUnit, scheduler));
    }

    private static <T> io.reactivex.observables.ConnectableObservable<T> getHighSpeedVideoSizes(io.reactivex.ObservableSource<T> observableSource, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferSupplier) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.observables.ConnectableObservable) new io.reactivex.internal.operators.observable.ObservableReplay(new io.reactivex.internal.operators.observable.ObservableReplay.ReplaySource(atomicReference, bufferSupplier), observableSource, atomicReference, bufferSupplier));
    }

    private ObservableReplay(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<T> observableSource2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> atomicReference, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferSupplier) {
        this.getHighSpeedVideoSizes = observableSource;
        this.getHighSpeedVideoFpsRanges = observableSource2;
        this.Camera2StreamConfigurationMap = atomicReference;
        this.getHighSpeedVideoFpsRangesFor = bufferSupplier;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final io.reactivex.ObservableSource<T> source() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.Camera2StreamConfigurationMap.lazySet(null);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver = this.Camera2StreamConfigurationMap.get();
        return replayObserver == null || replayObserver.isDisposed();
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoSizes.subscribe(observer);
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public final void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.Camera2StreamConfigurationMap.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver2 = new io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<>(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges());
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z = !replayObserver.getOutputFormats.get() && replayObserver.getOutputFormats.compareAndSet(false, true);
        try {
            consumer.accept(replayObserver);
            if (z) {
                this.getHighSpeedVideoFpsRanges.subscribe(replayObserver);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                replayObserver.getOutputFormats.compareAndSet(true, false);
            }
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[0];
        static final io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[0];
        private static final long serialVersionUID = -533785617179540163L;
        final io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[]> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
        final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean();

        ReplayObserver(io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> replayBuffer) {
            this.Camera2StreamConfigurationMap = replayBuffer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.get() == getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.set(getHighSpeedVideoSizes);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.getHighSpeedVideoFpsRangesFor.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerDisposableArr[i].equals(innerDisposable)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
                } else {
                    io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr3 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[length - 1];
                    java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    java.lang.System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, innerDisposableArr, innerDisposableArr2));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                Camera2StreamConfigurationMap();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(t);
            Camera2StreamConfigurationMap();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = true;
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(th);
                getHighSpeedVideoFpsRangesFor();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
            getHighSpeedVideoFpsRangesFor();
        }

        private void Camera2StreamConfigurationMap() {
            for (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable : this.getHighSpeedVideoFpsRangesFor.get()) {
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(innerDisposable);
            }
        }

        private void getHighSpeedVideoFpsRangesFor() {
            for (io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable : this.getHighSpeedVideoFpsRangesFor.getAndSet(getHighSpeedVideoSizes)) {
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(innerDisposable);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class InnerDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2728361546769921047L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> getHighSpeedVideoSizes;

        InnerDisposable(io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver, io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoSizes = replayObserver;
            this.Camera2StreamConfigurationMap = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(this);
        }
    }

    /* loaded from: classes17.dex */
    static final class UnboundedReplayBuffer<T> extends java.util.ArrayList<java.lang.Object> implements io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int getHighSpeedVideoFpsRanges;

        UnboundedReplayBuffer() {
            super(16);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            add(io.reactivex.internal.util.NotificationLite.next(t));
            this.getHighSpeedVideoFpsRanges++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
            add(io.reactivex.internal.util.NotificationLite.error(th));
            this.getHighSpeedVideoFpsRanges++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
            add(io.reactivex.internal.util.NotificationLite.complete());
            this.getHighSpeedVideoFpsRanges++;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                io.reactivex.Observer<? super T> observer = innerDisposable.Camera2StreamConfigurationMap;
                int i = 1;
                while (!innerDisposable.isDisposed()) {
                    int i2 = this.getHighSpeedVideoFpsRanges;
                    java.lang.Integer num = (java.lang.Integer) innerDisposable.getHighSpeedVideoFpsRanges;
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (io.reactivex.internal.util.NotificationLite.accept(get(intValue), observer) || innerDisposable.isDisposed()) {
                            return;
                        } else {
                            intValue++;
                        }
                    }
                    innerDisposable.getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(intValue);
                    i = innerDisposable.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class Node extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final java.lang.Object Camera2StreamConfigurationMap;

        Node(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = obj;
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BoundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.Node> implements io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        io.reactivex.internal.operators.observable.ObservableReplay.Node getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            return obj;
        }

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj) {
            return obj;
        }

        BoundedReplayBuffer() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = new io.reactivex.internal.operators.observable.ObservableReplay.Node(null);
            this.getHighResolutionOutputSizeshNQ4ISI = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void getHighSpeedVideoFpsRangesFor(T t) {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = new io.reactivex.internal.operators.observable.ObservableReplay.Node(getHighSpeedVideoSizes(io.reactivex.internal.util.NotificationLite.next(t)));
            this.getHighResolutionOutputSizeshNQ4ISI.set(node);
            this.getHighResolutionOutputSizeshNQ4ISI = node;
            this.getHighSpeedVideoSizes++;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = new io.reactivex.internal.operators.observable.ObservableReplay.Node(getHighSpeedVideoSizes(io.reactivex.internal.util.NotificationLite.error(th)));
            this.getHighResolutionOutputSizeshNQ4ISI.set(node);
            this.getHighResolutionOutputSizeshNQ4ISI = node;
            this.getHighSpeedVideoSizes++;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = new io.reactivex.internal.operators.observable.ObservableReplay.Node(getHighSpeedVideoSizes(io.reactivex.internal.util.NotificationLite.complete()));
            this.getHighResolutionOutputSizeshNQ4ISI.set(node);
            this.getHighResolutionOutputSizeshNQ4ISI = node;
            this.getHighSpeedVideoSizes++;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer
        public final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                int i = 1;
                do {
                    io.reactivex.internal.operators.observable.ObservableReplay.Node node = (io.reactivex.internal.operators.observable.ObservableReplay.Node) innerDisposable.getHighSpeedVideoFpsRanges;
                    if (node == null) {
                        node = getHighSpeedVideoFpsRangesFor();
                        innerDisposable.getHighSpeedVideoFpsRanges = node;
                    }
                    while (!innerDisposable.isDisposed()) {
                        io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = node.get();
                        if (node2 != null) {
                            if (io.reactivex.internal.util.NotificationLite.accept(getHighResolutionOutputSizeshNQ4ISI(node2.Camera2StreamConfigurationMap), innerDisposable.Camera2StreamConfigurationMap)) {
                                innerDisposable.getHighSpeedVideoFpsRanges = null;
                                return;
                            }
                            node = node2;
                        } else {
                            innerDisposable.getHighSpeedVideoFpsRanges = node;
                            i = innerDisposable.addAndGet(-i);
                        }
                    }
                    return;
                } while (i != 0);
            }
        }

        io.reactivex.internal.operators.observable.ObservableReplay.Node getHighSpeedVideoFpsRangesFor() {
            return get();
        }

        void getHighSpeedVideoFpsRanges() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = get();
            if (node.Camera2StreamConfigurationMap != null) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = new io.reactivex.internal.operators.observable.ObservableReplay.Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SizeBoundReplayBuffer<T> extends io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int Camera2StreamConfigurationMap;

        SizeBoundReplayBuffer(int i) {
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoSizes > this.Camera2StreamConfigurationMap) {
                this.getHighSpeedVideoSizes--;
                set(get().get());
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SizeAndTimeBoundReplayBuffer<T> extends io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int Camera2StreamConfigurationMap;
        final long getHighSpeedVideoFpsRanges;
        final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.TimeUnit getInputFormats;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRangesFor = scheduler;
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = j;
            this.getInputFormats = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj) {
            return new io.reactivex.schedulers.Timed(obj, this.getHighSpeedVideoFpsRangesFor.now(this.getInputFormats), this.getInputFormats);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            return ((io.reactivex.schedulers.Timed) obj).value();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node;
            long now = this.getHighSpeedVideoFpsRangesFor.now(this.getInputFormats);
            long j = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = get();
            io.reactivex.internal.operators.observable.ObservableReplay.Node node3 = node2.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 != null) {
                    if (this.getHighSpeedVideoSizes <= this.Camera2StreamConfigurationMap) {
                        if (((io.reactivex.schedulers.Timed) node2.Camera2StreamConfigurationMap).time() > now - j) {
                            break;
                        }
                        i++;
                        this.getHighSpeedVideoSizes--;
                        node3 = node2.get();
                    } else {
                        i++;
                        this.getHighSpeedVideoSizes--;
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
        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoFpsRanges() {
            long now = this.getHighSpeedVideoFpsRangesFor.now(this.getInputFormats);
            long j = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.operators.observable.ObservableReplay.Node node = get();
            io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = node.get();
            int i = 0;
            while (true) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node3 = node2;
                io.reactivex.internal.operators.observable.ObservableReplay.Node node4 = node;
                node = node3;
                if (node == null || this.getHighSpeedVideoSizes <= 1 || ((io.reactivex.schedulers.Timed) node.Camera2StreamConfigurationMap).time() > now - j) {
                    break;
                }
                i++;
                this.getHighSpeedVideoSizes--;
                node2 = node.get();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final io.reactivex.internal.operators.observable.ObservableReplay.Node getHighSpeedVideoFpsRangesFor() {
            io.reactivex.internal.operators.observable.ObservableReplay.Node node;
            long now = this.getHighSpeedVideoFpsRangesFor.now(this.getInputFormats);
            long j = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.operators.observable.ObservableReplay.Node node2 = get();
            io.reactivex.internal.operators.observable.ObservableReplay.Node node3 = node2.get();
            while (true) {
                io.reactivex.internal.operators.observable.ObservableReplay.Node node4 = node3;
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
    static final class UnBoundedFactory implements io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<java.lang.Object> {
        UnBoundedFactory() {
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<java.lang.Object> getHighSpeedVideoFpsRanges() {
            return new io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer();
        }
    }

    /* loaded from: classes17.dex */
    static final class DisposeConsumer<R> implements io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private final io.reactivex.internal.operators.observable.ObserverResourceWrapper<R> getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
            this.getHighSpeedVideoSizes.setResource(disposable);
        }

        DisposeConsumer(io.reactivex.internal.operators.observable.ObserverResourceWrapper<R> observerResourceWrapper) {
            this.getHighSpeedVideoSizes = observerResourceWrapper;
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayBufferSupplier<T> implements io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> {
        private final int getHighResolutionOutputSizeshNQ4ISI;

        ReplayBufferSupplier(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> getHighSpeedVideoFpsRanges() {
            return new io.reactivex.internal.operators.observable.ObservableReplay.SizeBoundReplayBuffer(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* loaded from: classes17.dex */
    static final class ScheduledReplaySupplier<T> implements io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> {
        private final long Camera2StreamConfigurationMap;
        private final io.reactivex.Scheduler getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        ScheduledReplaySupplier(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = timeUnit;
            this.getHighSpeedVideoFpsRanges = scheduler;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier
        public final io.reactivex.internal.operators.observable.ObservableReplay.ReplayBuffer<T> getHighSpeedVideoFpsRanges() {
            return new io.reactivex.internal.operators.observable.ObservableReplay.SizeAndTimeBoundReplayBuffer(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplaySource<T> implements io.reactivex.ObservableSource<T> {
        private final io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> getHighSpeedVideoFpsRangesFor;

        ReplaySource(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T>> atomicReference, io.reactivex.internal.operators.observable.ObservableReplay.BufferSupplier<T> bufferSupplier) {
            this.getHighSpeedVideoFpsRangesFor = atomicReference;
            this.getHighSpeedVideoFpsRanges = bufferSupplier;
        }

        @Override // io.reactivex.ObservableSource
        public final void subscribe(io.reactivex.Observer<? super T> observer) {
            io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver;
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[] innerDisposableArr2;
            while (true) {
                replayObserver = this.getHighSpeedVideoFpsRangesFor.get();
                if (replayObserver != null) {
                    break;
                }
                io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<T> replayObserver2 = new io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver<>(this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges());
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<T> innerDisposable = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable<>(replayObserver, observer);
            observer.onSubscribe(innerDisposable);
            do {
                innerDisposableArr = replayObserver.getHighSpeedVideoFpsRangesFor.get();
                if (innerDisposableArr == io.reactivex.internal.operators.observable.ObservableReplay.ReplayObserver.getHighSpeedVideoSizes) {
                    break;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new io.reactivex.internal.operators.observable.ObservableReplay.InnerDisposable[length + 1];
                java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(replayObserver.getHighSpeedVideoFpsRangesFor, innerDisposableArr, innerDisposableArr2));
            if (innerDisposable.isDisposed()) {
                replayObserver.Camera2StreamConfigurationMap(innerDisposable);
            } else {
                replayObserver.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(innerDisposable);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class MulticastReplay<R, U> extends io.reactivex.Observable<R> {
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> getHighSpeedVideoFpsRangesFor;
        private final java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> getHighSpeedVideoSizes;

        MulticastReplay(java.util.concurrent.Callable<? extends io.reactivex.observables.ConnectableObservable<U>> callable, io.reactivex.functions.Function<? super io.reactivex.Observable<U>, ? extends io.reactivex.ObservableSource<R>> function) {
            this.getHighSpeedVideoSizes = callable;
            this.getHighSpeedVideoFpsRangesFor = function;
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
            try {
                io.reactivex.observables.ConnectableObservable connectableObservable = (io.reactivex.observables.ConnectableObservable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(connectableObservable), "The selector returned a null ObservableSource");
                io.reactivex.internal.operators.observable.ObserverResourceWrapper observerResourceWrapper = new io.reactivex.internal.operators.observable.ObserverResourceWrapper(observer);
                observableSource.subscribe(observerResourceWrapper);
                connectableObservable.connect(new io.reactivex.internal.operators.observable.ObservableReplay.DisposeConsumer(observerResourceWrapper));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class Replay<T> extends io.reactivex.observables.ConnectableObservable<T> {
        private final io.reactivex.Observable<T> getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.observables.ConnectableObservable<T> getHighSpeedVideoFpsRanges;

        Replay(io.reactivex.observables.ConnectableObservable<T> connectableObservable, io.reactivex.Observable<T> observable) {
            this.getHighSpeedVideoFpsRanges = connectableObservable;
            this.getHighResolutionOutputSizeshNQ4ISI = observable;
        }

        @Override // io.reactivex.observables.ConnectableObservable
        public final void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
            this.getHighSpeedVideoFpsRanges.connect(consumer);
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(observer);
        }
    }
}
