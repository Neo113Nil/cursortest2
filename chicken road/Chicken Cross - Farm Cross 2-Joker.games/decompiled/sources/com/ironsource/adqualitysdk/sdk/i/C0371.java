package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ƴ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0371 extends AbstractRunnableC0730 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0368 f473;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f474;

    public C0371(C0368 c0368, int i) {
        this.f473 = c0368;
        this.f474 = i;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        int i;
        JSONObject jSONObject;
        C1051 c1051 = this.f473.f470;
        if (this.f474 >= c1051.f3135.m5828().m5774()) {
            i = 0;
        } else {
            C1050 c1050 = c1051.f3135;
            if (c1050.m5828() == null || ((C0470) AbstractC0398.m5397()).f879) {
                i = 100;
            } else {
                C0936 m5828 = c1050.m5828();
                synchronized (m5828) {
                    jSONObject = m5828.f3224;
                }
                i = jSONObject.optInt(StringFog.decrypt("wKaS\n", "pdXmIYVbvAs=\n"), m5828.f2633);
            }
        }
        C1050 c10502 = c1051.f3135;
        c10502.f3129.removeCallbacksAndMessages(null);
        c10502.f3129.postDelayed(new C1247(c10502), i);
    }
}
