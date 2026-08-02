package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableConcatArray extends io.reactivex.Completable {
    final io.reactivex.CompletableSource[] getHighSpeedVideoSizes;

    public CompletableConcatArray(io.reactivex.CompletableSource[] completableSourceArr) {
        this.getHighSpeedVideoSizes = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableConcatArray.ConcatInnerObserver concatInnerObserver = new io.reactivex.internal.operators.completable.CompletableConcatArray.ConcatInnerObserver(completableObserver, this.getHighSpeedVideoSizes);
        completableObserver.onSubscribe(concatInnerObserver.getHighSpeedVideoFpsRanges);
        concatInnerObserver.getHighResolutionOutputSizeshNQ4ISI();
    }

    /* loaded from: classes17.dex */
    static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final io.reactivex.CompletableSource[] Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRanges = new io.reactivex.internal.disposables.SequentialDisposable();
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;

        ConcatInnerObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.CompletableSource[] completableSourceArr) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
            this.Camera2StreamConfigurationMap = completableSourceArr;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges.replace(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoFpsRanges.isDisposed() || getAndIncrement() != 0) {
                return;
            }
            io.reactivex.CompletableSource[] completableSourceArr = this.Camera2StreamConfigurationMap;
            while (!this.getHighSpeedVideoFpsRanges.isDisposed()) {
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                if (i == completableSourceArr.length) {
                    this.getHighSpeedVideoFpsRangesFor.onComplete();
                    return;
                } else {
                    completableSourceArr[i].subscribe(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
