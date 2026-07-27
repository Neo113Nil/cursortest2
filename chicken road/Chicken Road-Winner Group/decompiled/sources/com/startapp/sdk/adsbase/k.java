package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.d7;

/* loaded from: classes.dex */
public final class k implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f3233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3234c;

    public k(StartAppAd startAppAd, i iVar, AdPreferences adPreferences) {
        this.f3234c = startAppAd;
        this.f3232a = iVar;
        this.f3233b = adPreferences;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        StartAppAd.AdMode adMode;
        String adTag = this.f3233b.getAdTag();
        adMode = this.f3234c.f3124g;
        if (d7.a(true, adTag, false, adMode == StartAppAd.AdMode.REWARDED_VIDEO)) {
            this.f3234c.b(this.f3232a, 2);
        } else {
            this.f3232a.onFailedToReceiveAd(ad);
        }
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f3232a.onReceiveAd(ad);
    }
}
