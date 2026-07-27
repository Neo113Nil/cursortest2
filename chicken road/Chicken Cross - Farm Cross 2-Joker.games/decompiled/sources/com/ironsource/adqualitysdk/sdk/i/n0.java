package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class n0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f207;

    public n0(o0 o0Var) {
        this.f207 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f207;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdEventListener interstitialAdEventListener = (InterstitialAdEventListener) arrayList.get(1);
        o0Var.getClass();
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        return null;
    }
}
