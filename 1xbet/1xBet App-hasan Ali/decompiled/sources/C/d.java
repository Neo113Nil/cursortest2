package C;

import b0.o;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: y, reason: collision with root package name */
    public c f781y;

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // b0.o
    public final void o0() {
        c cVar = this.f781y;
        if (cVar != null) {
            cVar.f780a.k(this);
        }
        if (cVar != null) {
            cVar.f780a.c(this);
        }
        this.f781y = cVar;
    }

    @Override // b0.o
    public final void q0() {
        c cVar = this.f781y;
        if (cVar != null) {
            cVar.f780a.k(this);
        }
    }
}
