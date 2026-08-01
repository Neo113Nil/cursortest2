package com.bytedance.adsdk.pcc;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class vh implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    public Object pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (!(obj instanceof JSONArray) || !(obj2 instanceof Integer)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) obj;
        if (jSONArray.length() > 0) {
            return jSONArray.opt(((Integer) obj2).intValue() % jSONArray.length());
        }
        return null;
    }
}
