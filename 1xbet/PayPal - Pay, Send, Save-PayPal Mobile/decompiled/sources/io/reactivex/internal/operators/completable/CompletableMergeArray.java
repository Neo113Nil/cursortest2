package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableMergeArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] Camera2StreamConfigurationMap;

    public CompletableMergeArray(io.reactivex.CompletableSource[] completableSourceArr) {
        this.Camera2StreamConfigurationMap = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.internal.operators.completable.CompletableMergeArray.InnerCompletableObserver innerCompletableObserver = new io.reactivex.internal.operators.completable.CompletableMergeArray.InnerCompletableObserver(completableObserver, new java.util.concurrent.atomic.AtomicBoolean(), compositeDisposable, this.Camera2StreamConfigurationMap.length + 1);
        completableObserver.onSubscribe(compositeDisposable);
        for (io.reactivex.CompletableSource completableSource : this.Camera2StreamConfigurationMap) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                compositeDisposable.dispose();
                innerCompletableObserver.onError(new java.lang.NullPointerException("A completable source is null"));
                return;
            }
            completableSource.subscribe(innerCompletableObserver);
        }
        innerCompletableObserver.onComplete();
    }

    /* loaded from: classes17.dex */
    static final class InnerCompletableObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -8360547806504310570L;
        final io.reactivex.CompletableObserver getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoFpsRangesFor;

        InnerCompletableObserver(io.reactivex.CompletableObserver completableObserver, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, io.reactivex.disposables.CompositeDisposable compositeDisposable, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = completableObserver;
            this.getHighSpeedVideoFpsRanges = atomicBoolean;
            this.getHighSpeedVideoFpsRangesFor = compositeDisposable;
            lazySet(i);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.add(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (decrementAndGet() == 0 && this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }
    }
}
