package z;

import P.AbstractC0329z;
import P.C0305m0;
import n.AbstractC2107A;

/* renamed from: z.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2691O implements InterfaceC2692P {

    /* renamed from: a, reason: collision with root package name */
    public final String f21494a;

    /* renamed from: b, reason: collision with root package name */
    public final C0305m0 f21495b;

    public C2691O(C2724z c2724z, String str) {
        this.f21494a = str;
        this.f21495b = AbstractC0329z.t(c2724z);
    }

    @Override // z.InterfaceC2692P
    public final int a(x0.Q q5) {
        return e().f21582b;
    }

    @Override // z.InterfaceC2692P
    public final int b(x0.Q q5, W0.m mVar) {
        return e().f21581a;
    }

    @Override // z.InterfaceC2692P
    public final int c(x0.Q q5, W0.m mVar) {
        return e().f21583c;
    }

    @Override // z.InterfaceC2692P
    public final int d(x0.Q q5) {
        return e().f21584d;
    }

    public final C2724z e() {
        return (C2724z) this.f21495b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2691O) {
            return kotlin.jvm.internal.l.a(e(), ((C2691O) obj).e());
        }
        return false;
    }

    public final void f(C2724z c2724z) {
        this.f21495b.setValue(c2724z);
    }

    public final int hashCode() {
        return this.f21494a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21494a);
        sb.append("(left=");
        sb.append(e().f21581a);
        sb.append(", top=");
        sb.append(e().f21582b);
        sb.append(", right=");
        sb.append(e().f21583c);
        sb.append(", bottom=");
        return AbstractC2107A.t(sb, e().f21584d, ')');
    }
}
