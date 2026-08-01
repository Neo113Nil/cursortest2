package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.র, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0678 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1849;

    public C0678(C0582 c0582) {
        this.f1849 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1849;
        InterstitialAd interstitialAd = (InterstitialAd) arrayList.get(0);
        InterstitialListener interstitialListener = (InterstitialListener) arrayList.get(1);
        c0582.getClass();
        interstitialAd.setListener(interstitialListener);
        return null;
    }
}
