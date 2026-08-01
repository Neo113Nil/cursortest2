package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Κ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0467 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f867;

    public C0467(C1267 c1267) {
        this.f867 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f867;
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        c1267.getClass();
        return dTBAdSize.getSlotUUID();
    }
}
