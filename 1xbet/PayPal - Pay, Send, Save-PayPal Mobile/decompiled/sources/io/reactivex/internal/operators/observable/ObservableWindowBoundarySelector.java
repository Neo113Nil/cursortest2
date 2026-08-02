package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableWindowBoundarySelector<T, B, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int getHighSpeedVideoFpsRanges;
    final io.reactivex.ObservableSource<B> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> getHighSpeedVideoSizes;

    public ObservableWindowBoundarySelector(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<B> observableSource2, io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> function, int i) {
        super(observableSource);
        this.getHighSpeedVideoFpsRangesFor = observableSource2;
        this.getHighSpeedVideoSizes = function;
        this.getHighSpeedVideoFpsRanges = i;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer) {
        this.source.subscribe(new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver(new io.reactivex.observers.SerializedObserver(observer), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges));
    }

    /* loaded from: classes17.dex */
    static final class WindowBoundaryMainObserver<T, B, V> extends io.reactivex.internal.observers.QueueDrainObserver<T, java.lang.Object, io.reactivex.Observable<T>> implements io.reactivex.disposables.Disposable {
        final io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final io.reactivex.ObservableSource<B> getHighSpeedVideoFpsRangesFor;
        final io.reactivex.disposables.CompositeDisposable getInputFormats;
        final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getOutputFormats;
        final java.util.List<io.reactivex.subjects.UnicastSubject<T>> getOutputMinFrameDuration;

        @Override // io.reactivex.internal.observers.QueueDrainObserver, io.reactivex.internal.util.ObservableQueueDrain
        public final void accept(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, java.lang.Object obj) {
        }

        WindowBoundaryMainObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> observer, io.reactivex.ObservableSource<B> observableSource, io.reactivex.functions.Function<? super B, ? extends io.reactivex.ObservableSource<V>> function, int i) {
            super(observer, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>();
            java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
            this.getInputSizeshNQ4ISI = atomicLong;
            this.getHighSpeedVideoFpsRangesFor = observableSource;
            this.Camera2StreamConfigurationMap = function;
            this.getHighSpeedVideoFpsRanges = i;
            this.getInputFormats = new io.reactivex.disposables.CompositeDisposable();
            this.getOutputMinFrameDuration = new java.util.ArrayList();
            atomicLong.lazySet(1L);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getOutputFormats, disposable)) {
                this.getOutputFormats = disposable;
                this.actual.onSubscribe(this);
                if (this.cancelled) {
                    return;
                }
                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryOpenObserver operatorWindowBoundaryOpenObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryOpenObserver(this);
                if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighResolutionOutputSizeshNQ4ISI, null, operatorWindowBoundaryOpenObserver)) {
                    this.getInputSizeshNQ4ISI.getAndIncrement();
                    this.getHighSpeedVideoFpsRangesFor.subscribe(operatorWindowBoundaryOpenObserver);
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            if (fastEnter()) {
                java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = this.getOutputMinFrameDuration.iterator();
                while (it.hasNext()) {
                    it.next().onNext(t);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(io.reactivex.internal.util.NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.done) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRangesFor();
            }
            if (this.getInputSizeshNQ4ISI.decrementAndGet() == 0) {
                this.getInputFormats.dispose();
            }
            this.actual.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            if (enter()) {
                getHighSpeedVideoFpsRangesFor();
            }
            if (this.getInputSizeshNQ4ISI.decrementAndGet() == 0) {
                this.getInputFormats.dispose();
            }
            this.actual.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.cancelled = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final void getHighSpeedVideoFpsRangesFor() {
            io.reactivex.internal.queue.MpscLinkedQueue mpscLinkedQueue = (io.reactivex.internal.queue.MpscLinkedQueue) this.queue;
            io.reactivex.Observer<? super V> observer = this.actual;
            java.util.List<io.reactivex.subjects.UnicastSubject<T>> list = this.getOutputMinFrameDuration;
            int i = 1;
            while (true) {
                boolean z = this.done;
                java.lang.Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    this.getInputFormats.dispose();
                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
                    java.lang.Throwable th = this.error;
                    if (th != null) {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it = list.iterator();
                        while (it.hasNext()) {
                            it.next().onError(th);
                        }
                    } else {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it2 = list.iterator();
                        while (it2.hasNext()) {
                            it2.next().onComplete();
                        }
                    }
                    list.clear();
                    return;
                }
                if (!z2) {
                    if (poll instanceof io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation) {
                        io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation windowOperation = (io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation) poll;
                        if (windowOperation.getHighSpeedVideoFpsRanges != null) {
                            if (list.remove(windowOperation.getHighSpeedVideoFpsRanges)) {
                                windowOperation.getHighSpeedVideoFpsRanges.onComplete();
                                if (this.getInputSizeshNQ4ISI.decrementAndGet() == 0) {
                                    this.getInputFormats.dispose();
                                    io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighResolutionOutputSizeshNQ4ISI);
                                    return;
                                }
                            } else {
                                continue;
                            }
                        } else if (!this.cancelled) {
                            io.reactivex.subjects.UnicastSubject<T> create = io.reactivex.subjects.UnicastSubject.create(this.getHighSpeedVideoFpsRanges);
                            list.add(create);
                            observer.onNext(create);
                            try {
                                io.reactivex.ObservableSource observableSource = (io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.Camera2StreamConfigurationMap.apply(windowOperation.getHighSpeedVideoFpsRangesFor), "The ObservableSource supplied is null");
                                io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryCloseObserver operatorWindowBoundaryCloseObserver = new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.OperatorWindowBoundaryCloseObserver(this, create);
                                if (this.getInputFormats.add(operatorWindowBoundaryCloseObserver)) {
                                    this.getInputSizeshNQ4ISI.getAndIncrement();
                                    observableSource.subscribe(operatorWindowBoundaryCloseObserver);
                                }
                            } catch (java.lang.Throwable th2) {
                                io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                                this.cancelled = true;
                                observer.onError(th2);
                            }
                        }
                    } else {
                        java.util.Iterator<io.reactivex.subjects.UnicastSubject<T>> it3 = list.iterator();
                        while (it3.hasNext()) {
                            it3.next().onNext(io.reactivex.internal.util.NotificationLite.getValue(poll));
                        }
                    }
                } else {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class WindowOperation<T, B> {
        final io.reactivex.subjects.UnicastSubject<T> getHighSpeedVideoFpsRanges;
        final B getHighSpeedVideoFpsRangesFor;

        WindowOperation(io.reactivex.subjects.UnicastSubject<T> unicastSubject, B b) {
            this.getHighSpeedVideoFpsRanges = unicastSubject;
            this.getHighSpeedVideoFpsRangesFor = b;
        }
    }

    /* loaded from: classes17.dex */
    static final class OperatorWindowBoundaryOpenObserver<T, B> extends io.reactivex.observers.DisposableObserver<B> {
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> getHighSpeedVideoFpsRanges;

        OperatorWindowBoundaryOpenObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver) {
            this.getHighSpeedVideoFpsRanges = windowBoundaryMainObserver;
        }

        @Override // io.reactivex.Observer
        public final void onNext(B b) {
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver = this.getHighSpeedVideoFpsRanges;
            windowBoundaryMainObserver.queue.offer(new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation(null, b));
            if (windowBoundaryMainObserver.enter()) {
                windowBoundaryMainObserver.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, B, ?> windowBoundaryMainObserver = this.getHighSpeedVideoFpsRanges;
            windowBoundaryMainObserver.getOutputFormats.dispose();
            windowBoundaryMainObserver.getInputFormats.dispose();
            windowBoundaryMainObserver.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }

    /* loaded from: classes17.dex */
    static final class OperatorWindowBoundaryCloseObserver<T, V> extends io.reactivex.observers.DisposableObserver<V> {
        final io.reactivex.subjects.UnicastSubject<T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;

        OperatorWindowBoundaryCloseObserver(io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver, io.reactivex.subjects.UnicastSubject<T> unicastSubject) {
            this.getHighSpeedVideoFpsRanges = windowBoundaryMainObserver;
            this.getHighResolutionOutputSizeshNQ4ISI = unicastSubject;
        }

        @Override // io.reactivex.Observer
        public final void onNext(V v) {
            dispose();
            onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
                return;
            }
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver = this.getHighSpeedVideoFpsRanges;
            windowBoundaryMainObserver.getOutputFormats.dispose();
            windowBoundaryMainObserver.getInputFormats.dispose();
            windowBoundaryMainObserver.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoSizes) {
                return;
            }
            this.getHighSpeedVideoSizes = true;
            io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowBoundaryMainObserver<T, ?, V> windowBoundaryMainObserver = this.getHighSpeedVideoFpsRanges;
            windowBoundaryMainObserver.getInputFormats.delete(this);
            windowBoundaryMainObserver.queue.offer(new io.reactivex.internal.operators.observable.ObservableWindowBoundarySelector.WindowOperation(this.getHighResolutionOutputSizeshNQ4ISI, null));
            if (windowBoundaryMainObserver.enter()) {
                windowBoundaryMainObserver.getHighSpeedVideoFpsRangesFor();
            }
        }
    }
}
