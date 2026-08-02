package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableSequenceEqual<T> extends io.reactivex.Observable<java.lang.Boolean> {
    final io.reactivex.ObservableSource<? extends T> Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighSpeedVideoSizes;

    public ObservableSequenceEqual(io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate, int i) {
        this.Camera2StreamConfigurationMap = observableSource;
        this.getHighSpeedVideoFpsRangesFor = observableSource2;
        this.getHighSpeedVideoSizes = biPredicate;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super java.lang.Boolean> observer) {
        io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualCoordinator equalCoordinator = new io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualCoordinator(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        observer.onSubscribe(equalCoordinator);
        io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<T>[] equalObserverArr = equalCoordinator.Camera2StreamConfigurationMap;
        equalCoordinator.getHighSpeedVideoFpsRangesFor.subscribe(equalObserverArr[0]);
        equalCoordinator.getHighSpeedVideoSizesFor.subscribe(equalObserverArr[1]);
    }

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<T>[] Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> getHighSpeedVideoFpsRanges;
        final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.Observer<? super java.lang.Boolean> getHighSpeedVideoSizes;
        final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoSizesFor;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable getInputFormats = new io.reactivex.internal.disposables.ArrayCompositeDisposable(2);
        T getInputSizeshNQ4ISI;
        T getOutputFormats;

        EqualCoordinator(io.reactivex.Observer<? super java.lang.Boolean> observer, int i, io.reactivex.ObservableSource<? extends T> observableSource, io.reactivex.ObservableSource<? extends T> observableSource2, io.reactivex.functions.BiPredicate<? super T, ? super T> biPredicate) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighSpeedVideoFpsRangesFor = observableSource;
            this.getHighSpeedVideoSizesFor = observableSource2;
            this.getHighSpeedVideoFpsRanges = biPredicate;
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver[]{new io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<>(this, 0, i), new io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<>(this, 1, i)};
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getInputFormats.dispose();
            if (getAndIncrement() == 0) {
                io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<T>[] equalObserverArr = this.Camera2StreamConfigurationMap;
                equalObserverArr[0].getHighSpeedVideoSizes.clear();
                equalObserverArr[1].getHighSpeedVideoSizes.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        final void Camera2StreamConfigurationMap() {
            java.lang.Throwable th;
            java.lang.Throwable th2;
            if (getAndIncrement() == 0) {
                io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<T>[] equalObserverArr = this.Camera2StreamConfigurationMap;
                io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<T> equalObserver = equalObserverArr[0];
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = equalObserver.getHighSpeedVideoSizes;
                io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualObserver<T> equalObserver2 = equalObserverArr[1];
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue2 = equalObserver2.getHighSpeedVideoSizes;
                int i = 1;
                while (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    boolean z = equalObserver.Camera2StreamConfigurationMap;
                    if (!z || (th2 = equalObserver.getHighSpeedVideoFpsRanges) == null) {
                        boolean z2 = equalObserver2.Camera2StreamConfigurationMap;
                        if (!z2 || (th = equalObserver2.getHighSpeedVideoFpsRanges) == null) {
                            if (this.getInputSizeshNQ4ISI == null) {
                                this.getInputSizeshNQ4ISI = spscLinkedArrayQueue.poll();
                            }
                            boolean z3 = this.getInputSizeshNQ4ISI == null;
                            if (this.getOutputFormats == null) {
                                this.getOutputFormats = spscLinkedArrayQueue2.poll();
                            }
                            T t = this.getOutputFormats;
                            boolean z4 = t == null;
                            if (z && z2 && z3 && z4) {
                                this.getHighSpeedVideoSizes.onNext(java.lang.Boolean.TRUE);
                                this.getHighSpeedVideoSizes.onComplete();
                                return;
                            }
                            if (z && z2 && z3 != z4) {
                                this.getHighResolutionOutputSizeshNQ4ISI = true;
                                spscLinkedArrayQueue.clear();
                                spscLinkedArrayQueue2.clear();
                                this.getHighSpeedVideoSizes.onNext(java.lang.Boolean.FALSE);
                                this.getHighSpeedVideoSizes.onComplete();
                                return;
                            }
                            if (!z3 && !z4) {
                                try {
                                    if (this.getHighSpeedVideoFpsRanges.test(this.getInputSizeshNQ4ISI, t)) {
                                        this.getInputSizeshNQ4ISI = null;
                                        this.getOutputFormats = null;
                                    } else {
                                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                                        spscLinkedArrayQueue.clear();
                                        spscLinkedArrayQueue2.clear();
                                        this.getHighSpeedVideoSizes.onNext(java.lang.Boolean.FALSE);
                                        this.getHighSpeedVideoSizes.onComplete();
                                        return;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                                    this.getHighResolutionOutputSizeshNQ4ISI = true;
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
                            this.getHighResolutionOutputSizeshNQ4ISI = true;
                            spscLinkedArrayQueue.clear();
                            spscLinkedArrayQueue2.clear();
                            this.getHighSpeedVideoSizes.onError(th);
                            return;
                        }
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
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

    static final class EqualObserver<T> implements io.reactivex.Observer<T> {
        volatile boolean Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Throwable getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualCoordinator<T> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getHighSpeedVideoSizes;

        EqualObserver(io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualCoordinator<T> equalCoordinator, int i, int i2) {
            this.getHighSpeedVideoFpsRangesFor = equalCoordinator;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i2);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.operators.observable.ObservableSequenceEqual.EqualCoordinator<T> equalCoordinator = this.getHighSpeedVideoFpsRangesFor;
            equalCoordinator.getInputFormats.setResource(this.getHighResolutionOutputSizeshNQ4ISI, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizes.offer(t);
            this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = th;
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
        }
    }
}
