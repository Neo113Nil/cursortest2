package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class ObservableSwitchMapMaybe<T, R> extends io.reactivex.Observable<R> {
    final io.reactivex.Observable<T> Camera2StreamConfigurationMap;
    final boolean getHighSpeedVideoFpsRanges;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getHighSpeedVideoSizes;

    public ObservableSwitchMapMaybe(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
        this.Camera2StreamConfigurationMap = observable;
        this.getHighSpeedVideoSizes = function;
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, observer)) {
            return;
        }
        this.Camera2StreamConfigurationMap.subscribe(new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver(observer, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapMaybeMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super R> getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoFpsRanges;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> getInputFormats;
        io.reactivex.disposables.Disposable getInputSizeshNQ4ISI;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizesFor = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapMaybeMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> function, boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = observer;
            this.getInputFormats = function;
            this.getHighSpeedVideoFpsRanges = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getInputSizeshNQ4ISI, disposable)) {
                this.getInputSizeshNQ4ISI = disposable;
                this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver2 = this.getOutputFormats.get();
            if (switchMapMaybeObserver2 != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapMaybeObserver2);
            }
            try {
                io.reactivex.MaybeSource maybeSource = (io.reactivex.MaybeSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null MaybeSource");
                io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver switchMapMaybeObserver3 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver(this);
                do {
                    switchMapMaybeObserver = this.getOutputFormats.get();
                    if (switchMapMaybeObserver == getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getOutputFormats, switchMapMaybeObserver, switchMapMaybeObserver3));
                maybeSource.subscribe(switchMapMaybeObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getInputSizeshNQ4ISI.dispose();
                this.getOutputFormats.getAndSet(getHighSpeedVideoFpsRangesFor);
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizesFor.addThrowable(th)) {
                if (!this.getHighSpeedVideoFpsRanges) {
                    getHighSpeedVideoFpsRangesFor();
                }
                this.Camera2StreamConfigurationMap = true;
                getHighSpeedVideoSizes();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoSizes();
        }

        final void getHighSpeedVideoFpsRangesFor() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> atomicReference = this.getOutputFormats;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver2 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapMaybeObserver2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes = true;
            this.getInputSizeshNQ4ISI.dispose();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> atomicReference = this.getOutputFormats;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<java.lang.Object> switchMapMaybeObserver2 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver) atomicReference.getAndSet(switchMapMaybeObserver);
            if (switchMapMaybeObserver2 == null || switchMapMaybeObserver2 == switchMapMaybeObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapMaybeObserver2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes;
        }

        final void getHighSpeedVideoSizes() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super R> observer = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoSizesFor;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R>> atomicReference = this.getOutputFormats;
                int i = 1;
                while (!this.getHighSpeedVideoSizes) {
                    if (atomicThrowable.get() != null && !this.getHighSpeedVideoFpsRanges) {
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.Camera2StreamConfigurationMap;
                    io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver.SwitchMapMaybeObserver<R> switchMapMaybeObserver = atomicReference.get();
                    boolean z2 = switchMapMaybeObserver == null;
                    if (z && z2) {
                        java.lang.Throwable terminate = atomicThrowable.terminate();
                        if (terminate != null) {
                            observer.onError(terminate);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    if (!z2 && switchMapMaybeObserver.Camera2StreamConfigurationMap != null) {
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapMaybeObserver, null);
                        observer.onNext(switchMapMaybeObserver.Camera2StreamConfigurationMap);
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        static final class SwitchMapMaybeObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R Camera2StreamConfigurationMap;
            final io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver<?, R> getHighResolutionOutputSizeshNQ4ISI;

            SwitchMapMaybeObserver(io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver) {
                this.getHighResolutionOutputSizeshNQ4ISI = switchMapMaybeMainObserver;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(R r) {
                this.Camera2StreamConfigurationMap = r;
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapMaybeMainObserver.getOutputFormats, this, null) && switchMapMaybeMainObserver.getHighSpeedVideoSizesFor.addThrowable(th)) {
                    if (!switchMapMaybeMainObserver.getHighSpeedVideoFpsRanges) {
                        switchMapMaybeMainObserver.getInputSizeshNQ4ISI.dispose();
                        switchMapMaybeMainObserver.getHighSpeedVideoFpsRangesFor();
                    }
                    switchMapMaybeMainObserver.getHighSpeedVideoSizes();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe.SwitchMapMaybeMainObserver<?, R> switchMapMaybeMainObserver = this.getHighResolutionOutputSizeshNQ4ISI;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapMaybeMainObserver.getOutputFormats, this, null)) {
                    switchMapMaybeMainObserver.getHighSpeedVideoSizes();
                }
            }
        }
    }
}
