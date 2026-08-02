package androidx.transition;

/* loaded from: classes3.dex */
class ViewUtilsApi29 extends androidx.transition.ViewUtilsApi23 {
    ViewUtilsApi29() {
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void getHighSpeedVideoSizes(android.view.View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.ViewUtilsApi19
    public float getHighSpeedVideoFpsRangesFor(android.view.View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsApi19
    public void Camera2StreamConfigurationMap(android.view.View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsApi19
    public void getHighSpeedVideoFpsRangesFor(android.view.View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void getHighSpeedVideoSizes(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void getHighSpeedVideoFpsRanges(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsApi19
    public void Camera2StreamConfigurationMap(android.view.View view, android.graphics.Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
