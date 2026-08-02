package io.reactivex.internal.operators.observable;

/* loaded from: classes17.dex */
public final class ObservableRefCount<T> extends io.reactivex.Observable<T> {
    final io.reactivex.Scheduler Camera2StreamConfigurationMap;
    io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    final io.reactivex.observables.ConnectableObservable<T> getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

    public ObservableRefCount(io.reactivex.observables.ConnectableObservable<T> connectableObservable) {
        this(connectableObservable, 1, 0L, java.util.concurrent.TimeUnit.NANOSECONDS, io.reactivex.schedulers.Schedulers.trampoline());
    }

    public ObservableRefCount(io.reactivex.observables.ConnectableObservable<T> connectableObservable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        this.getHighSpeedVideoSizes = connectableObservable;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = j;
        this.getOutputMinFrameDuration = timeUnit;
        this.Camera2StreamConfigurationMap = scheduler;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection;
        boolean z;
        synchronized (this) {
            refConnection = this.getHighResolutionOutputSizeshNQ4ISI;
            if (refConnection == null) {
                refConnection = new io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection(this);
                this.getHighResolutionOutputSizeshNQ4ISI = refConnection;
            }
            long j = refConnection.getHighResolutionOutputSizeshNQ4ISI;
            if (j == 0 && refConnection.getHighSpeedVideoFpsRanges != null) {
                refConnection.getHighSpeedVideoFpsRanges.dispose();
            }
            long j2 = j + 1;
            refConnection.getHighResolutionOutputSizeshNQ4ISI = j2;
            if (refConnection.getHighSpeedVideoSizes || j2 != this.getHighSpeedVideoFpsRangesFor) {
                z = false;
            } else {
                z = true;
                refConnection.getHighSpeedVideoSizes = true;
            }
        }
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.observable.ObservableRefCount.RefCountObserver(observer, this, refConnection));
        if (z) {
            this.getHighSpeedVideoSizes.connect(refConnection);
        }
    }

    final void Camera2StreamConfigurationMap(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                if (refConnection.getHighSpeedVideoFpsRanges != null) {
                    refConnection.getHighSpeedVideoFpsRanges.dispose();
                }
                io.reactivex.observables.ConnectableObservable<T> connectableObservable = this.getHighSpeedVideoSizes;
                if (connectableObservable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableObservable).dispose();
                }
            }
        }
    }

    final void getHighSpeedVideoSizes(io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
        synchronized (this) {
            if (refConnection.getHighResolutionOutputSizeshNQ4ISI == 0 && refConnection == this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                io.reactivex.internal.disposables.DisposableHelper.dispose(refConnection);
                io.reactivex.observables.ConnectableObservable<T> connectableObservable = this.getHighSpeedVideoSizes;
                if (connectableObservable instanceof io.reactivex.disposables.Disposable) {
                    ((io.reactivex.disposables.Disposable) connectableObservable).dispose();
                }
            }
        }
    }

    static final class RefConnection extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.functions.Consumer<io.reactivex.disposables.Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;
        final io.reactivex.internal.operators.observable.ObservableRefCount<?> Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        io.reactivex.disposables.Disposable getHighSpeedVideoFpsRanges;
        boolean getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(io.reactivex.disposables.Disposable disposable) throws java.lang.Exception {
            io.reactivex.internal.disposables.DisposableHelper.replace(this, disposable);
        }

        RefConnection(io.reactivex.internal.operators.observable.ObservableRefCount<?> observableRefCount) {
            this.Camera2StreamConfigurationMap = observableRefCount;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this);
        }
    }

    static final class RefCountObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -7419642935409022375L;
        final io.reactivex.Observer<? super T> Camera2StreamConfigurationMap;
        final io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.operators.observable.ObservableRefCount<T> getHighSpeedVideoFpsRanges;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizes;

        RefCountObserver(io.reactivex.Observer<? super T> observer, io.reactivex.internal.operators.observable.ObservableRefCount<T> observableRefCount, io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection) {
            this.Camera2StreamConfigurationMap = observer;
            this.getHighSpeedVideoFpsRanges = observableRefCount;
            this.getHighResolutionOutputSizeshNQ4ISI = refConnection;
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.Camera2StreamConfigurationMap.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.onComplete();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.getHighSpeedVideoSizes.dispose();
            if (compareAndSet(false, true)) {
                io.reactivex.internal.operators.observable.ObservableRefCount<T> observableRefCount = this.getHighSpeedVideoFpsRanges;
                io.reactivex.internal.operators.observable.ObservableRefCount.RefConnection refConnection = this.getHighResolutionOutputSizeshNQ4ISI;
                synchronized (observableRefCount) {
                    if (observableRefCount.getHighResolutionOutputSizeshNQ4ISI == null) {
                        return;
                    }
                    long j = refConnection.getHighResolutionOutputSizeshNQ4ISI - 1;
                    refConnection.getHighResolutionOutputSizeshNQ4ISI = j;
                    if (j == 0 && refConnection.getHighSpeedVideoSizes) {
                        if (observableRefCount.getHighSpeedVideoFpsRanges == 0) {
                            observableRefCount.getHighSpeedVideoSizes(refConnection);
                            return;
                        }
                        io.reactivex.internal.disposables.SequentialDisposable sequentialDisposable = new io.reactivex.internal.disposables.SequentialDisposable();
                        refConnection.getHighSpeedVideoFpsRanges = sequentialDisposable;
                        sequentialDisposable.replace(observableRefCount.Camera2StreamConfigurationMap.scheduleDirect(refConnection, observableRefCount.getHighSpeedVideoFpsRanges, observableRefCount.getOutputMinFrameDuration));
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getHighSpeedVideoSizes, disposable)) {
                this.getHighSpeedVideoSizes = disposable;
                this.Camera2StreamConfigurationMap.onSubscribe(this);
            }
        }
    }
}
