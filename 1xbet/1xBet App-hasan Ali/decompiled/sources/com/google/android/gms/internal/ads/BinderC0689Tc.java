package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* renamed from: com.google.android.gms.internal.ads.Tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0689Tc extends AbstractBinderC0654Oc {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11649k;

    /* renamed from: l, reason: collision with root package name */
    public final J2.u f11650l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11651m;

    public /* synthetic */ BinderC0689Tc(J2.u uVar, Object obj, int i) {
        this.f11649k = i;
        this.f11650l = uVar;
        this.f11651m = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void f() {
        C0717Xc c0717Xc;
        switch (this.f11649k) {
            case 0:
                Zl zl = (Zl) this.f11650l;
                if (zl != null) {
                    zl.d((C0675Rc) this.f11651m);
                    break;
                }
                break;
            default:
                Zl zl2 = (Zl) this.f11650l;
                if (zl2 != null && (c0717Xc = (C0717Xc) this.f11651m) != null) {
                    zl2.d(c0717Xc);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void q(C0387u0 c0387u0) {
        switch (this.f11649k) {
            case 0:
                Zl zl = (Zl) this.f11650l;
                if (zl != null) {
                    zl.b(c0387u0.b());
                    break;
                }
                break;
            default:
                Zl zl2 = (Zl) this.f11650l;
                if (zl2 != null) {
                    zl2.b(c0387u0.b());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0661Pc
    public final void x(int i) {
        int i5 = this.f11649k;
    }

    private final void u3(int i) {
    }

    private final void v3(int i) {
    }
}
