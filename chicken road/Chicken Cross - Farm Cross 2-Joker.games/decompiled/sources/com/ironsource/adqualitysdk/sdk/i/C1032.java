package com.ironsource.adqualitysdk.sdk.i;

import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ọ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1032 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1025 f3061;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3062;

    public C1032(C1025 c1025, JSONObject jSONObject) {
        this.f3061 = c1025;
        this.f3062 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        C1107 c1107 = this.f3061.f3049;
        JSONObject jSONObject = this.f3062;
        c1107.f3231.f3122.m5796(jSONObject);
        C1050 c1050 = c1107.f3231;
        C1115 c1115 = new C1115(c1107);
        synchronized (c1050.f3131) {
        }
        c1050.m5833(jSONObject);
        c1050.f3131.getClass();
        C0414 c0414 = new C0414(jSONObject);
        C1035 c1035 = new C1035(c0414);
        c1035.m5812(c1050.m5828().m5773());
        c1050.f3131.m5389(c0414, c1115);
        c1050.m5826(c1035.m5810());
        AbstractC1145.m5891(c1115);
    }
}
