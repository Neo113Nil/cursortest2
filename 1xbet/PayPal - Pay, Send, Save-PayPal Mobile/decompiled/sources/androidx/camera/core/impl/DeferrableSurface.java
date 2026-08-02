package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class DeferrableSurface {
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Class<?> getHighSpeedVideoSizes;
    private final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoSizesFor;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getInputFormats;
    int getInputSizeshNQ4ISI;
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOutputFormats;
    final java.lang.Object getOutputMinFrameDuration;
    private androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizes;
    private final android.util.Size getOutputSizeshNQ4ISI;
    public static final android.util.Size SIZE_UNDEFINED = new android.util.Size(0, 0);
    private static final boolean getHighSpeedVideoFpsRanges = androidx.camera.core.Logger.isDebugEnabled("DeferrableSurface");
    static final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger(0);
    static final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicInteger(0);

    protected abstract com.google.common.util.concurrent.ListenableFuture<android.view.Surface> provideSurface();

    public static final class SurfaceUnavailableException extends java.lang.Exception {
        public SurfaceUnavailableException(java.lang.String str) {
            super(str);
        }
    }

    public static final class SurfaceClosedException extends java.lang.Exception {
        androidx.camera.core.impl.DeferrableSurface Camera2StreamConfigurationMap;

        public SurfaceClosedException(java.lang.String str, androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            super(str);
            this.Camera2StreamConfigurationMap = deferrableSurface;
        }

        public final androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    public DeferrableSurface(android.util.Size size, int i) {
        this.getOutputMinFrameDuration = new java.lang.Object();
        this.getInputSizeshNQ4ISI = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        this.getOutputSizeshNQ4ISI = size;
        this.getOutputSizes = i;
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.DeferrableSurface.this.getHighResolutionOutputSizeshNQ4ISI(completer);
            }
        });
        this.getOutputFormats = future;
        this.getHighSpeedVideoSizesFor = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.impl.DeferrableSurface.this.getHighSpeedVideoFpsRangesFor(completer);
            }
        });
        if (androidx.camera.core.Logger.isDebugEnabled("DeferrableSurface")) {
            getHighSpeedVideoSizes("Surface created", getHighSpeedVideoFpsRangesFor.incrementAndGet(), Camera2StreamConfigurationMap.get());
            final java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Exception());
            future.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurface$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.DeferrableSurface deferrableSurface = androidx.camera.core.impl.DeferrableSurface.this;
                    java.lang.String str = stackTraceString;
                    try {
                        deferrableSurface.getOutputFormats.get();
                        deferrableSurface.getHighSpeedVideoSizes("Surface terminated", androidx.camera.core.impl.DeferrableSurface.getHighSpeedVideoFpsRangesFor.decrementAndGet(), androidx.camera.core.impl.DeferrableSurface.Camera2StreamConfigurationMap.get());
                    } catch (java.lang.Exception e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected surface termination for ");
                        sb.append(deferrableSurface);
                        sb.append("\nStack Trace:\n");
                        sb.append(str);
                        androidx.camera.core.Logger.e("DeferrableSurface", sb.toString());
                        synchronized (deferrableSurface.getOutputMinFrameDuration) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, java.lang.Boolean.valueOf(deferrableSurface.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(deferrableSurface.getInputSizeshNQ4ISI)), e);
                        }
                    }
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }

    final /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        synchronized (this.getOutputMinFrameDuration) {
            this.getOutputMinFrameDurationlomOqCM = completer;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeferrableSurface-termination(");
        sb.append(this);
        sb.append(")");
        return sb.toString();
    }

    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        synchronized (this.getOutputMinFrameDuration) {
            this.getInputFormats = completer;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeferrableSurface-close(");
        sb.append(this);
        sb.append(")");
        return sb.toString();
    }

    final void getHighSpeedVideoSizes(java.lang.String str, int i, int i2) {
        if (!getHighSpeedVideoFpsRanges && androidx.camera.core.Logger.isDebugEnabled("DeferrableSurface")) {
            androidx.camera.core.Logger.d("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("[total_surfaces=");
        sb.append(i);
        sb.append(", used_surfaces=");
        sb.append(i2);
        sb.append("](");
        sb.append(this);
        sb.append("}");
        androidx.camera.core.Logger.d("DeferrableSurface", sb.toString());
    }

    public final com.google.common.util.concurrent.ListenableFuture<android.view.Surface> getSurface() {
        synchronized (this.getOutputMinFrameDuration) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return provideSurface();
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getTerminationFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.getOutputFormats);
    }

    public void incrementUseCount() throws androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException {
        synchronized (this.getOutputMinFrameDuration) {
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0 && this.getHighResolutionOutputSizeshNQ4ISI) {
                throw new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.getInputSizeshNQ4ISI = i + 1;
            if (androidx.camera.core.Logger.isDebugEnabled("DeferrableSurface")) {
                if (this.getInputSizeshNQ4ISI == 1) {
                    getHighSpeedVideoSizes("New surface in use", getHighSpeedVideoFpsRangesFor.get(), Camera2StreamConfigurationMap.incrementAndGet());
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("use count+1, useCount=");
                sb.append(this.getInputSizeshNQ4ISI);
                sb.append(" ");
                sb.append(this);
                androidx.camera.core.Logger.d("DeferrableSurface", sb.toString());
            }
        }
    }

    public void close() {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer;
        synchronized (this.getOutputMinFrameDuration) {
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                completer = null;
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getInputFormats.set(null);
                if (this.getInputSizeshNQ4ISI == 0) {
                    completer = this.getOutputMinFrameDurationlomOqCM;
                    this.getOutputMinFrameDurationlomOqCM = null;
                } else {
                    completer = null;
                }
                if (androidx.camera.core.Logger.isDebugEnabled("DeferrableSurface")) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("surface closed,  useCount=");
                    sb.append(this.getInputSizeshNQ4ISI);
                    sb.append(" closed=true ");
                    sb.append(this);
                    androidx.camera.core.Logger.d("DeferrableSurface", sb.toString());
                }
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getCloseFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.getHighSpeedVideoSizesFor);
    }

    public void decrementUseCount() {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer;
        synchronized (this.getOutputMinFrameDuration) {
            int i = this.getInputSizeshNQ4ISI;
            if (i == 0) {
                throw new java.lang.IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.getInputSizeshNQ4ISI = i2;
            if (i2 == 0 && this.getHighResolutionOutputSizeshNQ4ISI) {
                completer = this.getOutputMinFrameDurationlomOqCM;
                this.getOutputMinFrameDurationlomOqCM = null;
            } else {
                completer = null;
            }
            if (androidx.camera.core.Logger.isDebugEnabled("DeferrableSurface")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("use count-1,  useCount=");
                sb.append(this.getInputSizeshNQ4ISI);
                sb.append(" closed=");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                sb.append(" ");
                sb.append(this);
                androidx.camera.core.Logger.d("DeferrableSurface", sb.toString());
                if (this.getInputSizeshNQ4ISI == 0) {
                    getHighSpeedVideoSizes("Surface no longer in use", getHighSpeedVideoFpsRangesFor.get(), Camera2StreamConfigurationMap.decrementAndGet());
                }
            }
        }
        if (completer != null) {
            completer.set(null);
        }
    }

    public android.util.Size getPrescribedSize() {
        return this.getOutputSizeshNQ4ISI;
    }

    public int getPrescribedStreamFormat() {
        return this.getOutputSizes;
    }

    public int getUseCount() {
        int i;
        synchronized (this.getOutputMinFrameDuration) {
            i = this.getInputSizeshNQ4ISI;
        }
        return i;
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.getOutputMinFrameDuration) {
            z = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return z;
    }

    public java.lang.Class<?> getContainerClass() {
        return this.getHighSpeedVideoSizes;
    }

    public void setContainerClass(java.lang.Class<?> cls) {
        this.getHighSpeedVideoSizes = cls;
    }
}
