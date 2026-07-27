package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ƨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0367 extends AbstractRunnableC0730 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0357 f466;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1115 f467;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0414 f468;

    public C0367(C0357 c0357, C0414 c0414, C1115 c1115) {
        this.f466 = c0357;
        this.f468 = c0414;
        this.f467 = c1115;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0730
    /* renamed from: ﾒ */
    public final void mo5316() {
        int i;
        C0357 c0357 = this.f466;
        C0482 c0482 = c0357.f454;
        String str = c0357.f455 + StringFog.decrypt("UA==\n", "ekTX9/luKk4=\n");
        C0839 c0839 = c0482.f930;
        c0839.getClass();
        try {
            i = c0839.f2447.m5677(str);
        } catch (Throwable unused) {
            i = 0;
        }
        C0357 c03572 = this.f466;
        c03572.getClass();
        if (i <= 10000) {
            String str2 = c03572.f455 + this.f468.f545;
            if (TextUtils.isEmpty(str2)) {
                AbstractC0544.m5511(C0357.m5388(this.f466), StringFog.decrypt("HnSS5aBcENAvdJbo\n", "XRXxjcUPZL8=\n"), StringFog.decrypt("gWBexLmD0gi3aVOWuanARvJ8F9D8noFboWdF1v6PgUOwcRfR9piBR7diUtTt\n", "1Qg3t5nqoSg=\n"), null, null, true);
                return;
            }
            try {
                C0414 c0414 = this.f468;
                c0414.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringFog.decrypt("F7jcqzeF3pc=\n", "Z9ev33PkqvY=\n"), c0414.f546);
                jSONObject.put(StringFog.decrypt("KBXmKg==\n", "XWCPTk7agfQ=\n"), c0414.f545);
                String jSONObject2 = jSONObject.toString();
                AbstractC0544.m5510(C0357.m5388(this.f466), StringFog.decrypt("QOSyVgZdoXdx5LZb\n", "A4XRPmMO1Rg=\n"), StringFog.decrypt("PiEitGgXfDUSIiu5Yg0h\n", "fUBB3AF5GxU=\n"), jSONObject2, true);
                this.f466.f454.m5469(str2, jSONObject2);
            } catch (JSONException unused2) {
                return;
            }
        }
        C1115 c1115 = this.f467;
        if (c1115 != null) {
            AbstractC1145.m5891(c1115);
        }
    }
}
