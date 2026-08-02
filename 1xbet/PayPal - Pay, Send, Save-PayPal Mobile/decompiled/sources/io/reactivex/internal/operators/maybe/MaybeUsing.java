package io.reactivex.internal.operators.maybe;

/* loaded from: classes3.dex */
public final class MaybeUsing<T, D> extends io.reactivex.Maybe<T> {
    final io.reactivex.functions.Consumer<? super D> Camera2StreamConfigurationMap;
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<? extends D> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super D, ? extends io.reactivex.MaybeSource<? extends T>> getHighSpeedVideoSizes;

    public MaybeUsing(java.util.concurrent.Callable<? extends D> callable, io.reactivex.functions.Function<? super D, ? extends io.reactivex.MaybeSource<? extends T>> function, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = callable;
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // io.reactivex.Maybe
    public final void subscribeActual(io.reactivex.MaybeObserver<? super T> maybeObserver) {
        try {
            D call = this.getHighSpeedVideoFpsRangesFor.call();
            try {
                ((io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply(call), "The sourceSupplier returned a null MaybeSource")).subscribe(new io.reactivex.internal.operators.maybe.MaybeUsing.UsingObserver(maybeObserver, call, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    try {
                        this.Camera2StreamConfigurationMap.accept(call);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        io.reactivex.internal.disposables.EmptyDisposable.error(new io.reactivex.exceptions.CompositeException(th, th2), maybeObserver);
                        return;
                    }
                }
                io.reactivex.internal.disposables.EmptyDisposable.error(th, maybeObserver);
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                try {
                    this.Camera2StreamConfigurationMap.accept(call);
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    io.reactivex.plugins.RxJavaPlugins.onError(th3);
                }
            }
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, maybeObserver);
        }
    }

    /* loaded from: classes17.dex */
    static final class UsingObserver<T, D> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -674404550052917487L;
        final boolean Camera2StreamConfigurationMap;
        final io.reactivex.MaybeObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Consumer<? super D> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        UsingObserver(io.reactivex.MaybeObserver<? super T> maybeObserver, D d, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
            super(d);
            this.getHighResolutionOutputSizeshNQ4ISI = maybeObserver;
            this.getHighSpeedVideoFpsRanges = consumer;
            this.Camera2StreamConfigurationMap = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            java.lang.Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.getHighSpeedVideoFpsRanges.accept(andSet);
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

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t) {
            java.lang.Object andSet;
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.Camera2StreamConfigurationMap) {
                java.lang.Object andSet2 = getAndSet(this);
                if (andSet2 == this) {
                    return;
                }
                try {
                    this.getHighSpeedVideoFpsRanges.accept(andSet2);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    return;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            if (this.Camera2StreamConfigurationMap || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(andSet);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(java.lang.Throwable th) {
            java.lang.Object andSet;
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.Camera2StreamConfigurationMap) {
                java.lang.Object andSet2 = getAndSet(this);
                if (andSet2 == this) {
                    return;
                }
                try {
                    this.getHighSpeedVideoFpsRanges.accept(andSet2);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    th = new io.reactivex.exceptions.CompositeException(th, th2);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            if (this.Camera2StreamConfigurationMap || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(andSet);
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            java.lang.Object andSet;
            this.getHighSpeedVideoSizes = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.Camera2StreamConfigurationMap) {
                java.lang.Object andSet2 = getAndSet(this);
                if (andSet2 == this) {
                    return;
                }
                try {
                    this.getHighSpeedVideoFpsRanges.accept(andSet2);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                    return;
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            if (this.Camera2StreamConfigurationMap || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(andSet);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(th2);
            }
        }
    }
}
