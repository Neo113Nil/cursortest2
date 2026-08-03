package com.ironsource;

/* renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3347wa extends com.ironsource.AbstractC3157m implements com.ironsource.O2, com.ironsource.InterfaceC3383ya {
    private final com.ironsource.C3212p0 b;
    private final com.ironsource.J2 c;
    private final java.lang.ref.WeakReference<com.ironsource.InterfaceC3393z2> d;
    private com.unity3d.mediation.LevelPlayAdInfo e;
    private final com.ironsource.InterfaceC3365xa f;

    public C3347wa(com.ironsource.InterfaceC3393z2 listener, com.ironsource.C3212p0 adTools, com.ironsource.J2 bannerAdProperties, com.ironsource.W2 bannerViewContainer) {
        com.ironsource.InterfaceC3365xa a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = new java.lang.ref.WeakReference<>(listener);
        this.e = n();
        a2 = com.ironsource.Ta.f5983a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, m(), (r17 & 64) != 0 ? new com.ironsource.InterfaceC3216p4.a() : null);
        this.f = a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.ironsource.L2 a(com.ironsource.C3347wa this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final com.ironsource.N2 m() {
        return new com.ironsource.N2() { // from class: com.ironsource.wa$$ExternalSyntheticLambda0
            @Override // com.ironsource.N2
            public final com.ironsource.L2 a(boolean z) {
                com.ironsource.L2 a2;
                a2 = com.ironsource.C3347wa.a(com.ironsource.C3347wa.this, z);
                return a2;
            }
        };
    }

    private final com.unity3d.mediation.LevelPlayAdInfo n() {
        java.lang.String uuid = this.c.b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
        java.lang.String c = this.c.c();
        java.lang.String aVar = this.c.a().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "bannerAdProperties.adFormat.toString()");
        return new com.unity3d.mediation.LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    public final void b() {
        this.f.b();
    }

    public final void c() {
        this.f.c();
    }

    public final void d() {
        this.f.d();
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ kotlin.Unit g() {
        o();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ kotlin.Unit h() {
        q();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void i() {
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            interfaceC3393z2.a(this.e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ kotlin.Unit j() {
        p();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void k() {
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            interfaceC3393z2.c(this.e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void onAdClicked() {
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            interfaceC3393z2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            interfaceC3393z2.b(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void onAdLeftApplication() {
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            interfaceC3393z2.e(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            interfaceC3393z2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final com.ironsource.L2 a(com.ironsource.C3212p0 c3212p0, com.ironsource.J2 j2, boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        return new com.ironsource.L2(c3212p0, com.ironsource.M2.z.a(j2, l().a(), z), this);
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void b(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            java.lang.String uuid = this.c.b().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC3393z2.a(new com.unity3d.mediation.LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC3383ya
    public void d(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.InterfaceC3393z2 interfaceC3393z2 = this.d.get();
        if (interfaceC3393z2 != null) {
            com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = this.e;
            java.lang.String uuid = this.c.b().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC3393z2.a(levelPlayAdInfo, new com.unity3d.mediation.LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }
}
