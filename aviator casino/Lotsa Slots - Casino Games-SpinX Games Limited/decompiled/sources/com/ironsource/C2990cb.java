package com.ironsource;

/* renamed from: com.ironsource.cb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2990cb {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.H7 f6188a;
    private final com.ironsource.Xa b;

    /* renamed from: com.ironsource.cb$a */
    public static final class a implements com.ironsource.InterfaceC3373y0 {
        a() {
        }

        @Override // com.ironsource.InterfaceC3373y0
        public com.ironsource.AbstractC3355x0 a(boolean z, com.ironsource.C3069h0 adProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return com.ironsource.B9.z.a(adProperties, com.ironsource.C2990cb.this.f6188a.f().a(), z);
        }
    }

    public C2990cb(java.lang.String adUnitId, com.ironsource.Xa.b config, com.ironsource.C3212p0 adTools, com.ironsource.C3003d6 adControllerFactory, com.ironsource.H7 provider, com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.C3326v7 idFactory, com.ironsource.Z0 adUnitValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.f6188a = provider;
        this.b = new com.ironsource.Xa(com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(), provider, currentTimeProvider, idFactory);
    }

    public final java.lang.String b() {
        java.lang.String uuid = this.b.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean c() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.b.m();
    }

    public final void d() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.b.n();
    }

    public final void a(com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.b.a(levelPlayInterstitialAdListener != null ? com.ironsource.C3008db.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    private final com.ironsource.InterfaceC3373y0 a() {
        return new com.ironsource.C2990cb.a();
    }
}
