package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class CameraView extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {
    private int Camera2StreamConfigurationMap;
    private android.hardware.Camera getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private android.graphics.SurfaceTexture getHighSpeedVideoSizes;
    private int getInputFormats;

    public CameraView(android.content.Context context) {
        this(context, null, 0);
    }

    public void addPreviewFrameBuffer(byte[] bArr) {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    public int getDegreesToRotate() {
        return (360 - this.getHighSpeedVideoFpsRanges) % 360;
    }

    public android.hardware.Camera.Size getFrameSize() {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            return camera.getParameters().getPreviewSize();
        }
        return null;
    }

    public android.hardware.Camera.Size getNativePictureSize() {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            return camera.getParameters().getPictureSize();
        }
        return null;
    }

    public android.hardware.Camera.Size getOptimalPreviewSize() {
        return getOptimalPreviewSize(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats);
    }

    public java.util.List<android.hardware.Camera.Size> getSupportedFrameSizes() {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            return camera.getParameters().getSupportedPreviewSizes();
        }
        return null;
    }

    @Override // android.view.TextureView
    public android.graphics.SurfaceTexture getSurfaceTexture() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isStopped() {
        return this.getHighResolutionOutputSizeshNQ4ISI == null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.getHighSpeedVideoSizes = surfaceTexture;
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
                this.getHighResolutionOutputSizeshNQ4ISI.startPreview();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return true;
        }
        stop();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    public void setPreviewFrameCallback(android.hardware.Camera.PreviewCallback previewCallback) {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            camera.setPreviewCallback(previewCallback);
        }
    }

    public void setPreviewFrameCallbackWithBuffer(android.hardware.Camera.PreviewCallback previewCallback) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
            int bitsPerPixel = ((this.getHighSpeedVideoFpsRangesFor * this.getInputFormats) * android.graphics.ImageFormat.getBitsPerPixel(17)) / 8;
            this.getHighResolutionOutputSizeshNQ4ISI.setPreviewCallbackWithBuffer(previewCallback);
            this.getHighResolutionOutputSizeshNQ4ISI.addCallbackBuffer(new byte[bitsPerPixel]);
        }
    }

    public void stop() {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            try {
                camera.cancelAutoFocus();
            } catch (java.lang.Exception unused) {
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setPreviewCallback(null);
            this.getHighResolutionOutputSizeshNQ4ISI.setPreviewCallbackWithBuffer(null);
            this.getHighResolutionOutputSizeshNQ4ISI.stopPreview();
            this.getHighResolutionOutputSizeshNQ4ISI.release();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    public CameraView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected android.hardware.Camera.Size getOptimalPreviewSize(int i, int i2) {
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        android.hardware.Camera.Size size = null;
        if (camera == null) {
            return null;
        }
        double d = i / i2;
        java.util.List<android.hardware.Camera.Size> supportedPreviewSizes = camera.getParameters().getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (android.hardware.Camera.Size size2 : supportedPreviewSizes) {
            if (java.lang.Math.abs((size2.width / size2.height) - d) <= 0.1d && java.lang.Math.abs(size2.height - i2) < d3) {
                d3 = java.lang.Math.abs(size2.height - i2);
                size = size2;
            }
        }
        if (size == null) {
            for (android.hardware.Camera.Size size3 : supportedPreviewSizes) {
                if (java.lang.Math.abs(size3.height - i2) < d2) {
                    d2 = java.lang.Math.abs(size3.height - i2);
                    size = size3;
                }
            }
        }
        return size;
    }

    public android.hardware.Camera.Size start() {
        return start(null, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats);
    }

    public CameraView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = -1;
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoFpsRangesFor = 640;
        this.getInputFormats = androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND;
        setSurfaceTextureListener(this);
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            android.hardware.Camera.getCameraInfo(i2, cameraInfo);
            this.Camera2StreamConfigurationMap = i2;
            if (cameraInfo.facing == 1) {
                return;
            }
        }
    }

    public android.hardware.Camera.Size start(android.app.Activity activity, int i, int i2) {
        stop();
        this.getHighResolutionOutputSizeshNQ4ISI = android.hardware.Camera.open(this.Camera2StreamConfigurationMap);
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(this.Camera2StreamConfigurationMap, cameraInfo);
        int deviceOrientation = com.daon.sdk.face.CameraTools.getDeviceOrientation(activity, cameraInfo);
        this.getHighSpeedVideoFpsRanges = deviceOrientation;
        this.getHighResolutionOutputSizeshNQ4ISI.setDisplayOrientation(deviceOrientation);
        android.hardware.Camera.Size optimalPreviewSize = getOptimalPreviewSize(i, i2);
        if (optimalPreviewSize != null) {
            this.getHighSpeedVideoFpsRangesFor = optimalPreviewSize.width;
            this.getInputFormats = optimalPreviewSize.height;
        } else {
            this.getHighSpeedVideoFpsRangesFor = 640;
            this.getInputFormats = androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND;
        }
        android.hardware.Camera.Parameters parameters = this.getHighResolutionOutputSizeshNQ4ISI.getParameters();
        parameters.setPreviewSize(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats);
        parameters.setPreviewFormat(17);
        parameters.setRotation(this.getHighSpeedVideoFpsRanges);
        if (parameters.getSupportedFocusModes().contains(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            parameters.setFocusMode(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setParameters(parameters);
        android.hardware.Camera camera = this.getHighResolutionOutputSizeshNQ4ISI;
        if (camera != null) {
            try {
                camera.setPreviewTexture(this.getHighSpeedVideoSizes);
                this.getHighResolutionOutputSizeshNQ4ISI.startPreview();
            } catch (java.io.IOException unused) {
            }
        }
        return optimalPreviewSize;
    }
}
