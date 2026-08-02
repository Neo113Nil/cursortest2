package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapSingleElement<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.MaybeSource<T> getHighSpeedVideoFpsRanges;

    public MaybeFlatMapSingleElement(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
        this.getHighSpeedVideoFpsRanges = maybeSource;
        this.Camera2StreamConfigurationMap = function;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement.FlatMapMaybeObserver(maybeObserver, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4827726964688405508L;
        final io.reactivex.MaybeObserver<? super R> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoSizes;

        FlatMapMaybeObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.getHighSpeedVideoSizes = function;
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
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t), "The mapper returned a null SingleSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement.FlatMapSingleObserver(this, this.getHighSpeedVideoFpsRangesFor));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class FlatMapSingleObserver<R> implements io.reactivex.SingleObserver<R> {
        final io.reactivex.MaybeObserver<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;

        FlatMapSingleObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference, io.reactivex.MaybeObserver<? super R> maybeObserver) {
            this.getHighSpeedVideoFpsRanges = atomicReference;
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(R r) {
            this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(r);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }
    }
}
