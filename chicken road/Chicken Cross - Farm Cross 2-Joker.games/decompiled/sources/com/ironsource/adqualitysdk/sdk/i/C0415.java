package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.base.entity.CampaignEx;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʏ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0415 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0333 f547;

    public C0415(C0333 c0333) {
        this.f547 = c0333;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0333 c0333 = this.f547;
        CampaignEx campaignEx = (CampaignEx) arrayList.get(0);
        c0333.getClass();
        return campaignEx.getClickURL();
    }
}
