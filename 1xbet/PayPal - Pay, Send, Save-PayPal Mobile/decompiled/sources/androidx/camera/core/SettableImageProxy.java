package androidx.camera.core;

/* loaded from: classes6.dex */
public final class SettableImageProxy extends androidx.camera.core.ForwardingImageProxy {
    private final int Camera2StreamConfigurationMap;
    private final androidx.camera.core.ImageInfo getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private android.graphics.Rect getHighSpeedVideoSizes;

    SettableImageProxy(androidx.camera.core.ImageProxy imageProxy, androidx.camera.core.ImageInfo imageInfo) {
        this(imageProxy, null, imageInfo);
    }

    public SettableImageProxy(androidx.camera.core.ImageProxy imageProxy, android.util.Size size, androidx.camera.core.ImageInfo imageInfo) {
        super(imageProxy);
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        if (size == null) {
            this.Camera2StreamConfigurationMap = super.getWidth();
            this.getHighSpeedVideoFpsRangesFor = super.getHeight();
        } else {
            this.Camera2StreamConfigurationMap = size.getWidth();
            this.getHighSpeedVideoFpsRangesFor = size.getHeight();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = imageInfo;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final android.graphics.Rect getCropRect() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoSizes == null) {
                return new android.graphics.Rect(0, 0, getWidth(), getHeight());
            }
            return new android.graphics.Rect(this.getHighSpeedVideoSizes);
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final void setCropRect(android.graphics.Rect rect) {
        if (rect != null) {
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizes = rect;
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getWidth() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final int getHeight() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
    public final androidx.camera.core.ImageInfo getImageInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
