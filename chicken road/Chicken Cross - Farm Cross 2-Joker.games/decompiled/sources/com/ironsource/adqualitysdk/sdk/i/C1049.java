package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ἵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1049 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f3112;

    public C1049(C1015 c1015) {
        this.f3112 = c1015;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1015 c1015 = this.f3112;
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        c1015.getClass();
        return impressionData.getPlacementType();
    }
}
