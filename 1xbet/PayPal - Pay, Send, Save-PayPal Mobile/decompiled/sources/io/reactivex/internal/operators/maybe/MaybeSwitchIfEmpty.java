package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeSwitchIfEmpty<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> getHighSpeedVideoFpsRanges;

    public MaybeSwitchIfEmpty(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRanges = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty.SwitchIfEmptyMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class SwitchIfEmptyMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2223459372976438024L;
        final io.reactivex.MaybeSource<? extends T> Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoFpsRangesFor;

        SwitchIfEmptyMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.MaybeSource<? extends T> maybeSource) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
            this.Camera2StreamConfigurationMap = maybeSource;
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
            this.getHighSpeedVideoFpsRangesFor.onSuccess(t);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty.SwitchIfEmptyMaybeObserver.OtherMaybeObserver(this.getHighSpeedVideoFpsRangesFor, this));
        }

        static final class OtherMaybeObserver<T> implements io.reactivex.MaybeObserver<T> {
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;
            final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

            OtherMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
                this.getHighSpeedVideoSizes = maybeObserver;
                this.getHighSpeedVideoFpsRanges = atomicReference;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t) {
                this.getHighSpeedVideoSizes.onSuccess(t);
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
}
