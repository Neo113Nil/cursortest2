package androidx.camera.core;

/* loaded from: classes6.dex */
public class MetadataImageReader implements androidx.camera.core.impl.ImageReaderProxy, androidx.camera.core.ForwardingImageProxy.OnImageCloseListener {
    final java.lang.Object Camera2StreamConfigurationMap;
    androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener getHighResolutionOutputSizeshNQ4ISI;
    final android.util.LongSparseArray<androidx.camera.core.ImageInfo> getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final java.util.List<androidx.camera.core.ImageProxy> getInputFormats;
    private androidx.camera.core.impl.CameraCaptureCallback getInputSizeshNQ4ISI;
    private final androidx.camera.core.impl.ImageReaderProxy getOutputFormats;
    private java.util.concurrent.Executor getOutputMinFrameDuration;
    private androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener getOutputMinFrameDurationlomOqCM;
    private final android.util.LongSparseArray<androidx.camera.core.ImageProxy> getOutputSizes;
    private final java.util.List<androidx.camera.core.ImageProxy> getOutputStallDuration;

    private MetadataImageReader(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getInputSizeshNQ4ISI = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.core.MetadataImageReader.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(int i, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                super.onCaptureCompleted(i, cameraCaptureResult);
                androidx.camera.core.MetadataImageReader metadataImageReader = androidx.camera.core.MetadataImageReader.this;
                synchronized (metadataImageReader.Camera2StreamConfigurationMap) {
                    if (metadataImageReader.getHighSpeedVideoFpsRangesFor) {
                        return;
                    }
                    metadataImageReader.getHighSpeedVideoFpsRanges.put(cameraCaptureResult.getTimestamp(), new androidx.camera.core.internal.CameraCaptureResultImageInfo(cameraCaptureResult));
                    metadataImageReader.Camera2StreamConfigurationMap();
                }
            }
        };
        this.getHighSpeedVideoSizes = 0;
        this.getOutputMinFrameDurationlomOqCM = new androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.MetadataImageReader$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy2) {
                androidx.camera.core.MetadataImageReader metadataImageReader = androidx.camera.core.MetadataImageReader.this;
                synchronized (metadataImageReader.Camera2StreamConfigurationMap) {
                    metadataImageReader.getHighSpeedVideoSizes++;
                }
                metadataImageReader.Camera2StreamConfigurationMap(imageReaderProxy2);
            }
        };
        this.getHighSpeedVideoFpsRangesFor = false;
        this.getHighSpeedVideoFpsRanges = new android.util.LongSparseArray<>();
        this.getOutputSizes = new android.util.LongSparseArray<>();
        this.getInputFormats = new java.util.ArrayList();
        this.getOutputFormats = imageReaderProxy;
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputStallDuration = new java.util.ArrayList(getMaxImages());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireLatestImage() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getOutputStallDuration.isEmpty()) {
                return null;
            }
            if (this.getHighSpeedVideoSizesFor >= this.getOutputStallDuration.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i = 0; i < this.getOutputStallDuration.size() - 1; i++) {
                if (!this.getInputFormats.contains(this.getOutputStallDuration.get(i))) {
                    arrayList.add(this.getOutputStallDuration.get(i));
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.ImageProxy) it.next()).close();
            }
            int size = this.getOutputStallDuration.size();
            java.util.List<androidx.camera.core.ImageProxy> list = this.getOutputStallDuration;
            this.getHighSpeedVideoSizesFor = size;
            androidx.camera.core.ImageProxy imageProxy = list.get(size - 1);
            this.getInputFormats.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public androidx.camera.core.ImageProxy acquireNextImage() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getOutputStallDuration.isEmpty()) {
                return null;
            }
            if (this.getHighSpeedVideoSizesFor >= this.getOutputStallDuration.size()) {
                throw new java.lang.IllegalStateException("Maximum image number reached.");
            }
            java.util.List<androidx.camera.core.ImageProxy> list = this.getOutputStallDuration;
            int i = this.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoSizesFor = i + 1;
            androidx.camera.core.ImageProxy imageProxy = list.get(i);
            this.getInputFormats.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.getOutputStallDuration).iterator();
            while (it.hasNext()) {
                ((androidx.camera.core.ImageProxy) it.next()).close();
            }
            this.getOutputStallDuration.clear();
            this.getOutputFormats.close();
            this.getHighSpeedVideoFpsRangesFor = true;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.Camera2StreamConfigurationMap) {
            height = this.getOutputFormats.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.Camera2StreamConfigurationMap) {
            width = this.getOutputFormats.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.Camera2StreamConfigurationMap) {
            imageFormat = this.getOutputFormats.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.Camera2StreamConfigurationMap) {
            maxImages = this.getOutputFormats.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public android.view.Surface getSurface() {
        android.view.Surface surface;
        synchronized (this.Camera2StreamConfigurationMap) {
            surface = this.getOutputFormats.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, java.util.concurrent.Executor executor) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI = (androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener) androidx.core.util.Preconditions.checkNotNull(onImageAvailableListener);
            this.getOutputMinFrameDuration = (java.util.concurrent.Executor) androidx.core.util.Preconditions.checkNotNull(executor);
            this.getOutputFormats.setOnImageAvailableListener(this.getOutputMinFrameDurationlomOqCM, executor);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getOutputFormats.clearOnImageAvailableListener();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = null;
            this.getHighSpeedVideoSizes = 0;
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
        synchronized (this.Camera2StreamConfigurationMap) {
            synchronized (this.Camera2StreamConfigurationMap) {
                int indexOf = this.getOutputStallDuration.indexOf(imageProxy);
                if (indexOf >= 0) {
                    this.getOutputStallDuration.remove(indexOf);
                    int i = this.getHighSpeedVideoSizesFor;
                    if (indexOf <= i) {
                        this.getHighSpeedVideoSizesFor = i - 1;
                    }
                }
                this.getInputFormats.remove(imageProxy);
                if (this.getHighSpeedVideoSizes > 0) {
                    Camera2StreamConfigurationMap(this.getOutputFormats);
                }
            }
        }
    }

    public androidx.camera.core.impl.CameraCaptureCallback getCameraCaptureCallback() {
        return this.getInputSizeshNQ4ISI;
    }

    final void Camera2StreamConfigurationMap(androidx.camera.core.impl.ImageReaderProxy imageReaderProxy) {
        androidx.camera.core.ImageProxy imageProxy;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            int size = this.getOutputSizes.size() + this.getOutputStallDuration.size();
            if (size >= imageReaderProxy.getMaxImages()) {
                androidx.camera.core.Logger.d("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                return;
            }
            do {
                try {
                    imageProxy = imageReaderProxy.acquireNextImage();
                    if (imageProxy != null) {
                        this.getHighSpeedVideoSizes--;
                        size++;
                        this.getOutputSizes.put(imageProxy.getImageInfo().getTimestamp(), imageProxy);
                        Camera2StreamConfigurationMap();
                    }
                } catch (java.lang.IllegalStateException e) {
                    androidx.camera.core.Logger.d("MetadataImageReader", "Failed to acquire next image.", e);
                    imageProxy = null;
                }
                if (imageProxy == null || this.getHighSpeedVideoSizes <= 0) {
                    break;
                }
            } while (size < imageReaderProxy.getMaxImages());
        }
    }

    final void Camera2StreamConfigurationMap() {
        final androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        java.util.concurrent.Executor executor;
        synchronized (this.Camera2StreamConfigurationMap) {
            for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
                androidx.camera.core.ImageInfo valueAt = this.getHighSpeedVideoFpsRanges.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                androidx.camera.core.ImageProxy imageProxy = this.getOutputSizes.get(timestamp);
                if (imageProxy != null) {
                    this.getOutputSizes.remove(timestamp);
                    this.getHighSpeedVideoFpsRanges.removeAt(size);
                    androidx.camera.core.SettableImageProxy settableImageProxy = new androidx.camera.core.SettableImageProxy(imageProxy, valueAt);
                    synchronized (this.Camera2StreamConfigurationMap) {
                        if (this.getOutputStallDuration.size() < getMaxImages()) {
                            settableImageProxy.addOnImageCloseListener(this);
                            this.getOutputStallDuration.add(settableImageProxy);
                            onImageAvailableListener = this.getHighResolutionOutputSizeshNQ4ISI;
                            executor = this.getOutputMinFrameDuration;
                        } else {
                            androidx.camera.core.Logger.d("TAG", "Maximum image number reached.");
                            settableImageProxy.close();
                            onImageAvailableListener = null;
                            executor = null;
                        }
                    }
                    if (onImageAvailableListener != null) {
                        if (executor != null) {
                            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.MetadataImageReader$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    onImageAvailableListener.onImageAvailable(androidx.camera.core.MetadataImageReader.this);
                                }
                            });
                        } else {
                            onImageAvailableListener.onImageAvailable(this);
                        }
                    }
                }
            }
            synchronized (this.Camera2StreamConfigurationMap) {
                if (this.getOutputSizes.size() != 0 && this.getHighSpeedVideoFpsRanges.size() != 0) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(this.getOutputSizes.keyAt(0));
                    java.lang.Long valueOf2 = java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges.keyAt(0));
                    androidx.core.util.Preconditions.checkArgument(!valueOf2.equals(valueOf));
                    if (valueOf2.longValue() > valueOf.longValue()) {
                        for (int size2 = this.getOutputSizes.size() - 1; size2 >= 0; size2--) {
                            if (this.getOutputSizes.keyAt(size2) < valueOf2.longValue()) {
                                this.getOutputSizes.valueAt(size2).close();
                                this.getOutputSizes.removeAt(size2);
                            }
                        }
                    } else {
                        for (int size3 = this.getHighSpeedVideoFpsRanges.size() - 1; size3 >= 0; size3--) {
                            if (this.getHighSpeedVideoFpsRanges.keyAt(size3) < valueOf.longValue()) {
                                this.getHighSpeedVideoFpsRanges.removeAt(size3);
                            }
                        }
                    }
                }
            }
        }
    }

    public MetadataImageReader(int i, int i2, int i3, int i4) {
        this(new androidx.camera.core.AndroidImageReaderProxy(android.media.ImageReader.newInstance(i, i2, i3, i4)));
    }
}
