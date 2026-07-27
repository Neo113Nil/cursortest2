package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ł, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0347 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f442;

    public C0347(C1267 c1267) {
        this.f442 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f442;
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        c1267.getClass();
        return apsAd.getSlotUuid();
    }
}
