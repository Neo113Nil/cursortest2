package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ic extends com.inmobi.media.AbstractC2445h implements com.inmobi.media.Ah, com.inmobi.media.Tk, com.inmobi.media.Io, com.inmobi.media.InterfaceC2519jm {
    public volatile com.inmobi.media.InterfaceC2782tj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(com.inmobi.media.C2631o1 adManagerComponent, com.inmobi.media.Pc nativeCallbacks) {
        super(adManagerComponent.e);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        this.c = new com.inmobi.media.C2300bd(adManagerComponent, nativeCallbacks, this);
    }

    @Override // com.inmobi.media.AbstractC2861wj
    public final com.inmobi.media.InterfaceC2782tj a() {
        return this.c;
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void b() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.InterfaceC2519jm interfaceC2519jm = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2519jm ? (com.inmobi.media.InterfaceC2519jm) interfaceC2782tj : null;
        if (interfaceC2519jm != null) {
            interfaceC2519jm.b();
        }
    }

    @Override // com.inmobi.media.Tk
    public final void d() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.Tk tk = interfaceC2782tj instanceof com.inmobi.media.Tk ? (com.inmobi.media.Tk) interfaceC2782tj : null;
        if (tk != null) {
            tk.d();
        }
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void f() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.InterfaceC2519jm interfaceC2519jm = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2519jm ? (com.inmobi.media.InterfaceC2519jm) interfaceC2782tj : null;
        if (interfaceC2519jm != null) {
            interfaceC2519jm.f();
        }
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void h() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.InterfaceC2519jm interfaceC2519jm = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2519jm ? (com.inmobi.media.InterfaceC2519jm) interfaceC2782tj : null;
        if (interfaceC2519jm != null) {
            interfaceC2519jm.h();
        }
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void i() {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.InterfaceC2519jm interfaceC2519jm = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2519jm ? (com.inmobi.media.InterfaceC2519jm) interfaceC2782tj : null;
        if (interfaceC2519jm != null) {
            interfaceC2519jm.i();
        }
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(int i, double d) {
        java.lang.String a2;
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.Nc nc = interfaceC2782tj instanceof com.inmobi.media.Kd ? ((com.inmobi.media.Kd) interfaceC2782tj).j : interfaceC2782tj instanceof com.inmobi.media.C2881xd ? ((com.inmobi.media.C2881xd) interfaceC2782tj).h : interfaceC2782tj instanceof com.inmobi.media.Ae ? ((com.inmobi.media.Ae) interfaceC2782tj).f : interfaceC2782tj instanceof com.inmobi.media.Fe ? ((com.inmobi.media.Fe) interfaceC2782tj).f4706a : null;
        return (nc == null || (a2 = nc.a(i, d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a2;
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(double d) {
        com.inmobi.media.Nc nc;
        java.lang.String a2;
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        if (interfaceC2782tj instanceof com.inmobi.media.Kd) {
            nc = ((com.inmobi.media.Kd) interfaceC2782tj).j;
        } else if (interfaceC2782tj instanceof com.inmobi.media.C2881xd) {
            nc = ((com.inmobi.media.C2881xd) interfaceC2782tj).h;
        } else if (interfaceC2782tj instanceof com.inmobi.media.Ae) {
            nc = ((com.inmobi.media.Ae) interfaceC2782tj).f;
        } else {
            nc = interfaceC2782tj instanceof com.inmobi.media.Fe ? ((com.inmobi.media.Fe) interfaceC2782tj).f4706a : null;
        }
        return (nc == null || (a2 = nc.a(d)) == null) ? "Ad not ready for Win/Loss notification. AdUnit must be inflated first." : a2;
    }

    @Override // com.inmobi.media.InterfaceC2519jm
    public final void a(boolean z) {
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.InterfaceC2519jm interfaceC2519jm = interfaceC2782tj instanceof com.inmobi.media.InterfaceC2519jm ? (com.inmobi.media.InterfaceC2519jm) interfaceC2782tj : null;
        if (interfaceC2519jm != null) {
            interfaceC2519jm.a(z);
        }
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData inMobiNativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        com.inmobi.media.InterfaceC2782tj interfaceC2782tj = this.c;
        com.inmobi.media.Ah ah = interfaceC2782tj instanceof com.inmobi.media.Ah ? (com.inmobi.media.Ah) interfaceC2782tj : null;
        if (ah != null) {
            ah.a(inMobiNativeViewData);
        }
    }

    @Override // com.inmobi.media.AbstractC2861wj
    public final void a(com.inmobi.media.InterfaceC2782tj interfaceC2782tj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC2782tj, "<set-?>");
        this.c = interfaceC2782tj;
    }
}
