package com.ironsource;

/* loaded from: classes5.dex */
public final class Na implements com.ironsource.InterfaceC3365xa {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f5856a;
    private final com.ironsource.W2 b;
    private final com.ironsource.N2 c;
    private com.ironsource.InterfaceC3383ya d;
    private com.ironsource.Sa e;
    private com.ironsource.L2 f;
    private final com.ironsource.M0 g;
    private final com.ironsource.InterfaceC3391z0 h;
    private final com.ironsource.O2 i;

    public static final class a implements com.ironsource.O2 {
        a() {
        }

        public void a() {
            com.ironsource.InterfaceC3383ya m = com.ironsource.Na.this.m();
            if (m != null) {
                m.onAdLeftApplication();
            }
        }

        public void b() {
            com.ironsource.InterfaceC3383ya m = com.ironsource.Na.this.m();
            if (m != null) {
                m.k();
            }
        }

        public void c() {
            com.ironsource.InterfaceC3383ya m = com.ironsource.Na.this.m();
            if (m != null) {
                m.i();
            }
        }

        @Override // com.ironsource.K0
        public void e() {
            com.ironsource.InterfaceC3383ya m = com.ironsource.Na.this.m();
            if (m != null) {
                m.onAdClicked();
            }
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ kotlin.Unit g() {
            a();
            return kotlin.Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ kotlin.Unit h() {
            c();
            return kotlin.Unit.INSTANCE;
        }

        @Override // com.ironsource.O2
        public /* bridge */ /* synthetic */ kotlin.Unit j() {
            b();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class b implements com.ironsource.M0 {
        b() {
        }

        @Override // com.ironsource.M0
        public /* synthetic */ void a() {
            com.ironsource.M0.CC.$default$a(this);
        }

        @Override // com.ironsource.M0
        public void a(com.ironsource.C3301u0 adUnitCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
            com.ironsource.Na.this.l().a(adUnitCallback);
        }

        @Override // com.ironsource.M0
        public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
        }

        @Override // com.ironsource.M0
        public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.Na.this.l().a(ironSourceError);
        }
    }

    public static final class c implements com.ironsource.InterfaceC3391z0 {
        c() {
        }

        @Override // com.ironsource.InterfaceC3391z0
        public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
            com.ironsource.InterfaceC3383ya m = com.ironsource.Na.this.m();
            if (m != null) {
                m.onAdDisplayed(adInfo);
            }
        }

        @Override // com.ironsource.InterfaceC3391z0
        public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
            com.ironsource.InterfaceC3383ya m = com.ironsource.Na.this.m();
            if (m != null) {
                m.d(ironSourceError);
            }
        }
    }

    public Na(com.ironsource.C3212p0 adTools, com.ironsource.W2 bannerContainer, com.ironsource.N2 bannerAdUnitFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.f5856a = adTools;
        this.b = bannerContainer;
        this.c = bannerAdUnitFactory;
        this.e = new com.ironsource.Oa(this);
        this.g = new com.ironsource.Na.b();
        this.h = new com.ironsource.Na.c();
        this.i = new com.ironsource.Na.a();
    }

    public final com.ironsource.C3212p0 a() {
        return this.f5856a;
    }

    public final void b(com.ironsource.InterfaceC3383ya interfaceC3383ya) {
        this.d = interfaceC3383ya;
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void c() {
        this.e.c();
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void d() {
    }

    public final com.ironsource.O2 e() {
        return this.i;
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void f() {
    }

    public final com.ironsource.M0 g() {
        return this.g;
    }

    public final com.ironsource.InterfaceC3391z0 h() {
        return this.h;
    }

    public final com.ironsource.N2 i() {
        return this.c;
    }

    public final com.ironsource.W2 j() {
        return this.b;
    }

    public final com.ironsource.L2 k() {
        return this.f;
    }

    public final com.ironsource.Sa l() {
        return this.e;
    }

    public final com.ironsource.InterfaceC3383ya m() {
        return this.d;
    }

    public final void a(com.ironsource.Sa sa) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sa, "<set-?>");
        this.e = sa;
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void b() {
        this.e.b();
    }

    public final void a(com.ironsource.L2 l2) {
        this.f = l2;
    }

    public final void a(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.f5856a.e().h().f("Banner Single Ad Unit Strategy - " + message);
    }

    public final void a(com.ironsource.C3301u0 adUnitCallback, com.ironsource.L2 adUnit) {
        com.ironsource.InterfaceC3383ya interfaceC3383ya;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        adUnit.a(this.b.getViewBinder(), this.h);
        com.unity3d.mediation.LevelPlayAdInfo c2 = adUnitCallback.c();
        if (c2 == null || (interfaceC3383ya = this.d) == null) {
            return;
        }
        interfaceC3383ya.onAdLoaded(c2);
    }

    public final void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.InterfaceC3383ya interfaceC3383ya = this.d;
        if (interfaceC3383ya != null) {
            interfaceC3383ya.b(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC3365xa
    public void a(com.ironsource.InterfaceC3383ya listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.d = listener;
    }
}
