package z0;

import a3.AbstractC0467k;

/* loaded from: classes.dex */
public abstract class Z implements b0.n {
    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    public abstract b0.o i();

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }

    public abstract void k(b0.o oVar);
}
