package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleUsing<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super U> Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;

    public SingleUsing(java.util.concurrent.Callable<U> callable, io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> function, io.reactivex.functions.Consumer<? super U> consumer, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.Camera2StreamConfigurationMap = consumer;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        try {
            U call = this.getHighSpeedVideoFpsRangesFor.call();
            try {
                ((io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(call), "The singleFunction returned a null SingleSource")).subscribe(new io.reactivex.internal.operators.single.SingleUsing.UsingSingleObserver(singleObserver, call, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap));
            } catch (java.lang.Throwable th) {
                th = th;
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                if (this.getHighSpeedVideoSizes) {
                    try {
                        this.Camera2StreamConfigurationMap.accept(call);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        th = new io.reactivex.exceptions.CompositeException(th, th2);
                    }
                }
                io.reactivex.internal.disposables.EmptyDisposable.error(th, singleObserver);
                if (this.getHighSpeedVideoSizes) {
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
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, singleObserver);
        }
    }

    /* loaded from: classes17.dex */
    static final class UsingSingleObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5331524057054083935L;
        io.reactivex.disposables.Disposable Camera2StreamConfigurationMap;
        final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.Consumer<? super U> getHighSpeedVideoFpsRanges;
        final boolean getHighSpeedVideoSizes;

        UsingSingleObserver(io.reactivex.SingleObserver<? super T> singleObserver, U u, boolean z, io.reactivex.functions.Consumer<? super U> consumer) {
            super(u);
            this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            this.getHighSpeedVideoSizes = z;
            this.getHighSpeedVideoFpsRanges = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap.dispose();
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
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
            return this.Camera2StreamConfigurationMap.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.Camera2StreamConfigurationMap, disposable)) {
                this.Camera2StreamConfigurationMap = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            java.lang.Object andSet;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.getHighSpeedVideoSizes) {
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
            if (this.getHighSpeedVideoSizes || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(andSet);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            java.lang.Object andSet;
            this.Camera2StreamConfigurationMap = io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
            if (this.getHighSpeedVideoSizes) {
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
            if (this.getHighSpeedVideoSizes || (andSet = getAndSet(this)) == this) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRanges.accept(andSet);
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(th3);
            }
        }
    }
}
