package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ィ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1104 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1088 f3226;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Intent f3227;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f3228;

    public C1104(C1088 c1088, Context context, Intent intent) {
        this.f3226 = c1088;
        this.f3228 = context;
        this.f3227 = intent;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1088 c1088 = this.f3226;
        c1088.f3206.m5583(c1088.f3205, c1088.f3204, C0900.m5707(c1088.f3202, c1088.f3203, new Object[]{c1088, this.f3228, this.f3227}));
    }
}
