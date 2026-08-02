package io.reactivex.internal.operators.completable;

/* loaded from: classes3.dex */
public final class CompletableTimeout extends io.reactivex.Completable {
    final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
    final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
    final long getHighSpeedVideoFpsRanges;
    final io.reactivex.CompletableSource getHighSpeedVideoFpsRangesFor;
    final io.reactivex.CompletableSource getHighSpeedVideoSizes;

    public CompletableTimeout(io.reactivex.CompletableSource completableSource, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, io.reactivex.CompletableSource completableSource2) {
        this.getHighSpeedVideoSizes = completableSource;
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = timeUnit;
        this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        this.getHighSpeedVideoFpsRangesFor = completableSource2;
    }

    @Override // io.reactivex.Completable
    public final void subscribeActual(io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        compositeDisposable.add(this.getHighResolutionOutputSizeshNQ4ISI.scheduleDirect(new io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask(atomicBoolean, compositeDisposable, completableObserver), this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap));
        this.getHighSpeedVideoSizes.subscribe(new io.reactivex.internal.operators.completable.CompletableTimeout.TimeOutObserver(compositeDisposable, atomicBoolean, completableObserver));
    }

    /* loaded from: classes17.dex */
    static final class TimeOutObserver implements io.reactivex.CompletableObserver {
        private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;
        private final io.reactivex.CompletableObserver getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes;

        TimeOutObserver(io.reactivex.disposables.CompositeDisposable compositeDisposable, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoSizes = compositeDisposable;
            this.getHighSpeedVideoFpsRanges = atomicBoolean;
            this.getHighSpeedVideoFpsRangesFor = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.add(disposable);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRangesFor.onError(th);
            } else {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.dispose();
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            }
        }
    }

    /* loaded from: classes17.dex */
    final class DisposeTask implements java.lang.Runnable {
        final io.reactivex.CompletableObserver getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRanges;
        final io.reactivex.disposables.CompositeDisposable getHighSpeedVideoSizes;

        DisposeTask(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, io.reactivex.disposables.CompositeDisposable compositeDisposable, io.reactivex.CompletableObserver completableObserver) {
            this.getHighSpeedVideoFpsRanges = atomicBoolean;
            this.getHighSpeedVideoSizes = compositeDisposable;
            this.getHighResolutionOutputSizeshNQ4ISI = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.getHighSpeedVideoFpsRanges.compareAndSet(false, true)) {
                this.getHighSpeedVideoSizes.clear();
                if (io.reactivex.internal.operators.completable.CompletableTimeout.this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI.onError(new java.util.concurrent.TimeoutException());
                } else {
                    io.reactivex.internal.operators.completable.CompletableTimeout.this.getHighSpeedVideoFpsRangesFor.subscribe(new io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.DisposeObserver());
                }
            }
        }

        final class DisposeObserver implements io.reactivex.CompletableObserver {
            DisposeObserver() {
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.getHighSpeedVideoSizes.add(disposable);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(java.lang.Throwable th) {
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.getHighSpeedVideoSizes.dispose();
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.getHighSpeedVideoSizes.dispose();
                io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask.this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            }
        }
    }
}
