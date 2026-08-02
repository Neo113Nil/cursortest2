package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.MaybeSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;

    public MaybeFlatMapCompletable(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeSource;
        this.getHighSpeedVideoFpsRanges = function;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable.FlatMapCompletableObserver flatMapCompletableObserver = new io.reactivex.internal.operators.maybe.MaybeFlatMapCompletable.FlatMapCompletableObserver(completableObserver, this.getHighSpeedVideoFpsRanges);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(flatMapCompletableObserver);
    }

    /* loaded from: classes17.dex */
    static final class FlatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2177128922851101253L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;
        final io.reactivex.CompletableObserver getHighSpeedVideoSizes;

        FlatMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function) {
            this.getHighSpeedVideoSizes = completableObserver;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(t), "The mapper returned a null CompletableSource");
                if (isDisposed()) {
                    return;
                }
                completableSource.subscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes.onComplete();
        }
    }
}
