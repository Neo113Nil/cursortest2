package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܬ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0658 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0651 f1804;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0969 f1805;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1806;

    public C0658(C0651 c0651, String str, C0969 c0969, boolean z) {
        this.f1804 = c0651;
        this.f1806 = str;
        this.f1805 = c0969;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0667 m5609 = this.f1804.m5609(this.f1806);
        if (m5609 != null) {
            C0969 c0969 = this.f1805;
            C1042 c1042 = c0969.f2812;
            m5609.f1827 = c1042.f3103;
            m5609.f1826 = c1042.f3102;
            m5609.f1825 = c0969.f2809.m5527();
            if (StringFog.decrypt("Ih3huyMN8A==\n", "Z1Og+W9ItKo=\n").equals(m5609.f1825) || StringFog.decrypt("jwWpj64N1W0=\n", "y0z6zuxBkCk=\n").equals(m5609.f1825)) {
                m5609.f1825 = C0667.f1819;
            }
            C1042 c10422 = c0969.f2812;
            m5609.f1824 = c10422.f3101;
            m5609.f1823 = c10422.f3100;
            m5609.f1822 = c0969.m5788();
        }
    }
}
