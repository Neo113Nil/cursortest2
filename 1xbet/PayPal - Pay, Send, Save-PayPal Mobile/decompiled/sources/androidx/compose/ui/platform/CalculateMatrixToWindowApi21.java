package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\r\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\t\u0010\u0010R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\r\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroidx/compose/ui/graphics/Matrix;", "p0", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "p1", "", "Camera2StreamConfigurationMap", "(Landroid/view/View;[F)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Matrix;", "getHighSpeedVideoFpsRangesFor", "([FLandroid/graphics/Matrix;)V", "", "([FFF)V", "getHighSpeedVideoFpsRanges", "[F", "", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class CalculateMatrixToWindowApi21 implements androidx.compose.ui.platform.CalculateMatrixToWindow {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final float[] getHighResolutionOutputSizeshNQ4ISI;
    private final int[] getHighSpeedVideoFpsRangesFor;

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = fArr;
        this.getHighSpeedVideoFpsRangesFor = new int[2];
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    public final void Camera2StreamConfigurationMap(android.view.View p0, float[] p1) {
        androidx.compose.ui.graphics.Matrix.m6232resetimpl(p1);
        getHighResolutionOutputSizeshNQ4ISI(p0, p1);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(android.view.View p0, float[] p1) {
        java.lang.Object parent = p0.getParent();
        if (parent instanceof android.view.View) {
            getHighResolutionOutputSizeshNQ4ISI((android.view.View) parent, p1);
            Camera2StreamConfigurationMap(p1, -p0.getScrollX(), -p0.getScrollY());
            Camera2StreamConfigurationMap(p1, p0.getLeft(), p0.getTop());
        } else {
            p0.getLocationInWindow(this.getHighSpeedVideoFpsRangesFor);
            Camera2StreamConfigurationMap(p1, -p0.getScrollX(), -p0.getScrollY());
            Camera2StreamConfigurationMap(p1, r0[0], r0[1]);
        }
        android.graphics.Matrix matrix = p0.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(p1, matrix);
    }

    private final void getHighSpeedVideoFpsRangesFor(float[] fArr, android.graphics.Matrix matrix) {
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5865setFromtUYjHk(this.getHighResolutionOutputSizeshNQ4ISI, matrix);
        androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoFpsRanges(fArr, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    private final void Camera2StreamConfigurationMap(float[] fArr, float f, float f2) {
        androidx.compose.ui.platform.AndroidComposeView_androidKt.getHighSpeedVideoSizes(fArr, f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }
}
