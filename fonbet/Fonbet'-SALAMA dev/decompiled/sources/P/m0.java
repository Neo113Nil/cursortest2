package P;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class m0 extends l0 {

    /* renamed from: l, reason: collision with root package name */
    public I.c f5091l;

    public m0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f5091l = null;
    }

    @Override // P.p0
    public I.c g() {
        Insets systemGestureInsets;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.f5091l == null) {
            systemGestureInsets = this.f5082c.getSystemGestureInsets();
            i7 = systemGestureInsets.left;
            i8 = systemGestureInsets.top;
            i9 = systemGestureInsets.right;
            i10 = systemGestureInsets.bottom;
            this.f5091l = I.c.a(i7, i8, i9, i10);
        }
        return this.f5091l;
    }

    @Override // P.j0, P.p0
    public q0 i(int i7, int i8, int i9, int i10) {
        WindowInsets inset;
        inset = this.f5082c.inset(i7, i8, i9, i10);
        return q0.g(inset, null);
    }

    @Override // P.k0, P.p0
    public void n(I.c cVar) {
    }
}
