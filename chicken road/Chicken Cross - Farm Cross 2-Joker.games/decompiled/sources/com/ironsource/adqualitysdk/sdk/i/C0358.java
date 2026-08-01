package com.ironsource.adqualitysdk.sdk.i;

import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ÿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0358 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1305 f457;

    public C0358(C1305 c1305) {
        this.f457 = c1305;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1305 c1305 = this.f457;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialAdListener interstitialAdListener = (InterstitialAdListener) arrayList.get(1);
        c1305.getClass();
        interstitialAd.setAdListener(interstitialAdListener);
        return null;
    }
}
