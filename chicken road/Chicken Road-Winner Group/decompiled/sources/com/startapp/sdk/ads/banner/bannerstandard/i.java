package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ba;
import com.startapp.sdk.internal.f7;
import com.startapp.sdk.internal.g7;
import d2.C0279i;
import o2.l;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MetaData f2948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2949e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i(Object obj, Object obj2, AdUnitConfig adUnitConfig, int i3, MetaData metaData, int i4) {
        this.f2945a = i4;
        this.f2949e = obj;
        this.f = obj2;
        this.f2946b = adUnitConfig;
        this.f2947c = i3;
        this.f2948d = metaData;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        C0279i lambda$loadExternalInline$0;
        C0279i a3;
        switch (this.f2945a) {
            case 0:
                BannerStandard bannerStandard = (BannerStandard) this.f2949e;
                AdUnitConfig adUnitConfig = this.f2946b;
                int i3 = this.f2947c;
                lambda$loadExternalInline$0 = bannerStandard.lambda$loadExternalInline$0((g7) this.f, adUnitConfig, i3, this.f2948d, (ba) obj);
                return lambda$loadExternalInline$0;
            default:
                StartAppAd startAppAd = (StartAppAd) this.f2949e;
                AdUnitConfig adUnitConfig2 = this.f2946b;
                int i4 = this.f2947c;
                a3 = startAppAd.a((AdEventListener) this.f, adUnitConfig2, i4, this.f2948d, (f7) obj);
                return a3;
        }
    }
}
