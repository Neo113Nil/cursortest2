package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ο, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0481 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f927;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1175 f928;

    public C0481(C0470 c0470, C1175 c1175) {
        this.f927 = c0470;
        this.f928 = c1175;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean z;
        C0470 c0470 = this.f927;
        c0470.f885 = this.f928;
        synchronized (c0470) {
            z = c0470.f881;
        }
        if (z) {
            this.f928.mo5664();
        }
    }
}
