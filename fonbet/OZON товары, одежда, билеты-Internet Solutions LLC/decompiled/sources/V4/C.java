package V4;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class C extends B {
    @Override // V4.z
    public final float a(@NonNull View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // V4.z
    public final void b(@NonNull View view, int i11, int i12, int i13, int i14) {
        view.setLeftTopRightBottom(i11, i12, i13, i14);
    }

    @Override // V4.z
    public final void c(@NonNull View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // V4.B, V4.z
    public final void d(int i11, @NonNull View view) {
        view.setTransitionVisibility(i11);
    }

    @Override // V4.z
    public final void e(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // V4.z
    public final void f(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
