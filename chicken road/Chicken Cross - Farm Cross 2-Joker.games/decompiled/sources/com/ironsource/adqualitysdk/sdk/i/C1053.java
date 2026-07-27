package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ὶ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1053 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1036 f3137;

    public C1053(C1036 c1036) {
        this.f3137 = c1036;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1036 c1036 = this.f3137;
        OguryInterstitialAd oguryInterstitialAd = (OguryInterstitialAd) arrayList.get(0);
        OguryInterstitialAdListener oguryInterstitialAdListener = (OguryInterstitialAdListener) arrayList.get(1);
        c1036.getClass();
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        return null;
    }
}
