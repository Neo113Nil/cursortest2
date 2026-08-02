package com.microblink.blinkid.recognition.callback;

/* loaded from: classes.dex */
public abstract class BaseRecognitionProcessCallback {
    com.microblink.blinkid.metadata.MetadataCallbacks Camera2StreamConfigurationMap;
    com.microblink.blinkid.recognition.callback.NativeCancelDelegate getHighResolutionOutputSizeshNQ4ISI = new com.microblink.blinkid.recognition.callback.NativeCancelDelegate();
    private com.microblink.blinkid.secured.lIllIlllIl getHighSpeedVideoFpsRanges;
    com.microblink.blinkid.recognition.NativeRecognizerWrapper getHighSpeedVideoFpsRangesFor;
    long getHighSpeedVideoSizes;

    static {
        com.microblink.blinkid.secured.lIIllllIIl.IlIllIlIIl();
    }

    BaseRecognitionProcessCallback(com.microblink.blinkid.secured.lIllIlllIl lillilllil, com.microblink.blinkid.geometry.Rectangle rectangle, com.microblink.blinkid.entities.recognizers.RecognizerBundle.RecognitionDebugMode recognitionDebugMode) {
        this.getHighSpeedVideoSizes = 0L;
        this.getHighSpeedVideoFpsRanges = lillilllil;
        this.getHighSpeedVideoSizes = nativeConstruct(recognitionDebugMode.ordinal());
        setScanningRegion(rectangle);
        setVisiblePartRelativeDestination(null);
    }

    private native long nativeConstruct(int i);

    private static native void nativeDestruct(long j);

    private static native void nativeSetBaseCallbacks(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    private static native void nativeSetMirrorType(long j, int i);

    private static native void nativeSetScanningRegion(long j, float f, float f2, float f3, float f4);

    private static native void nativeSetVisiblePartRelativeDestination(long j, float f, float f2, float f3, float f4);

    public void dispose() {
        long j = this.getHighSpeedVideoSizes;
        if (j != 0) {
            nativeDestruct(j);
            this.getHighSpeedVideoSizes = 0L;
        }
    }

    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        dispose();
    }

    public com.microblink.blinkid.recognition.callback.NativeCancelDelegate getCancelDelegate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public long getNativeContext() {
        return this.getHighSpeedVideoSizes;
    }

    public void onDebugText(java.lang.String str) {
        this.Camera2StreamConfigurationMap.getDebugTextCallback().onDebugText(str);
    }

    public void onDetectionFailed() {
        this.Camera2StreamConfigurationMap.getFailedDetectionCallback().onDetectionFailed();
    }

    public void onImage(long j) {
        com.microblink.blinkid.image.Image buildImageFromNativeContext = com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(j, false, null);
        this.Camera2StreamConfigurationMap.getDebugImageCallback().onImageAvailable(buildImageFromNativeContext);
        buildImageFromNativeContext.dispose();
    }

    public void onLicenseInfo(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges.onLicenseInformation(str);
    }

    public void onPointsDetection(int i, float[] fArr, float[] fArr2, int i2) {
        this.Camera2StreamConfigurationMap.getPointsDetectionCallback().onPointsDetection(new com.microblink.blinkid.metadata.detection.points.DisplayablePointsDetection(i, fArr, fArr2, i2));
    }

    public void onQuadDetection(int i, float[] fArr, float[] fArr2) {
        this.Camera2StreamConfigurationMap.getQuadDetectionCallback().onQuadDetection(new com.microblink.blinkid.metadata.detection.quad.DisplayableQuadDetection(i, fArr, fArr2));
    }

    public void setCameraOptions(boolean z, boolean z2) {
        if (z) {
            nativeSetMirrorType(this.getHighSpeedVideoSizes, z2 ? 1 : 2);
        } else if (z2) {
            nativeSetMirrorType(this.getHighSpeedVideoSizes, 3);
        } else {
            nativeSetMirrorType(this.getHighSpeedVideoSizes, 0);
        }
    }

    public void setMetadataCallbacks(com.microblink.blinkid.metadata.MetadataCallbacks metadataCallbacks) {
        this.Camera2StreamConfigurationMap = metadataCallbacks;
        nativeSetBaseCallbacks(this.getHighSpeedVideoSizes, metadataCallbacks.getFailedDetectionCallback() != null, metadataCallbacks.getPointsDetectionCallback() != null, this.Camera2StreamConfigurationMap.getQuadDetectionCallback() != null, this.Camera2StreamConfigurationMap.getDebugTextCallback() != null, this.Camera2StreamConfigurationMap.getDebugImageCallback() != null);
    }

    public void setNativeRecognizerWrapper(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper) {
        this.getHighSpeedVideoFpsRangesFor = nativeRecognizerWrapper;
    }

    public void setScanningRegion(com.microblink.blinkid.geometry.Rectangle rectangle) {
        if (rectangle == null) {
            rectangle = com.microblink.blinkid.geometry.Rectangle.getDefaultROI();
        }
        nativeSetScanningRegion(this.getHighSpeedVideoSizes, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }

    public void setVisiblePartRelativeDestination(com.microblink.blinkid.geometry.Rectangle rectangle) {
        if (rectangle == null) {
            rectangle = com.microblink.blinkid.geometry.Rectangle.getDefaultROI();
        }
        nativeSetVisiblePartRelativeDestination(this.getHighSpeedVideoSizes, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
    }
}
