package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾌ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1306 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f3764;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3765;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List f3766;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject f3767;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f3768;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3769;

    static {
        StringFog.decrypt("24CBMw==\n", "r/nxVuLxIX8=\n");
        StringFog.decrypt("+yh+NR0Q\n", "mkwqTG11O9k=\n");
        StringFog.decrypt("KcJcy5XD\n", "WaMuqviwrp0=\n");
        StringFog.decrypt("cAR7mVI6UsZ0FA==\n", "EWcP8CRTJq8=\n");
        StringFog.decrypt("oP2cAw438OGz5g==\n", "1pT5dEhenJU=\n");
        StringFog.decrypt("VflUwCnT2ONl+ULiJcQ=\n", "Ipw2lkC2r5A=\n");
    }

    public C1306(JSONObject jSONObject) {
        this.f3768 = ISAdQualityAdType.UNKNOWN;
        this.f3769 = AbstractC1212.m5923(jSONObject.optString(StringFog.decrypt("4T+eoQ==\n", "lUbuxIXvRxg=\n")));
        String m5923 = AbstractC1212.m5923(jSONObject.optString(StringFog.decrypt("VAN1NuiM\n", "NWchT5jpzQQ=\n")));
        if (!TextUtils.isEmpty(m5923)) {
            this.f3768 = ISAdQualityAdType.fromInt(Integer.parseInt(m5923));
        }
        this.f3767 = jSONObject.optJSONObject(StringFog.decrypt("gi4o2FvJ\n", "8k9auTa6su8=\n"));
        String decrypt = StringFog.decrypt("dJCtv8VpZAdwgA==\n", "FfPZ1rMAEG4=\n");
        List arrayList = new ArrayList();
        String str = AbstractC0647.f1786;
        JSONArray optJSONArray = jSONObject.optJSONArray(decrypt);
        this.f3766 = optJSONArray != null ? AbstractC0647.m5604(optJSONArray) : arrayList;
        this.f3765 = AbstractC1212.m5923(jSONObject.optString(StringFog.decrypt("3A/+dygEUGHPFA==\n", "qmabAG5tPBU=\n")));
        this.f3764 = AbstractC1212.m5923(jSONObject.optString(StringFog.decrypt("e6/RKZ/Hbg1Lr8cLk9A=\n", "DMqzf/aiGX4=\n")));
    }
}
