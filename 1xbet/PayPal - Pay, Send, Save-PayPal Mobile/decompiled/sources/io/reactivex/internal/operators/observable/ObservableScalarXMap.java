package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableScalarXMap {
    private ObservableScalarXMap() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T, R> boolean tryScalarXMapSubscribe(io.reactivex.ObservableSource<T> observableSource, io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof java.util.concurrent.Callable)) {
            return false;
        }
        try {
            a.d dVar = (java.lang.Object) ((java.util.concurrent.Callable) observableSource).call();
            if (dVar == null) {
                io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                return true;
            }
            try {
                io.reactivex.ObservableSource observableSource2 = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(function.apply(dVar), "The mapper returned a null ObservableSource");
                if (observableSource2 instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object call = ((java.util.concurrent.Callable) observableSource2).call();
                        if (call == null) {
                            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                            return true;
                        }
                        io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable scalarDisposable = new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable(observer, call);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (java.lang.Throwable th2) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
                return true;
            }
        } catch (java.lang.Throwable th3) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
            io.reactivex.internal.disposables.EmptyDisposable.error(th3, observer);
            return true;
        }
    }

    public static <T, U> io.reactivex.Observable<U> scalarXMap(T t, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarXMapObservable(t, function));
    }

    /* loaded from: classes17.dex */
    static final class ScalarXMapObservable<T, R> extends io.reactivex.Observable<R> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> Camera2StreamConfigurationMap;
        final T getHighSpeedVideoSizes;

        ScalarXMapObservable(T t, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function) {
            this.getHighSpeedVideoSizes = t;
            this.Camera2StreamConfigurationMap = function;
        }

        @Override // io.reactivex.Observable
        public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
            try {
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(this.getHighSpeedVideoSizes), "The mapper returned a null ObservableSource");
                if (observableSource instanceof java.util.concurrent.Callable) {
                    try {
                        java.lang.Object call = ((java.util.concurrent.Callable) observableSource).call();
                        if (call == null) {
                            io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                            return;
                        }
                        io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable scalarDisposable = new io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable(observer, call);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                        return;
                    } catch (java.lang.Throwable th) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                        io.reactivex.internal.disposables.EmptyDisposable.error(th, observer);
                        return;
                    }
                }
                observableSource.subscribe(observer);
            } catch (java.lang.Throwable th2) {
                io.reactivex.internal.disposables.EmptyDisposable.error(th2, observer);
            }
        }
    }

    /* loaded from: classes17.dex */
    public static final class ScalarDisposable<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.internal.fuseable.QueueDisposable<T>, java.lang.Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        final T getHighSpeedVideoFpsRangesFor;

        public ScalarDisposable(io.reactivex.Observer<? super T> observer, T t) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRangesFor = t;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t) {
            throw new java.lang.UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean offer(T t, T t2) {
            throw new java.lang.UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() throws java.lang.Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            set(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == 3;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.Camera2StreamConfigurationMap.onNext(this.getHighSpeedVideoFpsRangesFor);
                if (get() == 2) {
                    lazySet(3);
                    this.Camera2StreamConfigurationMap.onComplete();
                }
            }
        }
    }
}
