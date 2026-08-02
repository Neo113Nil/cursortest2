package O0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class v extends u {
    @Override // Q0.a
    public final float D(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // Q0.a
    public final void S(View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override // O0.u, Q0.a
    public final void T(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override // O0.u
    public final void p0(View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // O0.u
    public final void q0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // O0.u
    public final void r0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
