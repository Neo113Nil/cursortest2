package U5;

import a.AbstractC0603a;
import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f6492a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6493b;

    public e0(Object obj) {
        this.f6493b = obj;
        this.f6492a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC1464a.t(this.f6492a, e0Var.f6492a) && AbstractC1464a.t(this.f6493b, e0Var.f6493b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6492a, this.f6493b});
    }

    public final String toString() {
        Object obj = this.f6493b;
        if (obj != null) {
            D3.j u02 = AbstractC0603a.u0(this);
            u02.a(obj, "config");
            return u02.toString();
        }
        D3.j u03 = AbstractC0603a.u0(this);
        u03.a(this.f6492a, "error");
        return u03.toString();
    }

    public e0(l0 l0Var) {
        this.f6493b = null;
        p3.f.k(l0Var, "status");
        this.f6492a = l0Var;
        p3.f.h(!l0Var.e(), "cannot use OK status: %s", l0Var);
    }
}
