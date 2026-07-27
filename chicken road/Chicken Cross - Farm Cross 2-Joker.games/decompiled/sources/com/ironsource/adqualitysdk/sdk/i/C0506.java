package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Т, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0506 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0470 f1152;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0942 f1153;

    public C0506(C0470 c0470, InterfaceC0942 interfaceC0942) {
        this.f1152 = c0470;
        this.f1153 = interfaceC0942;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        boolean z;
        this.f1152.f883.add(this.f1153);
        C0470 c0470 = this.f1152;
        synchronized (c0470) {
            z = c0470.f881;
        }
        if (z) {
            this.f1153.mo5664();
        }
    }
}
