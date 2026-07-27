package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class E {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean f104;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f105;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f106;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f107;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f108;

    static {
        StringFog.decrypt("08CgUT3KDlD35q1pMsYe\n", "hKXCB1SveRo=\n");
        StringFog.decrypt("7UUqqJ3c1Q==\n", "mjdL2O25p/M=\n");
        StringFog.decrypt("52jEQ+m9\n", "hAepLobTY4Y=\n");
        StringFog.decrypt("DUlIYeU=\n", "aDE8E4TQ3wY=\n");
        StringFog.decrypt("PQz2iXH0ug==\n", "SmmU/xiRzbE=\n");
        StringFog.decrypt("kLmSqPldWw2vuQ==\n", "5cr37YEpKWw=\n");
    }

    public E(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f108 = jSONObject.optString(StringFog.decrypt("htjzeNWxjA==\n", "8aqSCKXU/jg=\n"));
            this.f107 = jSONObject.optString(StringFog.decrypt("fQ7/hpqU\n", "HmGS6/X6mPQ=\n"));
            this.f106 = jSONObject.optString(StringFog.decrypt("YkwFy5w=\n", "BzRxuf12w6w=\n"));
            this.f105 = jSONObject.optString(StringFog.decrypt("mtqZX4namg==\n", "7b/7KeC/7RY=\n"));
            this.f104 = jSONObject.optBoolean(StringFog.decrypt("gSRnPswwvbq+JA==\n", "9FcCe7REz9s=\n"));
        }
    }
}
