package io.reactivex.internal.operators.mixed;

/* loaded from: classes3.dex */
public final class ObservableSwitchMapCompletable<T> extends io.reactivex.Completable {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Observable<T> getHighSpeedVideoFpsRangesFor;

    public ObservableSwitchMapCompletable(io.reactivex.Observable<T> observable, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = observable;
        this.getHighResolutionOutputSizeshNQ4ISI = function;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        if (io.reactivex.internal.operators.mixed.ScalarXMapZHelper.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, completableObserver)) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver(completableObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap));
    }

    /* loaded from: classes17.dex */
    static final class SwitchMapCompletableObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver(null);
        final io.reactivex.CompletableObserver Camera2StreamConfigurationMap;
        volatile boolean getHighResolutionOutputSizeshNQ4ISI;
        final boolean getHighSpeedVideoSizes;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> getOutputFormats;
        io.reactivex.disposables.Disposable getOutputMinFrameDuration;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> getInputFormats = new java.util.concurrent.atomic.AtomicReference<>();

        SwitchMapCompletableObserver(io.reactivex.CompletableObserver completableObserver, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> function, boolean z) {
            this.Camera2StreamConfigurationMap = completableObserver;
            this.getOutputFormats = function;
            this.getHighSpeedVideoSizes = z;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputMinFrameDuration, disposable)) {
                this.getOutputMinFrameDuration = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver;
            try {
                io.reactivex.CompletableSource completableSource = (io.reactivex.CompletableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputFormats.apply(t), "The mapper returned a null CompletableSource");
                io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver2 = new io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.getInputFormats.get();
                    if (switchMapInnerObserver == getHighSpeedVideoFpsRanges) {
                        return;
                    }
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getInputFormats, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(switchMapInnerObserver);
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                this.getOutputMinFrameDuration.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.addThrowable(th)) {
                if (this.getHighSpeedVideoSizes) {
                    onComplete();
                    return;
                }
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> atomicReference = this.getInputFormats;
                io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver = getHighSpeedVideoFpsRanges;
                io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
                if (andSet != null && andSet != switchMapInnerObserver) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(andSet);
                }
                java.lang.Throwable terminate = this.getHighSpeedVideoFpsRangesFor.terminate();
                if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                    this.Camera2StreamConfigurationMap.onError(terminate);
                    return;
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            if (this.getInputFormats.get() == null) {
                java.lang.Throwable terminate = this.getHighSpeedVideoFpsRangesFor.terminate();
                if (terminate == null) {
                    this.Camera2StreamConfigurationMap.onComplete();
                } else {
                    this.Camera2StreamConfigurationMap.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getOutputMinFrameDuration.dispose();
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver> atomicReference = this.getInputFormats;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver switchMapInnerObserver = getHighSpeedVideoFpsRanges;
            io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver.SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(andSet);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getInputFormats.get() == getHighSpeedVideoFpsRanges;
        }

        static final class SwitchMapInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver<?> getHighSpeedVideoFpsRanges;

            SwitchMapInnerObserver(io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.getHighSpeedVideoFpsRanges = switchMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.getHighSpeedVideoFpsRanges;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapCompletableObserver.getInputFormats, this, null) && switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.addThrowable(th)) {
                    if (switchMapCompletableObserver.getHighSpeedVideoSizes) {
                        if (switchMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI) {
                            switchMapCompletableObserver.Camera2StreamConfigurationMap.onError(switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.terminate());
                            return;
                        }
                        return;
                    }
                    switchMapCompletableObserver.dispose();
                    java.lang.Throwable terminate = switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.terminate();
                    if (terminate != io.reactivex.internal.util.ExceptionHelper.TERMINATED) {
                        switchMapCompletableObserver.Camera2StreamConfigurationMap.onError(terminate);
                        return;
                    }
                    return;
                }
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable.SwitchMapCompletableObserver<?> switchMapCompletableObserver = this.getHighSpeedVideoFpsRanges;
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(switchMapCompletableObserver.getInputFormats, this, null) && switchMapCompletableObserver.getHighResolutionOutputSizeshNQ4ISI) {
                    java.lang.Throwable terminate = switchMapCompletableObserver.getHighSpeedVideoFpsRangesFor.terminate();
                    if (terminate == null) {
                        switchMapCompletableObserver.Camera2StreamConfigurationMap.onComplete();
                    } else {
                        switchMapCompletableObserver.Camera2StreamConfigurationMap.onError(terminate);
                    }
                }
            }
        }
    }
}
