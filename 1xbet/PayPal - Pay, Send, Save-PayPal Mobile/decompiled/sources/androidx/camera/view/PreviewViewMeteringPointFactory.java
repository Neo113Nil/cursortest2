package androidx.camera.view;

/* loaded from: classes6.dex */
class PreviewViewMeteringPointFactory extends androidx.camera.core.MeteringPointFactory {
    static final android.graphics.PointF getHighSpeedVideoSizes = new android.graphics.PointF(2.0f, 2.0f);
    private android.graphics.Rect Camera2StreamConfigurationMap = null;
    private final androidx.camera.view.PreviewTransformation getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Matrix getHighSpeedVideoFpsRangesFor;

    PreviewViewMeteringPointFactory(androidx.camera.view.PreviewTransformation previewTransformation) {
        this.getHighResolutionOutputSizeshNQ4ISI = previewTransformation;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    public android.graphics.PointF convertPoint(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            android.graphics.Matrix matrix = this.getHighSpeedVideoFpsRangesFor;
            if (matrix == null) {
                return getHighSpeedVideoSizes;
            }
            matrix.mapPoints(fArr);
            return new android.graphics.PointF(fArr[0], fArr[1]);
        }
    }

    public final void getHighSpeedVideoFpsRanges(android.graphics.Rect rect) {
        setSurfaceAspectRatio(new android.util.Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.Camera2StreamConfigurationMap = rect;
        }
    }

    final void getHighSpeedVideoSizes(android.util.Size size, int i) {
        android.graphics.Rect rect;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        synchronized (this) {
            if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = this.Camera2StreamConfigurationMap) == null) {
                this.getHighSpeedVideoFpsRangesFor = null;
            } else {
                this.getHighSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(size, i, rect);
            }
        }
    }
}
