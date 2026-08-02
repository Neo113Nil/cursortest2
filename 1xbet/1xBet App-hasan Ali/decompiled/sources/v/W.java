package v;

import a3.AbstractC0467k;
import z0.C2733I;

/* loaded from: classes.dex */
public final class W implements f0.e {

    /* renamed from: k, reason: collision with root package name */
    public final U f20186k;

    public W(U u5) {
        this.f20186k = u5;
    }

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // f0.e
    public final void g(C2733I c2733i) {
        this.f20186k.b(c2733i);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
