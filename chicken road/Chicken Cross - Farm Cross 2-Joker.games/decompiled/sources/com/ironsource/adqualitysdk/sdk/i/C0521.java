package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ь, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0521 extends AbstractC1102 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1186 = StringFog.decrypt("iayg\n", "7NjUuPT3o4c=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1185 = StringFog.decrypt("mP4lZA==\n", "/YpRFy6TleI=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1184 = StringFog.decrypt("pOrv6OMB\n", "0JiOgZdyGw8=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m5491() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optString(f1186);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final JSONArray m5492() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3224;
        }
        return jSONObject.optJSONArray(f1185);
    }
}
