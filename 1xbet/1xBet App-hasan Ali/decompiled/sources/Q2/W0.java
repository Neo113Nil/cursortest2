package Q2;

import com.google.android.gms.internal.ads.C0844ca;

/* loaded from: classes.dex */
public final class W0 extends AbstractBinderC0396z {

    /* renamed from: k, reason: collision with root package name */
    public final J2.u f4946k;

    /* renamed from: l, reason: collision with root package name */
    public final C0844ca f4947l;

    public W0(J2.u uVar, C0844ca c0844ca) {
        this.f4946k = uVar;
        this.f4947l = c0844ca;
    }

    @Override // Q2.A
    public final void e1(C0387u0 c0387u0) {
        J2.u uVar = this.f4946k;
        if (uVar != null) {
            uVar.b(c0387u0.b());
        }
    }

    @Override // Q2.A
    public final void p() {
        C0844ca c0844ca;
        J2.u uVar = this.f4946k;
        if (uVar == null || (c0844ca = this.f4947l) == null) {
            return;
        }
        uVar.d(c0844ca);
    }
}
