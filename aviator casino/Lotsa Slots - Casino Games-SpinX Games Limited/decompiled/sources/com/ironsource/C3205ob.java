package com.ironsource;

/* renamed from: com.ironsource.ob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3205ob {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Xa f6542a;

    /* renamed from: com.ironsource.ob$a */
    public static final class a implements com.ironsource.InterfaceC3373y0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ironsource.H7 f6543a;

        a(com.ironsource.H7 h7) {
            this.f6543a = h7;
        }

        @Override // com.ironsource.InterfaceC3373y0
        public com.ironsource.AbstractC3355x0 a(boolean z, com.ironsource.C3069h0 adProperties) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return com.ironsource.C2993ce.z.a(adProperties, this.f6543a.f().a(), z);
        }
    }

    public C3205ob(java.lang.String adUnitId, com.ironsource.Xa.b config, com.ironsource.C3212p0 adTools, com.ironsource.C3003d6 adControllerFactory, com.ironsource.H7 provider, com.ironsource.InterfaceC3216p4 currentTimeProvider, com.ironsource.C3326v7 idFactory, com.ironsource.Z0 adUnitValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.f6542a = new com.ironsource.Xa(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final java.lang.String a() {
        java.lang.String uuid = this.f6542a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean b() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f6542a.m();
    }

    public final void c() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f6542a.n();
    }

    public final void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f6542a.a(activity, str);
    }

    public final void a(com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f6542a.a(levelPlayRewardedAdListener != null ? com.ironsource.C3223pb.b(levelPlayRewardedAdListener) : null);
    }

    public final com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String str) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.f6542a.a(str);
    }

    private final com.ironsource.C3205ob.a a(com.ironsource.H7 h7) {
        return new com.ironsource.C3205ob.a(h7);
    }
}
