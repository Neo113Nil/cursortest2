package v;

import m4.InterfaceC2105h;

/* loaded from: classes.dex */
public final class s0 extends b0.o implements z0.v0 {

    /* renamed from: y, reason: collision with root package name */
    public v0 f20302y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20303z;

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
        H0.v vVar = H0.s.f2167m;
        InterfaceC2105h[] interfaceC2105hArr2 = H0.u.f2183a;
        InterfaceC2105h interfaceC2105h = interfaceC2105hArr2[6];
        vVar.a(jVar, Boolean.TRUE);
        H0.h hVar = new H0.h(new r0(this, 0), new r0(this, 1));
        if (this.f20303z) {
            H0.v vVar2 = H0.s.f2175u;
            InterfaceC2105h interfaceC2105h2 = interfaceC2105hArr2[12];
            vVar2.a(jVar, hVar);
        } else {
            H0.v vVar3 = H0.s.f2174t;
            InterfaceC2105h interfaceC2105h3 = interfaceC2105hArr2[11];
            vVar3.a(jVar, hVar);
        }
    }
}
