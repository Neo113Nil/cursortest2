package androidx.camera.core;

/* loaded from: classes6.dex */
public class SafeCloseImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    androidx.camera.core.ForwardingImageProxy.OnImageCloseListener getHighResolutionOutputSizeshNQ4ISI;
    private final android.view.Surface getInputSizeshNQ4ISI;
    private final androidx.camera.core.impl.ImageReaderProxy getOutputMinFrameDuration;
    final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    int Camera2StreamConfigurationMap = 0;
    boolean getHighSpeedVideoFpsRanges = false;
    private final androidx.camera.core.ForwardingImageProxy.OnImageCloseListener getHighSpeedVideoSizes = new androidx.camera.core.ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda1
        @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
        public final void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
            androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener;
            androidx.camera.core.SafeCloseImageReaderProxy safeCloseImageReaderProxy = androidx.camera.core.SafeCloseImageReaderProxy.this;
            synchronized (safeCloseImageReaderProxy.getHighSpeedVideoFpsRangesFor) {
                int i = safeCloseImageReaderProxy.Camera2StreamConfigurationMap - 1;
                safeCloseImageReaderProxy.Camera2StreamConfigurationMap = i;
                if (safeCloseImageReaderProxy.getHighSpeedVideoFpsRanges && i == 0) {
                    safeCloseImageReaderProxy.close();
                }
                onImageCloseListener = safeCloseImageReaderProxy.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (onImageCloseListener != null) {
                onImageCloseListener.onImageClose(imageProxy);
            }
        }
    };

    public SafeCloseImageReaderProxy(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.getOutputMinFrameDuration = imageReaderProxy;
        this.getInputSizeshNQ4ISI = imageReaderProxy.getSurface();
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        androidx.camera.core.ImageProxy Camera2StreamConfigurationMap;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getOutputMinFrameDuration.acquireLatestImage());
        }
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        androidx.camera.core.ImageProxy Camera2StreamConfigurationMap;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getOutputMinFrameDuration.acquireNextImage());
        }
        return Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            android.view.Surface surface = this.getInputSizeshNQ4ISI;
            if (surface != null) {
                surface.release();
            }
            this.getOutputMinFrameDuration.close();
        }
    }

    private androidx.camera.core.ImageProxy Camera2StreamConfigurationMap(androidx.camera.core.ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        this.Camera2StreamConfigurationMap++;
        androidx.camera.core.SingleCloseImageProxy singleCloseImageProxy = new androidx.camera.core.SingleCloseImageProxy(imageProxy);
        singleCloseImageProxy.addOnImageCloseListener(this.getHighSpeedVideoSizes);
        return singleCloseImageProxy;
    }

    public void safeClose() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRanges = true;
            this.getOutputMinFrameDuration.clearOnImageAvailableListener();
            if (this.Camera2StreamConfigurationMap == 0) {
                close();
            }
        }
    }

    public boolean isClosed() {
        boolean z;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            z = this.getHighSpeedVideoFpsRanges;
        }
        return z;
    }

    public int getCapacity() {
        int maxImages;
        int i;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            maxImages = this.getOutputMinFrameDuration.getMaxImages();
            i = this.Camera2StreamConfigurationMap;
        }
        return maxImages - i;
    }

    public void setOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighResolutionOutputSizeshNQ4ISI = onImageCloseListener;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            height = this.getOutputMinFrameDuration.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            width = this.getOutputMinFrameDuration.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            imageFormat = this.getOutputMinFrameDuration.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            maxImages = this.getOutputMinFrameDuration.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        android.view.Surface surface;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            surface = this.getOutputMinFrameDuration.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getOutputMinFrameDuration.setOnImageAvailableListener(new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.SafeCloseImageReaderProxy$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
                    onImageAvailableListener.onImageAvailable(androidx.camera.core.SafeCloseImageReaderProxy.this);
                }
            }, executor);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getOutputMinFrameDuration.clearOnImageAvailableListener();
        }
    }

    public androidx.camera.core.impl.ImageReaderProxy getImageReaderProxy() {
        androidx.camera.core.impl.ImageReaderProxy imageReaderProxy;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            imageReaderProxy = this.getOutputMinFrameDuration;
        }
        return imageReaderProxy;
    }
}
