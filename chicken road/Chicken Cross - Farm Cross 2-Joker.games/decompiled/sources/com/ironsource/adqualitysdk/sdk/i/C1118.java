package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.丫, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1118 extends AbstractRunnableC0730 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1111 f3247;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0406 f3248;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0650 f3249;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3250;

    public C1118(C1111 c1111, JSONObject jSONObject, C0650 c0650, C0406 c0406) {
        this.f3247 = c1111;
        this.f3250 = jSONObject;
        this.f3249 = c0650;
        this.f3248 = c0406;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        String m5880 = C1111.m5880(this.f3247, this.f3250);
        C0447 c0447 = (C0447) this.f3247.f3237.get(m5880);
        if (c0447 == null) {
            c0447 = new C0447(this.f3250, this.f3249);
            this.f3247.f3237.put(m5880, c0447);
        } else {
            JSONObject jSONObject = this.f3250;
            C0650 c0650 = this.f3249;
            c0447.f744 = new C0448(jSONObject);
            c0447.f750 = c0650;
        }
        c0447.f3235 = this.f3248;
    }
}
