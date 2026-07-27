package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ヾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1115 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1107 f3243;

    public C1115(C1107 c1107) {
        this.f3243 = c1107;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1050 c1050 = this.f3243.f3231;
        String str = C1050.f3117;
        c1050.m5834(false);
        C0423 c0423 = this.f3243.f3232;
        if (c0423 != null) {
            try {
                c0423.mo5316();
            } catch (Exception e) {
                AbstractC0480.m5465(StringFog.decrypt("dSYNzonCck1H\n", "NEhsovC2Gy4=\n"), StringFog.decrypt("e1fOQ2PanHweVtlCdb+Dd1BRhgx+lLZ9U1XQSWWTmnw=\n", "PiW8LBH69RI=\n"), e, false, false, true);
            }
        }
    }
}
