package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.nd;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nd f3026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdPreferences f3027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f3029d;

    public j(StartAppNativeAd startAppNativeAd, nd ndVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.f3029d = startAppNativeAd;
        this.f3026a = ndVar;
        this.f3027b = nativeAdPreferences;
        this.f3028c = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ib ibVar;
        ib ibVar2;
        Context context;
        AtomicBoolean atomicBoolean;
        if (ad != null) {
            this.f3029d.setErrorMessage(ad.getErrorMessage());
        }
        ibVar = ((Ad) this.f3029d).eventTracer;
        ((y6) ((x6) ibVar.a())).c(this.f3029d, fi.f3711g);
        ibVar2 = ((Ad) this.f3029d).eventTracer;
        ((y6) ((x6) ibVar2.a())).b(this.f3029d, fi.f3707b);
        context = ((Ad) this.f3029d).context;
        a0.a(context, this.f3028c, this.f3029d, false);
        atomicBoolean = this.f3029d.loading;
        atomicBoolean.set(false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f3029d.initNativeAdList(this.f3026a, this.f3027b, this.f3028c);
    }
}
