package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public final class RgbaImageProxy implements androidx.camera.core.ImageProxy {
    private final android.graphics.Rect Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    androidx.camera.core.ImageProxy.PlaneProxy[] getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.ImageInfo getHighSpeedVideoSizes;
    private final int getOutputMinFrameDuration;

    public RgbaImageProxy(androidx.camera.core.processing.Packet<android.graphics.Bitmap> packet) {
        this(packet.getData(), packet.getCropRect(), packet.getRotationDegrees(), packet.getSensorToBufferTransform(), packet.getCameraCaptureResult().getTimestamp());
    }

    public RgbaImageProxy(android.graphics.Bitmap bitmap, android.graphics.Rect rect, int i, android.graphics.Matrix matrix, long j) {
        this(androidx.camera.core.internal.utils.ImageUtil.createDirectByteBuffer(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i, matrix, j);
    }

    public RgbaImageProxy(final java.nio.ByteBuffer byteBuffer, final int i, int i2, int i3, android.graphics.Rect rect, final int i4, final android.graphics.Matrix matrix, final long j) {
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        this.getOutputMinFrameDuration = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.Camera2StreamConfigurationMap = rect;
        this.getHighSpeedVideoSizes = new androidx.camera.core.ImageInfo() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.2
            @Override // androidx.camera.core.ImageInfo
            public androidx.camera.core.impl.TagBundle getTagBundle() {
                throw new java.lang.UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
            }

            @Override // androidx.camera.core.ImageInfo
            public long getTimestamp() {
                return j;
            }

            @Override // androidx.camera.core.ImageInfo
            public int getRotationDegrees() {
                return i4;
            }

            @Override // androidx.camera.core.ImageInfo
            public android.graphics.Matrix getSensorToBufferTransformMatrix() {
                return new android.graphics.Matrix(matrix);
            }

            @Override // androidx.camera.core.ImageInfo
            public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
                throw new java.lang.UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
            }
        };
        byteBuffer.rewind();
        final int i5 = i2 * i;
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.ImageProxy.PlaneProxy[]{new androidx.camera.core.ImageProxy.PlaneProxy() { // from class: androidx.camera.core.imagecapture.RgbaImageProxy.1
            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getRowStride() {
                return i5;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public int getPixelStride() {
                return i;
            }

            @Override // androidx.camera.core.ImageProxy.PlaneProxy
            public java.nio.ByteBuffer getBuffer() {
                return byteBuffer;
            }
        }};
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public final android.graphics.Rect getCropRect() {
        android.graphics.Rect rect;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            rect = this.Camera2StreamConfigurationMap;
        }
        return rect;
    }

    @Override // androidx.camera.core.ImageProxy
    public final void setCropRect(android.graphics.Rect rect) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            if (rect != null) {
                this.Camera2StreamConfigurationMap.set(rect);
            }
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
        }
        return 1;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        int i;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            i = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return i;
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        int i;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            i = this.getOutputMinFrameDuration;
        }
        return i;
    }

    @Override // androidx.camera.core.ImageProxy
    public final androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        androidx.camera.core.ImageProxy.PlaneProxy[] planeProxyArr;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            planeProxyArr = (androidx.camera.core.ImageProxy.PlaneProxy[]) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor);
        }
        return planeProxyArr;
    }

    @Override // androidx.camera.core.ImageProxy
    public final androidx.camera.core.ImageInfo getImageInfo() {
        androidx.camera.core.ImageInfo imageInfo;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            imageInfo = this.getHighSpeedVideoSizes;
        }
        return imageInfo;
    }

    @Override // androidx.camera.core.ImageProxy
    public final android.media.Image getImage() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
        }
        return null;
    }

    public final android.graphics.Bitmap createBitmap() {
        android.graphics.Bitmap createBitmapFromPlane;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            createBitmapFromPlane = androidx.camera.core.internal.utils.ImageUtil.createBitmapFromPlane(getPlanes(), getWidth(), getHeight());
        }
        return createBitmapFromPlane;
    }

    private void getHighSpeedVideoFpsRanges() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            androidx.core.util.Preconditions.checkState(this.getHighSpeedVideoFpsRangesFor != null, "The image is closed.");
        }
    }
}
