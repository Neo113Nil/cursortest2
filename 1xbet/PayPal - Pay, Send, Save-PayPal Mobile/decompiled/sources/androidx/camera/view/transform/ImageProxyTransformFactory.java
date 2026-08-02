package androidx.camera.view.transform;

/* loaded from: classes6.dex */
public final class ImageProxyTransformFactory {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    public final void setUsingCropRect(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public final boolean isUsingCropRect() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setUsingRotationDegrees(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final boolean isUsingRotationDegrees() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final androidx.camera.view.transform.OutputTransform getOutputTransform(androidx.camera.core.ImageProxy imageProxy) {
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        int rotationDegrees = this.getHighSpeedVideoFpsRanges ? imageProxy.getImageInfo().getRotationDegrees() : 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            rectF = new android.graphics.RectF(imageProxy.getCropRect());
        } else {
            rectF = new android.graphics.RectF(0.0f, 0.0f, imageProxy.getWidth(), imageProxy.getHeight());
        }
        if (androidx.camera.core.impl.utils.TransformUtils.is90or270(rotationDegrees)) {
            rectF2 = new android.graphics.RectF(0.0f, 0.0f, rectF.height(), rectF.width());
        } else {
            rectF2 = new android.graphics.RectF(0.0f, 0.0f, rectF.width(), rectF.height());
        }
        android.graphics.Matrix rectToRect = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(rectF, rectF2, rotationDegrees);
        rectToRect.preConcat(androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(imageProxy.getCropRect()));
        return new androidx.camera.view.transform.OutputTransform(rectToRect, androidx.camera.core.impl.utils.TransformUtils.rectToSize(imageProxy.getCropRect()));
    }
}
