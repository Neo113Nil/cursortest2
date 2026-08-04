package p098n4;

import G5.a;
import G5.e;
import p063i4.b;
import p063i4.f;
import p134s4.c;
import p134s4.d;
import p134s4.h;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0928a extends AbstractC0933f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0940m f15394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f15395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f15396f;

    public C0928a(C0940m c0940m, a aVar, h hVar) {
        this.f15394d = c0940m;
        this.f15395e = aVar;
        this.f15396f = hVar;
    }

    @Override // p098n4.AbstractC0933f
    public final AbstractC0933f a(h hVar) {
        return new C0928a(this.f15394d, this.f15395e, hVar);
    }

    @Override // p098n4.AbstractC0933f
    public final d b(c cVar, h hVar) {
        b bVar = new b(new f(this.f15394d, hVar.f16178a.t(cVar.f16162d)), cVar.f16160b);
        v4.c cVar2 = cVar.f16163e;
        return new d(cVar.f16159a, this, bVar, cVar2 != null ? cVar2.f17179a : null);
    }

    @Override // p098n4.AbstractC0933f
    public final void c(p063i4.c cVar) {
        a aVar = this.f15395e;
        aVar.getClass();
        e eVarA = e.a(cVar);
        ((A5.h) aVar.f2475a).b(eVarA.f3061a, eVarA.f3062b, eVarA.f3063c);
    }

    @Override // p098n4.AbstractC0933f
    public final void d(d dVar) {
        if (this.f15418a.get()) {
            return;
        }
        int iE = p136t.e.e(dVar.f16164a);
        b bVar = dVar.f16166c;
        a aVar = this.f15395e;
        if (iE == 0) {
            aVar.s("childRemoved", bVar, null);
            return;
        }
        String str = dVar.f16167d;
        if (iE == 1) {
            aVar.s("childAdded", bVar, str);
        } else if (iE == 2) {
            aVar.s("childMoved", bVar, str);
        } else {
            if (iE != 3) {
                return;
            }
            aVar.s("childChanged", bVar, str);
        }
    }

    @Override // p098n4.AbstractC0933f
    public final h e() {
        return this.f15396f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0928a) {
            C0928a c0928a = (C0928a) obj;
            if (c0928a.f15395e.equals(this.f15395e) && c0928a.f15394d.equals(this.f15394d) && c0928a.f15396f.equals(this.f15396f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p098n4.AbstractC0933f
    public final boolean f(AbstractC0933f abstractC0933f) {
        return (abstractC0933f instanceof C0928a) && ((C0928a) abstractC0933f).f15395e.equals(this.f15395e);
    }

    @Override // p098n4.AbstractC0933f
    public final boolean g(int i7) {
        return i7 != 5;
    }

    public final int hashCode() {
        return this.f15396f.hashCode() + ((this.f15394d.hashCode() + (this.f15395e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChildEventRegistration";
    }
}
