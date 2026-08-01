package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭖ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1160 extends C0772 {

    /* renamed from: ףּ, reason: contains not printable characters */
    public final boolean f3318;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final boolean f3319;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final int f3320;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f3321;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f3322;

    public C1160(JSONObject jSONObject) {
        this.f3318 = false;
        this.f3322 = jSONObject.optString(StringFog.decrypt("rLEvcqTVx865rCBwvdk=\n", "zdVuEdC8sac=\n"));
        this.f3321 = jSONObject.optString(StringFog.decrypt("ufEgvCjxPaKi9TGZD/UnhJ7mJ4wo7A==\n", "zpRC6kGUSuE=\n"));
        this.f3320 = jSONObject.optInt(StringFog.decrypt("fZlafmua3f1u\n", "Cvw4KAL/qrQ=\n"), -1);
        this.f3319 = jSONObject.optBoolean(StringFog.decrypt("dVdd0b0wNrZ5WVXGsCUssnU=\n", "EC88sslxVcI=\n"));
        this.f3318 = jSONObject.optBoolean(StringFog.decrypt("RS41UtzX6sdFLipi89TCwEgsOA==\n", "JE1BEb27hqU=\n"));
        this.f2227 = jSONObject.optString(StringFog.decrypt("zg7RxhvXkF7HCQ==\n", "pH2FqVK5+js=\n"));
        ArrayList arrayList = null;
        this.f2226 = TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("z54dq56cT8bC\n", "uuxx++z5Ka8=\n"))) ? null : Arrays.asList(jSONObject.optString(StringFog.decrypt("Bv7dpF7MM+gL\n", "c4yx9CypVYE=\n")).split(StringFog.decrypt("Yw==\n", "TzygHlxQUFc=\n")));
        this.f2225 = jSONObject.optBoolean(StringFog.decrypt("NcBhZq07I28lxExQuzE=\n", "QLMEMchZdQY=\n"));
        boolean z = true;
        this.f2224 = jSONObject.optBoolean(StringFog.decrypt("NkrFaNfiz/cgS8lSwg==\n", "QzmgIraUroQ=\n"), true);
        if (TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("W1uZ2Rc6XslSXA==\n", "MSjNtl5UNKw=\n"))) && !jSONObject.optBoolean(StringFog.decrypt("0VEzpHTgQazBVRWfeOd5sQ==\n", "pCJW8xGCF8U=\n")) && !jSONObject.optBoolean(StringFog.decrypt("Fzo+mDlk+GcQJjaqH2rSagw9\n", "Yklbz1wGuw8=\n"))) {
            z = false;
        }
        this.f2222 = z;
        this.f2221 = jSONObject.optBoolean(StringFog.decrypt("JHmjZd5sKpg0fYVe0msShQ==\n", "UQrGMrsOfPE=\n"));
        this.f2220 = jSONObject.optBoolean(StringFog.decrypt("PYtwkEOgFi0Ciw==\n", "SPgV1TvUZEw=\n"));
        this.f2223 = jSONObject.optBoolean(StringFog.decrypt("SjuD3FVclG1PJIPGRVK2bVo/lQ==\n", "P0jmkSAw4AQ=\n"));
        this.f2219 = jSONObject.optBoolean(StringFog.decrypt("rqDvY91KnfuKu/Bj1VSS+7A=\n", "w9WDF7Q68Z4=\n"));
        this.f2218 = jSONObject.optBoolean(StringFog.decrypt("Wd6gPCOnBn9E\n", "MLPQc033aQw=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("o68asOETwu6yqBC19w==\n", "1cZ/x5JHrac=\n"));
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object opt = optJSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
            }
        }
        if (arrayList != null) {
            this.f2217 = arrayList;
        }
    }
}
