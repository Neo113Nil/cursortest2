package com.ironsource;

/* loaded from: classes5.dex */
public final class Rb extends com.ironsource.AbstractC3157m implements com.ironsource.InterfaceC3045fc, com.ironsource.M0, com.ironsource.InterfaceC3391z0 {
    private final com.ironsource.Ub b;
    private final com.ironsource.C3212p0 c;
    private final com.ironsource.C2973bc d;
    private com.ironsource.C3009dc e;
    private com.unity3d.mediation.LevelPlayAdInfo f;

    public Rb(com.ironsource.Ub listener, com.ironsource.C3212p0 adTools, com.ironsource.C2973bc nativeAdProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.b = listener;
        this.c = adTools;
        this.d = nativeAdProperties;
        this.f = m();
    }

    private final com.unity3d.mediation.LevelPlayAdInfo m() {
        java.lang.String uuid = this.d.b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "nativeAdProperties.adId.toString()");
        java.lang.String c = this.d.c();
        java.lang.String aVar = this.d.a().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "nativeAdProperties.adFormat.toString()");
        return new com.unity3d.mediation.LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void a() {
        com.ironsource.M0.CC.$default$a(this);
    }

    public final void a(com.ironsource.Ob nativeAdBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        com.ironsource.C3009dc c3009dc = this.e;
        if (c3009dc == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c3009dc = null;
        }
        c3009dc.a(new com.ironsource.Wb(nativeAdBinder), this);
    }

    @Override // com.ironsource.M0
    public /* synthetic */ void b(com.ironsource.C3301u0 c3301u0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3301u0, "adUnitCallback");
    }

    @Override // com.ironsource.InterfaceC3391z0
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.b(this.f);
    }

    public final void n() {
        this.f = m();
        com.ironsource.C3009dc c3009dc = this.e;
        if (c3009dc == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c3009dc = null;
        }
        c3009dc.a(true);
    }

    public final void o() {
        com.ironsource.C3009dc a2 = a(this.c, this.d);
        this.e = a2;
        if (a2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            a2 = null;
        }
        a2.a((com.ironsource.M0) this);
    }

    private final com.ironsource.C3009dc a(com.ironsource.C3212p0 c3212p0, com.ironsource.C2973bc c2973bc) {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose();
        return new com.ironsource.C3009dc(c3212p0, com.ironsource.C3027ec.y.a(c2973bc, l().a()), this);
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.C3301u0 adUnitCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        com.unity3d.mediation.LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            this.f = c;
            this.b.a(c);
        }
    }

    @Override // com.ironsource.InterfaceC3391z0
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.M0
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }
}
