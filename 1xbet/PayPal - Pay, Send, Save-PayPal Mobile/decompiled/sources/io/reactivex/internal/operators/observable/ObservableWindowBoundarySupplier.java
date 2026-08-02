package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> getHighSpeedVideoSizes;

    public ObservableWindowBoundarySupplier(io.reactivex.ObservableSource<T> observableSource, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable, int i) {
        super(observableSource);
        this.getHighSpeedVideoSizes = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryMainObserver<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 2233020065421370272L;
        final int getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoSizes;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> getInputFormats;
        final java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputMinFrameDurationlomOqCM;
        io.reactivex.subjects.UnicastSubject<T> getOutputSizes;
        static final io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<java.lang.Object, java.lang.Object> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<>(null);
        static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B>> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> getHighSpeedVideoSizesFor = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable getOutputMinFrameDuration = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean();

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, int i, java.util.concurrent.Callable<? extends io.reactivex.ObservableSource<B>> callable) {
            this.getInputFormats = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getInputSizeshNQ4ISI = callable;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputMinFrameDurationlomOqCM, disposable)) {
                this.getOutputMinFrameDurationlomOqCM = disposable;
                this.getInputFormats.onSubscribe(this);
                this.getHighSpeedVideoSizesFor.offer(getHighSpeedVideoFpsRanges);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoSizesFor.offer(t);
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            Camera2StreamConfigurationMap();
            if (this.getOutputMinFrameDuration.addThrowable(th)) {
                this.getHighSpeedVideoSizes = true;
                getHighResolutionOutputSizeshNQ4ISI();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            Camera2StreamConfigurationMap();
            this.getHighSpeedVideoSizes = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getOutputFormats.compareAndSet(false, true)) {
                Camera2StreamConfigurationMap();
                if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                    this.getOutputMinFrameDurationlomOqCM.dispose();
                }
            }
        }

        private void Camera2StreamConfigurationMap() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<T, B>> atomicReference = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver<java.lang.Object, java.lang.Object> windowBoundaryInnerObserver = getHighSpeedVideoFpsRangesFor;
            io.reactivex.disposables.Disposable disposable = (io.reactivex.disposables.Disposable) atomicReference.getAndSet(windowBoundaryInnerObserver);
            if (disposable == null || disposable == windowBoundaryInnerObserver) {
                return;
            }
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputFormats.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                this.getOutputMinFrameDurationlomOqCM.dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighResolutionOutputSizeshNQ4ISI() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super io.reactivex.Observable<T>> observer = this.getInputFormats;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> mpscLinkedQueue = this.getHighSpeedVideoSizesFor;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getOutputMinFrameDuration;
                int i = 1;
                while (this.getOutputSizeshNQ4ISI.get() != 0) {
                    io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getOutputSizes;
                    boolean z = this.getHighSpeedVideoSizes;
                    if (z && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        java.lang.Throwable terminate = atomicThrowable.terminate();
                        if (unicastSubject != 0) {
                            this.getOutputSizes = null;
                            unicastSubject.onError(terminate);
                        }
                        observer.onError(terminate);
                        return;
                    }
                    java.lang.Object poll = mpscLinkedQueue.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        java.lang.Throwable terminate2 = atomicThrowable.terminate();
                        if (terminate2 == null) {
                            if (unicastSubject != 0) {
                                this.getOutputSizes = null;
                                unicastSubject.onComplete();
                            }
                            observer.onComplete();
                            return;
                        }
                        if (unicastSubject != 0) {
                            this.getOutputSizes = null;
                            unicastSubject.onError(terminate2);
                        }
                        observer.onError(terminate2);
                        return;
                    }
                    if (!z2) {
                        if (poll != getHighSpeedVideoFpsRanges) {
                            unicastSubject.onNext(poll);
                        } else {
                            if (unicastSubject != 0) {
                                this.getOutputSizes = null;
                                unicastSubject.onComplete();
                            }
                            if (!this.getOutputFormats.get()) {
                                io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.getHighResolutionOutputSizeshNQ4ISI, this);
                                this.getOutputSizes = create;
                                this.getOutputSizeshNQ4ISI.getAndIncrement();
                                try {
                                    io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getInputSizeshNQ4ISI.call(), "The other Callable returned a null ObservableSource");
                                    io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver windowBoundaryInnerObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryInnerObserver(this);
                                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, null, windowBoundaryInnerObserver)) {
                                        observableSource.subscribe(windowBoundaryInnerObserver);
                                        observer.onNext(create);
                                    }
                                } catch (java.lang.Throwable th) {
                                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                                    atomicThrowable.addThrowable(th);
                                    this.getHighSpeedVideoSizes = true;
                                }
                            }
                        }
                    } else {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
                mpscLinkedQueue.clear();
                this.getOutputSizes = null;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryInnerObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> Camera2StreamConfigurationMap;
        boolean getHighSpeedVideoSizes;

        WindowBoundaryInnerObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.Camera2StreamConfigurationMap = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b) {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            dispose();
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.Camera2StreamConfigurationMap;
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(windowBoundaryMainObserver.Camera2StreamConfigurationMap, this, null);
            windowBoundaryMainObserver.getHighSpeedVideoSizesFor.offer(io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver.getHighSpeedVideoFpsRanges);
            windowBoundaryMainObserver.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.Camera2StreamConfigurationMap;
            windowBoundaryMainObserver.getOutputMinFrameDurationlomOqCM.dispose();
            if (windowBoundaryMainObserver.getOutputMinFrameDuration.addThrowable(th)) {
                windowBoundaryMainObserver.getHighSpeedVideoSizes = true;
                windowBoundaryMainObserver.getHighResolutionOutputSizeshNQ4ISI();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.Camera2StreamConfigurationMap;
            windowBoundaryMainObserver.getOutputMinFrameDurationlomOqCM.dispose();
            windowBoundaryMainObserver.getHighSpeedVideoSizes = true;
            windowBoundaryMainObserver.getHighResolutionOutputSizeshNQ4ISI();
        }
    }
}
