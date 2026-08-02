package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFromCompletable<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.HasUpstreamCompletableSource {
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRanges;

    public MaybeFromCompletable(io.reactivex.CompletableSource completableSource) {
        this.getHighSpeedVideoFpsRanges = completableSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamCompletableSource
    public final io.reactivex.CompletableSource source() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.maybe.MaybeFromCompletable.FromCompletableObserver(maybeObserver));
    }

    /* loaded from: classes17.dex */
    static final class FromCompletableObserver<T> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRanges;

        FromCompletableObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoFpsRanges = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }
    }
}
