package z;

import P.AbstractC0329z;
import P.C0305m0;
import g1.C1968b;
import n.AbstractC2107A;
import n1.k0;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2699a implements InterfaceC2692P {

    /* renamed from: a, reason: collision with root package name */
    public final int f21524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21525b;

    /* renamed from: c, reason: collision with root package name */
    public final C0305m0 f21526c = AbstractC0329z.t(C1968b.f17072e);

    /* renamed from: d, reason: collision with root package name */
    public final C0305m0 f21527d = AbstractC0329z.t(Boolean.TRUE);

    public C2699a(String str, int i) {
        this.f21524a = i;
        this.f21525b = str;
    }

    @Override // z.InterfaceC2692P
    public final int a(x0.Q q5) {
        return e().f17074b;
    }

    @Override // z.InterfaceC2692P
    public final int b(x0.Q q5, W0.m mVar) {
        return e().f17073a;
    }

    @Override // z.InterfaceC2692P
    public final int c(x0.Q q5, W0.m mVar) {
        return e().f17075c;
    }

    @Override // z.InterfaceC2692P
    public final int d(x0.Q q5) {
        return e().f17076d;
    }

    public final C1968b e() {
        return (C1968b) this.f21526c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2699a) {
            return this.f21524a == ((C2699a) obj).f21524a;
        }
        return false;
    }

    public final void f(k0 k0Var, int i) {
        int i5 = this.f21524a;
        if (i == 0 || (i & i5) != 0) {
            this.f21526c.setValue(k0Var.f18442a.i(i5));
            this.f21527d.setValue(Boolean.valueOf(k0Var.f18442a.u(i5)));
        }
    }

    public final int hashCode() {
        return this.f21524a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21525b);
        sb.append('(');
        sb.append(e().f17073a);
        sb.append(", ");
        sb.append(e().f17074b);
        sb.append(", ");
        sb.append(e().f17075c);
        sb.append(", ");
        return AbstractC2107A.t(sb, e().f17076d, ')');
    }
}
