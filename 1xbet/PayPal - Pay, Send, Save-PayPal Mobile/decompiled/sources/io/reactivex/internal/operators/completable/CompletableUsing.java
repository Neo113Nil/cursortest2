package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableUsing<R> extends io.reactivex.Completable {
    final java.util.concurrent.Callable<R> getHighResolutionOutputSizeshNQ4ISI;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super R> getHighSpeedVideoSizes;

    public CompletableUsing(java.util.concurrent.Callable<R> callable, io.reactivex.functions.Function<? super R, ? extends io.reactivex.CompletableSource> function, io.reactivex.functions.Consumer<? super R> consumer, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
        this.getHighSpeedVideoFpsRangesFor = function;
        this.getHighSpeedVideoSizes = consumer;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        try {
            R call = this.getHighResolutionOutputSizeshNQ4ISI.call();
            try {
                ((io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRangesFor.apply(call), "The completableFunction returned a null CompletableSource")).subscribe(new io.reactivex.internal.operators.completable.CompletableUsing.UsingObserver(completableObserver, call, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (this.getHighSpeedVideoFpsRanges) {
                    try {
                        this.getHighSpeedVideoSizes.accept(call);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        io.reactivex.internal.disposables.EmptyDisposable.error(new io.reactivex.exceptions.CompositeException(th, th2), completableObserver);
                        return;
                    }
                }
                io.reactivex.internal.disposables.EmptyDisposable.error(th, completableObserver);
                if (this.getHighSpeedVideoFpsRanges) {
                    return;
                }
                try {
                    this.getHighSpeedVideoSizes.accept(call);
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    io.reactivex.plugins.RxJavaPlugins.onError(th3);
                }
            }
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, completableObserver);
        }
    }

    /* loaded from: classes17.dex */
    static final class UsingObserver<R> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -674404550052917487L;
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        final boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.functions.Consumer<? super R> getHighSpeedVideoFpsRangesFor;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        UsingObserver(io.reactivex.CompletableObserver completableObserver, R r, io.reactivex.functions.Consumer<? super R> consumer, boolean z) {
            super(r);
            this.Camera2StreamConfigurationMap = completableObserver;
            this.getHighSpeedVideoFpsRangesFor = consumer;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            java.lang.Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.getHighSpeedVideoFpsRangesFor.accept(andSet);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            java.lang.Object andSet;
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.getHighSpeedVideoFpsRanges) {
                java.lang.Object andSet2 = getAndSet(this);
                if (andSet2 == this) {
                    return;
                }
                try {
                    this.getHighSpeedVideoFpsRangesFor.accept(andSet2);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    th = new io.reactivex.exceptions.CompositeException(th, th2);
                }
            }
            this.Camera2StreamConfigurationMap.onError(th);
            if (this.getHighSpeedVideoFpsRanges || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.accept(andSet);
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            java.lang.Object andSet;
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.getHighSpeedVideoFpsRanges) {
                java.lang.Object andSet2 = getAndSet(this);
                if (andSet2 == this) {
                    return;
                }
                try {
                    this.getHighSpeedVideoFpsRangesFor.accept(andSet2);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.Camera2StreamConfigurationMap.onError(th);
                    return;
                }
            }
            this.Camera2StreamConfigurationMap.onComplete();
            if (this.getHighSpeedVideoFpsRanges || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.accept(andSet);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(th2);
            }
        }
    }
}
