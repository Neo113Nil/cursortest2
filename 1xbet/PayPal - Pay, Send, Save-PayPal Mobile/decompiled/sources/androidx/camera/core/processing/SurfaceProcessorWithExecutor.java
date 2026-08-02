package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class SurfaceProcessorWithExecutor implements androidx.camera.core.processing.SurfaceProcessorInternal {
    final androidx.camera.core.SurfaceProcessor Camera2StreamConfigurationMap;
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;
    final androidx.core.util.Consumer<java.lang.Throwable> getHighSpeedVideoSizes;

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
    }

    public SurfaceProcessorWithExecutor(androidx.camera.core.CameraEffect cameraEffect) {
        this.Camera2StreamConfigurationMap = (androidx.camera.core.SurfaceProcessor) java.util.Objects.requireNonNull(cameraEffect.getSurfaceProcessor());
        this.getHighSpeedVideoFpsRangesFor = cameraEffect.getExecutor();
        this.getHighSpeedVideoSizes = cameraEffect.getErrorListener();
    }

    public androidx.camera.core.SurfaceProcessor getProcessor() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.concurrent.Executor getExecutor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final androidx.camera.core.SurfaceRequest surfaceRequest) {
        try {
            this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceProcessorWithExecutor surfaceProcessorWithExecutor = androidx.camera.core.processing.SurfaceProcessorWithExecutor.this;
                    try {
                        surfaceProcessorWithExecutor.Camera2StreamConfigurationMap.onInputSurface(surfaceRequest);
                    } catch (androidx.camera.core.ProcessingException e) {
                        androidx.camera.core.Logger.e("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e);
                        surfaceProcessorWithExecutor.getHighSpeedVideoSizes.accept(e);
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            androidx.camera.core.Logger.e("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final androidx.camera.core.SurfaceOutput surfaceOutput) {
        try {
            this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceProcessorWithExecutor$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.SurfaceProcessorWithExecutor surfaceProcessorWithExecutor = androidx.camera.core.processing.SurfaceProcessorWithExecutor.this;
                    try {
                        surfaceProcessorWithExecutor.Camera2StreamConfigurationMap.onOutputSurface(surfaceOutput);
                    } catch (androidx.camera.core.ProcessingException e) {
                        androidx.camera.core.Logger.e("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e);
                        surfaceProcessorWithExecutor.getHighSpeedVideoSizes.accept(e);
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
            androidx.camera.core.Logger.e("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> snapshot(int i, int i2) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceProcessorWithExecutor(");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(")");
        return sb.toString();
    }
}
