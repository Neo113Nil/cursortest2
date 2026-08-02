package androidx.camera.view.transform;

/* loaded from: classes6.dex */
public final class CoordinateTransform {
    private final android.graphics.Matrix getHighSpeedVideoSizes;

    public CoordinateTransform(androidx.camera.view.transform.OutputTransform outputTransform, androidx.camera.view.transform.OutputTransform outputTransform2) {
        if (!androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(outputTransform.getHighResolutionOutputSizeshNQ4ISI, outputTransform2.getHighResolutionOutputSizeshNQ4ISI)) {
            androidx.camera.core.Logger.w("CoordinateTransform", java.lang.String.format("The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.", outputTransform.getHighResolutionOutputSizeshNQ4ISI, outputTransform2.getHighResolutionOutputSizeshNQ4ISI));
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.getHighSpeedVideoSizes = matrix;
        androidx.core.util.Preconditions.checkState(outputTransform.getMatrix().invert(matrix), "The source transform cannot be inverted");
        matrix.postConcat(outputTransform2.getMatrix());
    }

    public final void transform(android.graphics.Matrix matrix) {
        matrix.set(this.getHighSpeedVideoSizes);
    }

    public final void mapPoints(float[] fArr) {
        this.getHighSpeedVideoSizes.mapPoints(fArr);
    }

    public final void mapPoint(android.graphics.PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        this.getHighSpeedVideoSizes.mapPoints(fArr);
        pointF.x = fArr[0];
        pointF.y = fArr[1];
    }

    public final void mapRect(android.graphics.RectF rectF) {
        this.getHighSpeedVideoSizes.mapRect(rectF);
    }
}
