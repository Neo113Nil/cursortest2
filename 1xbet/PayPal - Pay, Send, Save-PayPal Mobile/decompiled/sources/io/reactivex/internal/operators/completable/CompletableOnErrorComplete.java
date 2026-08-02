package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableOnErrorComplete extends io.reactivex.Completable {
    final io.reactivex.functions.Predicate<? super java.lang.Throwable> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;

    public CompletableOnErrorComplete(io.reactivex.CompletableSource completableSource, io.reactivex.functions.Predicate<? super java.lang.Throwable> predicate) {
        this.getHighSpeedVideoFpsRangesFor = completableSource;
        this.getHighResolutionOutputSizeshNQ4ISI = predicate;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.completable.CompletableOnErrorComplete.OnError(completableObserver));
    }

    /* loaded from: classes17.dex */
    final class OnError implements io.reactivex.CompletableObserver {
        private final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        OnError(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoSizes = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            try {
                if (io.reactivex.internal.operators.completable.CompletableOnErrorComplete.this.getHighResolutionOutputSizeshNQ4ISI.test(th)) {
                    this.getHighSpeedVideoSizes.onComplete();
                } else {
                    this.getHighSpeedVideoSizes.onError(th);
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.onSubscribe(disposable);
        }
    }
}
