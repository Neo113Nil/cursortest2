package E2;

import B2.t;
import B2.v;
import d2.C0279i;
import o2.l;
import w2.C1227f;
import w2.InterfaceC1226e;
import w2.l0;

/* loaded from: classes.dex */
public final class c implements InterfaceC1226e, l0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1227f f344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f345b;

    public c(d dVar, C1227f c1227f) {
        this.f345b = dVar;
        this.f344a = c1227f;
    }

    @Override // w2.l0
    public final void a(t tVar, int i3) {
        this.f344a.a(tVar, i3);
    }

    @Override // g2.InterfaceC0319c
    public final void e(Object obj) {
        this.f344a.e(obj);
    }

    @Override // w2.InterfaceC1226e
    public final v f(Object obj, l lVar) {
        d dVar = this.f345b;
        b bVar = new b(dVar, 1, this);
        v f = this.f344a.f((C0279i) obj, bVar);
        if (f != null) {
            d.f346g.set(dVar, null);
        }
        return f;
    }

    @Override // g2.InterfaceC0319c
    public final g2.h getContext() {
        return this.f344a.f10503e;
    }

    @Override // w2.InterfaceC1226e
    public final void m(Object obj) {
        this.f344a.m(obj);
    }
}
