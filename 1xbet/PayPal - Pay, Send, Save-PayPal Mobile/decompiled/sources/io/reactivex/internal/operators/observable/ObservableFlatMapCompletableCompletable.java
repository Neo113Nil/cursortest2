package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends io.reactivex.Completable implements io.reactivex.internal.fuseable.FuseToObservable<T> {
    final io.reactivex.ObservableSource<T> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoSizes;

    public ObservableFlatMapCompletableCompletable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        this.getHighResolutionOutputSizeshNQ4ISI.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver(completableObserver, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<T> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableFlatMapCompletable(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class FlatMapCompletableMainObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getOutputFormats;
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizesFor = new io.reactivex.disposables.CompositeDisposable();

        FlatMapCompletableMainObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.getOutputFormats = function;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver.InnerObserver innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver.InnerObserver();
                if (this.getHighSpeedVideoSizes || !this.getHighSpeedVideoSizesFor.add(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoFpsRangesFor.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.Camera2StreamConfigurationMap.addThrowable(th)) {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    if (decrementAndGet() == 0) {
                        this.getHighSpeedVideoFpsRanges.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.getHighSpeedVideoFpsRanges.onError(this.Camera2StreamConfigurationMap.terminate());
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                java.lang.Throwable terminate = this.Camera2StreamConfigurationMap.terminate();
                if (terminate != null) {
                    this.getHighSpeedVideoFpsRanges.onError(terminate);
                } else {
                    this.getHighSpeedVideoFpsRanges.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getHighSpeedVideoFpsRangesFor.dispose();
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.isDisposed();
        }

        final class InnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver flatMapCompletableMainObserver = io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.getHighSpeedVideoSizesFor.delete(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver flatMapCompletableMainObserver = io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable.FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.getHighSpeedVideoSizesFor.delete(this);
                flatMapCompletableMainObserver.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
            }
        }
    }
}
