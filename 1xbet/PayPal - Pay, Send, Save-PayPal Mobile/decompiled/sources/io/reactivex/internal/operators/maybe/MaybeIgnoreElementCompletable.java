package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeIgnoreElementCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToMaybe<T> {
    final io.reactivex.MaybeSource<T> getHighSpeedVideoFpsRangesFor;

    public MaybeIgnoreElementCompletable(io.reactivex.MaybeSource<T> maybeSource) {
        this.getHighSpeedVideoFpsRangesFor = maybeSource;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable.IgnoreMaybeObserver(completableObserver));
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public final io.reactivex.Maybe<T> fuseToMaybe() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.maybe.MaybeIgnoreElement(this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class IgnoreMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;

        IgnoreMaybeObserver(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
