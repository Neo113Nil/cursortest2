package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƫ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0368 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0357 f469;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1051 f470;

    public C0368(C0357 c0357, C1051 c1051) {
        this.f469 = c0357;
        this.f470 = c1051;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        int i;
        C0357 c0357 = this.f469;
        C0482 c0482 = c0357.f454;
        String str = c0357.f455 + StringFog.decrypt("Iw==\n", "CTdn58THnmU=\n");
        C0839 c0839 = c0482.f930;
        c0839.getClass();
        try {
            i = c0839.f2447.m5677(str);
        } catch (Throwable unused) {
            i = 0;
        }
        AbstractC1145.m5891(new C0371(this, i));
    }
}
