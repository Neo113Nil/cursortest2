package androidx.camera.core;

/* loaded from: classes6.dex */
public abstract class ForwardingImageProxy implements androidx.camera.core.ImageProxy {
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private final java.util.Set<androidx.camera.core.ForwardingImageProxy.OnImageCloseListener> getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
    protected final androidx.camera.core.ImageProxy mImage;

    public interface OnImageCloseListener {
        void onImageClose(androidx.camera.core.ImageProxy imageProxy);
    }

    protected ForwardingImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        this.mImage = imageProxy;
    }

    @Override // androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        this.mImage.close();
        notifyOnImageCloseListeners();
    }

    @Override // androidx.camera.core.ImageProxy
    public android.graphics.Rect getCropRect() {
        return this.mImage.getCropRect();
    }

    @Override // androidx.camera.core.ImageProxy
    public void setCropRect(android.graphics.Rect rect) {
        this.mImage.setCropRect(rect);
    }

    @Override // androidx.camera.core.ImageProxy
    public int getFormat() {
        return this.mImage.getFormat();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getHeight() {
        return this.mImage.getHeight();
    }

    @Override // androidx.camera.core.ImageProxy
    public int getWidth() {
        return this.mImage.getWidth();
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageProxy.PlaneProxy[] getPlanes() {
        return this.mImage.getPlanes();
    }

    @Override // androidx.camera.core.ImageProxy
    public androidx.camera.core.ImageInfo getImageInfo() {
        return this.mImage.getImageInfo();
    }

    @Override // androidx.camera.core.ImageProxy
    public android.media.Image getImage() {
        return this.mImage.getImage();
    }

    public void addOnImageCloseListener(androidx.camera.core.ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.add(onImageCloseListener);
        }
    }

    protected void notifyOnImageCloseListeners() {
        java.util.HashSet hashSet;
        synchronized (this.Camera2StreamConfigurationMap) {
            hashSet = new java.util.HashSet(this.getHighSpeedVideoFpsRangesFor);
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((androidx.camera.core.ForwardingImageProxy.OnImageCloseListener) it.next()).onImageClose(this);
        }
    }
}
