package U5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final J f6425e = new J(null, null, l0.f6536e, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f6426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p028d6.r f6427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f6428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6429d;

    public J(AbstractC0457y abstractC0457y, p028d6.r rVar, l0 l0Var, boolean z4) {
        this.f6426a = abstractC0457y;
        this.f6427b = rVar;
        p113p3.f.k(l0Var, "status");
        this.f6428c = l0Var;
        this.f6429d = z4;
    }

    public static J a(l0 l0Var) {
        p113p3.f.d("error status shouldn't be OK", !l0Var.e());
        return new J(null, null, l0Var, false);
    }

    public static J b(AbstractC0457y abstractC0457y, p028d6.r rVar) {
        p113p3.f.k(abstractC0457y, "subchannel");
        return new J(abstractC0457y, rVar, l0.f6536e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return p097n3.a.t(this.f6426a, j.f6426a) && p097n3.a.t(this.f6428c, j.f6428c) && p097n3.a.t(this.f6427b, j.f6427b) && this.f6429d == j.f6429d;
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f6429d);
        return Arrays.hashCode(new Object[]{this.f6426a, this.f6428c, this.f6427b, boolValueOf});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f6426a, "subchannel");
        jVarU0.a(this.f6427b, "streamTracerFactory");
        jVarU0.a(this.f6428c, "status");
        jVarU0.c("drop", this.f6429d);
        return jVarU0.toString();
    }
}
