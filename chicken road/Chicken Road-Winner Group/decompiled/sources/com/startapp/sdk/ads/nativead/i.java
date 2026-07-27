package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f3022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f3025d;

    public i(StartAppNativeAd startAppNativeAd, int i3, AdEventListener adEventListener) {
        this.f3025d = startAppNativeAd;
        this.f3023b = i3;
        this.f3024c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.f3022a + 1;
        this.f3022a = i3;
        if (i3 == this.f3023b) {
            this.f3025d.onReceiveAd(this.f3024c);
        }
    }
}
