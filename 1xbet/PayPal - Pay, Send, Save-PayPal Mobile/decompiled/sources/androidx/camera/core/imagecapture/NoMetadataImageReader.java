package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class NoMetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy {
    androidx.camera.core.imagecapture.ProcessingRequest Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.ImageReaderProxy getHighSpeedVideoSizes;

    NoMetadataImageReader(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.getHighSpeedVideoSizes = imageReaderProxy;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.acquireLatestImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.acquireNextImage());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        this.getHighSpeedVideoSizes.close();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        return this.getHighSpeedVideoSizes.getHeight();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        return this.getHighSpeedVideoSizes.getWidth();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        return this.getHighSpeedVideoSizes.getImageFormat();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        return this.getHighSpeedVideoSizes.getMaxImages();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        return this.getHighSpeedVideoSizes.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoSizes.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.imagecapture.NoMetadataImageReader$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                onImageAvailableListener.onImageAvailable(androidx.camera.core.imagecapture.NoMetadataImageReader.this);
            }
        }, executor);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        this.getHighSpeedVideoSizes.clearOnImageAvailableListener();
    }

    private androidx.camera.core.ImageProxy getHighSpeedVideoFpsRanges(androidx.camera.core.ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = this.Camera2StreamConfigurationMap;
        androidx.camera.core.impl.TagBundle emptyBundle = processingRequest == null ? androidx.camera.core.impl.TagBundle.emptyBundle() : androidx.camera.core.impl.TagBundle.create(new android.util.Pair(processingRequest.getOutputStallDuration, this.Camera2StreamConfigurationMap.getOutputSizes.get(0)));
        this.Camera2StreamConfigurationMap = null;
        return new androidx.camera.core.SettableImageProxy(imageProxy, new android.util.Size(imageProxy.getWidth(), imageProxy.getHeight()), new androidx.camera.core.internal.CameraCaptureResultImageInfo(new androidx.camera.core.streamsharing.VirtualCameraCaptureResult(emptyBundle, imageProxy.getImageInfo().getTimestamp())));
    }
}
