package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleFlatMapMaybe<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRangesFor;

    public SingleFlatMapMaybe(io.reactivex.SingleSource<? extends T> singleSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function) {
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoFpsRangesFor = singleSource;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapMaybe.FlatMapSingleObserver(maybeObserver, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapSingleObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5843758257109742742L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super R> getHighSpeedVideoSizes;

        FlatMapSingleObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.getHighSpeedVideoFpsRangesFor = function;
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
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new io.reactivex.internal.operators.single.SingleFlatMapMaybe.FlatMapMaybeObserver(this, this.getHighSpeedVideoSizes));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeObserver<R> implements io.reactivex.MaybeObserver<R> {
        final io.reactivex.MaybeObserver<? super R> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;

        FlatMapMaybeObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.MaybeObserver<? super R> maybeObserver) {
            this.getHighSpeedVideoFpsRangesFor = atomicReference;
            this.getHighSpeedVideoFpsRanges = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRangesFor, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(R r) {
            this.getHighSpeedVideoFpsRanges.onSuccess(r);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
