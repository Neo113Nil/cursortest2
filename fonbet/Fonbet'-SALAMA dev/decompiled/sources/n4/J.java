package n4;

import i4.C1265b;
import i4.C1266c;
import i4.C1269f;
import i4.InterfaceC1278o;
import s4.C1595c;
import s4.C1596d;

/* loaded from: classes2.dex */
public final class J extends AbstractC1472f {

    /* renamed from: d, reason: collision with root package name */
    public final C1479m f15376d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1278o f15377e;

    /* renamed from: f, reason: collision with root package name */
    public final s4.h f15378f;

    public J(C1479m c1479m, InterfaceC1278o interfaceC1278o, s4.h hVar) {
        this.f15376d = c1479m;
        this.f15377e = interfaceC1278o;
        this.f15378f = hVar;
    }

    @Override // n4.AbstractC1472f
    public final AbstractC1472f a(s4.h hVar) {
        return new J(this.f15376d, this.f15377e, hVar);
    }

    @Override // n4.AbstractC1472f
    public final C1596d b(C1595c c1595c, s4.h hVar) {
        return new C1596d(5, this, new C1265b(new C1269f(this.f15376d, hVar.f16172a), c1595c.f16154b), null);
    }

    @Override // n4.AbstractC1472f
    public final void c(C1266c c1266c) {
        this.f15377e.b(c1266c);
    }

    @Override // n4.AbstractC1472f
    public final void d(C1596d c1596d) {
        if (this.f15412a.get()) {
            return;
        }
        this.f15377e.a(c1596d.f16160c);
    }

    @Override // n4.AbstractC1472f
    public final s4.h e() {
        return this.f15378f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            J j = (J) obj;
            if (j.f15377e.equals(this.f15377e) && j.f15376d.equals(this.f15376d) && j.f15378f.equals(this.f15378f)) {
                return true;
            }
        }
        return false;
    }

    @Override // n4.AbstractC1472f
    public final boolean f(AbstractC1472f abstractC1472f) {
        return (abstractC1472f instanceof J) && ((J) abstractC1472f).f15377e.equals(this.f15377e);
    }

    @Override // n4.AbstractC1472f
    public final boolean g(int i7) {
        return i7 == 5;
    }

    public final int hashCode() {
        return this.f15378f.hashCode() + ((this.f15376d.hashCode() + (this.f15377e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
