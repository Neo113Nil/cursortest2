package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableMergeDelayErrorArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] getHighResolutionOutputSizeshNQ4ISI;

    public CompletableMergeDelayErrorArray(io.reactivex.CompletableSource[] completableSourceArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(this.getHighResolutionOutputSizeshNQ4ISI.length + 1);
        io.reactivex.internal.util.AtomicThrowable atomicThrowable = new io.reactivex.internal.util.AtomicThrowable();
        completableObserver.onSubscribe(compositeDisposable);
        for (io.reactivex.CompletableSource completableSource : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.addThrowable(new java.lang.NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            java.lang.Throwable terminate = atomicThrowable.terminate();
            if (terminate == null) {
                completableObserver.onComplete();
            } else {
                completableObserver.onError(terminate);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class MergeInnerCompletableObserver implements io.reactivex.CompletableObserver {
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        final io.reactivex.internal.util.AtomicThrowable getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes;

        MergeInnerCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.disposables.CompositeDisposable compositeDisposable, io.reactivex.internal.util.AtomicThrowable atomicThrowable, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
            this.Camera2StreamConfigurationMap = completableObserver;
            this.getHighSpeedVideoSizes = compositeDisposable;
            this.getHighResolutionOutputSizeshNQ4ISI = atomicThrowable;
            this.getHighSpeedVideoFpsRangesFor = atomicInteger;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.add(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.addThrowable(th)) {
                getHighSpeedVideoFpsRangesFor();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            getHighSpeedVideoFpsRangesFor();
        }

        private void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() == 0) {
                java.lang.Throwable terminate = this.getHighResolutionOutputSizeshNQ4ISI.terminate();
                if (terminate == null) {
                    this.Camera2StreamConfigurationMap.onComplete();
                } else {
                    this.Camera2StreamConfigurationMap.onError(terminate);
                }
            }
        }
    }
}
