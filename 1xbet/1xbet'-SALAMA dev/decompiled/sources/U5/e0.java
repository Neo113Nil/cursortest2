package U5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f6492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        return p097n3.a.t(this.f6492a, e0Var.f6492a) && p097n3.a.t(this.f6493b, e0Var.f6493b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6492a, this.f6493b});
    }

    public final String toString() {
        Object obj = this.f6493b;
        if (obj != null) {
            D3.j jVarU0 = p003a.a.u0(this);
            jVarU0.a(obj, "config");
            return jVarU0.toString();
        }
        D3.j jVarU1 = p003a.a.u0(this);
        jVarU1.a(this.f6492a, "error");
        return jVarU1.toString();
    }

    public e0(l0 l0Var) {
        this.f6493b = null;
        p113p3.f.k(l0Var, "status");
        this.f6492a = l0Var;
        p113p3.f.h(!l0Var.e(), "cannot use OK status: %s", l0Var);
    }
}
