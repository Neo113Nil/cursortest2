package com.ironsource.adqualitysdk.sdk.i;

import java.util.Calendar;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ϛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0490 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0482 f1125;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f1126;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1127;

    public C0490(C0482 c0482, String str, String str2) {
        this.f1125 = c0482;
        this.f1127 = str;
        this.f1126 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C0482 c0482 = this.f1125;
        String str = this.f1127;
        c0482.m5469(str, this.f1126);
        String m5940 = AbstractC1257.m5940("kc0DQyELDebe1Qc=\n", "v6FiMFV+fYI=\n", new StringBuilder().append(str));
        String str2 = AbstractC0494.f1141;
        c0482.m5469(m5940, Long.toString(Calendar.getInstance().getTimeInMillis()));
        this.f1125.getClass();
    }
}
