package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import l1.C7783A;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.x0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5297x0 implements InterfaceC5294w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final float[] f41044a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f41045b = new int[2];

    public C5297x0(float[] fArr) {
        this.f41044a = fArr;
    }

    private final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z11 = parent instanceof View;
        float[] fArr2 = this.f41044a;
        if (z11) {
            b((View) parent, fArr);
            U.b(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            U.b(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(this.f41045b);
            U.b(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            U.b(fArr, r0[0], r0[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        C7783A.b(matrix, fArr2);
        U.e(fArr, fArr2);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5294w0
    public final void a(@NotNull View view, @NotNull float[] fArr) {
        C7837o0.e(fArr);
        b(view, fArr);
    }
}
