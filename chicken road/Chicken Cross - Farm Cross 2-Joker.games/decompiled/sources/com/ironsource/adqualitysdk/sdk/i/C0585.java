package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.צ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0585 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1413;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualityCustomMediationRevenue f1414;

    public C0585(C0563 c0563, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        this.f1413 = c0563;
        this.f1414 = iSAdQualityCustomMediationRevenue;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f1413.f1277.m5634(StringFog.decrypt("6D1uZfZMew3rdmVi1E1hFuo1WGnh\n", "hVgKDJc4EmI=\n"), Collections.singletonList(C0563.m5531(this.f1413, this.f1414)));
        this.f1413.f1278 = true;
    }
}
