package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableCache extends io.reactivex.Completable implements io.reactivex.CompletableObserver {
    static final io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[0];
    static final io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[0];
    java.lang.Throwable Camera2StreamConfigurationMap;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[]> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
    final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean();
    final io.reactivex.CompletableSource getInputSizeshNQ4ISI;

    @Override // io.reactivex.CompletableObserver
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
    }

    public CompletableCache(io.reactivex.CompletableSource completableSource) {
        this.getInputSizeshNQ4ISI = completableSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr;
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr2;
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache(completableObserver);
        completableObserver.onSubscribe(innerCompletableCache);
        do {
            innerCompletableCacheArr = this.getHighSpeedVideoFpsRanges.get();
            if (innerCompletableCacheArr == getHighSpeedVideoSizes) {
                java.lang.Throwable th = this.Camera2StreamConfigurationMap;
                if (th != null) {
                    completableObserver.onError(th);
                    return;
                } else {
                    completableObserver.onComplete();
                    return;
                }
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[length + 1];
            java.lang.System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, innerCompletableCacheArr, innerCompletableCacheArr2));
        if (innerCompletableCache.isDisposed()) {
            getHighSpeedVideoFpsRangesFor(innerCompletableCache);
        }
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
            this.getInputSizeshNQ4ISI.subscribe(this);
        }
    }

    @Override // io.reactivex.CompletableObserver
    public final void onError(java.lang.Throwable th) {
        this.Camera2StreamConfigurationMap = th;
        for (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache : this.getHighSpeedVideoFpsRanges.getAndSet(getHighSpeedVideoSizes)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.getHighSpeedVideoSizes.onError(th);
            }
        }
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public final void onComplete() {
        for (io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache : this.getHighSpeedVideoFpsRanges.getAndSet(getHighSpeedVideoSizes)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.getHighSpeedVideoSizes.onComplete();
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache innerCompletableCache) {
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr;
        io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = this.getHighSpeedVideoFpsRanges.get();
            int length = innerCompletableCacheArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (innerCompletableCacheArr[i] == innerCompletableCache) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else {
                io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[] innerCompletableCacheArr3 = new io.reactivex.internal.operators.completable.CompletableCache.InnerCompletableCache[length - 1];
                java.lang.System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i);
                java.lang.System.arraycopy(innerCompletableCacheArr, i + 1, innerCompletableCacheArr3, i, (length - i) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    /* loaded from: classes17.dex */
    final class InnerCompletableCache extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8943152917179642732L;
        final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        InnerCompletableCache(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoSizes = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (compareAndSet(false, true)) {
                io.reactivex.internal.operators.completable.CompletableCache.this.getHighSpeedVideoFpsRangesFor(this);
            }
        }
    }
}
