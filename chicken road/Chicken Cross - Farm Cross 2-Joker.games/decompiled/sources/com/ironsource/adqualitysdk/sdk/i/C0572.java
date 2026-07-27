package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ח, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0572 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1325;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityCustomMediationRevenue f1326;

    public C0572(C0563 c0563, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        this.f1325 = c0563;
        this.f1326 = iSAdQualityCustomMediationRevenue;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f1325.f1277.m5634(StringFog.decrypt("BzvEUMEAKmcEcM9X7BE1bQYOzFjZJiZ+\n", "al6gOaB0Qwg=\n"), Collections.singletonList(C0563.m5531(this.f1325, this.f1326)));
    }
}
