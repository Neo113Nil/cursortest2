package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ί, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1065 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f3169;

    public C1065(C0971 c0971) {
        this.f3169 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0971 c0971 = this.f3169;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c0971.getClass();
        return campaignEx.getPackageName();
    }
}
