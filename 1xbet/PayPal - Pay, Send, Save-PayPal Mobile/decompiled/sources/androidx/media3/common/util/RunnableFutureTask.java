package androidx.media3.common.util;

/* loaded from: classes7.dex */
public abstract class RunnableFutureTask<R, E extends java.lang.Exception> implements java.util.concurrent.RunnableFuture<R> {
    private boolean getHighSpeedVideoFpsRanges;
    private java.lang.Exception getHighSpeedVideoFpsRangesFor;
    private R getHighSpeedVideoSizes;
    private java.lang.Thread getInputSizeshNQ4ISI;
    private final androidx.media3.common.util.ConditionVariable getOutputFormats = new androidx.media3.common.util.ConditionVariable();
    private final androidx.media3.common.util.ConditionVariable getHighResolutionOutputSizeshNQ4ISI = new androidx.media3.common.util.ConditionVariable();
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    protected void cancelWork() {
    }

    protected abstract R doWork() throws java.lang.Exception;

    protected RunnableFutureTask() {
    }

    public final void blockUntilStarted() {
        this.getOutputFormats.blockUninterruptible();
    }

    public final void blockUntilFinished() {
        this.getHighResolutionOutputSizeshNQ4ISI.blockUninterruptible();
    }

    @Override // java.util.concurrent.Future
    public final R get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        this.getHighResolutionOutputSizeshNQ4ISI.block();
        return getHighSpeedVideoFpsRangesFor();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.block(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            throw new java.util.concurrent.TimeoutException();
        }
        return getHighSpeedVideoFpsRangesFor();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoFpsRanges && !this.getHighResolutionOutputSizeshNQ4ISI.isOpen()) {
                this.getHighSpeedVideoFpsRanges = true;
                cancelWork();
                java.lang.Thread thread = this.getInputSizeshNQ4ISI;
                if (thread == null) {
                    this.getOutputFormats.open();
                    this.getHighResolutionOutputSizeshNQ4ISI.open();
                } else if (z) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isOpen();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getInputSizeshNQ4ISI = java.lang.Thread.currentThread();
            this.getOutputFormats.open();
            try {
                try {
                    this.getHighSpeedVideoSizes = doWork();
                    synchronized (this.Camera2StreamConfigurationMap) {
                        this.getHighResolutionOutputSizeshNQ4ISI.open();
                        this.getInputSizeshNQ4ISI = null;
                        java.lang.Thread.interrupted();
                    }
                } catch (java.lang.Exception e) {
                    this.getHighSpeedVideoFpsRangesFor = e;
                    synchronized (this.Camera2StreamConfigurationMap) {
                        this.getHighResolutionOutputSizeshNQ4ISI.open();
                        this.getInputSizeshNQ4ISI = null;
                        java.lang.Thread.interrupted();
                    }
                }
            } catch (java.lang.Throwable th) {
                synchronized (this.Camera2StreamConfigurationMap) {
                    this.getHighResolutionOutputSizeshNQ4ISI.open();
                    this.getInputSizeshNQ4ISI = null;
                    java.lang.Thread.interrupted();
                    throw th;
                }
            }
        }
    }

    private R getHighSpeedVideoFpsRangesFor() throws java.util.concurrent.ExecutionException {
        if (this.getHighSpeedVideoFpsRanges) {
            throw new java.util.concurrent.CancellationException();
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            throw new java.util.concurrent.ExecutionException(this.getHighSpeedVideoFpsRangesFor);
        }
        return this.getHighSpeedVideoSizes;
    }
}
