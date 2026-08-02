package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableMergeIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;

    public CompletableMergeIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> iterable) {
        this.getHighSpeedVideoFpsRanges = iterable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            java.util.Iterator it = (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.iterator(), "The source iterator returned is null");
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(1);
            io.reactivex.internal.operators.completable.CompletableMergeIterable.MergeCompletableObserver mergeCompletableObserver = new io.reactivex.internal.operators.completable.CompletableMergeIterable.MergeCompletableObserver(completableObserver, compositeDisposable, atomicInteger);
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (compositeDisposable.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completableSource.subscribe(mergeCompletableObserver);
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            compositeDisposable.dispose();
                            mergeCompletableObserver.onError(th);
                            return;
                        }
                    } else {
                        mergeCompletableObserver.onComplete();
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    compositeDisposable.dispose();
                    mergeCompletableObserver.onError(th2);
                    return;
                }
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            completableObserver.onError(th3);
        }
    }

    /* loaded from: classes17.dex */
    static final class MergeCompletableObserver extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7730517613164279224L;
        final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoFpsRanges;
        final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        MergeCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.disposables.CompositeDisposable compositeDisposable, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
            this.getHighSpeedVideoSizes = completableObserver;
            this.getHighSpeedVideoFpsRanges = compositeDisposable;
            this.getHighResolutionOutputSizeshNQ4ISI = atomicInteger;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges.add(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.dispose();
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
