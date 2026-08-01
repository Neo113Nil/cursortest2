package com.bytedance.adsdk.pcc;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class pcc implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    public Object pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray(valueOf);
            int parseInt = Integer.parseInt(String.valueOf(objArr[1]));
            for (int i = 0; i < jSONArray2.length(); i += parseInt) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                for (int i2 = 0; i2 < parseInt; i2++) {
                    int i3 = i + i2;
                    if (i3 >= jSONArray2.length()) {
                        break;
                    }
                    jSONArray3.put(jSONArray2.optJSONObject(i3));
                }
                jSONObject2.put("$chunk", jSONArray3);
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
