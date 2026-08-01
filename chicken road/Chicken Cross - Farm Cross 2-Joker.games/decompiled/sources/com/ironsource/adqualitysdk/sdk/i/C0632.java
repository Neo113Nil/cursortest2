package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڙ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0632 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0594 f1733;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0810 f1734;

    public C0632(C0594 c0594, InterfaceC0810 interfaceC0810) {
        this.f1733 = c0594;
        this.f1734 = interfaceC0810;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        this.f1733.f1552.put(this.f1734, new C0662(this));
        C0594.m5548(this.f1733);
    }
}
