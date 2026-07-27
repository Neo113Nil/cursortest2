package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.υ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0484 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f931;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1148 f932;

    public C0484(C0470 c0470, C1148 c1148) {
        this.f931 = c0470;
        this.f932 = c1148;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean z;
        C0470 c0470 = this.f931;
        synchronized (c0470) {
            z = c0470.f881;
        }
        if (z) {
            this.f932.mo5664();
        } else {
            this.f931.f884.add(this.f932);
        }
    }
}
