package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\t\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi29;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "<init>", "()V", "Landroid/view/View;", "p0", "Landroidx/compose/ui/graphics/Matrix;", "p1", "", "Camera2StreamConfigurationMap", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "getHighSpeedVideoSizes", "Landroid/graphics/Matrix;", "", "getHighSpeedVideoFpsRangesFor", "[I", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CalculateMatrixToWindowApi29 implements androidx.compose.ui.platform.CalculateMatrixToWindow {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.graphics.Matrix Camera2StreamConfigurationMap = new android.graphics.Matrix();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int[] getHighSpeedVideoFpsRanges = new int[2];

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    public final void Camera2StreamConfigurationMap(android.view.View p0, float[] p1) {
        this.Camera2StreamConfigurationMap.reset();
        p0.transformMatrixToGlobal(this.Camera2StreamConfigurationMap);
        android.view.ViewParent parent = p0.getParent();
        while (parent instanceof android.view.View) {
            p0 = parent;
            parent = p0.getParent();
        }
        p0.getLocationOnScreen(this.getHighSpeedVideoFpsRanges);
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i = iArr[0];
        int i2 = iArr[1];
        p0.getLocationInWindow(iArr);
        int[] iArr2 = this.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5865setFromtUYjHk(p1, this.Camera2StreamConfigurationMap);
    }
}
