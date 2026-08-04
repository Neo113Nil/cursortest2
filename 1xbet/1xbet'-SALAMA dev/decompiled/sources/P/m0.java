package P;

import android.graphics.Insets;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I.c f5091l;

    public m0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
        this.f5091l = null;
    }

    @Override // P.p0
    public I.c g() {
        if (this.f5091l == null) {
            Insets systemGestureInsets = this.f5082c.getSystemGestureInsets();
            this.f5091l = I.c.a(systemGestureInsets.left, systemGestureInsets.top, systemGestureInsets.right, systemGestureInsets.bottom);
        }
        return this.f5091l;
    }

    @Override // P.j0, P.p0
    public q0 i(int i7, int i8, int i9, int i10) {
        return q0.g(this.f5082c.inset(i7, i8, i9, i10), null);
    }

    @Override // P.k0, P.p0
    public void n(I.c cVar) {
    }
}
