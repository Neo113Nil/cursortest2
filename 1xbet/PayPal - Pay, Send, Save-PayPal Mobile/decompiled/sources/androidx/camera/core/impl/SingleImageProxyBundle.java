package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class SingleImageProxyBundle implements androidx.camera.core.impl.ImageProxyBundle {
    private final androidx.camera.core.ImageProxy getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    public SingleImageProxyBundle(androidx.camera.core.ImageProxy imageProxy, java.lang.String str) {
        androidx.camera.core.ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo == null) {
            throw new java.lang.IllegalArgumentException("ImageProxy has no associated ImageInfo");
        }
        java.lang.Integer num = (java.lang.Integer) imageInfo.getTagBundle().getTag(str);
        if (num == null) {
            throw new java.lang.IllegalArgumentException("ImageProxy has no associated tag");
        }
        this.getHighSpeedVideoFpsRangesFor = num.intValue();
        this.getHighResolutionOutputSizeshNQ4ISI = imageProxy;
    }

    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.ImageProxy> getImageProxy(int i) {
        if (i != this.getHighSpeedVideoFpsRangesFor) {
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public final java.util.List<java.lang.Integer> getCaptureIds() {
        return java.util.Collections.singletonList(java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor));
    }
}
