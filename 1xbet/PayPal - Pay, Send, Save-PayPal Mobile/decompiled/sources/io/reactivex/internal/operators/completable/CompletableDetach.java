package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableDetach extends io.reactivex.Completable {
    final io.reactivex.CompletableSource getHighSpeedVideoSizes;

    public CompletableDetach(io.reactivex.CompletableSource completableSource) {
        this.getHighSpeedVideoSizes = completableSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableDetach.DetachCompletableObserver(completableObserver));
    }

    /* loaded from: classes17.dex */
    static final class DetachCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        DetachCompletableObserver(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.CompletableObserver completableObserver = this.getHighSpeedVideoFpsRanges;
            if (completableObserver != null) {
                this.getHighSpeedVideoFpsRanges = null;
                completableObserver.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.CompletableObserver completableObserver = this.getHighSpeedVideoFpsRanges;
            if (completableObserver != null) {
                this.getHighSpeedVideoFpsRanges = null;
                completableObserver.onComplete();
            }
        }
    }
}
