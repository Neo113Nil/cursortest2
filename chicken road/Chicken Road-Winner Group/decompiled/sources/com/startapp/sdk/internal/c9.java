package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestMode;
import com.startapp.sdk.adsbase.model.GetAdRequest$VideoRequestType;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public final class c9 extends com.startapp.sdk.adsbase.model.a {

    /* renamed from: V0, reason: collision with root package name */
    public boolean f3531V0;
    public boolean W0;

    /* renamed from: X0, reason: collision with root package name */
    public String f3532X0;

    /* renamed from: Y0, reason: collision with root package name */
    public String f3533Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public String f3534Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f3535a1;

    /* renamed from: b1, reason: collision with root package name */
    public Integer f3536b1;

    /* renamed from: c1, reason: collision with root package name */
    public String f3537c1;

    public c9() {
        ExternalAdConfig googleads;
        ExternalConfig u3 = MetaData.E().u();
        if (u3 != null && (googleads = u3.getGoogleads()) != null) {
            googleads.getDparam();
        }
        this.f3536b1 = 0;
    }

    @Override // com.startapp.sdk.adsbase.model.a, com.startapp.sdk.internal.y1
    public final void a(se requestParamsHolder) {
        kotlin.jvm.internal.j.e(requestParamsHolder, "requestParamsHolder");
        super.a(requestParamsHolder);
        requestParamsHolder.a("googleAd", Boolean.TRUE, true, true);
        requestParamsHolder.a("served", Boolean.valueOf(this.W0), true, true);
        requestParamsHolder.a("sessionId", this.f3532X0, false, true);
        requestParamsHolder.a("requestTs", this.f3534Z0, false, true);
        if (this.n0 == AdPreferences.Placement.INAPP_BANNER) {
            Integer num = this.f3536b1;
            requestParamsHolder.a("bnrt", Integer.valueOf(num != null ? num.intValue() : 0), false, true);
            requestParamsHolder.a("fixedSize", Boolean.FALSE, false, true);
            requestParamsHolder.a("type", 1, false, true);
        } else {
            requestParamsHolder.a("video", this.f3531V0 ? GetAdRequest$VideoRequestType.FORCED : GetAdRequest$VideoRequestType.ENABLED, false, true);
            requestParamsHolder.a("videoMode", this.f3531V0 ? GetAdRequest$VideoRequestMode.REWARDED : GetAdRequest$VideoRequestMode.INTERSTITIAL, false, true);
            requestParamsHolder.a("type", Integer.valueOf(this.f3531V0 ? 11 : 4), false, true);
        }
        requestParamsHolder.a("price", this.f3533Y0, false, true);
        requestParamsHolder.a("bidPrice", this.f3537c1, false, true);
        requestParamsHolder.a("reason", Integer.valueOf(this.f3535a1), false, true);
    }
}
