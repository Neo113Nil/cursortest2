package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Y extends C0772 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final String f140;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f141;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f142;

    public Y() {
    }

    public Y(JSONObject jSONObject) {
        this.f141 = jSONObject.optString(StringFog.decrypt("LXKT3CN+WSo2doL5BHpDDApllOwjYw==\n", "WhfxikobLmk=\n"));
        this.f142 = jSONObject.optString(StringFog.decrypt("rMz0bOoktwGp6/B2zA==\n", "2qWRG6lI1nI=\n"));
        this.f140 = jSONObject.optString(StringFog.decrypt("ksi1k81AyUKH3peExlL2Uw==\n", "4qnH9qM0nys=\n"));
        this.f2227 = jSONObject.optString(StringFog.decrypt("r8B6Iu8snzamxw==\n", "xbMuTaZC9VM=\n"));
        this.f2225 = false;
        this.f2222 = !TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("BkiCmIsG4cYPTw==\n", "bDvW98Joi6M=\n"))) || jSONObject.optBoolean(StringFog.decrypt("kHYY/wcW04aAcj7ECxHrmw==\n", "5QV9qGJ0he8=\n")) || jSONObject.optBoolean(StringFog.decrypt("nWaFuFztBtOaeo2KeuMs3oZh\n", "6BXg7zmPRbs=\n"));
        this.f2221 = jSONObject.optBoolean(StringFog.decrypt("IMLPug+XQzgwxumBA5B7JQ==\n", "VbGq7Wr1FVE=\n"));
        this.f2220 = jSONObject.optBoolean(StringFog.decrypt("N5T19/qLZrkIlA==\n", "QueQsoL/FNg=\n"));
        ArrayList arrayList = null;
        this.f2226 = TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("4JPvge7aGNDt\n", "leGD0Zy/frk=\n"))) ? null : Arrays.asList(jSONObject.optString(StringFog.decrypt("s8s2b2V9NVi+\n", "xrlaPxcYUzE=\n")).split(StringFog.decrypt("DQ==\n", "IZZOWRas3SI=\n")));
        this.f2224 = jSONObject.optBoolean(StringFog.decrypt("JjXuuceDa3cwNOKD0g==\n", "U0aL86b1CgQ=\n"), true);
        this.f2223 = false;
        this.f2219 = jSONObject.optBoolean(StringFog.decrypt("RlgR1kG1t21iQw7WSau4bVg=\n", "Ky19oijF2wg=\n"));
        this.f2218 = jSONObject.optBoolean(StringFog.decrypt("fyZ8zrqvSJxi\n", "FksMgdT/J+8=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("4tItKrdaK6jz1ScvoQ==\n", "lLtIXcQOROE=\n"));
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
