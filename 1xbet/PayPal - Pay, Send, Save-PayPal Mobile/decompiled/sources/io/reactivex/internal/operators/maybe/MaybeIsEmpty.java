package io.reactivex.internal.operators.maybe;

/* loaded from: classes17.dex */
public final class MaybeIsEmpty<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, java.lang.Boolean> {
    public MaybeIsEmpty(io.reactivex.MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Boolean> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeIsEmpty.IsEmptyMaybeObserver(maybeObserver));
    }

    static final class IsEmptyMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

        IsEmptyMaybeObserver(io.reactivex.MaybeObserver<? super java.lang.Boolean> maybeObserver) {
            this.getHighSpeedVideoFpsRangesFor = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
                this.getHighResolutionOutputSizeshNQ4ISI = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(java.lang.Boolean.FALSE);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor.onSuccess(java.lang.Boolean.TRUE);
        }
    }
}
