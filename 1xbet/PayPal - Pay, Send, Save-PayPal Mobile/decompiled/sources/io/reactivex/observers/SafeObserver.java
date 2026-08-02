package io.reactivex.observers;

/* loaded from: classes3.dex */
public final class SafeObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
    io.reactivex.disposables.Disposable getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;

    public SafeObserver(io.reactivex.Observer<? super T> observer) {
        this.Camera2StreamConfigurationMap = observer;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, disposable)) {
            this.getHighResolutionOutputSizeshNQ4ISI = disposable;
            try {
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRanges = true;
                try {
                    disposable.dispose();
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th2));
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.getHighResolutionOutputSizeshNQ4ISI.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighSpeedVideoFpsRanges = true;
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.Camera2StreamConfigurationMap.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                try {
                    this.Camera2StreamConfigurationMap.onError(nullPointerException);
                    return;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th));
                    return;
                }
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
                return;
            }
        }
        if (t == null) {
            java.lang.NullPointerException nullPointerException2 = new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                onError(nullPointerException2);
                return;
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                onError(new io.reactivex.exceptions.CompositeException(nullPointerException2, th3));
                return;
            }
        }
        try {
            this.Camera2StreamConfigurationMap.onNext(t);
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.dispose();
                onError(th4);
            } catch (java.lang.Throwable th5) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th5);
                onError(new io.reactivex.exceptions.CompositeException(th4, th5));
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoFpsRanges) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
            try {
                this.Camera2StreamConfigurationMap.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
                try {
                    this.Camera2StreamConfigurationMap.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException));
                    return;
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th2));
                    return;
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, nullPointerException, th3));
                return;
            }
        }
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        try {
            this.Camera2StreamConfigurationMap.onError(th);
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(th, th4));
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        this.getHighSpeedVideoFpsRanges = true;
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            try {
                this.Camera2StreamConfigurationMap.onComplete();
                return;
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
        }
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Subscription not set!");
        try {
            this.Camera2StreamConfigurationMap.onSubscribe(io.reactivex.internal.disposables.EmptyDisposable.INSTANCE);
            try {
                this.Camera2StreamConfigurationMap.onError(nullPointerException);
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th2));
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.plugins.RxJavaPlugins.onError(new io.reactivex.exceptions.CompositeException(nullPointerException, th3));
        }
    }
}
