package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR:\u0010\u0012\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/graphics/TransformShader;", "", "<init>", "()V", "Landroid/graphics/Matrix;", "getHighSpeedVideoFpsRangesFor", "()Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "transform-Q8lPUPs", "([F)V", "transform", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Matrix;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "shader", "Landroid/graphics/Shader;", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformShader {
    public static final int $stable = 8;
    private android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Shader shader;

    private final android.graphics.Matrix getHighSpeedVideoFpsRangesFor() {
        android.graphics.Matrix matrix = this.getHighResolutionOutputSizeshNQ4ISI;
        if (matrix != null) {
            return matrix;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        this.getHighResolutionOutputSizeshNQ4ISI = matrix2;
        return matrix2;
    }

    /* renamed from: transform-Q8lPUPs, reason: not valid java name */
    public final void m6379transformQ8lPUPs(float[] matrix) {
        android.graphics.Matrix matrix2;
        if (matrix == null) {
            matrix2 = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        } else {
            android.graphics.Matrix highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(highSpeedVideoFpsRangesFor, matrix);
            matrix2 = highSpeedVideoFpsRangesFor;
        }
        android.graphics.Shader shader = this.shader;
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final android.graphics.Shader getShader() {
        return this.shader;
    }

    public final void setShader(android.graphics.Shader shader) {
        android.graphics.Matrix matrix = this.getHighResolutionOutputSizeshNQ4ISI;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.shader = shader;
    }
}
