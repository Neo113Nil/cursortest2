package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ȳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0387 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f498;

    public C0387(C1267 c1267) {
        this.f498 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f498;
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        c1267.getClass();
        return Boolean.valueOf(dTBAdSize.isInterstitialAd());
    }
}
