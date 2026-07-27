package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻛ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1243 extends AbstractRunnableC0730 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1151 f3527;

    public C1243(C1151 c1151) {
        this.f3527 = c1151;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        try {
            C1151 c1151 = this.f3527;
            c1151.f3302 = Class.forName(c1151.f3297.f3322);
            AbstractC1145.m5891(new C1310(this));
        } catch (ClassNotFoundException e) {
            AbstractC0544.m5502(StringFog.decrypt("2qyfbm8jLkbaq6Nmdy42Wuk=\n", "m8/rBxlKWj8=\n"), StringFog.decrypt("C/mqZSsPe609/71kMEFw5Drk+G8vSnmwPau3bHk=\n", "TovYClkvF8Q=\n") + this.f3527.f3297.f3322 + StringFog.decrypt("yK0=\n", "8o0PVq1dBrY=\n") + e.getLocalizedMessage());
        }
    }
}
