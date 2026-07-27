package w2;

import d2.C0279i;

/* renamed from: w2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1231j extends S implements InterfaceC1230i {

    /* renamed from: e, reason: collision with root package name */
    public final Z f10508e;

    public C1231j(Z z3) {
        this.f10508e = z3;
    }

    @Override // w2.InterfaceC1230i
    public final boolean b(Throwable th) {
        return i().u(th);
    }

    @Override // o2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C0279i.f4852a;
    }

    @Override // w2.U
    public final void j(Throwable th) {
        this.f10508e.q(i());
    }
}
