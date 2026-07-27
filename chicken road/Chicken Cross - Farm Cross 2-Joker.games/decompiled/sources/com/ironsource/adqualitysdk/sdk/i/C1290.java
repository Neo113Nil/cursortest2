package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｷ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1290 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f3674;

    public C1290(C1267 c1267) {
        this.f3674 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f3674;
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        c1267.getClass();
        return dTBAdResponse.getRenderingMap();
    }
}
