package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFlatMapNotification<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoFpsRanges;
    final java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoSizes;

    public MaybeFlatMapNotification(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> function2, java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> callable) {
        super(maybeSource);
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoSizes = callable;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver(maybeObserver, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapMaybeObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4375739915521278546L;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super R> getHighSpeedVideoSizes;

        FlatMapMaybeObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends R>> function2, java.util.concurrent.Callable<? extends io.reactivex.MaybeSource<? extends R>> callable) {
            this.getHighSpeedVideoSizes = maybeObserver;
            this.Camera2StreamConfigurationMap = function;
            this.getHighSpeedVideoFpsRangesFor = function2;
            this.getHighSpeedVideoFpsRanges = callable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(t), "The onSuccessMapper returned a null MaybeSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.InnerObserver());
            } catch (java.lang.Exception e) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(e);
                this.getHighSpeedVideoSizes.onError(e);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            try {
                ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(th), "The onErrorMapper returned a null MaybeSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.InnerObserver());
            } catch (java.lang.Exception e) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(e);
                this.getHighSpeedVideoSizes.onError(new io.reactivex.exceptions.CompositeException(th, e));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            try {
                ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.call(), "The onCompleteSupplier returned a null MaybeSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.InnerObserver());
            } catch (java.lang.Exception e) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(e);
                this.getHighSpeedVideoSizes.onError(e);
            }
        }

        final class InnerObserver implements io.reactivex.MaybeObserver<R> {
            InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.this.getHighSpeedVideoSizes.onSuccess(r);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.this.getHighSpeedVideoSizes.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.maybe.MaybeFlatMapNotification.FlatMapMaybeObserver.this.getHighSpeedVideoSizes.onComplete();
            }
        }
    }
}
