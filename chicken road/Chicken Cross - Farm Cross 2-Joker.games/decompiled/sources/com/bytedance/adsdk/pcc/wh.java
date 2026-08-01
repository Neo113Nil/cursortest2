package com.bytedance.adsdk.pcc;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class wh implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public String pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(valueOf);
            String valueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(valueOf2)) {
                return null;
            }
            Object pcc = com.bytedance.adsdk.pcc.sf.pcc.pcc(valueOf2).pcc(jSONObject2);
            if (TextUtils.isEmpty(String.valueOf(pcc))) {
                if (objArr.length >= 3) {
                    return String.valueOf(objArr[2]);
                }
                return null;
            }
            return String.valueOf(pcc);
        } catch (JSONException unused) {
            return null;
        }
    }
}
