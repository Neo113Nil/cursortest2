package A0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class C0 implements B0 {

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f159k = new Matrix();

    /* renamed from: l, reason: collision with root package name */
    public final int[] f160l = new int[2];

    @Override // A0.B0
    public void c(View view, float[] fArr) {
        Matrix matrix = this.f159k;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f160l;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i5 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i5);
        i0.F.o(matrix, fArr);
    }
}
