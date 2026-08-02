package x4;

import W3.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.C2267g;
import p4.C2268h;
import p4.InterfaceC2266f;
import p4.q0;
import u4.q;

/* loaded from: classes.dex */
public final class b implements InterfaceC2266f, q0 {

    /* renamed from: k, reason: collision with root package name */
    public final C2268h f21098k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f21099l;

    public b(c cVar, C2268h c2268h) {
        this.f21099l = cVar;
        this.f21098k = c2268h;
    }

    @Override // p4.InterfaceC2266f
    public final H3.g a(Object obj, i4.f fVar) {
        c cVar = this.f21099l;
        T0.a aVar = new T0.a(1, cVar, this);
        H3.g a5 = this.f21098k.a((o) obj, aVar);
        if (a5 != null) {
            c.f21100h.set(cVar, null);
        }
        return a5;
    }

    @Override // p4.q0
    public final void b(q qVar, int i) {
        this.f21098k.b(qVar, i);
    }

    @Override // p4.InterfaceC2266f
    public final boolean g(Throwable th) {
        return this.f21098k.g(th);
    }

    @Override // a4.c
    public final a4.h getContext() {
        return this.f21098k.f18796o;
    }

    @Override // p4.InterfaceC2266f
    public final void j(Object obj, i4.f fVar) {
        o oVar = o.f6046a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f21100h;
        c cVar = this.f21099l;
        atomicReferenceFieldUpdater.set(cVar, null);
        O3.f fVar2 = new O3.f(11, cVar, this);
        C2268h c2268h = this.f21098k;
        c2268h.A(oVar, c2268h.f18742m, new C2267g(0, fVar2));
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        this.f21098k.resumeWith(obj);
    }

    @Override // p4.InterfaceC2266f
    public final void u(Object obj) {
        this.f21098k.u(obj);
    }
}
