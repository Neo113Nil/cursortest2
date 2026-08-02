package io.reactivex.subjects;

/* loaded from: classes17.dex */
public final class PublishSubject<T> extends io.reactivex.subjects.Subject<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.PublishSubject.PublishDisposable<T>[]> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
    java.lang.Throwable getHighSpeedVideoSizes;
    static final io.reactivex.subjects.PublishSubject.PublishDisposable[] getHighSpeedVideoFpsRanges = new io.reactivex.subjects.PublishSubject.PublishDisposable[0];
    static final io.reactivex.subjects.PublishSubject.PublishDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.subjects.PublishSubject.PublishDisposable[0];

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.PublishSubject<T> create() {
        return new io.reactivex.subjects.PublishSubject<>();
    }

    PublishSubject() {
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        io.reactivex.subjects.PublishSubject.PublishDisposable[] publishDisposableArr2;
        io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable = new io.reactivex.subjects.PublishSubject.PublishDisposable<>(observer, this);
        observer.onSubscribe(publishDisposable);
        do {
            publishDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (publishDisposableArr == getHighSpeedVideoFpsRanges) {
                java.lang.Throwable th = this.getHighSpeedVideoSizes;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new io.reactivex.subjects.PublishSubject.PublishDisposable[length + 1];
            java.lang.System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, publishDisposableArr, publishDisposableArr2));
        if (publishDisposable.isDisposed()) {
            Camera2StreamConfigurationMap(publishDisposable);
        }
    }

    final void Camera2StreamConfigurationMap(io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable) {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr;
        io.reactivex.subjects.PublishSubject.PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (publishDisposableArr == getHighSpeedVideoFpsRanges || publishDisposableArr == getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                io.reactivex.subjects.PublishSubject.PublishDisposable[] publishDisposableArr3 = new io.reactivex.subjects.PublishSubject.PublishDisposable[length - 1];
                java.lang.System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                java.lang.System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, publishDisposableArr, publishDisposableArr2));
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable : this.Camera2StreamConfigurationMap.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.getHighSpeedVideoSizes.onNext(t);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.Camera2StreamConfigurationMap.get();
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = getHighSpeedVideoFpsRanges;
        if (publishDisposableArr == publishDisposableArr2) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoSizes = th;
        for (io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable : this.Camera2StreamConfigurationMap.getAndSet(publishDisposableArr2)) {
            if (publishDisposable.get()) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                publishDisposable.getHighSpeedVideoSizes.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr = this.Camera2StreamConfigurationMap.get();
        io.reactivex.subjects.PublishSubject.PublishDisposable<T>[] publishDisposableArr2 = getHighSpeedVideoFpsRanges;
        if (publishDisposableArr != publishDisposableArr2) {
            for (io.reactivex.subjects.PublishSubject.PublishDisposable<T> publishDisposable : this.Camera2StreamConfigurationMap.getAndSet(publishDisposableArr2)) {
                if (!publishDisposable.get()) {
                    publishDisposable.getHighSpeedVideoSizes.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.get().length != 0;
    }

    @Override // io.reactivex.subjects.Subject
    public final java.lang.Throwable getThrowable() {
        if (this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges) {
            return this.getHighSpeedVideoSizes;
        }
        return null;
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes != null;
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap.get() == getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == null;
    }

    static final class PublishDisposable<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3562861878281475070L;
        final io.reactivex.subjects.PublishSubject<T> Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        PublishDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.subjects.PublishSubject<T> publishSubject) {
            this.getHighSpeedVideoSizes = observer;
            this.Camera2StreamConfigurationMap = publishSubject;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }
    }
}
