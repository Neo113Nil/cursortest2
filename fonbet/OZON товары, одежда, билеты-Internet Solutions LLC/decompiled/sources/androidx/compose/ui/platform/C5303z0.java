package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import l1.C7783A;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5303z0 implements InterfaceC5294w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Matrix f41112a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f41113b = new int[2];

    @Override // androidx.compose.ui.platform.InterfaceC5294w0
    public void a(@NotNull View view, @NotNull float[] fArr) {
        Matrix matrix = this.f41112a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f41113b;
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i11, iArr[1] - i12);
        C7783A.b(matrix, fArr);
    }
}
