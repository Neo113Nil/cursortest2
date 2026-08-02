package androidx.camera.core;

/* loaded from: classes6.dex */
class AndroidImageReaderProxy implements androidx.camera.core.impl.ImageReaderProxy {
    private final android.media.ImageReader getHighSpeedVideoFpsRangesFor;
    final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    boolean getHighResolutionOutputSizeshNQ4ISI = true;

    AndroidImageReaderProxy(android.media.ImageReader imageReader) {
        this.getHighSpeedVideoFpsRangesFor = imageReader;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        android.media.Image image;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                image = this.getHighSpeedVideoFpsRangesFor.acquireLatestImage();
            } catch (java.lang.RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.AndroidImageProxy(image);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        android.media.Image image;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                image = this.getHighSpeedVideoFpsRangesFor.acquireNextImage();
            } catch (java.lang.RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new androidx.camera.core.AndroidImageProxy(image);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor.close();
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            height = this.getHighSpeedVideoFpsRangesFor.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            width = this.getHighSpeedVideoFpsRangesFor.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            imageFormat = this.getHighSpeedVideoFpsRangesFor.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            maxImages = this.getHighSpeedVideoFpsRangesFor.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        android.view.Surface surface;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            surface = this.getHighSpeedVideoFpsRangesFor.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final java.util.concurrent.Executor executor) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoFpsRangesFor.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda1
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(android.media.ImageReader imageReader) {
                    final androidx.camera.core.AndroidImageReaderProxy androidImageReaderProxy = androidx.camera.core.AndroidImageReaderProxy.this;
                    java.util.concurrent.Executor executor2 = executor;
                    final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener2 = onImageAvailableListener;
                    synchronized (androidImageReaderProxy.getHighSpeedVideoFpsRanges) {
                        if (!androidImageReaderProxy.getHighResolutionOutputSizeshNQ4ISI) {
                            executor2.execute(new java.lang.Runnable() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    onImageAvailableListener2.onImageAvailable(androidx.camera.core.AndroidImageReaderProxy.this);
                                }
                            });
                        }
                    }
                }
            }, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoFpsRangesFor.setOnImageAvailableListener(null, null);
        }
    }
}
