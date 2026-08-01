package com.ironsource.adqualitysdk.sdk.i;

import com.amazon.aps.ads.ApsAd;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1311 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1267 f3781;

    public C1311(C1267 c1267) {
        this.f3781 = c1267;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1267 c1267 = this.f3781;
        ApsAd apsAd = (ApsAd) arrayList.get(0);
        c1267.getClass();
        return apsAd.getAdLoader();
    }
}
