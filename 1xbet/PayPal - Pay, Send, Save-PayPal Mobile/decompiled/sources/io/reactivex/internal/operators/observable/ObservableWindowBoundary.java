package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWindowBoundary<T, B> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<B> getHighSpeedVideoFpsRangesFor;

    public ObservableWindowBoundary(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<B> observableSource2, int i) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = observableSource2;
        this.Camera2StreamConfigurationMap = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver windowBoundaryMainObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver(observer, this.Camera2StreamConfigurationMap);
        observer.onSubscribe(windowBoundaryMainObserver);
        this.getHighSpeedVideoFpsRangesFor.subscribe(windowBoundaryMainObserver.getHighSpeedVideoFpsRanges);
        this.source.subscribe(windowBoundaryMainObserver);
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryMainObserver<T, B> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int Camera2StreamConfigurationMap;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> getHighSpeedVideoFpsRangesFor;
        volatile boolean getHighSpeedVideoSizes;
        io.reactivex.subjects.UnicastSubject<T> getHighSpeedVideoSizesFor;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryInnerObserver<T, B> getHighSpeedVideoFpsRanges = new io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryInnerObserver<>(this);
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicInteger getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(1);
        final io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> getInputFormats = new io.reactivex.internal.queue.MpscLinkedQueue<>();
        final io.reactivex.internal.util.AtomicThrowable getInputSizeshNQ4ISI = new io.reactivex.internal.util.AtomicThrowable();
        final java.util.concurrent.atomic.AtomicBoolean getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean();

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, int i) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getOutputMinFrameDuration, disposable)) {
                this.getInputFormats.offer(getHighResolutionOutputSizeshNQ4ISI);
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getInputFormats.offer(t);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.dispose();
            if (this.getInputSizeshNQ4ISI.addThrowable(th)) {
                this.getHighSpeedVideoSizes = true;
                getHighSpeedVideoFpsRangesFor();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.dispose();
            this.getHighSpeedVideoSizes = true;
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.getOutputFormats.compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRanges.dispose();
                if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputMinFrameDuration);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputFormats.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getOutputSizeshNQ4ISI.decrementAndGet() == 0) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputMinFrameDuration);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoFpsRangesFor() {
            if (getAndIncrement() == 0) {
                io.reactivex.Observer<? super io.reactivex.Observable<T>> observer = this.getHighSpeedVideoFpsRangesFor;
                io.reactivex.internal.queue.MpscLinkedQueue<java.lang.Object> mpscLinkedQueue = this.getInputFormats;
                io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getInputSizeshNQ4ISI;
                int i = 1;
                while (this.getOutputSizeshNQ4ISI.get() != 0) {
                    io.reactivex.subjects.UnicastSubject<T> unicastSubject = this.getHighSpeedVideoSizesFor;
                    boolean z = this.getHighSpeedVideoSizes;
                    if (z && atomicThrowable.get() != null) {
                        mpscLinkedQueue.clear();
                        java.lang.Throwable terminate = atomicThrowable.terminate();
                        if (unicastSubject != 0) {
                            this.getHighSpeedVideoSizesFor = null;
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
                                this.getHighSpeedVideoSizesFor = null;
                                unicastSubject.onComplete();
                            }
                            observer.onComplete();
                            return;
                        }
                        if (unicastSubject != 0) {
                            this.getHighSpeedVideoSizesFor = null;
                            unicastSubject.onError(terminate2);
                        }
                        observer.onError(terminate2);
                        return;
                    }
                    if (!z2) {
                        if (poll != getHighResolutionOutputSizeshNQ4ISI) {
                            unicastSubject.onNext(poll);
                        } else {
                            if (unicastSubject != 0) {
                                this.getHighSpeedVideoSizesFor = null;
                                unicastSubject.onComplete();
                            }
                            if (!this.getOutputFormats.get()) {
                                io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.Camera2StreamConfigurationMap, this);
                                this.getHighSpeedVideoSizesFor = create;
                                this.getOutputSizeshNQ4ISI.getAndIncrement();
                                observer.onNext(create);
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
                this.getHighSpeedVideoSizesFor = null;
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryInnerObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;

        WindowBoundaryInnerObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.Camera2StreamConfigurationMap = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.Camera2StreamConfigurationMap;
            windowBoundaryMainObserver.getInputFormats.offer(io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver.getHighResolutionOutputSizeshNQ4ISI);
            windowBoundaryMainObserver.getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.disposables.DisposableHelper.dispose(windowBoundaryMainObserver.getOutputMinFrameDuration);
            if (windowBoundaryMainObserver.getInputSizeshNQ4ISI.addThrowable(th)) {
                windowBoundaryMainObserver.getHighSpeedVideoSizes = true;
                windowBoundaryMainObserver.getHighSpeedVideoFpsRangesFor();
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            io.reactivex.internal.operators.observable.ObservableWindowBoundary.WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.Camera2StreamConfigurationMap;
            io.reactivex.internal.disposables.DisposableHelper.dispose(windowBoundaryMainObserver.getOutputMinFrameDuration);
            windowBoundaryMainObserver.getHighSpeedVideoSizes = true;
            windowBoundaryMainObserver.getHighSpeedVideoFpsRangesFor();
        }
    }
}
