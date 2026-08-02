package n1;

import android.graphics.Insets;
import android.view.WindowInsets;
import g1.C1968b;

/* loaded from: classes.dex */
public class c0 extends b0 {

    /* renamed from: t, reason: collision with root package name */
    public C1968b f18423t;

    /* renamed from: u, reason: collision with root package name */
    public C1968b f18424u;

    /* renamed from: v, reason: collision with root package name */
    public C1968b f18425v;

    public c0(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var, windowInsets);
        this.f18423t = null;
        this.f18424u = null;
        this.f18425v = null;
    }

    @Override // n1.h0
    public C1968b k() {
        Insets mandatorySystemGestureInsets;
        if (this.f18424u == null) {
            mandatorySystemGestureInsets = this.f18402c.getMandatorySystemGestureInsets();
            this.f18424u = C1968b.c(mandatorySystemGestureInsets);
        }
        return this.f18424u;
    }

    @Override // n1.h0
    public C1968b m() {
        Insets systemGestureInsets;
        if (this.f18423t == null) {
            systemGestureInsets = this.f18402c.getSystemGestureInsets();
            this.f18423t = C1968b.c(systemGestureInsets);
        }
        return this.f18423t;
    }

    @Override // n1.h0
    public C1968b o() {
        Insets tappableElementInsets;
        if (this.f18425v == null) {
            tappableElementInsets = this.f18402c.getTappableElementInsets();
            this.f18425v = C1968b.c(tappableElementInsets);
        }
        return this.f18425v;
    }

    @Override // n1.Z, n1.h0
    public k0 r(int i, int i5, int i6, int i7) {
        WindowInsets inset;
        inset = this.f18402c.inset(i, i5, i6, i7);
        return k0.c(null, inset);
    }

    public c0(k0 k0Var, c0 c0Var) {
        super(k0Var, c0Var);
        this.f18423t = null;
        this.f18424u = null;
        this.f18425v = null;
    }

    @Override // n1.a0, n1.h0
    public void z(C1968b c1968b) {
    }
}
