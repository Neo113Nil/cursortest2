package androidx.camera.core;

/* loaded from: classes6.dex */
final class SingleCloseImageProxy extends androidx.camera.core.ForwardingImageProxy {
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoSizes;

    SingleCloseImageProxy(androidx.camera.core.ImageProxy imageProxy) {
        super(imageProxy);
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        if (this.getHighSpeedVideoSizes.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
