package androidx.camera.core.processing;

/* loaded from: classes6.dex */
final class SurfaceOutputImpl implements androidx.camera.core.SurfaceOutput {
    private final float[] Camera2StreamConfigurationMap;
    private final androidx.camera.core.SurfaceOutput.CameraInputInfo getHighResolutionOutputSizeshNQ4ISI;
    private androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> getHighSpeedVideoFpsRanges;
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoFpsRangesFor;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoSizes;
    private final float[] getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private java.util.concurrent.Executor getOutputFormats;
    private final float[] getOutputSizes;
    private android.graphics.Matrix getOutputSizeshNQ4ISI;
    private final androidx.camera.core.SurfaceOutput.CameraInputInfo getOutputStallDuration;
    private final float[] getOutputStallDurationlomOqCM;
    private final int isOutputSupportedFor;
    private final android.view.Surface isOutputSupportedForhNQ4ISI;
    private final android.util.Size unwrapAs;
    private final java.lang.Object getOutputMinFrameDurationlomOqCM = new java.lang.Object();
    private boolean getOutputMinFrameDuration = false;
    private boolean getInputSizeshNQ4ISI = false;

    SurfaceOutputImpl(android.view.Surface surface, int i, int i2, android.util.Size size, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo2, android.graphics.Matrix matrix) {
        float[] fArr = new float[16];
        this.Camera2StreamConfigurationMap = fArr;
        float[] fArr2 = new float[16];
        this.getOutputSizes = fArr2;
        float[] fArr3 = new float[16];
        this.getHighSpeedVideoSizesFor = fArr3;
        float[] fArr4 = new float[16];
        this.getOutputStallDurationlomOqCM = fArr4;
        this.isOutputSupportedForhNQ4ISI = surface;
        this.isOutputSupportedFor = i;
        this.getInputFormats = i2;
        this.unwrapAs = size;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraInputInfo;
        this.getOutputStallDuration = cameraInputInfo2;
        this.getOutputSizeshNQ4ISI = matrix;
        getHighSpeedVideoSizes(fArr, fArr3, cameraInputInfo);
        getHighSpeedVideoSizes(fArr2, fArr4, cameraInputInfo2);
        this.getHighSpeedVideoFpsRangesFor = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.SurfaceOutputImpl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                androidx.camera.core.processing.SurfaceOutputImpl.this.getHighSpeedVideoSizes = completer;
                return "SurfaceOutputImpl close future complete";
            }
        });
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final android.view.Surface getSurface(java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> consumer) {
        boolean z;
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            this.getOutputFormats = executor;
            this.getHighSpeedVideoFpsRanges = consumer;
            z = this.getOutputMinFrameDuration;
        }
        if (z) {
            getHighSpeedVideoFpsRanges();
        }
        return this.isOutputSupportedForhNQ4ISI;
    }

    public final void getHighSpeedVideoFpsRanges() {
        java.util.concurrent.Executor executor;
        androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> consumer;
        final java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            if (this.getOutputFormats == null || (consumer = this.getHighSpeedVideoFpsRanges) == null) {
                this.getOutputMinFrameDuration = true;
            } else if (!this.getInputSizeshNQ4ISI) {
                atomicReference.set(consumer);
                executor = this.getOutputFormats;
                this.getOutputMinFrameDuration = false;
            }
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.SurfaceOutputImpl$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.core.util.Consumer) atomicReference.get()).accept(androidx.camera.core.SurfaceOutput.Event.of(0, androidx.camera.core.processing.SurfaceOutputImpl.this));
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e) {
                androidx.camera.core.Logger.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getTargets() {
        return this.isOutputSupportedFor;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getFormat() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final android.util.Size getSize() {
        return this.unwrapAs;
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getOutputMinFrameDurationlomOqCM) {
            if (!this.getInputSizeshNQ4ISI) {
                this.getInputSizeshNQ4ISI = true;
            }
        }
        this.getHighSpeedVideoSizes.set(null);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void updateTransformMatrix(float[] fArr, float[] fArr2) {
        updateTransformMatrix(fArr, fArr2, true);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z ? this.Camera2StreamConfigurationMap : this.getOutputSizes, 0);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final android.graphics.Matrix getSensorToBufferTransform() {
        return new android.graphics.Matrix(this.getOutputSizeshNQ4ISI);
    }

    private static void getHighSpeedVideoSizes(float[] fArr, float[] fArr2, androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(fArr, 0.5f);
        androidx.camera.core.impl.utils.MatrixExt.preRotate(fArr, cameraInputInfo.getRotationDegrees(), 0.5f, 0.5f);
        if (cameraInputInfo.getMirroring()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(cameraInputInfo.getInputSize()), androidx.camera.core.impl.utils.TransformUtils.sizeToRectF(androidx.camera.core.impl.utils.TransformUtils.rotateSize(cameraInputInfo.getInputSize(), cameraInputInfo.getRotationDegrees())), cameraInputInfo.getRotationDegrees(), cameraInputInfo.getMirroring());
        android.graphics.RectF rectF = new android.graphics.RectF(cameraInputInfo.getInputCropRect());
        rectToRect.mapRect(rectF);
        float width = rectF.left / r1.getWidth();
        float height = ((r1.getHeight() - rectF.height()) - rectF.top) / r1.getHeight();
        float width2 = rectF.width() / r1.getWidth();
        float height2 = rectF.height() / r1.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        getHighSpeedVideoFpsRangesFor(fArr2, cameraInputInfo.getCameraInternal());
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    private static void getHighSpeedVideoFpsRangesFor(float[] fArr, androidx.camera.core.impl.CameraInternal cameraInternal) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(fArr, 0.5f);
        if (cameraInternal != null) {
            androidx.core.util.Preconditions.checkState(cameraInternal.getHasTransform(), "Camera has no transform.");
            androidx.camera.core.impl.utils.MatrixExt.preRotate(fArr, cameraInternal.getCameraInfo().getSensorRotationDegrees(), 0.5f, 0.5f);
            if (cameraInternal.isFrontFacing()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }
}
