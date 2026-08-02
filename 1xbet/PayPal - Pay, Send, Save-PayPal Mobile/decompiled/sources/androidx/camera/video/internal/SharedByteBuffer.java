package androidx.camera.video.internal;

/* loaded from: classes6.dex */
public final class SharedByteBuffer implements java.io.Closeable {
    private final int Camera2StreamConfigurationMap;
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor;
    private final androidx.core.util.Pair<java.util.concurrent.Executor, java.lang.Runnable> getHighSpeedVideoSizes;
    private final java.util.concurrent.atomic.AtomicInteger getOutputMinFrameDuration;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        getHighSpeedVideoFpsRanges();
    }

    public final java.nio.ByteBuffer get() {
        java.nio.ByteBuffer byteBuffer;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoFpsRanges) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot call ");
                sb.append("get()");
                sb.append(" on a closed SharedByteBuffer.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            byteBuffer = this.getHighSpeedVideoFpsRangesFor;
        }
        return byteBuffer;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "SharedByteBuffer[buf: %s, shareId: 0x%x, instanceId:0x%x]", this.getHighSpeedVideoFpsRangesFor, java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap), java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)));
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            if (getHighSpeedVideoFpsRanges()) {
                androidx.camera.core.Logger.w("SharedByteBuffer", java.lang.String.format(java.util.Locale.US, "SharedByteBuffer closed by finalizer, but should have been closed manually with SharedByteBuffer.close() [%s]", toString()));
            }
        } finally {
            super.finalize();
        }
    }

    private boolean getHighSpeedVideoFpsRanges() {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges = true;
            int decrementAndGet = this.getOutputMinFrameDuration.decrementAndGet();
            if (androidx.camera.core.Logger.isDebugEnabled("SharedByteBuffer")) {
                if (decrementAndGet < 0) {
                    throw new java.lang.AssertionError("Invalid ref count. close() should never produce a ref count below 0");
                }
                androidx.camera.core.Logger.d("SharedByteBuffer", java.lang.String.format(java.util.Locale.US, "Ref count decremented: %d [%s]", java.lang.Integer.valueOf(decrementAndGet), toString()));
            }
            if (decrementAndGet == 0) {
                if (androidx.camera.core.Logger.isDebugEnabled("SharedByteBuffer")) {
                    androidx.camera.core.Logger.d("SharedByteBuffer", java.lang.String.format(java.util.Locale.US, "Final reference released. Running final close action. [%s]", toString()));
                }
                try {
                    ((java.util.concurrent.Executor) androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoSizes.first)).execute((java.lang.Runnable) androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoSizes.second));
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    androidx.camera.core.Logger.e("SharedByteBuffer", java.lang.String.format(java.util.Locale.US, "Unable to execute final close action. [%s]", toString()), e);
                }
            }
            return true;
        }
    }
}
