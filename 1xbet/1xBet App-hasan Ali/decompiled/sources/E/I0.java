package E;

import a3.AbstractC0467k;
import i4.InterfaceC2015a;
import n.AbstractC2107A;
import x0.InterfaceC2639z;
import z0.AbstractC2739O;

/* loaded from: classes.dex */
public final class I0 implements InterfaceC2639z {

    /* renamed from: k, reason: collision with root package name */
    public final B0 f1046k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1047l;

    /* renamed from: m, reason: collision with root package name */
    public final P0.D f1048m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2015a f1049n;

    public I0(B0 b02, int i, P0.D d5, InterfaceC2015a interfaceC2015a) {
        this.f1046k = b02;
        this.f1047l = i;
        this.f1048m = d5;
        this.f1049n = interfaceC2015a;
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
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return kotlin.jvm.internal.l.a(this.f1046k, i02.f1046k) && this.f1047l == i02.f1047l && kotlin.jvm.internal.l.a(this.f1048m, i02.f1048m) && kotlin.jvm.internal.l.a(this.f1049n, i02.f1049n);
    }

    @Override // x0.InterfaceC2639z
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        x0.Z e3 = n5.e(W0.a.a(j5, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(e3.f20974l, W0.a.g(j5));
        return q5.i(e3.f20973k, min, X3.w.f6091k, new Q(q5, this, e3, min, 1));
    }

    @Override // x0.InterfaceC2639z
    public final /* synthetic */ int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        return AbstractC2107A.j(this, abstractC2739O, n5, i);
    }

    public final int hashCode() {
        return this.f1049n.hashCode() + ((this.f1048m.hashCode() + (((this.f1046k.hashCode() * 31) + this.f1047l) * 31)) * 31);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f1046k + ", cursorOffset=" + this.f1047l + ", transformedText=" + this.f1048m + ", textLayoutResultProvider=" + this.f1049n + ')';
    }
}
