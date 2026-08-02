package U5;

import a.AbstractC0603a;
import d6.C0984r;
import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class J {

    /* renamed from: e, reason: collision with root package name */
    public static final J f6425e = new J(null, null, l0.f6536e, false);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f6426a;

    /* renamed from: b, reason: collision with root package name */
    public final C0984r f6427b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f6428c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6429d;

    public J(AbstractC0457y abstractC0457y, C0984r c0984r, l0 l0Var, boolean z4) {
        this.f6426a = abstractC0457y;
        this.f6427b = c0984r;
        p3.f.k(l0Var, "status");
        this.f6428c = l0Var;
        this.f6429d = z4;
    }

    public static J a(l0 l0Var) {
        p3.f.d("error status shouldn't be OK", !l0Var.e());
        return new J(null, null, l0Var, false);
    }

    public static J b(AbstractC0457y abstractC0457y, C0984r c0984r) {
        p3.f.k(abstractC0457y, "subchannel");
        return new J(abstractC0457y, c0984r, l0.f6536e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return AbstractC1464a.t(this.f6426a, j.f6426a) && AbstractC1464a.t(this.f6428c, j.f6428c) && AbstractC1464a.t(this.f6427b, j.f6427b) && this.f6429d == j.f6429d;
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f6429d);
        return Arrays.hashCode(new Object[]{this.f6426a, this.f6428c, this.f6427b, valueOf});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f6426a, "subchannel");
        u02.a(this.f6427b, "streamTracerFactory");
        u02.a(this.f6428c, "status");
        u02.c("drop", this.f6429d);
        return u02.toString();
    }
}
