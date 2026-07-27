package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒎ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0773 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0761 f2228;

    public C0773(C0761 c0761) {
        this.f2228 = c0761;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean mo5398;
        C0682 c0682 = this.f2228.f2194;
        String str = C0682.f1855;
        synchronized (c0682) {
            mo5398 = AbstractC0398.m5397().mo5398();
        }
        if (mo5398) {
            C0682.m5624(this.f2228.f2194);
        }
    }
}
