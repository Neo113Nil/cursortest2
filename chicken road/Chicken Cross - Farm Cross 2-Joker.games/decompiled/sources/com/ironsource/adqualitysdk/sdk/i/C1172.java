package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭴ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1172 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3352;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3353;

    public C1172(C1151 c1151, Activity activity) {
        this.f3352 = c1151;
        this.f3353 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (C1151.m5897(this.f3352, this.f3353)) {
            AbstractC1145.m5895(new C1173(this));
            C1151 c1151 = this.f3352;
            if (c1151.f3300 && !c1151.f3299 && this.f3353.isFinishing()) {
                C1151 c11512 = this.f3352;
                c11512.m5660(this.f3353);
                c11512.f3301 = false;
            }
        }
    }
}
