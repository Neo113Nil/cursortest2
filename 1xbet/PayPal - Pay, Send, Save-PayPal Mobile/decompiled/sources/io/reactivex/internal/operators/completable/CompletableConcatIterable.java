package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableConcatIterable extends io.reactivex.Completable {
    final java.lang.Iterable<? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;

    public CompletableConcatIterable(java.lang.Iterable<? extends io.reactivex.CompletableSource> iterable) {
        this.getHighResolutionOutputSizeshNQ4ISI = iterable;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            io.reactivex.internal.operators.completable.CompletableConcatIterable.ConcatInnerObserver concatInnerObserver = new io.reactivex.internal.operators.completable.CompletableConcatIterable.ConcatInnerObserver(completableObserver, (java.util.Iterator) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.iterator(), "The iterator returned is null"));
            completableObserver.onSubscribe(concatInnerObserver.getHighSpeedVideoFpsRangesFor);
            concatInnerObserver.getHighResolutionOutputSizeshNQ4ISI();
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
        }
    }

    /* loaded from: classes17.dex */
    static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        final java.util.Iterator<? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.disposables.SequentialDisposable();

        ConcatInnerObserver(io.reactivex.CompletableObserver completableObserver, java.util.Iterator<? extends io.reactivex.CompletableSource> it) {
            this.Camera2StreamConfigurationMap = completableObserver;
            this.getHighSpeedVideoFpsRanges = it;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRangesFor.replace(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoFpsRangesFor.isDisposed() || getAndIncrement() != 0) {
                return;
            }
            java.util.Iterator<? extends io.reactivex.CompletableSource> it = this.getHighSpeedVideoFpsRanges;
            while (!this.getHighSpeedVideoFpsRangesFor.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        this.Camera2StreamConfigurationMap.onComplete();
                        return;
                    }
                    try {
                        ((io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(it.next(), "The CompletableSource returned is null")).subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.Camera2StreamConfigurationMap.onError(th);
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    this.Camera2StreamConfigurationMap.onError(th2);
                    return;
                }
            }
        }
    }
}
