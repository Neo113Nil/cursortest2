package n4;

import i4.C1266c;
import s4.C1595c;
import s4.C1596d;

/* renamed from: n4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1466B extends AbstractC1472f {

    /* renamed from: d, reason: collision with root package name */
    public final s4.h f15358d;

    public C1466B(s4.h hVar) {
        this.f15358d = hVar;
    }

    @Override // n4.AbstractC1472f
    public final AbstractC1472f a(s4.h hVar) {
        return new C1466B(hVar);
    }

    @Override // n4.AbstractC1472f
    public final C1596d b(C1595c c1595c, s4.h hVar) {
        return null;
    }

    @Override // n4.AbstractC1472f
    public final s4.h e() {
        return this.f15358d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1466B) && ((C1466B) obj).f15358d.equals(this.f15358d);
    }

    @Override // n4.AbstractC1472f
    public final boolean f(AbstractC1472f abstractC1472f) {
        return abstractC1472f instanceof C1466B;
    }

    @Override // n4.AbstractC1472f
    public final boolean g(int i7) {
        return false;
    }

    public final int hashCode() {
        return this.f15358d.hashCode();
    }

    @Override // n4.AbstractC1472f
    public final void c(C1266c c1266c) {
    }

    @Override // n4.AbstractC1472f
    public final void d(C1596d c1596d) {
    }
}
