package com.bytedance.adsdk.pcc;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class kj implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Boolean pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            if (obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj instanceof String) {
                return Boolean.valueOf(((String) obj).contains(String.valueOf(obj2)));
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0) {
                    return Boolean.valueOf(pcc(jSONArray, obj2));
                }
            }
        }
        return Boolean.FALSE;
    }

    private boolean pcc(JSONArray jSONArray, Object obj) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (jSONArray.get(i).equals(obj)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
