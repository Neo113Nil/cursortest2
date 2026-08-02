package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableUsing<T, D> extends io.reactivex.Observable<T> {
    final io.reactivex.functions.Consumer<? super D> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.Callable<? extends D> getHighSpeedVideoSizes;

    public ObservableUsing(java.util.concurrent.Callable<? extends D> callable, io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> function, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
        this.getHighSpeedVideoSizes = callable;
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighResolutionOutputSizeshNQ4ISI = consumer;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            D call = this.getHighSpeedVideoSizes.call();
            try {
                ((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(call), "The sourceSupplier returned a null ObservableSource")).subscribe(new io.reactivex.internal.operators.observable.ObservableUsing.UsingObserver(observer, call, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI.accept(call);
                    io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                } catch (java.lang.Throwable th2) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                    io.reactivex.internal.disposables.EmptyDisposable.error(new io.reactivex.exceptions.CompositeException(th, th2), observer);
                }
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.disposables.EmptyDisposable.error(th3, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class UsingObserver<T, D> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 5904473792286235046L;
        final io.reactivex.functions.Consumer<? super D> Camera2StreamConfigurationMap;
        final D getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        UsingObserver(io.reactivex.Observer<? super T> observer, D d, io.reactivex.functions.Consumer<? super D> consumer, boolean z) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = d;
            this.Camera2StreamConfigurationMap = consumer;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges) {
                if (compareAndSet(false, true)) {
                    try {
                        this.Camera2StreamConfigurationMap.accept(this.getHighResolutionOutputSizeshNQ4ISI);
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        th = new io.reactivex.exceptions.CompositeException(th, th2);
                    }
                }
                this.getHighSpeedVideoFpsRangesFor.dispose();
                this.getHighSpeedVideoSizes.onError(th);
                return;
            }
            this.getHighSpeedVideoSizes.onError(th);
            this.getHighSpeedVideoFpsRangesFor.dispose();
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges) {
                if (compareAndSet(false, true)) {
                    try {
                        this.Camera2StreamConfigurationMap.accept(this.getHighResolutionOutputSizeshNQ4ISI);
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        this.getHighSpeedVideoSizes.onError(th);
                        return;
                    }
                }
                this.getHighSpeedVideoFpsRangesFor.dispose();
                this.getHighSpeedVideoSizes.onComplete();
                return;
            }
            this.getHighSpeedVideoSizes.onComplete();
            this.getHighSpeedVideoFpsRangesFor.dispose();
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoFpsRangesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get();
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (compareAndSet(false, true)) {
                try {
                    this.Camera2StreamConfigurationMap.accept(this.getHighResolutionOutputSizeshNQ4ISI);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
