package io.reactivex.internal.operators.maybe;

/* loaded from: classes17.dex */
public final class MaybeIgnoreElement<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    public MaybeIgnoreElement(io.reactivex.MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeIgnoreElement.IgnoreMaybeObserver(maybeObserver));
    }

    static final class IgnoreMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.MaybeObserver<? super T> getHighSpeedVideoSizes;

        IgnoreMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighSpeedVideoSizes = maybeObserver;
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
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            this.getHighSpeedVideoSizes.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI.dispose();
            this.getHighResolutionOutputSizeshNQ4ISI = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }
}
