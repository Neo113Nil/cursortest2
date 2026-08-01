package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1266 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3576;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3577;

    public C1266(C1151 c1151, Activity activity) {
        this.f3576 = c1151;
        this.f3577 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (C1151.m5897(this.f3576, this.f3577)) {
            AbstractC1145.m5895(new C1302(this));
            C1151 c1151 = this.f3576;
            if (c1151.f3300 && c1151.f3301 && this.f3577.isFinishing()) {
                C1151 c11512 = this.f3576;
                c11512.m5660(this.f3577);
                c11512.f3301 = false;
            }
        }
    }
}
