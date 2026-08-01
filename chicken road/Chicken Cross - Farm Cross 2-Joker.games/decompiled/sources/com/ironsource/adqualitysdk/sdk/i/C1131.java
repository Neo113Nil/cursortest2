package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.爫, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1131 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1111 f3265;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0421 f3266;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3267;

    public C1131(C1111 c1111, JSONObject jSONObject, C0421 c0421) {
        this.f3265 = c1111;
        this.f3267 = jSONObject;
        this.f3266 = c0421;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String m5880 = C1111.m5880(this.f3265, this.f3267);
        Z z = (Z) this.f3265.f3238.get(m5880);
        if (z == null) {
            z = new Z(this.f3267);
            this.f3265.f3238.put(m5880, z);
        } else {
            z.m5340(this.f3267);
        }
        z.f3235 = this.f3266;
    }
}
