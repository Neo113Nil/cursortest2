package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class ObservableSwitchMapSingle<T, R> extends io.reactivex.Observable<R> {
    final boolean getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getHighSpeedVideoFpsRanges;
    final io.reactivex.Observable<T> getHighSpeedVideoSizes;

    public ObservableSwitchMapSingle(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
        this.getHighSpeedVideoSizes = observable;
        this.getHighSpeedVideoFpsRanges = function;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super R> observer) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, observer)) {
            return;
        }
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver(observer, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapSingleMainObserver<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<java.lang.Object> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean Camera2StreamConfigurationMap;
        final boolean getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super R> getHighSpeedVideoSizes;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizesFor;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> getInputFormats;
        final io.reactivex.internal.util.AtomicThrowable getOutputMinFrameDuration = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R>> getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapSingleMainObserver(io.reactivex.Observer<? super R> observer, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> function, boolean z) {
            this.getHighSpeedVideoSizes = observer;
            this.getInputFormats = function;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizesFor, disposable)) {
                this.getHighSpeedVideoSizesFor = disposable;
                this.getHighSpeedVideoSizes.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R> switchMapSingleObserver;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.getInputSizeshNQ4ISI.get();
            if (switchMapSingleObserver2 != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapSingleObserver2);
            }
            try {
                io.reactivex.SingleSource singleSource = (io.reactivex.SingleSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputFormats.apply(t), "The mapper returned a null SingleSource");
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver switchMapSingleObserver3 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.getInputSizeshNQ4ISI.get();
                    if (switchMapSingleObserver == getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputSizeshNQ4ISI, switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.subscribe(switchMapSingleObserver3);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getHighSpeedVideoSizesFor.dispose();
                this.getInputSizeshNQ4ISI.getAndSet(getHighSpeedVideoFpsRangesFor);
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getOutputMinFrameDuration.addThrowable(th)) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    getHighSpeedVideoFpsRanges();
                }
                this.Camera2StreamConfigurationMap = true;
                getHighSpeedVideoFpsRangesFor();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.Camera2StreamConfigurationMap = true;
            getHighSpeedVideoFpsRangesFor();
        }

        final void getHighSpeedVideoFpsRanges() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R>> atomicReference = this.getInputSizeshNQ4ISI;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver2 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapSingleObserver2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizesFor.dispose();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R>> atomicReference = this.getInputSizeshNQ4ISI;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<java.lang.Object> switchMapSingleObserver2 = (io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapSingleObserver2);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges;
        }

        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super R> observer = this.getHighSpeedVideoSizes;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getOutputMinFrameDuration;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R>> atomicReference = this.getInputSizeshNQ4ISI;
                int i = 1;
                while (!this.getHighSpeedVideoFpsRanges) {
                    if (atomicThrowable.get() != null && !this.getHighResolutionOutputSizeshNQ4ISI) {
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.Camera2StreamConfigurationMap;
                    io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver.SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    boolean z2 = switchMapSingleObserver == null;
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
                    if (!z2 && switchMapSingleObserver.Camera2StreamConfigurationMap != null) {
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, switchMapSingleObserver, null);
                        observer.onNext(switchMapSingleObserver.Camera2StreamConfigurationMap);
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
        }

        static final class SwitchMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R Camera2StreamConfigurationMap;
            final io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver<?, R> getHighSpeedVideoSizes;

            SwitchMapSingleObserver(io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.getHighSpeedVideoSizes = switchMapSingleMainObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(R r) {
                this.Camera2StreamConfigurationMap = r;
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle.SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver = this.getHighSpeedVideoSizes;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapSingleMainObserver.getInputSizeshNQ4ISI, this, null) && switchMapSingleMainObserver.getOutputMinFrameDuration.addThrowable(th)) {
                    if (!switchMapSingleMainObserver.getHighResolutionOutputSizeshNQ4ISI) {
                        switchMapSingleMainObserver.getHighSpeedVideoSizesFor.dispose();
                        switchMapSingleMainObserver.getHighSpeedVideoFpsRanges();
                    }
                    switchMapSingleMainObserver.getHighSpeedVideoFpsRangesFor();
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }
    }
}
