package p098n4;

import p063i4.b;
import p063i4.f;
import p063i4.o;
import p134s4.c;
import p134s4.d;
import p134s4.h;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC0933f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0940m f15382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f15383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f15384f;

    public J(C0940m c0940m, o oVar, h hVar) {
        this.f15382d = c0940m;
        this.f15383e = oVar;
        this.f15384f = hVar;
    }

    @Override // p098n4.AbstractC0933f
    public final AbstractC0933f a(h hVar) {
        return new J(this.f15382d, this.f15383e, hVar);
    }

    @Override // p098n4.AbstractC0933f
    public final d b(c cVar, h hVar) {
        return new d(5, this, new b(new f(this.f15382d, hVar.f16178a), cVar.f16160b), null);
    }

    @Override // p098n4.AbstractC0933f
    public final void c(p063i4.c cVar) {
        this.f15383e.b(cVar);
    }

    @Override // p098n4.AbstractC0933f
    public final void d(d dVar) {
        if (this.f15418a.get()) {
            return;
        }
        this.f15383e.a(dVar.f16166c);
    }

    @Override // p098n4.AbstractC0933f
    public final h e() {
        return this.f15384f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof J) {
            J j = (J) obj;
            if (j.f15383e.equals(this.f15383e) && j.f15382d.equals(this.f15382d) && j.f15384f.equals(this.f15384f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p098n4.AbstractC0933f
    public final boolean f(AbstractC0933f abstractC0933f) {
        return (abstractC0933f instanceof J) && ((J) abstractC0933f).f15383e.equals(this.f15383e);
    }

    @Override // p098n4.AbstractC0933f
    public final boolean g(int i7) {
        return i7 == 5;
    }

    public final int hashCode() {
        return this.f15384f.hashCode() + ((this.f15382d.hashCode() + (this.f15383e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
