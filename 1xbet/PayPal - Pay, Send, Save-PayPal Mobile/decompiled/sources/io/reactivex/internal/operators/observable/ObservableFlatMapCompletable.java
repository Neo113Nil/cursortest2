package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableFlatMapCompletable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> Camera2StreamConfigurationMap;
    final boolean getHighSpeedVideoSizes;

    public ObservableFlatMapCompletable(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
        super(observableSource);
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver(observer, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes));
    }

    static final class FlatMapCompletableMainObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getInputFormats;
        final io.reactivex.internal.util.AtomicThrowable Camera2StreamConfigurationMap = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizesFor = new io.reactivex.disposables.CompositeDisposable();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 2;
        }

        FlatMapCompletableMainObserver(io.reactivex.Observer<? super T> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRanges = z;
            lazySet(1);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoFpsRangesFor, disposable)) {
                this.getHighSpeedVideoFpsRangesFor = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.InnerObserver innerObserver = new io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.InnerObserver();
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
                if (this.getHighSpeedVideoFpsRanges) {
                    if (decrementAndGet() == 0) {
                        this.getHighResolutionOutputSizeshNQ4ISI.onError(this.Camera2StreamConfigurationMap.terminate());
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(this.Camera2StreamConfigurationMap.terminate());
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
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(terminate);
                } else {
                    this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
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
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver flatMapCompletableMainObserver = io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.getHighSpeedVideoSizesFor.delete(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver flatMapCompletableMainObserver = io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.this;
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
