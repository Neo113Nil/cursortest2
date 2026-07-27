package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ঌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0663 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0651 f1813;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0676 f1814;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1815;

    public C0663(C0651 c0651, String str, EnumC0676 enumC0676) {
        this.f1813 = c0651;
        this.f1815 = str;
        this.f1814 = enumC0676;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0667 m5609 = this.f1813.m5609(this.f1815);
        if (m5609 != null) {
            m5609.f1820 = this.f1814;
            m5609.m5612(EnumC0670.f1831);
        }
    }
}
