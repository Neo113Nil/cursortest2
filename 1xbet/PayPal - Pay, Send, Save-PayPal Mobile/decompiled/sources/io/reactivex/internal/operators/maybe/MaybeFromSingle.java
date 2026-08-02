package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeFromSingle<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.HasUpstreamSingleSource<T> {
    final io.reactivex.SingleSource<T> getHighSpeedVideoFpsRanges;

    public MaybeFromSingle(io.reactivex.SingleSource<T> singleSource) {
        this.getHighSpeedVideoFpsRanges = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamSingleSource
    public final io.reactivex.SingleSource<T> source() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.getHighSpeedVideoFpsRanges.subscribe(new io.reactivex.internal.operators.maybe.MaybeFromSingle.FromSingleObserver(maybeObserver));
    }

    /* loaded from: classes17.dex */
    static final class FromSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        FromSingleObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoSizes = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onError(th);
        }
    }
}
