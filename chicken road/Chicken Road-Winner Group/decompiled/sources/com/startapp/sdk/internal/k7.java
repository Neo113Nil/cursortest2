package com.startapp.sdk.internal;

import android.view.View;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;

/* loaded from: classes.dex */
public final class k7 extends AdManagerInterstitialAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n7 f3951a;

    public k7(n7 n7Var) {
        this.f3951a = n7Var;
    }

    public final void onAdFailedToLoad(LoadAdError adError) {
        kotlin.jvm.internal.j.e(adError, "adError");
        n7 n7Var = this.f3951a;
        n7Var.f4092d = null;
        n7Var.f4093e = null;
        com.startapp.sdk.adsbase.l lVar = n7Var.f4091c;
        if (lVar != null) {
            lVar.a(adError.toString());
        }
    }

    public final void onAdLoaded(Object obj) {
        AdManagerInterstitialAd interstitialAd = (AdManagerInterstitialAd) obj;
        kotlin.jvm.internal.j.e(interstitialAd, "interstitialAd");
        n7 n7Var = this.f3951a;
        n7Var.f4093e = null;
        n7Var.f4092d = interstitialAd;
        com.startapp.sdk.adsbase.l lVar = n7Var.f4091c;
        if (lVar != null) {
            lVar.a((View) null);
        }
    }
}
