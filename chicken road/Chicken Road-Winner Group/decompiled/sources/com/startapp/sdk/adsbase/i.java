package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;

/* loaded from: classes.dex */
public final class i implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3229b;

    public i(StartAppAd startAppAd, AdEventListener adEventListener) {
        this.f3229b = startAppAd;
        this.f3228a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ((y6) ((x6) this.f3229b.eventTracer.a())).c(this.f3229b, fi.f3711g);
        ((y6) ((x6) this.f3229b.eventTracer.a())).b(this.f3229b, fi.f3706a);
        StartAppAd startAppAd = this.f3229b;
        a0.a(startAppAd.context, this.f3228a, startAppAd, false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        ((y6) ((x6) this.f3229b.eventTracer.a())).c(this.f3229b, fi.f);
        ((y6) ((x6) this.f3229b.eventTracer.a())).b(this.f3229b, fi.f3706a);
        StartAppAd startAppAd = this.f3229b;
        a0.b(startAppAd.context, this.f3228a, startAppAd, false);
    }
}
