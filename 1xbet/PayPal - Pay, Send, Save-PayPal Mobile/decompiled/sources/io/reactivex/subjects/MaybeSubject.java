package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class MaybeSubject<T> extends io.reactivex.Maybe<T> implements io.reactivex.MaybeObserver<T> {
    java.lang.Throwable Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[]> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoSizes);
    T getOutputMinFrameDuration;
    static final io.reactivex.subjects.MaybeSubject.MaybeDisposable[] getHighSpeedVideoSizes = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[0];
    static final io.reactivex.subjects.MaybeSubject.MaybeDisposable[] getHighSpeedVideoFpsRangesFor = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.MaybeSubject<T> create() {
        return new io.reactivex.subjects.MaybeSubject<>();
    }

    MaybeSubject() {
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            this.getOutputMinFrameDuration = t;
            for (io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable : this.getHighSpeedVideoFpsRanges.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                maybeDisposable.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            this.Camera2StreamConfigurationMap = th;
            for (io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable : this.getHighSpeedVideoFpsRanges.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                maybeDisposable.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.MaybeObserver
    public final void onComplete() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            for (io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable : this.getHighSpeedVideoFpsRanges.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                maybeDisposable.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr;
        io.reactivex.subjects.MaybeSubject.MaybeDisposable[] maybeDisposableArr2;
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable = new io.reactivex.subjects.MaybeSubject.MaybeDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(maybeDisposable);
        do {
            maybeDisposableArr = this.getHighSpeedVideoFpsRanges.get();
            if (maybeDisposableArr == getHighSpeedVideoFpsRangesFor) {
                java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                if (th != null) {
                    maybeObserver.onError(th);
                    return;
                }
                T t = this.getOutputMinFrameDuration;
                if (t == null) {
                    maybeObserver.onComplete();
                    return;
                } else {
                    maybeObserver.onSuccess(t);
                    return;
                }
            }
            int length = maybeDisposableArr.length;
            maybeDisposableArr2 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[length + 1];
            java.lang.System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr2, 0, length);
            maybeDisposableArr2[length] = maybeDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, maybeDisposableArr, maybeDisposableArr2));
        if (maybeDisposable.isDisposed()) {
            Camera2StreamConfigurationMap(maybeDisposable);
        }
    }

    final void Camera2StreamConfigurationMap(io.reactivex.subjects.MaybeSubject.MaybeDisposable<T> maybeDisposable) {
        io.reactivex.subjects.MaybeSubject.MaybeDisposable<T>[] maybeDisposableArr;
        io.reactivex.subjects.MaybeSubject.MaybeDisposable[] maybeDisposableArr2;
        do {
            maybeDisposableArr = this.getHighSpeedVideoFpsRanges.get();
            int length = maybeDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (maybeDisposableArr[i] == maybeDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                maybeDisposableArr2 = getHighSpeedVideoSizes;
            } else {
                io.reactivex.subjects.MaybeSubject.MaybeDisposable[] maybeDisposableArr3 = new io.reactivex.subjects.MaybeSubject.MaybeDisposable[length - 1];
                java.lang.System.arraycopy(maybeDisposableArr, 0, maybeDisposableArr3, 0, i);
                java.lang.System.arraycopy(maybeDisposableArr, i + 1, maybeDisposableArr3, i, (length - i) - 1);
                maybeDisposableArr2 = maybeDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, maybeDisposableArr, maybeDisposableArr2));
    }

    public final T getValue() {
        if (this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor) {
            return this.getOutputMinFrameDuration;
        }
        return null;
    }

    public final boolean hasValue() {
        return this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor && this.getOutputMinFrameDuration != null;
    }

    public final java.lang.Throwable getThrowable() {
        if (this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor) {
            return this.Camera2StreamConfigurationMap;
        }
        return null;
    }

    public final boolean hasThrowable() {
        return this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor && this.Camera2StreamConfigurationMap != null;
    }

    public final boolean hasComplete() {
        return this.getHighSpeedVideoFpsRanges.get() == getHighSpeedVideoFpsRangesFor && this.getOutputMinFrameDuration == null && this.Camera2StreamConfigurationMap == null;
    }

    public final boolean hasObservers() {
        return this.getHighSpeedVideoFpsRanges.get().length != 0;
    }

    static final class MaybeDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.MaybeSubject<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

        MaybeDisposable(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.subjects.MaybeSubject<T> maybeSubject) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
            lazySet(maybeSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.subjects.MaybeSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.Camera2StreamConfigurationMap(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }
}
