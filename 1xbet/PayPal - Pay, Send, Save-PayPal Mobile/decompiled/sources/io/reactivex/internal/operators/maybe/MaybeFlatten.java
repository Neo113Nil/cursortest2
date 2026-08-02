package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatten<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoFpsRangesFor;

    public MaybeFlatten(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRangesFor = function;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRangesFor));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super R> getHighSpeedVideoSizes;

        FlatMapMaybeObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.Camera2StreamConfigurationMap = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                maybeSource.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver.InnerObserver());
            } catch (java.lang.Exception e) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(e);
                this.getHighSpeedVideoSizes.onError(e);
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

        final class InnerObserver implements io.reactivex.MaybeObserver<R> {
            InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver.this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver.this.getHighSpeedVideoSizes.onSuccess(r);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver.this.getHighSpeedVideoSizes.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.maybe.MaybeFlatten.FlatMapMaybeObserver.this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
