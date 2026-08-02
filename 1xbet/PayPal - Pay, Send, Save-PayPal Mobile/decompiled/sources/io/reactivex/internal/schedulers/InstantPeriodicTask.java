package io.reactivex.internal.schedulers;

/* loaded from: classes17.dex */
final class InstantPeriodicTask implements java.util.concurrent.Callable<java.lang.Void>, io.reactivex.disposables.Disposable {
    static final java.util.concurrent.FutureTask<java.lang.Void> getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.FutureTask<>(io.reactivex.internal.functions.Functions.EMPTY_RUNNABLE, null);
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
    final java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
    java.lang.Thread getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.ExecutorService getHighSpeedVideoSizes;
    final java.lang.Runnable getOutputFormats;

    InstantPeriodicTask(java.lang.Runnable runnable, java.util.concurrent.ExecutorService executorService) {
        this.getOutputFormats = runnable;
        this.getHighSpeedVideoSizes = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Void call() throws java.lang.Exception {
        this.getHighSpeedVideoFpsRangesFor = java.lang.Thread.currentThread();
        try {
            this.getOutputFormats.run();
            java.util.concurrent.Future submit = this.getHighSpeedVideoSizes.submit(this);
            while (true) {
                java.util.concurrent.Future<?> future = this.getHighSpeedVideoFpsRanges.get();
                if (future == getHighResolutionOutputSizeshNQ4ISI) {
                    submit.cancel(this.getHighSpeedVideoFpsRangesFor != java.lang.Thread.currentThread());
                } else if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, future, submit)) {
                    break;
                }
            }
            this.getHighSpeedVideoFpsRangesFor = null;
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRangesFor = null;
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }
        return null;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Future<?>> atomicReference = this.Camera2StreamConfigurationMap;
        java.util.concurrent.FutureTask<java.lang.Void> futureTask = getHighResolutionOutputSizeshNQ4ISI;
        java.util.concurrent.Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.getHighSpeedVideoFpsRangesFor != java.lang.Thread.currentThread());
        }
        java.util.concurrent.Future<?> andSet2 = this.getHighSpeedVideoFpsRanges.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.getHighSpeedVideoFpsRangesFor != java.lang.Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.Camera2StreamConfigurationMap.get() == getHighResolutionOutputSizeshNQ4ISI;
    }

    final void getHighSpeedVideoSizes(java.util.concurrent.Future<?> future) {
        java.util.concurrent.Future<?> future2;
        do {
            future2 = this.Camera2StreamConfigurationMap.get();
            if (future2 == getHighResolutionOutputSizeshNQ4ISI) {
                future.cancel(this.getHighSpeedVideoFpsRangesFor != java.lang.Thread.currentThread());
                return;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, future2, future));
    }
}
