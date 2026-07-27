package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Λ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0468 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f868;

    public C0468(C1267 c1267) {
        this.f868 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f868;
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(1);
        c1267.getClass();
        return dTBAdResponse.getPricePoints(dTBAdSize);
    }
}
