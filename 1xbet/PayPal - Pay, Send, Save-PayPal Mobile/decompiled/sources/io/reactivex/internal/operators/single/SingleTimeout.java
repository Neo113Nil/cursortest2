package io.reactivex.internal.operators.single;

/* loaded from: classes3.dex */
public final class SingleTimeout<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final io.reactivex.SingleSource<? extends T> getHighSpeedVideoFpsRanges;
    final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizes;

    public SingleTimeout(io.reactivex.SingleSource<T> singleSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, io.reactivex.SingleSource<? extends T> singleSource2) {
        this.Camera2StreamConfigurationMap = singleSource;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoSizes = timeUnit;
        this.getHighSpeedVideoFpsRangesFor = scheduler;
        this.getHighSpeedVideoFpsRanges = singleSource2;
    }

    @Override // io.reactivex.Single
    public final void subscribeActual(io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver timeoutMainObserver = new io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver(singleObserver, this.getHighSpeedVideoFpsRanges);
        singleObserver.onSubscribe(timeoutMainObserver);
        io.reactivex.internal.disposables.DisposableHelper.replace(timeoutMainObserver.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.scheduleDirect(timeoutMainObserver, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        this.Camera2StreamConfigurationMap.subscribe(timeoutMainObserver);
    }

    /* loaded from: classes17.dex */
    static final class TimeoutMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 37497744973048446L;
        final io.reactivex.SingleObserver<? super T> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<T> getHighSpeedVideoFpsRangesFor;
        io.reactivex.SingleSource<? extends T> getHighSpeedVideoSizes;

        static final class TimeoutFallbackObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final io.reactivex.SingleObserver<? super T> getHighResolutionOutputSizeshNQ4ISI;

            TimeoutFallbackObserver(io.reactivex.SingleObserver<? super T> singleObserver) {
                this.getHighResolutionOutputSizeshNQ4ISI = singleObserver;
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t) {
                this.getHighResolutionOutputSizeshNQ4ISI.onSuccess(t);
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(java.lang.Throwable th) {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }

        TimeoutMainObserver(io.reactivex.SingleObserver<? super T> singleObserver, io.reactivex.SingleSource<? extends T> singleSource) {
            this.Camera2StreamConfigurationMap = singleObserver;
            this.getHighSpeedVideoSizes = singleSource;
            if (singleSource != null) {
                this.getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<>(singleObserver);
            } else {
                this.getHighSpeedVideoFpsRangesFor = null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) {
                return;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            io.reactivex.SingleSource<? extends T> singleSource = this.getHighSpeedVideoSizes;
            if (singleSource == null) {
                this.Camera2StreamConfigurationMap.onError(new java.util.concurrent.TimeoutException());
            } else {
                this.getHighSpeedVideoSizes = null;
                singleSource.subscribe(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable == io.reactivex.internal.disposables.DisposableHelper.DISPOSED || !compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) {
                return;
            }
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            this.Camera2StreamConfigurationMap.onSuccess(t);
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(java.lang.Throwable th) {
            io.reactivex.disposables.Disposable disposable = get();
            if (disposable != io.reactivex.internal.disposables.DisposableHelper.DISPOSED && compareAndSet(disposable, io.reactivex.internal.disposables.DisposableHelper.DISPOSED)) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
                this.Camera2StreamConfigurationMap.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            io.reactivex.internal.operators.single.SingleTimeout.TimeoutMainObserver.TimeoutFallbackObserver<T> timeoutFallbackObserver = this.getHighSpeedVideoFpsRangesFor;
            if (timeoutFallbackObserver != null) {
                io.reactivex.internal.disposables.DisposableHelper.dispose(timeoutFallbackObserver);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }
    }
}
