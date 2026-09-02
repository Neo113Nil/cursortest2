package Y;

import a.AbstractC0018a;
import f0.p;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: b, reason: collision with root package name */
    public final h f405b;

    public a(h hVar) {
        this.f405b = hVar;
    }

    @Override // Y.i
    public final Object c(Object obj, p pVar) {
        return pVar.g(obj, this);
    }

    @Override // Y.i
    public g d(h hVar) {
        g0.h.e(hVar, "key");
        if (g0.h.a(getKey(), hVar)) {
            return this;
        }
        return null;
    }

    @Override // Y.i
    public /* bridge */ i e(h hVar) {
        return AbstractC0018a.q(this, hVar);
    }

    @Override // Y.i
    public final /* bridge */ i g(i iVar) {
        return AbstractC0018a.s(this, iVar);
    }

    @Override // Y.g
    public final h getKey() {
        return this.f405b;
    }
}
