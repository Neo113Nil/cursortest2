package n1;

import android.view.WindowInsets;
import g1.C1968b;

/* loaded from: classes.dex */
public class S extends Y {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f18392e;

    public S() {
        this.f18392e = Q.f();
    }

    @Override // n1.Y
    public k0 b() {
        WindowInsets build;
        a();
        build = this.f18392e.build();
        k0 c5 = k0.c(null, build);
        C1968b[] c1968bArr = this.f18394b;
        h0 h0Var = c5.f18442a;
        h0Var.w(c1968bArr);
        h0Var.v(null);
        h0Var.B(this.f18395c);
        h0Var.C(this.f18396d);
        return c5;
    }

    @Override // n1.Y
    public void e(C1968b c1968b) {
        this.f18392e.setMandatorySystemGestureInsets(c1968b.d());
    }

    @Override // n1.Y
    public void f(C1968b c1968b) {
        this.f18392e.setStableInsets(c1968b.d());
    }

    @Override // n1.Y
    public void g(C1968b c1968b) {
        this.f18392e.setSystemGestureInsets(c1968b.d());
    }

    @Override // n1.Y
    public void h(C1968b c1968b) {
        this.f18392e.setSystemWindowInsets(c1968b.d());
    }

    @Override // n1.Y
    public void i(C1968b c1968b) {
        this.f18392e.setTappableElementInsets(c1968b.d());
    }

    public S(k0 k0Var) {
        super(k0Var);
        WindowInsets.Builder f;
        WindowInsets b3 = k0Var.b();
        if (b3 != null) {
            f = Q.g(b3);
        } else {
            f = Q.f();
        }
        this.f18392e = f;
    }
}
