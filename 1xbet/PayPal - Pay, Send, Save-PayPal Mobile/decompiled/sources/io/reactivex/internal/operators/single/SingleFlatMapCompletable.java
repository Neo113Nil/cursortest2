package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFlatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<T> getHighSpeedVideoSizes;

    public SingleFlatMapCompletable(io.reactivex.SingleSource<T> singleSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function) {
        this.getHighSpeedVideoSizes = singleSource;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.single.SingleFlatMapCompletable.FlatMapCompletableObserver flatMapCompletableObserver = new io.reactivex.internal.operators.single.SingleFlatMapCompletable.FlatMapCompletableObserver(completableObserver, this.getHighResolutionOutputSizeshNQ4ISI);
        completableObserver.onSubscribe(flatMapCompletableObserver);
        this.getHighSpeedVideoSizes.subscribe(flatMapCompletableObserver);
    }

    /* loaded from: classes17.dex */
    static final class FlatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2177128922851101253L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;

        FlatMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t), "The mapper returned a null CompletableSource");
                if (isDisposed()) {
                    return;
                }
                completableSource.subscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
