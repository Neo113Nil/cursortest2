package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1184 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3368;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3369;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3370;

    public C1184(C1151 c1151, Activity activity, Bundle bundle) {
        this.f3368 = c1151;
        this.f3370 = activity;
        this.f3369 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (C1151.m5897(this.f3368, this.f3370)) {
            this.f3368.f3303.getClass();
            Bundle bundle = this.f3369;
            if (bundle != null) {
                bundle.putBoolean(C1151.f3295, this.f3368.f3301);
            }
            this.f3368.f3299 = true;
        }
    }
}
