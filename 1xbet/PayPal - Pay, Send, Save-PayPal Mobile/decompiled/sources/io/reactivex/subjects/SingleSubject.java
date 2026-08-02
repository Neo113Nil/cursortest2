package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class SingleSubject<T> extends io.reactivex.Single<T> implements io.reactivex.SingleObserver<T> {
    static final io.reactivex.subjects.SingleSubject.SingleDisposable[] Camera2StreamConfigurationMap = new io.reactivex.subjects.SingleSubject.SingleDisposable[0];
    static final io.reactivex.subjects.SingleSubject.SingleDisposable[] getHighSpeedVideoFpsRangesFor = new io.reactivex.subjects.SingleSubject.SingleDisposable[0];
    java.lang.Throwable getHighSpeedVideoFpsRanges;
    T getInputFormats;
    final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.SingleSubject.SingleDisposable<T>[]> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(Camera2StreamConfigurationMap);

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.SingleSubject<T> create() {
        return new io.reactivex.subjects.SingleSubject<>();
    }

    SingleSubject() {
    }

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.getHighSpeedVideoSizes.get() == getHighSpeedVideoFpsRangesFor) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            this.getInputFormats = t;
            for (io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable : this.getHighSpeedVideoSizes.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                singleDisposable.getHighSpeedVideoSizes.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighResolutionOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            this.getHighSpeedVideoFpsRanges = th;
            for (io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable : this.getHighSpeedVideoSizes.getAndSet(getHighSpeedVideoFpsRangesFor)) {
                singleDisposable.getHighSpeedVideoSizes.onError(th);
            }
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr;
        io.reactivex.subjects.SingleSubject.SingleDisposable[] singleDisposableArr2;
        io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable = new io.reactivex.subjects.SingleSubject.SingleDisposable<>(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        do {
            singleDisposableArr = this.getHighSpeedVideoSizes.get();
            if (singleDisposableArr == getHighSpeedVideoFpsRangesFor) {
                java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.getInputFormats);
                    return;
                }
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new io.reactivex.subjects.SingleSubject.SingleDisposable[length + 1];
            java.lang.System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, singleDisposableArr, singleDisposableArr2));
        if (singleDisposable.isDisposed()) {
            getHighSpeedVideoFpsRanges(singleDisposable);
        }
    }

    final void getHighSpeedVideoFpsRanges(io.reactivex.subjects.SingleSubject.SingleDisposable<T> singleDisposable) {
        io.reactivex.subjects.SingleSubject.SingleDisposable<T>[] singleDisposableArr;
        io.reactivex.subjects.SingleSubject.SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.getHighSpeedVideoSizes.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (singleDisposableArr[i] == singleDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = Camera2StreamConfigurationMap;
            } else {
                io.reactivex.subjects.SingleSubject.SingleDisposable[] singleDisposableArr3 = new io.reactivex.subjects.SingleSubject.SingleDisposable[length - 1];
                java.lang.System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                java.lang.System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, singleDisposableArr, singleDisposableArr2));
    }

    public final T getValue() {
        if (this.getHighSpeedVideoSizes.get() == getHighSpeedVideoFpsRangesFor) {
            return this.getInputFormats;
        }
        return null;
    }

    public final boolean hasValue() {
        return this.getHighSpeedVideoSizes.get() == getHighSpeedVideoFpsRangesFor && this.getInputFormats != null;
    }

    public final java.lang.Throwable getThrowable() {
        if (this.getHighSpeedVideoSizes.get() == getHighSpeedVideoFpsRangesFor) {
            return this.getHighSpeedVideoFpsRanges;
        }
        return null;
    }

    public final boolean hasThrowable() {
        return this.getHighSpeedVideoSizes.get() == getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges != null;
    }

    public final boolean hasObservers() {
        return this.getHighSpeedVideoSizes.get().length != 0;
    }

    static final class SingleDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.SingleSubject<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.SingleObserver<? super T> getHighSpeedVideoSizes;

        SingleDisposable(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.subjects.SingleSubject<T> singleSubject) {
            this.getHighSpeedVideoSizes = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.subjects.SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.getHighSpeedVideoFpsRanges(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }
}
