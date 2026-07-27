package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾍ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1307 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final HashMap f3770;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final HashMap f3771;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f3772;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final ArrayList f3773;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean f3774;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f3775;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3776;

    static {
        StringFog.decrypt("xmLo6uv9eU/JZPX45/Q=\n", "igubno6THD0=\n");
        StringFog.decrypt("sx6Vw48=\n", "wGvlpv3v9AI=\n");
        StringFog.decrypt("uHuc/yudivw=\n", "2Rnvi1n86Yg=\n");
        StringFog.decrypt("remIg9YncA==\n", "wIzl4bNVA5Q=\n");
        StringFog.decrypt("UYZTrbs=\n", "IuMn2MuPFZ4=\n");
        StringFog.decrypt("5ERXgVag\n", "gTIy7yLTATg=\n");
        StringFog.decrypt("DeISRQSimw==\n", "YIdmLWvG6E4=\n");
    }

    public C1307(String str, String str2, JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        this.f3776 = AbstractC1212.m5923(str2);
        this.f3775 = AbstractC1212.m5923(jSONObject.optString(StringFog.decrypt("KxAvW14=\n", "WGVfPixADbo=\n")));
        this.f3774 = jSONObject.optBoolean(StringFog.decrypt("MvMKKlVEpFo=\n", "U5F5Xiclxy4=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("EMBlbyv0OA==\n", "faUIDU6GSzc=\n"));
        HashMap hashMap2 = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String m5923 = AbstractC1212.m5923(optJSONArray.optString(i));
                if (m5923 != null) {
                    arrayList.add(m5923);
                }
            }
        } else {
            arrayList = null;
        }
        this.f3773 = arrayList == null ? new ArrayList() : arrayList;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("hf+XNrY=\n", "9prjQ8bEQpY=\n"));
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new C1306(optJSONArray2.optJSONObject(i2)));
            }
        } else {
            arrayList2 = null;
        }
        this.f3772 = arrayList2 == null ? new ArrayList() : arrayList2;
        JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("h9W8RmFZ\n", "4qPZKBUqKmo=\n"));
        if (optJSONObject != null) {
            hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, new C0476(optJSONObject.optJSONObject(next)));
            }
        } else {
            hashMap = null;
        }
        this.f3771 = hashMap == null ? new HashMap() : hashMap;
        C0623[] c0623Arr = {null};
        JSONObject optJSONObject2 = jSONObject.optJSONObject(StringFog.decrypt("mY8fDSnb1Q==\n", "9OprZUa/pnA=\n"));
        if (optJSONObject2 != null) {
            hashMap2 = new HashMap();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                C0623 c0623 = new C0623(str, this.f3776, next2, optJSONObject2.optJSONObject(next2), c0623Arr[0]);
                c0623Arr[0] = c0623;
                hashMap2.put(next2, c0623);
            }
        }
        this.f3770 = hashMap2 == null ? new HashMap() : hashMap2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f3770.values());
        Collections.sort(arrayList, new C0324());
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((C0623) it.next()).toString());
            sb.append("\n\n");
        }
        return sb.toString();
    }
}
