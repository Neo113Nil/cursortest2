package E;

import a3.AbstractC0467k;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import x0.InterfaceC2639z;
import z0.AbstractC2739O;

/* loaded from: classes.dex */
public final class S implements InterfaceC2639z {

    /* renamed from: k, reason: collision with root package name */
    public final B0 f1076k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1077l;

    /* renamed from: m, reason: collision with root package name */
    public final P0.D f1078m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2015a f1079n;

    public S(B0 b02, int i, P0.D d5, InterfaceC2015a interfaceC2015a) {
        this.f1076k = b02;
        this.f1077l = i;
        this.f1078m = d5;
        this.f1079n = interfaceC2015a;
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.a(this, abstractC2739O, n5, i);
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.d(this, abstractC2739O, n5, i);
    }

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.g(this, abstractC2739O, n5, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s2 = (S) obj;
        return kotlin.jvm.internal.l.a(this.f1076k, s2.f1076k) && this.f1077l == s2.f1077l && kotlin.jvm.internal.l.a(this.f1078m, s2.f1078m) && kotlin.jvm.internal.l.a(this.f1079n, s2.f1079n);
    }

    @Override // x0.InterfaceC2639z
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        long j6;
        if (n5.T(W0.a.g(j5)) < W0.a.h(j5)) {
            j6 = j5;
        } else {
            j6 = j5;
            j5 = W0.a.a(j6, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        x0.Z e3 = n5.e(j5);
        int min = Math.min(e3.f20973k, W0.a.h(j6));
        return q5.i(min, e3.f20974l, X3.w.f6091k, new Q(q5, this, e3, min, 0));
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.j(this, abstractC2739O, n5, i);
    }

    public final int hashCode() {
        return this.f1079n.hashCode() + ((this.f1078m.hashCode() + (((this.f1076k.hashCode() * 31) + this.f1077l) * 31)) * 31);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f1076k + ", cursorOffset=" + this.f1077l + ", transformedText=" + this.f1078m + ", textLayoutResultProvider=" + this.f1079n + ')';
    }
}
