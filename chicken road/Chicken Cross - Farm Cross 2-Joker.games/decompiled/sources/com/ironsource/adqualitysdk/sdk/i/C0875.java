package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᕪ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0875 implements InterfaceC0919 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0808 f2498;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0823 f2499;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0597 f2500;

    public C0875(C0808 c0808, AbstractC0597 abstractC0597, InterfaceC0823 interfaceC0823) {
        this.f2498 = c0808;
        this.f2500 = abstractC0597;
        this.f2499 = interfaceC0823;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0919
    /* renamed from: ﾒ */
    public final void mo5490() {
        C0455 c0455 = this.f2498.f2353.f2207.f1171;
        synchronized (c0455) {
            c0455.f845.remove(this);
        }
        this.f2498.f2353.m5655(this.f2500, this.f2499);
    }
}
