package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapBiSelector<T, U, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoSizes;

    public MaybeFlatMapBiSelector(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> function, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
        super(maybeSource);
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.getHighSpeedVideoSizes = biFunction;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector.FlatMapBiMainObserver(maybeObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapBiMainObserver<T, U, R> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector.FlatMapBiMainObserver.InnerObserver<T, U, R> getHighSpeedVideoFpsRanges;

        FlatMapBiMainObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends U>> function, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.maybe.MaybeFlatMapBiSelector.FlatMapBiMainObserver.InnerObserver<>(maybeObserver, biFunction);
            this.getHighResolutionOutputSizeshNQ4ISI = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(t), "The mapper returned a null MaybeSource");
                if (io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRanges, null)) {
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes = t;
                    maybeSource.subscribe(this.getHighSpeedVideoFpsRanges);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }

        static final class InnerObserver<T, U, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<U> {
            private static final long serialVersionUID = -2897979525538174559L;
            final io.reactivex.MaybeObserver<? super R> getHighResolutionOutputSizeshNQ4ISI;
            final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoFpsRangesFor;
            T getHighSpeedVideoSizes;

            InnerObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
                this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
                this.getHighSpeedVideoFpsRangesFor = biFunction;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(U u) {
                T t = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = null;
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(t, u), "The resultSelector returned a null value"));
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }
    }
}
