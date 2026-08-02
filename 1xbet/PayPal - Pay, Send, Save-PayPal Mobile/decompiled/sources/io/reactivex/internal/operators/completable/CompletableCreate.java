package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableCreate extends io.reactivex.Completable {
    final io.reactivex.CompletableOnSubscribe getHighResolutionOutputSizeshNQ4ISI;

    public CompletableCreate(io.reactivex.CompletableOnSubscribe completableOnSubscribe) {
        this.getHighResolutionOutputSizeshNQ4ISI = completableOnSubscribe;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.internal.operators.completable.CompletableCreate.Emitter emitter = new io.reactivex.internal.operators.completable.CompletableCreate.Emitter(completableObserver);
        completableObserver.onSubscribe(emitter);
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.subscribe(emitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            emitter.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class Emitter extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2467358622224974244L;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;

        Emitter(io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
        }

        @Override // io.reactivex.CompletableEmitter
        public final void onComplete() {
            io.reactivex.disposables.Disposable andSet;
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.CompletableEmitter
        public final void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.CompletableEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable andSet;
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || (andSet = getAndSet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) == io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // io.reactivex.CompletableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
        }

        @Override // io.reactivex.CompletableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.CompletableEmitter, io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
