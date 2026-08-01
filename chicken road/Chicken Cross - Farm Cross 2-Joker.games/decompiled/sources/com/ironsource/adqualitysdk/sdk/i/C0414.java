package com.ironsource.adqualitysdk.sdk.i;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʎ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0414 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f545;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f546;

    public C0414(JSONObject jSONObject) {
        String uuid = UUID.randomUUID().toString();
        this.f546 = jSONObject;
        this.f545 = uuid;
    }

    public C0414(String str, JSONObject jSONObject) {
        this.f546 = jSONObject;
        this.f545 = str;
    }
}
