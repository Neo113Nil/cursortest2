package com.ironsource;

import android.app.Activity;
import com.ironsource.Va;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.mb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4534mb {

    /* renamed from: a, reason: collision with root package name */
    private final Va f8359a;

    /* renamed from: com.ironsource.mb$a */
    public static final class a implements InterfaceC4738y0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ F7 f8360a;

        a(F7 f7) {
            this.f8360a = f7;
        }

        @Override // com.ironsource.InterfaceC4738y0
        public AbstractC4720x0 a(boolean z, C4434h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return C4340be.z.a(adProperties, this.f8360a.f().a(), z);
        }
    }

    public C4534mb(String adUnitId, Va.b config, C4577p0 adTools, C4350c6 adControllerFactory, F7 provider, InterfaceC4527m4 currentTimeProvider, C4637s7 idFactory, X0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.f8359a = new Va(LevelPlay.AdFormat.REWARDED, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(provider), provider, currentTimeProvider, idFactory);
    }

    public final String a() {
        String uuid = this.f8359a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f8359a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f8359a.n();
    }

    public final void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f8359a.a(activity, str);
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f8359a.a(levelPlayRewardedAdListener != null ? C4552nb.b(levelPlayRewardedAdListener) : null);
    }

    public final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("LevelPlayRewardedAd.setImpressionDataListener()");
        this.f8359a.a(levelPlayImpressionDataListener);
    }

    public final LevelPlayReward a(String str) {
        IronLog.API.info("LevelPlayRewardedAd.getReward()");
        return this.f8359a.a(str);
    }

    private final a a(F7 f7) {
        return new a(f7);
    }
}
