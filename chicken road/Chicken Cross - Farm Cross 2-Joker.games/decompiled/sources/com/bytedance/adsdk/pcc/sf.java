package com.bytedance.adsdk.pcc;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class sf implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    public Object pcc(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String valueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(valueOf)) {
            return null;
        }
        return Uri.decode(valueOf);
    }
}
