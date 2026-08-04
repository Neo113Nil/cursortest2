package p098n4;

import p134s4.c;
import p134s4.d;
import p134s4.h;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC0933f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f15364d;

    public B(h hVar) {
        this.f15364d = hVar;
    }

    @Override // p098n4.AbstractC0933f
    public final AbstractC0933f a(h hVar) {
        return new B(hVar);
    }

    @Override // p098n4.AbstractC0933f
    public final d b(c cVar, h hVar) {
        return null;
    }

    @Override // p098n4.AbstractC0933f
    public final h e() {
        return this.f15364d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof B) && ((B) obj).f15364d.equals(this.f15364d);
    }

    @Override // p098n4.AbstractC0933f
    public final boolean f(AbstractC0933f abstractC0933f) {
        return abstractC0933f instanceof B;
    }

    @Override // p098n4.AbstractC0933f
    public final boolean g(int i7) {
        return false;
    }

    public final int hashCode() {
        return this.f15364d.hashCode();
    }

    @Override // p098n4.AbstractC0933f
    public final void c(p063i4.c cVar) {
    }

    @Override // p098n4.AbstractC0933f
    public final void d(d dVar) {
    }
}
