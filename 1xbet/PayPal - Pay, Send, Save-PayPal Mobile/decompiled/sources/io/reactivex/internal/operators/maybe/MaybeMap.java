package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeMap<T, R> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, R> {
    final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoSizes;

    public MaybeMap(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.getHighSpeedVideoSizes = function;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeMap.MapMaybeObserver(maybeObserver, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class MapMaybeObserver<T, R> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super R> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Function<? super T, ? extends R> getHighSpeedVideoSizes;

        MapMaybeObserver(io.reactivex.MaybeObserver<? super R> maybeObserver, io.reactivex.functions.Function<? super T, ? extends R> function) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.getHighSpeedVideoSizes = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.disposables.Disposable disposable = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                this.getHighSpeedVideoFpsRangesFor.onSuccess(io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(t), "The mapper returned a null item"));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.onError(th);
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
}
