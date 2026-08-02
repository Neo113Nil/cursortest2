package t;

import P.AbstractC0329z;
import P.C0305m0;
import a3.AbstractC0467k;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2397i implements b0.n {

    /* renamed from: k, reason: collision with root package name */
    public final C0305m0 f19378k;

    public C2397i(boolean z3) {
        this.f19378k = AbstractC0329z.t(Boolean.valueOf(z3));
    }

    @Override // b0.p
    public final /* synthetic */ b0.p c(b0.p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return ((Boolean) cVar.c(this)).booleanValue();
    }
}
