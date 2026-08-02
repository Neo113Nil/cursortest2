package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableSwitchMap<T, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final int Camera2StreamConfigurationMap;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> getHighSpeedVideoSizes;

    public ObservableSwitchMap(io.reactivex.ObservableSource<T> observableSource, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.getHighSpeedVideoSizes = function;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.observable.ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.getHighSpeedVideoSizes)) {
            return;
        }
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver(observer, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> Camera2StreamConfigurationMap;
        private static final long serialVersionUID = -3491074160481096299L;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super R> getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;
        volatile boolean getHighSpeedVideoSizesFor;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> getInputFormats;
        final boolean getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputMinFrameDuration;
        volatile long getOutputStallDurationlomOqCM;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.util.AtomicThrowable getOutputFormats = new io.reactivex.internal.util.AtomicThrowable();

        static {
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> switchMapInnerObserver = new io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<>(null, -1L, 1);
            Camera2StreamConfigurationMap = switchMapInnerObserver;
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapInnerObserver);
        }

        SwitchMapObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends R>> function, int i, boolean z) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getInputFormats = function;
            this.getHighSpeedVideoSizes = i;
            this.getInputSizeshNQ4ISI = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputMinFrameDuration, disposable)) {
                this.getOutputMinFrameDuration = disposable;
                this.getHighSpeedVideoFpsRangesFor.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver;
            long j = this.getOutputStallDurationlomOqCM + 1;
            this.getOutputStallDurationlomOqCM = j;
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            if (switchMapInnerObserver2 != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapInnerObserver2);
            }
            try {
                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The ObservableSource returned is null");
                io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver switchMapInnerObserver3 = new io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver(this, j, this.getHighSpeedVideoSizes);
                do {
                    switchMapInnerObserver = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    if (switchMapInnerObserver == Camera2StreamConfigurationMap) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, switchMapInnerObserver, switchMapInnerObserver3));
                observableSource.subscribe(switchMapInnerObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputMinFrameDuration.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (!this.getHighSpeedVideoSizesFor && this.getOutputFormats.addThrowable(th)) {
                if (!this.getInputSizeshNQ4ISI) {
                    getHighSpeedVideoFpsRanges();
                }
                this.getHighSpeedVideoSizesFor = true;
                getHighSpeedVideoSizes();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizesFor) {
                return;
            }
            this.getHighSpeedVideoSizesFor = true;
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputMinFrameDuration.dispose();
            getHighSpeedVideoFpsRanges();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        private void getHighSpeedVideoFpsRanges() {
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> switchMapInnerObserver;
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<java.lang.Object, java.lang.Object> switchMapInnerObserver3 = Camera2StreamConfigurationMap;
            if (switchMapInnerObserver2 == switchMapInnerObserver3 || (switchMapInnerObserver = (io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver) this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(switchMapInnerObserver3)) == switchMapInnerObserver3 || switchMapInnerObserver == null) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapInnerObserver);
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x000e, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final void getHighSpeedVideoSizes() {
            io.reactivex.internal.fuseable.SimpleQueue<R> simpleQueue;
            amex.AMEXKernel aMEXKernel;
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoFpsRangesFor;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R>> atomicReference = this.getHighResolutionOutputSizeshNQ4ISI;
                boolean z = this.getInputSizeshNQ4ISI;
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoSizesFor) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            if (z2) {
                                java.lang.Throwable th = this.getOutputFormats.get();
                                if (th != null) {
                                    observer.onError(th);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        } else if (this.getOutputFormats.get() != null) {
                            observer.onError(this.getOutputFormats.terminate());
                            return;
                        } else if (z2) {
                            observer.onComplete();
                            return;
                        }
                    }
                    io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                    if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.getHighSpeedVideoFpsRanges) != null) {
                        if (switchMapInnerObserver.getHighResolutionOutputSizeshNQ4ISI) {
                            boolean isEmpty = simpleQueue.isEmpty();
                            if (z) {
                                if (isEmpty) {
                                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                                }
                            } else if (this.getOutputFormats.get() != null) {
                                observer.onError(this.getOutputFormats.terminate());
                                return;
                            } else if (isEmpty) {
                                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                            }
                        }
                        boolean z3 = false;
                        while (!this.getHighSpeedVideoFpsRanges) {
                            if (switchMapInnerObserver == atomicReference.get()) {
                                if (!z && this.getOutputFormats.get() != null) {
                                    observer.onError(this.getOutputFormats.terminate());
                                    return;
                                }
                                boolean z4 = switchMapInnerObserver.getHighResolutionOutputSizeshNQ4ISI;
                                try {
                                    aMEXKernel = simpleQueue.poll();
                                } catch (java.lang.Throwable th2) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                    this.getOutputFormats.addThrowable(th2);
                                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                                    if (!z) {
                                        getHighSpeedVideoFpsRanges();
                                        this.getOutputMinFrameDuration.dispose();
                                        this.getHighSpeedVideoSizesFor = true;
                                    } else {
                                        io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapInnerObserver);
                                    }
                                    z3 = true;
                                    aMEXKernel = null;
                                }
                                boolean z5 = aMEXKernel == null;
                                if (z4 && z5) {
                                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapInnerObserver, null);
                                } else if (!z5) {
                                    observer.onNext(aMEXKernel);
                                } else if (z3) {
                                    continue;
                                }
                            }
                        }
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapInnerObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile io.reactivex.internal.fuseable.SimpleQueue<R> getHighSpeedVideoFpsRanges;
        final long getHighSpeedVideoFpsRangesFor;
        final int getHighSpeedVideoSizes;

        SwitchMapInnerObserver(io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> switchMapObserver, long j, int i) {
            this.Camera2StreamConfigurationMap = switchMapObserver;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable) {
                    io.reactivex.internal.fuseable.QueueDisposable queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.getHighSpeedVideoFpsRanges = queueDisposable;
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                        return;
                    } else if (requestFusion == 2) {
                        this.getHighSpeedVideoFpsRanges = queueDisposable;
                        return;
                    }
                }
                this.getHighSpeedVideoFpsRanges = new io.reactivex.internal.queue.SpscLinkedArrayQueue(this.getHighSpeedVideoSizes);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(R r) {
            if (this.getHighSpeedVideoFpsRangesFor == this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM) {
                if (r != null) {
                    this.getHighSpeedVideoFpsRanges.offer(r);
                }
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableSwitchMap.SwitchMapObserver<T, R> switchMapObserver = this.Camera2StreamConfigurationMap;
            if (this.getHighSpeedVideoFpsRangesFor == switchMapObserver.getOutputStallDurationlomOqCM && switchMapObserver.getOutputFormats.addThrowable(th)) {
                if (!switchMapObserver.getInputSizeshNQ4ISI) {
                    switchMapObserver.getOutputMinFrameDuration.dispose();
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                switchMapObserver.getHighSpeedVideoSizes();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor == this.Camera2StreamConfigurationMap.getOutputStallDurationlomOqCM) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
            }
        }
    }
}
