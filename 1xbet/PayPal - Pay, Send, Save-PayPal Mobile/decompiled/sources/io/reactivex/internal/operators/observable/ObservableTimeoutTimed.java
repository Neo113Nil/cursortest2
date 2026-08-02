package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableTimeoutTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final io.reactivex.ObservableSource<? extends T> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    interface TimeoutSupport {
        void getHighSpeedVideoFpsRangesFor(long j);
    }

    public ObservableTimeoutTimed(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, io.reactivex.ObservableSource<? extends T> observableSource) {
        super(observable);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoSizes = observableSource;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        if (this.getHighSpeedVideoSizes == null) {
            io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutObserver timeoutObserver = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.createWorker());
            observer.onSubscribe(timeoutObserver);
            timeoutObserver.getHighResolutionOutputSizeshNQ4ISI(0L);
            this.source.subscribe(timeoutObserver);
            return;
        }
        io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutFallbackObserver timeoutFallbackObserver = new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutFallbackObserver(observer, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor.createWorker(), this.getHighSpeedVideoSizes);
        observer.onSubscribe(timeoutFallbackObserver);
        timeoutFallbackObserver.getHighSpeedVideoFpsRanges(0L);
        this.source.subscribe(timeoutFallbackObserver);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutObserver<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final long getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getHighSpeedVideoSizesFor;
        final io.reactivex.internal.disposables.SequentialDisposable Camera2StreamConfigurationMap = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.getHighSpeedVideoSizes = timeUnit;
            this.getHighSpeedVideoSizesFor = worker;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.Camera2StreamConfigurationMap.get().dispose();
                    this.getHighSpeedVideoFpsRangesFor.onNext(t);
                    getHighResolutionOutputSizeshNQ4ISI(j2);
                }
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.Camera2StreamConfigurationMap.replace(this.getHighSpeedVideoSizesFor.schedule(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutTask(j, this), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Camera2StreamConfigurationMap.dispose();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                this.getHighSpeedVideoSizesFor.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.Camera2StreamConfigurationMap.dispose();
                this.getHighSpeedVideoFpsRangesFor.onComplete();
                this.getHighSpeedVideoSizesFor.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void getHighSpeedVideoFpsRangesFor(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoFpsRangesFor.onError(new java.util.concurrent.TimeoutException());
                this.getHighSpeedVideoSizesFor.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoSizesFor.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutTask implements java.lang.Runnable {
        final io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoSizes;

        TimeoutTask(long j, io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport timeoutSupport) {
            this.getHighSpeedVideoSizes = j;
            this.getHighResolutionOutputSizeshNQ4ISI = timeoutSupport;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final long Camera2StreamConfigurationMap;
        io.reactivex.ObservableSource<? extends T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getInputFormats;
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoFpsRanges = new io.reactivex.internal.disposables.SequentialDisposable();
        final java.util.concurrent.atomic.AtomicLong getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicLong();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();

        TimeoutFallbackObserver(io.reactivex.Observer<? super T> observer, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker, io.reactivex.ObservableSource<? extends T> observableSource) {
            this.getHighSpeedVideoSizes = observer;
            this.Camera2StreamConfigurationMap = j;
            this.getOutputMinFrameDuration = timeUnit;
            this.getInputFormats = worker;
            this.getHighResolutionOutputSizeshNQ4ISI = observableSource;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getOutputFormats, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            long j = this.getHighSpeedVideoFpsRangesFor.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(j, j2)) {
                    this.getHighSpeedVideoFpsRanges.get().dispose();
                    this.getHighSpeedVideoSizes.onNext(t);
                    getHighSpeedVideoFpsRanges(j2);
                }
            }
        }

        final void getHighSpeedVideoFpsRanges(long j) {
            this.getHighSpeedVideoFpsRanges.replace(this.getInputFormats.schedule(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutTask(j, this), this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration));
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRangesFor.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRanges.dispose();
                this.getHighSpeedVideoSizes.onError(th);
                this.getInputFormats.dispose();
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRangesFor.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.getHighSpeedVideoFpsRanges.dispose();
                this.getHighSpeedVideoSizes.onComplete();
                this.getInputFormats.dispose();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TimeoutSupport
        public final void getHighSpeedVideoFpsRangesFor(long j) {
            if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(j, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
                io.reactivex.ObservableSource<? extends T> observableSource = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                observableSource.subscribe(new io.reactivex.internal.operators.observable.ObservableTimeoutTimed.FallbackObserver(this.getHighSpeedVideoSizes, this));
                this.getInputFormats.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getOutputFormats);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            this.getInputFormats.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }

    /* loaded from: classes17.dex */
    static final class FallbackObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;

        FallbackObserver(io.reactivex.Observer<? super T> observer, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> atomicReference) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoFpsRangesFor = atomicReference;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.replace(this.getHighSpeedVideoFpsRangesFor, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges.onComplete();
        }
    }
}
