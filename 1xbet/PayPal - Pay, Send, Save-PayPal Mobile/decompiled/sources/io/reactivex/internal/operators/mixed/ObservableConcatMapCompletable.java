package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class ObservableConcatMapCompletable<T> extends io.reactivex.Completable {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.internal.util.ErrorMode getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighSpeedVideoFpsRanges;
    final io.reactivex.Observable<T> getHighSpeedVideoFpsRangesFor;

    public ObservableConcatMapCompletable(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighResolutionOutputSizeshNQ4ISI = errorMode;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, completableObserver)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver(completableObserver, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class ConcatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.CompletableObserver getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.util.ErrorMode getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getInputFormats;
        io.reactivex.internal.fuseable.SimpleQueue<T> getOutputFormats;
        final int getOutputMinFrameDuration;
        io.reactivex.disposables.Disposable getOutputSizes;
        final io.reactivex.internal.util.AtomicThrowable getInputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver getHighSpeedVideoSizesFor = new io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.ConcatMapInnerObserver(this);

        ConcatMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, io.reactivex.internal.util.ErrorMode errorMode, int i) {
            this.getHighSpeedVideoFpsRanges = completableObserver;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRangesFor = errorMode;
            this.getOutputMinFrameDuration = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputSizes, disposable)) {
                this.getOutputSizes = disposable;
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(3);
                    if (requestFusion == 1) {
                        this.getOutputFormats = queueDisposable;
                        this.Camera2StreamConfigurationMap = true;
                        this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                        getHighSpeedVideoFpsRanges();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.getOutputFormats = queueDisposable;
                        this.getHighSpeedVideoFpsRanges.onSubscribe(this);
                        return;
                    }
                }
                this.getOutputFormats = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.getOutputMinFrameDuration);
                this.getHighSpeedVideoFpsRanges.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (t != null) {
                this.getOutputFormats.offer(t);
            }
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getInputSizeshNQ4ISI.addThrowable(th)) {
                if (this.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                    this.getHighSpeedVideoSizes = true;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
                    java.lang.Throwable terminate = this.getInputSizeshNQ4ISI.terminate();
                    if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        this.getHighSpeedVideoFpsRanges.onError(terminate);
                    }
                    if (getAndIncrement() == 0) {
                        this.getOutputFormats.clear();
                        return;
                    }
                    return;
                }
                this.Camera2StreamConfigurationMap = true;
                getHighSpeedVideoFpsRanges();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getOutputSizes.dispose();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoSizesFor);
            if (getAndIncrement() == 0) {
                this.getOutputFormats.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        final void getHighSpeedVideoFpsRanges() {
            io.reactivex.CompletableSource completableSource;
            boolean z;
            if (getAndIncrement() == 0) {
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getInputSizeshNQ4ISI;
                io.reactivex.internal.util.ErrorMode errorMode = this.getHighSpeedVideoFpsRangesFor;
                while (!this.getHighSpeedVideoSizes) {
                    if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                        if (errorMode == io.reactivex.internal.util.ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                            this.getHighSpeedVideoSizes = true;
                            this.getOutputFormats.clear();
                            this.getHighSpeedVideoFpsRanges.onError(atomicThrowable.terminate());
                            return;
                        }
                        boolean z2 = this.Camera2StreamConfigurationMap;
                        try {
                            T poll = this.getOutputFormats.poll();
                            if (poll != null) {
                                completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(poll), "The mapper returned a null CompletableSource");
                                z = false;
                            } else {
                                completableSource = null;
                                z = true;
                            }
                            if (z2 && z) {
                                this.getHighSpeedVideoSizes = true;
                                java.lang.Throwable terminate = atomicThrowable.terminate();
                                if (terminate != null) {
                                    this.getHighSpeedVideoFpsRanges.onError(terminate);
                                    return;
                                } else {
                                    this.getHighSpeedVideoFpsRanges.onComplete();
                                    return;
                                }
                            }
                            if (!z) {
                                this.getHighResolutionOutputSizeshNQ4ISI = true;
                                completableSource.subscribe(this.getHighSpeedVideoSizesFor);
                            }
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            this.getHighSpeedVideoSizes = true;
                            this.getOutputFormats.clear();
                            this.getOutputSizes.dispose();
                            atomicThrowable.addThrowable(th);
                            this.getHighSpeedVideoFpsRanges.onError(atomicThrowable.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.getOutputFormats.clear();
            }
        }

        static final class ConcatMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> getHighSpeedVideoSizes;

            ConcatMapInnerObserver(io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.getHighSpeedVideoSizes = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.getHighSpeedVideoSizes;
                if (concatMapCompletableObserver.getInputSizeshNQ4ISI.addThrowable(th)) {
                    if (concatMapCompletableObserver.getHighSpeedVideoFpsRangesFor == io.reactivex.internal.util.ErrorMode.IMMEDIATE) {
                        concatMapCompletableObserver.getHighSpeedVideoSizes = true;
                        concatMapCompletableObserver.getOutputSizes.dispose();
                        java.lang.Throwable terminate = concatMapCompletableObserver.getInputSizeshNQ4ISI.terminate();
                        if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                            concatMapCompletableObserver.getHighSpeedVideoFpsRanges.onError(terminate);
                        }
                        if (concatMapCompletableObserver.getAndIncrement() == 0) {
                            concatMapCompletableObserver.getOutputFormats.clear();
                            return;
                        }
                        return;
                    }
                    concatMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI = false;
                    concatMapCompletableObserver.getHighSpeedVideoFpsRanges();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.getHighSpeedVideoSizes;
                concatMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI = false;
                concatMapCompletableObserver.getHighSpeedVideoFpsRanges();
            }
        }
    }
}
