package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class BehaviorSubject<T> extends io.reactivex.subjects.Subject<T> {
    final java.util.concurrent.locks.Lock Camera2StreamConfigurationMap;
    final java.util.concurrent.locks.ReadWriteLock getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> getHighSpeedVideoSizesFor;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[]> getInputFormats;
    final java.util.concurrent.locks.Lock getInputSizeshNQ4ISI;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Object> getOutputFormats;
    private static final java.lang.Object[] getOutputMinFrameDuration = new java.lang.Object[0];
    static final io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[0];
    static final io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] getHighSpeedVideoFpsRanges = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.BehaviorSubject<T> create() {
        return new io.reactivex.subjects.BehaviorSubject<>();
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.BehaviorSubject<T> createDefault(T t) {
        return new io.reactivex.subjects.BehaviorSubject<>(t);
    }

    BehaviorSubject() {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.getHighSpeedVideoFpsRangesFor = reentrantReadWriteLock;
        this.Camera2StreamConfigurationMap = reentrantReadWriteLock.readLock();
        this.getInputSizeshNQ4ISI = reentrantReadWriteLock.writeLock();
        this.getInputFormats = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicReference<>();
    }

    private BehaviorSubject(T t) {
        this();
        this.getOutputFormats.lazySet(io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "defaultValue is null"));
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] behaviorDisposableArr2;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<>(observer, this);
        observer.onSubscribe(behaviorDisposable);
        do {
            behaviorDisposableArr = this.getInputFormats.get();
            if (behaviorDisposableArr == getHighSpeedVideoFpsRanges) {
                java.lang.Throwable th = this.getHighSpeedVideoSizesFor.get();
                if (th == io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    observer.onComplete();
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            int length = behaviorDisposableArr.length;
            behaviorDisposableArr2 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[length + 1];
            java.lang.System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr2, 0, length);
            behaviorDisposableArr2[length] = behaviorDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputFormats, behaviorDisposableArr, behaviorDisposableArr2));
        if (behaviorDisposable.getHighSpeedVideoSizes) {
            Camera2StreamConfigurationMap(behaviorDisposable);
            return;
        }
        if (behaviorDisposable.getHighSpeedVideoSizes) {
            return;
        }
        synchronized (behaviorDisposable) {
            if (behaviorDisposable.getHighSpeedVideoSizes) {
                return;
            }
            if (behaviorDisposable.getInputSizeshNQ4ISI) {
                return;
            }
            io.reactivex.subjects.BehaviorSubject<T> behaviorSubject = behaviorDisposable.getOutputMinFrameDuration;
            java.util.concurrent.locks.Lock lock = behaviorSubject.Camera2StreamConfigurationMap;
            lock.lock();
            behaviorDisposable.getHighResolutionOutputSizeshNQ4ISI = behaviorSubject.getHighSpeedVideoSizes;
            java.lang.Object obj = behaviorSubject.getOutputFormats.get();
            lock.unlock();
            behaviorDisposable.Camera2StreamConfigurationMap = obj != null;
            behaviorDisposable.getInputSizeshNQ4ISI = true;
            if (obj == null || behaviorDisposable.test(obj)) {
                return;
            }
            while (!behaviorDisposable.getHighSpeedVideoSizes) {
                synchronized (behaviorDisposable) {
                    appendOnlyLinkedArrayList = behaviorDisposable.getOutputFormats;
                    if (appendOnlyLinkedArrayList == null) {
                        behaviorDisposable.Camera2StreamConfigurationMap = false;
                        return;
                    }
                    behaviorDisposable.getOutputFormats = null;
                }
                appendOnlyLinkedArrayList.forEachWhile(behaviorDisposable);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.getHighSpeedVideoSizesFor.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizesFor.get() == null) {
            java.lang.Object next = io.reactivex.internal.util.NotificationLite.next(t);
            getHighResolutionOutputSizeshNQ4ISI(next);
            for (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable : this.getInputFormats.get()) {
                behaviorDisposable.getHighSpeedVideoFpsRanges(next, this.getHighSpeedVideoSizes);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizesFor, null, th)) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        java.lang.Object error = io.reactivex.internal.util.NotificationLite.error(th);
        java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[]> atomicReference = this.getInputFormats;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr = getHighSpeedVideoFpsRanges;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] andSet = atomicReference.getAndSet(behaviorDisposableArr);
        if (andSet != behaviorDisposableArr) {
            getHighResolutionOutputSizeshNQ4ISI(error);
        }
        for (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable : andSet) {
            behaviorDisposable.getHighSpeedVideoFpsRanges(error, this.getHighSpeedVideoSizes);
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizesFor, null, io.reactivex.internal.util.ExceptionHelper.TERMINATED)) {
            java.lang.Object complete = io.reactivex.internal.util.NotificationLite.complete();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[]> atomicReference = this.getInputFormats;
            io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr = getHighSpeedVideoFpsRanges;
            io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] andSet = atomicReference.getAndSet(behaviorDisposableArr);
            if (andSet != behaviorDisposableArr) {
                getHighResolutionOutputSizeshNQ4ISI(complete);
            }
            for (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable : andSet) {
                behaviorDisposable.getHighSpeedVideoFpsRanges(complete, this.getHighSpeedVideoSizes);
            }
        }
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.getInputFormats.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public final java.lang.Throwable getThrowable() {
        java.lang.Object obj = this.getOutputFormats.get();
        if (io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return io.reactivex.internal.util.NotificationLite.getError(obj);
        }
        return null;
    }

    public final T getValue() {
        java.lang.Object obj = this.getOutputFormats.get();
        if (io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) {
            return null;
        }
        return (T) io.reactivex.internal.util.NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public final java.lang.Object[] getValues() {
        java.lang.Object[] objArr = getOutputMinFrameDuration;
        java.lang.Object[] values = getValues(objArr);
        return values == objArr ? new java.lang.Object[0] : values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public final T[] getValues(T[] tArr) {
        java.lang.Object obj = this.getOutputFormats.get();
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

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return io.reactivex.internal.util.NotificationLite.isComplete(this.getOutputFormats.get());
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return io.reactivex.internal.util.NotificationLite.isError(this.getOutputFormats.get());
    }

    public final boolean hasValue() {
        java.lang.Object obj = this.getOutputFormats.get();
        return (obj == null || io.reactivex.internal.util.NotificationLite.isComplete(obj) || io.reactivex.internal.util.NotificationLite.isError(obj)) ? false : true;
    }

    final void Camera2StreamConfigurationMap(io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> behaviorDisposable) {
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] behaviorDisposableArr;
        io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] behaviorDisposableArr2;
        do {
            behaviorDisposableArr = this.getInputFormats.get();
            int length = behaviorDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (behaviorDisposableArr[i] == behaviorDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                behaviorDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] behaviorDisposableArr3 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[length - 1];
                java.lang.System.arraycopy(behaviorDisposableArr, 0, behaviorDisposableArr3, 0, i);
                java.lang.System.arraycopy(behaviorDisposableArr, i + 1, behaviorDisposableArr3, i, (length - i) - 1);
                behaviorDisposableArr2 = behaviorDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputFormats, behaviorDisposableArr, behaviorDisposableArr2));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI.lock();
        this.getHighSpeedVideoSizes++;
        this.getOutputFormats.lazySet(obj);
        this.getInputSizeshNQ4ISI.unlock();
    }

    static final class BehaviorDisposable<T> implements io.reactivex.disposables.Disposable, io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
        boolean Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        boolean getInputSizeshNQ4ISI;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> getOutputFormats;
        final io.reactivex.subjects.BehaviorSubject<T> getOutputMinFrameDuration;

        BehaviorDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.BehaviorSubject<T> behaviorSubject) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getOutputMinFrameDuration = behaviorSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        final void getHighSpeedVideoFpsRanges(java.lang.Object obj, long j) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            if (!this.getHighSpeedVideoFpsRanges) {
                synchronized (this) {
                    if (this.getHighSpeedVideoSizes) {
                        return;
                    }
                    if (this.getHighResolutionOutputSizeshNQ4ISI == j) {
                        return;
                    }
                    if (this.Camera2StreamConfigurationMap) {
                        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getOutputFormats;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                            this.getOutputFormats = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(obj);
                        return;
                    }
                    this.getInputSizeshNQ4ISI = true;
                    this.getHighSpeedVideoFpsRanges = true;
                }
            }
            test(obj);
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public final boolean test(java.lang.Object obj) {
            return this.getHighSpeedVideoSizes || io.reactivex.internal.util.NotificationLite.accept(obj, this.getHighSpeedVideoFpsRangesFor);
        }
    }
}
