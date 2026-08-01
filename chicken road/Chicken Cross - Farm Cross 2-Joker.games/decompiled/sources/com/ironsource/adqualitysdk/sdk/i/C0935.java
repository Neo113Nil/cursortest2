package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import java.util.Collections;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴬ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0935 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0923 f2625;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2626;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2627;

    public C0935(C0923 c0923, String str, Activity activity) {
        this.f2625 = c0923;
        this.f2627 = str;
        this.f2626 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1226.m5926(this.f2625.f2571, this.f2627, false, false, Collections.singletonList(this.f2626));
    }
}
