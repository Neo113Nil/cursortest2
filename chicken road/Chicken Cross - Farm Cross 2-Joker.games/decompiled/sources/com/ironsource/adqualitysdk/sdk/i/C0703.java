package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ย, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0703 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0698 f1900;

    public C0703(C0698 c0698) {
        this.f1900 = c0698;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        AbstractC0554 m5521 = AbstractC0554.m5521();
        C0720 c0720 = this.f1900.f1895.f1549;
        synchronized (m5521) {
            m5521.f1253.add(c0720);
        }
        AbstractC1145.m5892(new C0710(this));
    }
}
