package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class AsyncSubject<T> extends io.reactivex.subjects.Subject<T> {
    static final io.reactivex.subjects.AsyncSubject.AsyncDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[0];
    static final io.reactivex.subjects.AsyncSubject.AsyncDisposable[] getHighSpeedVideoSizes = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[0];
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[]> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
    java.lang.Throwable getHighSpeedVideoFpsRanges;
    T getHighSpeedVideoFpsRangesFor;

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.AsyncSubject<T> create() {
        return new io.reactivex.subjects.AsyncSubject<>();
    }

    AsyncSubject() {
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr = this.Camera2StreamConfigurationMap.get();
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr2 = getHighSpeedVideoSizes;
        if (asyncDisposableArr == asyncDisposableArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = th;
        for (io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable : this.Camera2StreamConfigurationMap.getAndSet(asyncDisposableArr2)) {
            asyncDisposable.Camera2StreamConfigurationMap(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr = this.Camera2StreamConfigurationMap.get();
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr2 = getHighSpeedVideoSizes;
        if (asyncDisposableArr != asyncDisposableArr2) {
            T t = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] andSet = this.Camera2StreamConfigurationMap.getAndSet(asyncDisposableArr2);
            int i = 0;
            if (t == null) {
                int length = andSet.length;
                while (i < length) {
                    andSet[i].Camera2StreamConfigurationMap();
                    i++;
                }
                return;
            }
            int length2 = andSet.length;
            while (i < length2) {
                andSet[i].complete(t);
                i++;
            }
        }
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges != null;
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges == null;
    }

    @Override // io.reactivex.subjects.Subject
    public final java.lang.Throwable getThrowable() {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes) {
            return this.getHighSpeedVideoFpsRanges;
        }
        return null;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr;
        io.reactivex.subjects.AsyncSubject.AsyncDisposable[] asyncDisposableArr2;
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable = new io.reactivex.subjects.AsyncSubject.AsyncDisposable<>(observer, this);
        observer.onSubscribe(asyncDisposable);
        do {
            asyncDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (asyncDisposableArr == getHighSpeedVideoSizes) {
                java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                if (th != null) {
                    observer.onError(th);
                    return;
                }
                T t = this.getHighSpeedVideoFpsRangesFor;
                if (t != null) {
                    asyncDisposable.complete(t);
                    return;
                } else {
                    asyncDisposable.Camera2StreamConfigurationMap();
                    return;
                }
            }
            int length = asyncDisposableArr.length;
            asyncDisposableArr2 = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[length + 1];
            java.lang.System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr2, 0, length);
            asyncDisposableArr2[length] = asyncDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, asyncDisposableArr, asyncDisposableArr2));
        if (asyncDisposable.isDisposed()) {
            getHighSpeedVideoFpsRangesFor(asyncDisposable);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(io.reactivex.subjects.AsyncSubject.AsyncDisposable<T> asyncDisposable) {
        io.reactivex.subjects.AsyncSubject.AsyncDisposable<T>[] asyncDisposableArr;
        io.reactivex.subjects.AsyncSubject.AsyncDisposable[] asyncDisposableArr2;
        do {
            asyncDisposableArr = this.Camera2StreamConfigurationMap.get();
            int length = asyncDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (asyncDisposableArr[i] == asyncDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                asyncDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                io.reactivex.subjects.AsyncSubject.AsyncDisposable[] asyncDisposableArr3 = new io.reactivex.subjects.AsyncSubject.AsyncDisposable[length - 1];
                java.lang.System.arraycopy(asyncDisposableArr, 0, asyncDisposableArr3, 0, i);
                java.lang.System.arraycopy(asyncDisposableArr, i + 1, asyncDisposableArr3, i, (length - i) - 1);
                asyncDisposableArr2 = asyncDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, asyncDisposableArr, asyncDisposableArr2));
    }

    public final boolean hasValue() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor != null;
    }

    public final T getValue() {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoSizes) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    @java.lang.Deprecated
    public final java.lang.Object[] getValues() {
        T value = getValue();
        return value != null ? new java.lang.Object[]{value} : new java.lang.Object[0];
    }

    @java.lang.Deprecated
    public final T[] getValues(T[] tArr) {
        T value = getValue();
        if (value == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) java.util.Arrays.copyOf(tArr, 1);
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    static final class AsyncDisposable<T> extends io.reactivex.internal.observers.DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final io.reactivex.subjects.AsyncSubject<T> getHighSpeedVideoFpsRanges;

        AsyncDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.AsyncSubject<T> asyncSubject) {
            super(observer);
            this.getHighSpeedVideoFpsRanges = asyncSubject;
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            if (super.tryDispose()) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
            }
        }

        final void Camera2StreamConfigurationMap() {
            if (isDisposed()) {
                return;
            }
            this.actual.onComplete();
        }

        final void Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (isDisposed()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.actual.onError(th);
            }
        }
    }
}
