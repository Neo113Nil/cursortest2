package M0;

import U0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h f221a;

    public a(h hVar) {
        this.f221a = hVar;
    }

    @Override // M0.i
    public i g(h hVar) {
        return V.a.r(this, hVar);
    }

    @Override // M0.g
    public final h getKey() {
        return this.f221a;
    }

    @Override // M0.i
    public g i(h hVar) {
        return V.a.m(this, hVar);
    }

    @Override // M0.i
    public final Object j(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // M0.i
    public final i k(i iVar) {
        return V.a.u(this, iVar);
    }
}
