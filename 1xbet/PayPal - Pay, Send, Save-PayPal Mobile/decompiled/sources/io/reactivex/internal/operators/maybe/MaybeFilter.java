package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFilter<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoFpsRanges;

    public MaybeFilter(io.reactivex.MaybeSource<T> maybeSource, io.reactivex.functions.Predicate<? super T> predicate) {
        super(maybeSource);
        this.getHighSpeedVideoFpsRanges = predicate;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeFilter.FilterMaybeObserver(maybeObserver, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class FilterMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> Camera2StreamConfigurationMap;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Predicate<? super T> getHighSpeedVideoSizes;

        FilterMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, io.reactivex.functions.Predicate<? super T> predicate) {
            this.Camera2StreamConfigurationMap = maybeObserver;
            this.getHighSpeedVideoSizes = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.disposables.Disposable disposable = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRanges, disposable)) {
                this.getHighSpeedVideoFpsRanges = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            try {
                if (this.getHighSpeedVideoSizes.test(t)) {
                    this.Camera2StreamConfigurationMap.onSuccess(t);
                } else {
                    this.Camera2StreamConfigurationMap.onComplete();
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.Camera2StreamConfigurationMap.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }
}
