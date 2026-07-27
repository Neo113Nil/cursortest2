package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0755 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0688 f2093;

    public C0755(C0688 c0688) {
        this.f2093 = c0688;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean mo5398;
        C0682 c0682 = this.f2093.f1875;
        String str = C0682.f1855;
        synchronized (c0682) {
            mo5398 = AbstractC0398.m5397().mo5398();
        }
        if (mo5398) {
            AbstractC1145.m5894(new C0758(this), AbstractC0398.m5397().mo5408());
        }
    }
}
