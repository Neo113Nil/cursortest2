package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeCache<T> extends io.reactivex.Maybe<T> implements io.reactivex.MaybeObserver<T> {
    static final io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[0];
    static final io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[0];
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[]> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>(getHighSpeedVideoFpsRangesFor);
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.MaybeSource<T>> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Throwable getHighSpeedVideoFpsRanges;
    T getOutputMinFrameDuration;

    @Override // io.reactivex.MaybeObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public MaybeCache(io.reactivex.MaybeSource<T> maybeSource) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] cacheDisposableArr2;
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<>(maybeObserver, this);
        maybeObserver.onSubscribe(cacheDisposable);
        do {
            cacheDisposableArr = this.Camera2StreamConfigurationMap.get();
            if (cacheDisposableArr == getHighSpeedVideoSizes) {
                if (cacheDisposable.isDisposed()) {
                    return;
                }
                java.lang.Throwable th = this.getHighSpeedVideoFpsRanges;
                if (th != null) {
                    maybeObserver.onError(th);
                    return;
                }
                T t = this.getOutputMinFrameDuration;
                if (t != null) {
                    maybeObserver.onSuccess(t);
                    return;
                } else {
                    maybeObserver.onComplete();
                    return;
                }
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[length + 1];
            java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, cacheDisposableArr, cacheDisposableArr2));
        if (cacheDisposable.isDisposed()) {
            getHighSpeedVideoSizes(cacheDisposable);
            return;
        }
        io.reactivex.MaybeSource<T> andSet = this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(null);
        if (andSet != null) {
            andSet.subscribe(this);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onSuccess(T t) {
        this.getOutputMinFrameDuration = t;
        for (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable : this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoSizes)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.getHighSpeedVideoFpsRangesFor.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onError(java.lang.Throwable th) {
        this.getHighSpeedVideoFpsRanges = th;
        for (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable : this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoSizes)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.getHighSpeedVideoFpsRangesFor.onError(th);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public final void onComplete() {
        for (io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable : this.Camera2StreamConfigurationMap.getAndSet(getHighSpeedVideoSizes)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }

    final void getHighSpeedVideoSizes(io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T> cacheDisposable) {
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable<T>[] cacheDisposableArr;
        io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = this.Camera2StreamConfigurationMap.get();
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
                cacheDisposableArr2 = getHighSpeedVideoFpsRangesFor;
            } else {
                io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[] cacheDisposableArr3 = new io.reactivex.internal.operators.maybe.MaybeCache.CacheDisposable[length - 1];
                java.lang.System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                java.lang.System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, cacheDisposableArr, cacheDisposableArr2));
    }

    /* loaded from: classes17.dex */
    static final class CacheDisposable<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.maybe.MaybeCache<T>> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        CacheDisposable(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.internal.operators.maybe.MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.operators.maybe.MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.getHighSpeedVideoSizes(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == null;
        }
    }
}
