package m0;

import a.AbstractC0018a;

/* loaded from: classes.dex */
public final class c0 implements Y.g, Y.h {

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f920b = new c0();

    @Override // Y.i
    public final Object c(Object obj, f0.p pVar) {
        return pVar.g(obj, this);
    }

    @Override // Y.i
    public final Y.g d(Y.h hVar) {
        g0.h.e(hVar, "key");
        if (g0.h.a(this, hVar)) {
            return this;
        }
        return null;
    }

    @Override // Y.i
    public final Y.i e(Y.h hVar) {
        return AbstractC0018a.q(this, hVar);
    }

    @Override // Y.i
    public final Y.i g(Y.i iVar) {
        return AbstractC0018a.s(this, iVar);
    }

    @Override // Y.g
    public final Y.h getKey() {
        return this;
    }
}
