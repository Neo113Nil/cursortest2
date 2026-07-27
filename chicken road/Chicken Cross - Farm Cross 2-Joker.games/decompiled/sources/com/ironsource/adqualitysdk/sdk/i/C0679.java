package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.শ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0679 extends AbstractC1102 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f1851 = StringFog.decrypt("bxdqe+gHKqR+Cw==\n", "DHgEFY1kXss=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f1850 = StringFog.decrypt("AA==\n", "c2iAd9KdDmg=\n") + UUID.randomUUID().toString().replace(StringFog.decrypt("Xw==\n", "cuXsiwyW0EM=\n"), "");

    public C0679(C1161 c1161) {
        this.f3223 = c1161;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m5616() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.has(this.f1851);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5617(String str) {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(this.f1851);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        if (optJSONObject2 != null) {
            return optJSONObject2.optString(StringFog.decrypt("LnmxnQ+k2zs/QLqBGa7AOg==\n", "TRbf82rHr1Q=\n"));
        }
        return null;
    }
}
