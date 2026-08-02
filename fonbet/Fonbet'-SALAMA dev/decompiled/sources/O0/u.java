package O0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class u extends Q0.a {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f4899m = true;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f4900n = true;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f4901o = true;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f4902p = true;

    @Override // Q0.a
    public void T(View view, int i7) {
        if (Build.VERSION.SDK_INT == 28) {
            super.T(view, i7);
        } else if (f4902p) {
            try {
                view.setTransitionVisibility(i7);
            } catch (NoSuchMethodError unused) {
                f4902p = false;
            }
        }
    }

    public void p0(View view, int i7, int i8, int i9, int i10) {
        if (f4901o) {
            try {
                view.setLeftTopRightBottom(i7, i8, i9, i10);
            } catch (NoSuchMethodError unused) {
                f4901o = false;
            }
        }
    }

    public void q0(View view, Matrix matrix) {
        if (f4899m) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4899m = false;
            }
        }
    }

    public void r0(View view, Matrix matrix) {
        if (f4900n) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4900n = false;
            }
        }
    }
}
