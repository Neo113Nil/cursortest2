package androidx.camera.view.transform;

/* loaded from: classes6.dex */
public final class OutputTransform {
    final android.graphics.Matrix Camera2StreamConfigurationMap;
    final android.util.Size getHighResolutionOutputSizeshNQ4ISI;

    public OutputTransform(android.graphics.Matrix matrix, android.util.Size size) {
        this.Camera2StreamConfigurationMap = matrix;
        this.getHighResolutionOutputSizeshNQ4ISI = size;
    }

    public final android.graphics.Matrix getMatrix() {
        return this.Camera2StreamConfigurationMap;
    }
}
