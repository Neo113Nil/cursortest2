package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeCreate<T> extends io.reactivex.Maybe<T> {
    final io.reactivex.MaybeOnSubscribe<T> getHighResolutionOutputSizeshNQ4ISI;

    public MaybeCreate(io.reactivex.MaybeOnSubscribe<T> maybeOnSubscribe) {
        this.getHighResolutionOutputSizeshNQ4ISI = maybeOnSubscribe;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.internal.operators.maybe.MaybeCreate.Emitter emitter = new io.reactivex.internal.operators.maybe.MaybeCreate.Emitter(maybeObserver);
        maybeObserver.onSubscribe(emitter);
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(emitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            emitter.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class Emitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeEmitter<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

        Emitter(io.reactivex.MaybeObserver<? super T> maybeObserver) {
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
        }

        @Override // io.reactivex.MaybeEmitter
        public final void onSuccess(T t) {
            io.reactivex.disposables.Disposable andSet;
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                if (t == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(new java.lang.NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (java.lang.Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // io.reactivex.MaybeEmitter
        public final void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.MaybeEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable andSet;
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.MaybeEmitter
        public final void onComplete() {
            io.reactivex.disposables.Disposable andSet;
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.MaybeEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
        }

        @Override // io.reactivex.MaybeEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeEmitter, io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
