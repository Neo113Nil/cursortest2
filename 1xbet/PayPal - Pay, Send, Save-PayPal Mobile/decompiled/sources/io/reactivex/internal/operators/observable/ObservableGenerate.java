package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableGenerate<T, S> extends io.reactivex.Observable<T> {
    final java.util.concurrent.Callable<S> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Consumer<? super S> getHighSpeedVideoSizes;

    public ObservableGenerate(java.util.concurrent.Callable<S> callable, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer) {
        this.getHighResolutionOutputSizeshNQ4ISI = callable;
        this.getHighSpeedVideoFpsRangesFor = biFunction;
        this.getHighSpeedVideoSizes = consumer;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            io.reactivex.internal.operators.observable.ObservableGenerate.GeneratorDisposable generatorDisposable = new io.reactivex.internal.operators.observable.ObservableGenerate.GeneratorDisposable(observer, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI.call());
            observer.onSubscribe(generatorDisposable);
            S s = generatorDisposable.getInputSizeshNQ4ISI;
            if (generatorDisposable.Camera2StreamConfigurationMap) {
                generatorDisposable.getInputSizeshNQ4ISI = null;
                try {
                    generatorDisposable.getHighSpeedVideoSizes.accept(s);
                    return;
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    io.reactivex.plugins.RxJavaPlugins.onError(th);
                    return;
                }
            }
            io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction = generatorDisposable.getHighResolutionOutputSizeshNQ4ISI;
            while (!generatorDisposable.Camera2StreamConfigurationMap) {
                generatorDisposable.getHighSpeedVideoFpsRangesFor = false;
                try {
                    s = biFunction.apply(s, generatorDisposable);
                    if (generatorDisposable.getHighSpeedVideoSizesFor) {
                        generatorDisposable.Camera2StreamConfigurationMap = true;
                        generatorDisposable.getInputSizeshNQ4ISI = null;
                        try {
                            generatorDisposable.getHighSpeedVideoSizes.accept(s);
                            return;
                        } catch (java.lang.Throwable th2) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                            io.reactivex.plugins.RxJavaPlugins.onError(th2);
                            return;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                    generatorDisposable.getInputSizeshNQ4ISI = null;
                    generatorDisposable.Camera2StreamConfigurationMap = true;
                    generatorDisposable.onError(th3);
                    try {
                        generatorDisposable.getHighSpeedVideoSizes.accept(s);
                        return;
                    } catch (java.lang.Throwable th4) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
                        io.reactivex.plugins.RxJavaPlugins.onError(th4);
                        return;
                    }
                }
            }
            generatorDisposable.getInputSizeshNQ4ISI = null;
            try {
                generatorDisposable.getHighSpeedVideoSizes.accept(s);
            } catch (java.lang.Throwable th5) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th5);
                io.reactivex.plugins.RxJavaPlugins.onError(th5);
            }
        } catch (java.lang.Throwable th6) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th6);
            io.reactivex.internal.disposables.EmptyDisposable.error(th6, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class GeneratorDisposable<T, S> implements io.reactivex.Emitter<T>, io.reactivex.disposables.Disposable {
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoFpsRangesFor;
        final io.reactivex.functions.Consumer<? super S> getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        S getInputSizeshNQ4ISI;

        GeneratorDisposable(io.reactivex.Observer<? super T> observer, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> biFunction, io.reactivex.functions.Consumer<? super S> consumer, S s) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = biFunction;
            this.getHighSpeedVideoSizes = consumer;
            this.getInputSizeshNQ4ISI = s;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                onError(new java.lang.IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.getHighSpeedVideoFpsRangesFor = true;
                this.getHighSpeedVideoFpsRanges.onNext(t);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.getHighSpeedVideoSizesFor = true;
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.getHighSpeedVideoSizesFor = true;
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
