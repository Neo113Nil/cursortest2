package com.ironsource;

import android.app.Activity;
import com.ironsource.Va;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4294ab {

    /* renamed from: a, reason: collision with root package name */
    private final F7 f8078a;
    private final Va b;

    /* renamed from: com.ironsource.ab$a */
    public static final class a implements InterfaceC4738y0 {
        a() {
        }

        @Override // com.ironsource.InterfaceC4738y0
        public AbstractC4720x0 a(boolean z, C4434h0 adProperties) {
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            return B9.z.a(adProperties, C4294ab.this.f8078a.f().a(), z);
        }
    }

    public C4294ab(String adUnitId, Va.b config, C4577p0 adTools, C4350c6 adControllerFactory, F7 provider, InterfaceC4527m4 currentTimeProvider, C4637s7 idFactory, X0 adUnitValidator) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adControllerFactory, "adControllerFactory");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(idFactory, "idFactory");
        Intrinsics.checkNotNullParameter(adUnitValidator, "adUnitValidator");
        this.f8078a = provider;
        this.b = new Va(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, adUnitValidator, a(), provider, currentTimeProvider, idFactory);
    }

    public final String b() {
        String uuid = this.b.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "fullScreenAdInternal.adId.toString()");
        return uuid;
    }

    public final boolean c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.b.m();
    }

    public final void d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.b.n();
    }

    public final void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.b.a(levelPlayInterstitialAdListener != null ? C4337bb.b(levelPlayInterstitialAdListener) : null);
    }

    public final void a(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setImpressionDataListener()");
        this.b.a(levelPlayImpressionDataListener);
    }

    public final void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.b.a(activity, str);
    }

    private final InterfaceC4738y0 a() {
        return new a();
    }
}
