package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class CompletableSubject extends io.reactivex.Completable implements io.reactivex.CompletableObserver {
    java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    static final io.reactivex.subjects.CompletableSubject.CompletableDisposable[] getHighSpeedVideoFpsRangesFor = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[0];
    static final io.reactivex.subjects.CompletableSubject.CompletableDisposable[] getHighSpeedVideoFpsRanges = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[0];
    final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.CompletableSubject.CompletableDisposable[]> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRangesFor);

    @io.reactivex.annotations.CheckReturnValue
    public static io.reactivex.subjects.CompletableSubject create() {
        return new io.reactivex.subjects.CompletableSubject();
    }

    CompletableSubject() {
    }

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
            this.getHighResolutionOutputSizeshNQ4ISI = th;
            for (io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable : this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoFpsRanges)) {
                completableDisposable.Camera2StreamConfigurationMap.onError(th);
            }
            return;
        }
        io.reactivex.plugins.RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
            for (io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable : this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoFpsRanges)) {
                completableDisposable.Camera2StreamConfigurationMap.onComplete();
            }
        }
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr;
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr2;
        io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable = new io.reactivex.subjects.CompletableSubject.CompletableDisposable(completableObserver, this);
        completableObserver.onSubscribe(completableDisposable);
        do {
            completableDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (completableDisposableArr == getHighSpeedVideoFpsRanges) {
                java.lang.Throwable th = this.getHighResolutionOutputSizeshNQ4ISI;
                if (th != null) {
                    completableObserver.onError(th);
                    return;
                } else {
                    completableObserver.onComplete();
                    return;
                }
            }
            int length = completableDisposableArr.length;
            completableDisposableArr2 = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[length + 1];
            java.lang.System.arraycopy(completableDisposableArr, 0, completableDisposableArr2, 0, length);
            completableDisposableArr2[length] = completableDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, completableDisposableArr, completableDisposableArr2));
        if (completableDisposable.isDisposed()) {
            getHighSpeedVideoFpsRangesFor(completableDisposable);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(io.reactivex.subjects.CompletableSubject.CompletableDisposable completableDisposable) {
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr;
        io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr2;
        do {
            completableDisposableArr = this.Camera2StreamConfigurationMap.get();
            int length = completableDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (completableDisposableArr[i] == completableDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                completableDisposableArr2 = getHighSpeedVideoFpsRangesFor;
            } else {
                io.reactivex.subjects.CompletableSubject.CompletableDisposable[] completableDisposableArr3 = new io.reactivex.subjects.CompletableSubject.CompletableDisposable[length - 1];
                java.lang.System.arraycopy(completableDisposableArr, 0, completableDisposableArr3, 0, i);
                java.lang.System.arraycopy(completableDisposableArr, i + 1, completableDisposableArr3, i, (length - i) - 1);
                completableDisposableArr2 = completableDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, completableDisposableArr, completableDisposableArr2));
    }

    public final java.lang.Throwable getThrowable() {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }

    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges && this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges && this.getHighResolutionOutputSizeshNQ4ISI == null;
    }

    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.get().length != 0;
    }

    static final class CompletableDisposable extends java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.CompletableSubject> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7650903191002190468L;
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;

        CompletableDisposable(io.reactivex.CompletableObserver completableObserver, io.reactivex.subjects.CompletableSubject completableSubject) {
            this.Camera2StreamConfigurationMap = completableObserver;
            lazySet(completableSubject);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.subjects.CompletableSubject andSet = getAndSet(null);
            if (andSet != null) {
                andSet.getHighSpeedVideoFpsRangesFor(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }
}
