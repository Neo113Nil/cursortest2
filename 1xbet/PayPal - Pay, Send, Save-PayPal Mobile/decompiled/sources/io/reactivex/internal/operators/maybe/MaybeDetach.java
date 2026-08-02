package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeDetach<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    public MaybeDetach(io.reactivex.MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new io.reactivex.internal.operators.maybe.MaybeDetach.DetachMaybeObserver(maybeObserver));
    }

    /* loaded from: classes17.dex */
    static final class DetachMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        DetachMaybeObserver(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.MaybeObserver<? super T> maybeObserver = this.getHighResolutionOutputSizeshNQ4ISI;
            if (maybeObserver != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                maybeObserver.onSuccess(t);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.MaybeObserver<? super T> maybeObserver = this.getHighResolutionOutputSizeshNQ4ISI;
            if (maybeObserver != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                maybeObserver.onError(th);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            io.reactivex.MaybeObserver<? super T> maybeObserver = this.getHighResolutionOutputSizeshNQ4ISI;
            if (maybeObserver != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                maybeObserver.onComplete();
            }
        }
    }
}
