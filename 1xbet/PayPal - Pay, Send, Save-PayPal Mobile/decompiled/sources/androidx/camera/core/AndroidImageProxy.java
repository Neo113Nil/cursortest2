package androidx.camera.core;

/* loaded from: classes6.dex */
final class AndroidImageProxy implements androidx.camera.core.ImageProxy {
    private final androidx.camera.core.AndroidImageProxy.PlaneProxy[] Camera2StreamConfigurationMap;
    private final androidx.camera.core.ImageInfo getHighResolutionOutputSizeshNQ4ISI;
    private final android.media.Image getHighSpeedVideoFpsRanges;

    AndroidImageProxy(android.media.Image image) {
        this.getHighSpeedVideoFpsRanges = image;
        android.media.Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.Camera2StreamConfigurationMap = new androidx.camera.core.AndroidImageProxy.PlaneProxy[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.Camera2StreamConfigurationMap[i] = new androidx.camera.core.AndroidImageProxy.PlaneProxy(planes[i]);
            }
        } else {
            this.Camera2StreamConfigurationMap = new androidx.camera.core.AndroidImageProxy.PlaneProxy[0];
        }
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.ImmutableImageInfo.create(androidx.camera.core.impl.TagBundle.emptyBundle(), image.getTimestamp(), 0, new android.graphics.Matrix(), 0);
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // androidx.camera.core.ImageProxy
    public final android.graphics.Rect getCropRect() {
        return this.getHighSpeedVideoFpsRanges.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public final void setCropRect(android.graphics.Rect rect) {
        this.getHighSpeedVideoFpsRanges.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getFormat() {
        return this.getHighSpeedVideoFpsRanges.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.getHighSpeedVideoFpsRanges.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.getHighSpeedVideoFpsRanges.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public final androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        return this.Camera2StreamConfigurationMap;
    }

    static final class PlaneProxy implements androidx.camera.core.ImageProxy.PlaneProxy {
        private final android.media.Image.Plane getHighResolutionOutputSizeshNQ4ISI;

        PlaneProxy(android.media.Image.Plane plane) {
            this.getHighResolutionOutputSizeshNQ4ISI = plane;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int getRowStride() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getRowStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final int getPixelStride() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getPixelStride();
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        public final java.nio.ByteBuffer getBuffer() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getBuffer();
        }
    }

    @Override // androidx.camera.core.ImageProxy
    public final androidx.camera.core.ImageInfo getImageInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.core.ImageProxy
    public final android.media.Image getImage() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
