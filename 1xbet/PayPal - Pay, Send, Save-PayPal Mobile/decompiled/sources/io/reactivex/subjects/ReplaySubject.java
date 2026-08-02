package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class ReplaySubject<T> extends io.reactivex.subjects.Subject<T> {
    static final io.reactivex.subjects.ReplaySubject.ReplayDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[0];
    static final io.reactivex.subjects.ReplaySubject.ReplayDisposable[] getHighSpeedVideoFpsRanges = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[0];
    private static final java.lang.Object[] getOutputMinFrameDuration = new java.lang.Object[0];
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[]> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
    final io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    interface ReplayBuffer<T> {
        void Camera2StreamConfigurationMap(java.lang.Object obj);

        boolean compareAndSet(java.lang.Object obj, java.lang.Object obj2);

        java.lang.Object get();

        T getHighResolutionOutputSizeshNQ4ISI();

        void getHighResolutionOutputSizeshNQ4ISI(T t);

        int getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable);

        T[] getHighSpeedVideoSizes(T[] tArr);
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> create() {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.UnboundedReplayBuffer(16));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> create(int i) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.UnboundedReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithSize(int i) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeBoundReplayBuffer(i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithTime(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j, timeUnit, scheduler));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.ReplaySubject<T> createWithTimeAndSize(long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, int i) {
        return new io.reactivex.subjects.ReplaySubject<>(new io.reactivex.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer(i, j, timeUnit, scheduler));
    }

    private ReplaySubject(io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer) {
        this.getHighSpeedVideoFpsRangesFor = replayBuffer;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable = new io.reactivex.subjects.ReplaySubject.ReplayDisposable<>(observer, this);
        observer.onSubscribe(replayDisposable);
        if (replayDisposable.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        while (true) {
            io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (replayDisposableArr == getHighSpeedVideoFpsRanges) {
                break;
            }
            int length = replayDisposableArr.length;
            io.reactivex.subjects.ReplaySubject.ReplayDisposable[] replayDisposableArr2 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[length + 1];
            java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, replayDisposableArr, replayDisposableArr2)) {
                if (replayDisposable.getHighSpeedVideoFpsRangesFor) {
                    getHighResolutionOutputSizeshNQ4ISI(replayDisposable);
                    return;
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(replayDisposable);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.getHighSpeedVideoSizes) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoFpsRangesFor;
        replayBuffer.getHighResolutionOutputSizeshNQ4ISI(t);
        for (io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable : this.Camera2StreamConfigurationMap.get()) {
            replayBuffer.getHighSpeedVideoSizes(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizes) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoSizes = true;
        java.lang.Object error = io.reactivex.internal.util.NotificationLite.error(th);
        io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoFpsRangesFor;
        replayBuffer.Camera2StreamConfigurationMap(error);
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(null, error)) {
            replayDisposableArr = this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoFpsRanges);
        } else {
            replayDisposableArr = getHighSpeedVideoFpsRanges;
        }
        for (io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable : replayDisposableArr) {
            replayBuffer.getHighSpeedVideoSizes(replayDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoSizes = true;
        java.lang.Object complete = io.reactivex.internal.util.NotificationLite.complete();
        io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> replayBuffer = this.getHighSpeedVideoFpsRangesFor;
        replayBuffer.Camera2StreamConfigurationMap(complete);
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(null, complete)) {
            replayDisposableArr = this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoFpsRanges);
        } else {
            replayDisposableArr = getHighSpeedVideoFpsRanges;
        }
        for (io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable : replayDisposableArr) {
            replayBuffer.getHighSpeedVideoSizes(replayDisposable);
        }
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public final java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get();
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public final T getValue() {
        return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void cleanupBuffer() {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object[] getValues() {
        java.lang.Object[] objArr = getOutputMinFrameDuration;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    public final T[] getValues(T[] tArr) {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(tArr);
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return io.reactivex.internal.util.NotificationLite.isComplete(this.getHighSpeedVideoFpsRangesFor.get());
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return io.reactivex.internal.util.NotificationLite.isError(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public final boolean hasValue() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges() != 0;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
        io.reactivex.subjects.ReplaySubject.ReplayDisposable<T>[] replayDisposableArr;
        io.reactivex.subjects.ReplaySubject.ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (replayDisposableArr == getHighSpeedVideoFpsRanges || replayDisposableArr == getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            int length = replayDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replayDisposableArr[i] == replayDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                io.reactivex.subjects.ReplaySubject.ReplayDisposable[] replayDisposableArr3 = new io.reactivex.subjects.ReplaySubject.ReplayDisposable[length - 1];
                java.lang.System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i);
                java.lang.System.arraycopy(replayDisposableArr, i + 1, replayDisposableArr3, i, (length - i) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, replayDisposableArr, replayDisposableArr2));
    }

    static final class ReplayDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 466549804534799122L;
        final io.reactivex.subjects.ReplaySubject<T> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;

        ReplayDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.ReplaySubject<T> replaySubject) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.Camera2StreamConfigurationMap = replaySubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    static final class UnboundedReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = -733876083048047795L;
        volatile int getHighSpeedVideoFpsRanges;
        final java.util.List<java.lang.Object> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
        }

        UnboundedReplayBuffer(int i) {
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint"));
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            this.getHighSpeedVideoFpsRangesFor.add(t);
            this.getHighSpeedVideoFpsRanges++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor.add(obj);
            this.getHighSpeedVideoFpsRanges++;
            this.getHighSpeedVideoSizes = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final T getHighResolutionOutputSizeshNQ4ISI() {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                return null;
            }
            java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRangesFor;
            T t = (T) list.get(i - 1);
            if (!io.reactivex.internal.util.NotificationLite.isComplete(t) && !io.reactivex.internal.util.NotificationLite.isError(t)) {
                return t;
            }
            if (i == 1) {
                return null;
            }
            return (T) list.get(i - 2);
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final T[] getHighSpeedVideoSizes(T[] tArr) {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                    return tArr;
                }
            } else {
                java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object obj = list.get(i - 1);
                if ((io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) && i - 1 == 0) {
                    if (tArr.length != 0) {
                        tArr[0] = null;
                    }
                } else {
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
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighSpeedVideoSizes(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
            int i;
            int i2;
            if (replayDisposable.getAndIncrement() == 0) {
                java.util.List<java.lang.Object> list = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.Observer<? super T> observer = replayDisposable.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Integer num = (java.lang.Integer) replayDisposable.getHighSpeedVideoSizes;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                    replayDisposable.getHighSpeedVideoSizes = 0;
                }
                int i3 = 1;
                while (!replayDisposable.getHighSpeedVideoFpsRangesFor) {
                    int i4 = this.getHighSpeedVideoFpsRanges;
                    while (i4 != i) {
                        if (replayDisposable.getHighSpeedVideoFpsRangesFor) {
                            replayDisposable.getHighSpeedVideoSizes = null;
                            return;
                        }
                        java.lang.Object obj = list.get(i);
                        if (this.getHighSpeedVideoSizes && (i2 = i + 1) == i4 && i2 == (i4 = this.getHighSpeedVideoFpsRanges)) {
                            if (io.reactivex.internal.util.NotificationLite.isComplete(obj)) {
                                observer.onComplete();
                            } else {
                                observer.onError(io.reactivex.internal.util.NotificationLite.getError(obj));
                            }
                            replayDisposable.getHighSpeedVideoSizes = null;
                            replayDisposable.getHighSpeedVideoFpsRangesFor = true;
                            return;
                        }
                        observer.onNext(obj);
                        i++;
                    }
                    if (i == this.getHighSpeedVideoFpsRanges) {
                        replayDisposable.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i);
                        i3 = replayDisposable.addAndGet(-i3);
                        if (i3 == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.getHighSpeedVideoSizes = null;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final int getHighSpeedVideoFpsRanges() {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i == 0) {
                return 0;
            }
            int i2 = i - 1;
            java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor.get(i2);
            return (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? i2 : i;
        }
    }

    static final class Node<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final T getHighResolutionOutputSizeshNQ4ISI;

        Node(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
        }
    }

    static final class TimedNode<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.ReplaySubject.TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        final long Camera2StreamConfigurationMap;
        final T getHighResolutionOutputSizeshNQ4ISI;

        TimedNode(T t, long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = t;
            this.Camera2StreamConfigurationMap = j;
        }
    }

    static final class SizeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = 1107649250281456395L;
        volatile boolean Camera2StreamConfigurationMap;
        volatile io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;
        io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> getHighSpeedVideoSizes;

        SizeBoundReplayBuffer(int i) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = new io.reactivex.subjects.ReplaySubject.Node<>(null);
            this.getHighSpeedVideoSizes = node;
            this.getHighResolutionOutputSizeshNQ4ISI = node;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = new io.reactivex.subjects.ReplaySubject.Node<>(t);
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = node;
            this.getHighSpeedVideoFpsRanges++;
            node2.set(node);
            int i = this.getHighSpeedVideoFpsRanges;
            if (i > this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRanges = i - 1;
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.get();
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Object obj) {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = new io.reactivex.subjects.ReplaySubject.Node<>(obj);
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = node;
            this.getHighSpeedVideoFpsRanges++;
            node2.lazySet(node);
            getHighSpeedVideoSizes();
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = this.getHighResolutionOutputSizeshNQ4ISI;
            if (node.getHighResolutionOutputSizeshNQ4ISI != null) {
                io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = new io.reactivex.subjects.ReplaySubject.Node<>(null);
                node2.lazySet(node.get());
                this.getHighResolutionOutputSizeshNQ4ISI = node2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final T getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node2 = null;
            while (true) {
                io.reactivex.subjects.ReplaySubject.Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t = (T) node.getHighResolutionOutputSizeshNQ4ISI;
            if (t == null) {
                return null;
            }
            return (io.reactivex.internal.util.NotificationLite.isComplete(t) || io.reactivex.internal.util.NotificationLite.isError(t)) ? (T) node2.getHighResolutionOutputSizeshNQ4ISI : t;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final T[] getHighSpeedVideoSizes(T[] tArr) {
            io.reactivex.subjects.ReplaySubject.Node<T> node = this.getHighResolutionOutputSizeshNQ4ISI;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < highSpeedVideoFpsRanges) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), highSpeedVideoFpsRanges));
            }
            for (int i = 0; i != highSpeedVideoFpsRanges; i++) {
                node = node.get();
                tArr[i] = node.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (tArr.length > highSpeedVideoFpsRanges) {
                tArr[highSpeedVideoFpsRanges] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighSpeedVideoSizes(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                io.reactivex.Observer<? super T> observer = replayDisposable.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = (io.reactivex.subjects.ReplaySubject.Node) replayDisposable.getHighSpeedVideoSizes;
                if (node == null) {
                    node = this.getHighResolutionOutputSizeshNQ4ISI;
                }
                int i = 1;
                while (!replayDisposable.getHighSpeedVideoFpsRangesFor) {
                    io.reactivex.subjects.ReplaySubject.Node<T> node2 = node.get();
                    if (node2 != null) {
                        T t = node2.getHighResolutionOutputSizeshNQ4ISI;
                        if (this.Camera2StreamConfigurationMap && node2.get() == null) {
                            if (io.reactivex.internal.util.NotificationLite.isComplete(t)) {
                                observer.onComplete();
                            } else {
                                observer.onError(io.reactivex.internal.util.NotificationLite.getError(t));
                            }
                            replayDisposable.getHighSpeedVideoSizes = null;
                            replayDisposable.getHighSpeedVideoFpsRangesFor = true;
                            return;
                        }
                        observer.onNext(t);
                        node = node2;
                    } else if (node.get() == null) {
                        replayDisposable.getHighSpeedVideoSizes = node;
                        i = replayDisposable.addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                replayDisposable.getHighSpeedVideoSizes = null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        
            return r1;
         */
        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getHighSpeedVideoFpsRanges() {
            io.reactivex.subjects.ReplaySubject.Node<java.lang.Object> node = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = 0;
            while (true) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                io.reactivex.subjects.ReplaySubject.Node<T> node2 = node.get();
                if (node2 == null) {
                    java.lang.Object obj = node.getHighResolutionOutputSizeshNQ4ISI;
                    if (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
                        return i - 1;
                    }
                } else {
                    i++;
                    node = node2;
                }
            }
        }
    }

    static final class SizeAndTimeBoundReplayBuffer<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.subjects.ReplaySubject.ReplayBuffer<T> {
        private static final long serialVersionUID = -8056260896137901749L;
        final io.reactivex.Scheduler Camera2StreamConfigurationMap;
        volatile io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> getInputSizeshNQ4ISI;
        final java.util.concurrent.TimeUnit getOutputFormats;

        SizeAndTimeBoundReplayBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxSize");
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.functions.ObjectHelper.verifyPositive(j, "maxAge");
            this.getOutputFormats = (java.util.concurrent.TimeUnit) io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.Camera2StreamConfigurationMap = (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
            this.getInputSizeshNQ4ISI = timedNode;
            this.getHighResolutionOutputSizeshNQ4ISI = timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = new io.reactivex.subjects.ReplaySubject.TimedNode<>(t, this.Camera2StreamConfigurationMap.now(this.getOutputFormats));
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = this.getInputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = timedNode;
            this.getHighSpeedVideoSizesFor++;
            timedNode2.set(timedNode);
            int i = this.getHighSpeedVideoSizesFor;
            if (i > this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizesFor = i - 1;
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.get();
            }
            long now = this.Camera2StreamConfigurationMap.now(this.getOutputFormats);
            long j = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode3 = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode4 = timedNode3.get();
                if (timedNode4 == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                    return;
                } else {
                    if (timedNode4.Camera2StreamConfigurationMap > now - j) {
                        this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                        return;
                    }
                    timedNode3 = timedNode4;
                }
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void Camera2StreamConfigurationMap(java.lang.Object obj) {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = new io.reactivex.subjects.ReplaySubject.TimedNode<>(obj, Long.MAX_VALUE);
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = this.getInputSizeshNQ4ISI;
            this.getInputSizeshNQ4ISI = timedNode;
            this.getHighSpeedVideoSizesFor++;
            timedNode2.lazySet(timedNode);
            long now = this.Camera2StreamConfigurationMap.now(this.getOutputFormats);
            long j = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode3 = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode4 = timedNode3.get();
                if (timedNode4.get() == null) {
                    if (timedNode3.getHighResolutionOutputSizeshNQ4ISI != null) {
                        io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode5 = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
                        timedNode5.lazySet(timedNode3.get());
                        this.getHighResolutionOutputSizeshNQ4ISI = timedNode5;
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                    }
                } else if (timedNode4.Camera2StreamConfigurationMap <= now - j) {
                    timedNode3 = timedNode4;
                } else if (timedNode3.getHighResolutionOutputSizeshNQ4ISI != null) {
                    io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode6 = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
                    timedNode6.lazySet(timedNode3.get());
                    this.getHighResolutionOutputSizeshNQ4ISI = timedNode6;
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI = timedNode3;
                }
            }
            this.getHighSpeedVideoSizes = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighSpeedVideoSizes() {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = this.getHighResolutionOutputSizeshNQ4ISI;
            if (timedNode.getHighResolutionOutputSizeshNQ4ISI != null) {
                io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = new io.reactivex.subjects.ReplaySubject.TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.getHighResolutionOutputSizeshNQ4ISI = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final T getHighResolutionOutputSizeshNQ4ISI() {
            T t;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = null;
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.Camera2StreamConfigurationMap >= this.Camera2StreamConfigurationMap.now(this.getOutputFormats) - this.getHighSpeedVideoFpsRangesFor && (t = (T) timedNode.getHighResolutionOutputSizeshNQ4ISI) != null) {
                return (io.reactivex.internal.util.NotificationLite.isComplete(t) || io.reactivex.internal.util.NotificationLite.isError(t)) ? (T) timedNode2.getHighResolutionOutputSizeshNQ4ISI : t;
            }
            return null;
        }

        private io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> Camera2StreamConfigurationMap() {
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode;
            io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode2 = this.getHighResolutionOutputSizeshNQ4ISI;
            long now = this.Camera2StreamConfigurationMap.now(this.getOutputFormats);
            long j = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.Camera2StreamConfigurationMap > now - j) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final T[] getHighSpeedVideoSizes(T[] tArr) {
            io.reactivex.subjects.ReplaySubject.TimedNode<T> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
            if (highSpeedVideoFpsRangesFor == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < highSpeedVideoFpsRangesFor) {
                tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), highSpeedVideoFpsRangesFor));
            }
            for (int i = 0; i != highSpeedVideoFpsRangesFor; i++) {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap.get();
                tArr[i] = Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (tArr.length > highSpeedVideoFpsRangesFor) {
                tArr[highSpeedVideoFpsRangesFor] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final void getHighSpeedVideoSizes(io.reactivex.subjects.ReplaySubject.ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() == 0) {
                io.reactivex.Observer<? super T> observer = replayDisposable.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode = (io.reactivex.subjects.ReplaySubject.TimedNode) replayDisposable.getHighSpeedVideoSizes;
                if (timedNode == null) {
                    timedNode = Camera2StreamConfigurationMap();
                }
                int i = 1;
                while (!replayDisposable.getHighSpeedVideoFpsRangesFor) {
                    while (!replayDisposable.getHighSpeedVideoFpsRangesFor) {
                        io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode2 = timedNode.get();
                        if (timedNode2 != null) {
                            T t = timedNode2.getHighResolutionOutputSizeshNQ4ISI;
                            if (this.getHighSpeedVideoSizes && timedNode2.get() == null) {
                                if (io.reactivex.internal.util.NotificationLite.isComplete(t)) {
                                    observer.onComplete();
                                } else {
                                    observer.onError(io.reactivex.internal.util.NotificationLite.getError(t));
                                }
                                replayDisposable.getHighSpeedVideoSizes = null;
                                replayDisposable.getHighSpeedVideoFpsRangesFor = true;
                                return;
                            }
                            observer.onNext(t);
                            timedNode = timedNode2;
                        } else if (timedNode.get() == null) {
                            replayDisposable.getHighSpeedVideoSizes = timedNode;
                            i = replayDisposable.addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    }
                    replayDisposable.getHighSpeedVideoSizes = null;
                    return;
                }
                replayDisposable.getHighSpeedVideoSizes = null;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.ReplayBuffer
        public final int getHighSpeedVideoFpsRanges() {
            return getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap());
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int getHighSpeedVideoFpsRangesFor(io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> timedNode) {
            int i = 0;
            while (true) {
                if (i == Integer.MAX_VALUE) {
                    break;
                }
                io.reactivex.subjects.ReplaySubject.TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    java.lang.Object obj = timedNode.getHighResolutionOutputSizeshNQ4ISI;
                    if (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
                        return i - 1;
                    }
                } else {
                    i++;
                    timedNode = timedNode2;
                }
            }
        }
    }
}
