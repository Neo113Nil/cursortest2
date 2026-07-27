package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺙ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1225 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3458;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f3459;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3460;

    public C1225(C1151 c1151, Activity activity, Bundle bundle) {
        this.f3458 = c1151;
        this.f3460 = activity;
        this.f3459 = bundle;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        if (C1151.m5897(this.f3458, this.f3460)) {
            this.f3458.f3303.getClass();
            this.f3458.getClass();
            C1151 c1151 = this.f3458;
            c1151.f3300 = false;
            Bundle bundle = this.f3459;
            if (bundle == null) {
                c1151.f3301 = false;
                return;
            }
            c1151.f3301 = bundle.getBoolean(C1151.f3295);
            C1151 c11512 = this.f3458;
            if (c11512.f3301) {
                c11512.f3300 = true;
            }
            c11512.f3298 = true;
        }
    }
}
