package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleCache<T> extends io.reactivex.Single<T> implements io.reactivex.SingleObserver<T> {
    static final io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[0];
    static final io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[0];
    java.lang.Throwable Camera2StreamConfigurationMap;
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRangesFor;
    T getOutputMinFrameDuration;
    final java.util.concurrent.atomic.AtomicInteger getInputFormats = new java.util.concurrent.atomic.AtomicInteger();
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T>[]> getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);

    @Override // io.reactivex.SingleObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public SingleCache(io.reactivex.SingleSource<? extends T> singleSource) {
        this.getHighSpeedVideoFpsRangesFor = singleSource;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] cacheDisposableArr2;
        io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T> cacheDisposable = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable<>(singleObserver, this);
        singleObserver.onSubscribe(cacheDisposable);
        do {
            cacheDisposableArr = this.getHighSpeedVideoSizes.get();
            if (cacheDisposableArr == getHighSpeedVideoFpsRanges) {
                java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.getOutputMinFrameDuration);
                    return;
                }
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[length + 1];
            java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, cacheDisposableArr, cacheDisposableArr2));
        if (cacheDisposable.isDisposed()) {
            Camera2StreamConfigurationMap(cacheDisposable);
        }
        if (this.getInputFormats.getAndIncrement() == 0) {
            this.getHighSpeedVideoFpsRangesFor.subscribe(this);
        }
    }

    final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T> cacheDisposable) {
        io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.getHighSpeedVideoSizes.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cacheDisposableArr[i] == cacheDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                io.reactivex.internal.operators.single.SingleCache.CacheDisposable[] cacheDisposableArr3 = new io.reactivex.internal.operators.single.SingleCache.CacheDisposable[length - 1];
                java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                java.lang.System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.SingleObserver
    public final void onSuccess(T t) {
        this.getOutputMinFrameDuration = t;
        for (io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T> cacheDisposable : this.getHighSpeedVideoSizes.getAndSet(getHighSpeedVideoFpsRanges)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public final void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = th;
        for (io.reactivex.internal.operators.single.SingleCache.CacheDisposable<T> cacheDisposable : this.getHighSpeedVideoSizes.getAndSet(getHighSpeedVideoFpsRanges)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class CacheDisposable<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 7514387411091976596L;
        final io.reactivex.internal.operators.single.SingleCache<T> Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

        CacheDisposable(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.internal.operators.single.SingleCache<T> singleCache) {
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            this.Camera2StreamConfigurationMap = singleCache;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this);
            }
        }
    }
}
