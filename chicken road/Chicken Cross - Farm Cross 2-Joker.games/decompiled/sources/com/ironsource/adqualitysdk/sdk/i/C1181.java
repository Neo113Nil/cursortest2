package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮉ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1181 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3365;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3366;

    public C1181(C1151 c1151, Activity activity) {
        this.f3365 = c1151;
        this.f3366 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (C1151.m5897(this.f3365, this.f3366)) {
            this.f3365.f3303.onActivityPaused(this.f3366);
        }
    }
}
