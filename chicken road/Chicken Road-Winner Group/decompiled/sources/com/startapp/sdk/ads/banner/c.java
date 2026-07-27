package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.q1;

/* loaded from: classes.dex */
public final class c implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f2951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerFormat f2952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f2953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f2954d;

    public c(BannerRequest.Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, q1 q1Var) {
        this.f2951a = callback;
        this.f2952b = bannerFormat;
        this.f2953c = adPreferences;
        this.f2954d = q1Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        this.f2951a.onFinished(null, String.valueOf(this.f2954d.getErrorMessage()));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f2951a.onFinished(new b(this), null);
    }
}
