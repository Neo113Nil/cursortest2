package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSequenceEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Boolean> {
    final io.reactivex.ObservableSource<? extends T> Camera2StreamConfigurationMap;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoSizes;

    public ObservableSequenceEqualSingle(io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.getHighSpeedVideoSizes = observableSource;
        this.Camera2StreamConfigurationMap = observableSource2;
        this.getHighResolutionOutputSizeshNQ4ISI = biPredicate;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver) {
        io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator(singleObserver, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        singleObserver.onSubscribe(equalCoordinator);
        io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] equalObserverArr = equalCoordinator.Camera2StreamConfigurationMap;
        equalCoordinator.getHighSpeedVideoFpsRangesFor.subscribe(equalObserverArr[0]);
        equalCoordinator.getInputFormats.subscribe(equalObserverArr[1]);
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public final io.reactivex.Observable<java.lang.Boolean> fuseToObservable() {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.observable.ObservableSequenceEqual(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] Camera2StreamConfigurationMap;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> getHighSpeedVideoSizes;
        T getHighSpeedVideoSizesFor;
        final io.reactivex.ObservableSource<? extends T> getInputFormats;
        T getInputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable getOutputFormats = new io.reactivex.internal.disposables.ArrayCompositeDisposable(2);

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> singleObserver, int i, io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            this.getHighSpeedVideoSizes = singleObserver;
            this.getHighSpeedVideoFpsRangesFor = observableSource;
            this.getInputFormats = observableSource2;
            this.getHighResolutionOutputSizeshNQ4ISI = biPredicate;
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver[]{new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<>(this, 0, i), new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<>(this, 1, i)};
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputFormats.dispose();
            if (getAndIncrement() == 0) {
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] equalObserverArr = this.Camera2StreamConfigurationMap;
                equalObserverArr[0].getHighResolutionOutputSizeshNQ4ISI.clear();
                equalObserverArr[1].getHighResolutionOutputSizeshNQ4ISI.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        final void getHighSpeedVideoFpsRangesFor() {
            java.lang.Throwable th;
            java.lang.Throwable th2;
            if (getAndIncrement() == 0) {
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] equalObserverArr = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T> equalObserver = equalObserverArr[0];
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T> equalObserver2 = equalObserverArr[1];
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.getHighResolutionOutputSizeshNQ4ISI;
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges) {
                    boolean z = equalObserver.getHighSpeedVideoFpsRangesFor;
                    if (!z || (th2 = equalObserver.Camera2StreamConfigurationMap) == null) {
                        boolean z2 = equalObserver2.getHighSpeedVideoFpsRangesFor;
                        if (!z2 || (th = equalObserver2.Camera2StreamConfigurationMap) == null) {
                            if (this.getHighSpeedVideoSizesFor == null) {
                                this.getHighSpeedVideoSizesFor = spscLinkedArrayQueue.poll();
                            }
                            boolean z3 = this.getHighSpeedVideoSizesFor == null;
                            if (this.getInputSizeshNQ4ISI == null) {
                                this.getInputSizeshNQ4ISI = spscLinkedArrayQueue2.poll();
                            }
                            T t = this.getInputSizeshNQ4ISI;
                            boolean z4 = t == null;
                            if (z && z2 && z3 && z4) {
                                this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.TRUE);
                                return;
                            }
                            if (z && z2 && z3 != z4) {
                                this.getHighSpeedVideoFpsRanges = true;
                                spscLinkedArrayQueue.clear();
                                spscLinkedArrayQueue2.clear();
                                this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.FALSE);
                                return;
                            }
                            if (!z3 && !z4) {
                                try {
                                    if (this.getHighResolutionOutputSizeshNQ4ISI.test(this.getHighSpeedVideoSizesFor, t)) {
                                        this.getHighSpeedVideoSizesFor = null;
                                        this.getInputSizeshNQ4ISI = null;
                                    } else {
                                        this.getHighSpeedVideoFpsRanges = true;
                                        spscLinkedArrayQueue.clear();
                                        spscLinkedArrayQueue2.clear();
                                        this.getHighSpeedVideoSizes.onSuccess(java.lang.Boolean.FALSE);
                                        return;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                    this.getHighSpeedVideoFpsRanges = true;
                                    spscLinkedArrayQueue.clear();
                                    spscLinkedArrayQueue2.clear();
                                    this.getHighSpeedVideoSizes.onError(th3);
                                    return;
                                }
                            }
                            if (z3 || z4) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            }
                        } else {
                            this.getHighSpeedVideoFpsRanges = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.getHighSpeedVideoSizes.onError(th);
                            return;
                        }
                    } else {
                        this.getHighSpeedVideoFpsRanges = true;
                        spscLinkedArrayQueue.clear();
                        spscLinkedArrayQueue2.clear();
                        this.getHighSpeedVideoSizes.onError(th2);
                        return;
                    }
                }
                spscLinkedArrayQueue.clear();
                spscLinkedArrayQueue2.clear();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class EqualObserver<T> implements io.reactivex.Observer<T> {
        java.lang.Throwable Camera2StreamConfigurationMap;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        EqualObserver(io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.getHighSpeedVideoFpsRanges = equalCoordinator;
            this.getHighSpeedVideoSizes = i;
            this.getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i2);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> equalCoordinator = this.getHighSpeedVideoFpsRanges;
            equalCoordinator.getOutputFormats.setResource(this.getHighSpeedVideoSizes, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighResolutionOutputSizeshNQ4ISI.offer(t);
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap = th;
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRangesFor = true;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
        }
    }
}
