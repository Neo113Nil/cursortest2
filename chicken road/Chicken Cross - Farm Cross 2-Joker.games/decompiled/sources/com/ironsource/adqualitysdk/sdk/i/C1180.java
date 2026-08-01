package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮈ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1180 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f3364;

    public C1180(C1015 c1015) {
        this.f3364 = c1015;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1015 c1015 = this.f3364;
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(0);
        c1015.getClass();
        Interstitial.setInterstitialListener(interstitialListener);
        return null;
    }
}
