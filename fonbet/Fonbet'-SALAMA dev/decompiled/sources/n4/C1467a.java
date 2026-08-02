package n4;

import i4.C1265b;
import i4.C1266c;
import i4.C1269f;
import s4.C1595c;
import s4.C1596d;

/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1467a extends AbstractC1472f {

    /* renamed from: d, reason: collision with root package name */
    public final C1479m f15388d;

    /* renamed from: e, reason: collision with root package name */
    public final G5.a f15389e;

    /* renamed from: f, reason: collision with root package name */
    public final s4.h f15390f;

    public C1467a(C1479m c1479m, G5.a aVar, s4.h hVar) {
        this.f15388d = c1479m;
        this.f15389e = aVar;
        this.f15390f = hVar;
    }

    @Override // n4.AbstractC1472f
    public final AbstractC1472f a(s4.h hVar) {
        return new C1467a(this.f15388d, this.f15389e, hVar);
    }

    @Override // n4.AbstractC1472f
    public final C1596d b(C1595c c1595c, s4.h hVar) {
        C1265b c1265b = new C1265b(new C1269f(this.f15388d, hVar.f16172a.t(c1595c.f16156d)), c1595c.f16154b);
        v4.c cVar = c1595c.f16157e;
        return new C1596d(c1595c.f16153a, this, c1265b, cVar != null ? cVar.f17173a : null);
    }

    @Override // n4.AbstractC1472f
    public final void c(C1266c c1266c) {
        G5.a aVar = this.f15389e;
        aVar.getClass();
        G5.e a2 = G5.e.a(c1266c);
        ((A5.h) aVar.f2475a).b(a2.f3061a, a2.f3062b, a2.f3063c);
    }

    @Override // n4.AbstractC1472f
    public final void d(C1596d c1596d) {
        if (this.f15412a.get()) {
            return;
        }
        int e7 = t.e.e(c1596d.f16158a);
        C1265b c1265b = c1596d.f16160c;
        G5.a aVar = this.f15389e;
        if (e7 == 0) {
            aVar.s("childRemoved", c1265b, null);
            return;
        }
        String str = c1596d.f16161d;
        if (e7 == 1) {
            aVar.s("childAdded", c1265b, str);
        } else if (e7 == 2) {
            aVar.s("childMoved", c1265b, str);
        } else {
            if (e7 != 3) {
                return;
            }
            aVar.s("childChanged", c1265b, str);
        }
    }

    @Override // n4.AbstractC1472f
    public final s4.h e() {
        return this.f15390f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1467a) {
            C1467a c1467a = (C1467a) obj;
            if (c1467a.f15389e.equals(this.f15389e) && c1467a.f15388d.equals(this.f15388d) && c1467a.f15390f.equals(this.f15390f)) {
                return true;
            }
        }
        return false;
    }

    @Override // n4.AbstractC1472f
    public final boolean f(AbstractC1472f abstractC1472f) {
        return (abstractC1472f instanceof C1467a) && ((C1467a) abstractC1472f).f15389e.equals(this.f15389e);
    }

    @Override // n4.AbstractC1472f
    public final boolean g(int i7) {
        return i7 != 5;
    }

    public final int hashCode() {
        return this.f15390f.hashCode() + ((this.f15388d.hashCode() + (this.f15389e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChildEventRegistration";
    }
}
