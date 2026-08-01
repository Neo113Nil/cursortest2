package com.ironsource.adqualitysdk.sdk.i;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.บ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0698 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0594 f1895;

    public C0698(C0594 c0594) {
        this.f1895 = c0594;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0594 c0594 = this.f1895;
        if (c0594.f1549 == null) {
            c0594.f1549 = new C0720(this);
            c0594.f1551.post(new C0703(this));
        }
    }
}
