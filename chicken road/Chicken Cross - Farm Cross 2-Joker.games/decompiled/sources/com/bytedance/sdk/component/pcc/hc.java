package com.bytedance.sdk.component.pcc;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class hc {
    private final Map<String, Object> pcc = new ConcurrentHashMap();

    public static hc pcc() {
        return new hc();
    }

    private hc() {
    }

    public hc pcc(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.pcc.put(str, obj);
        }
        return this;
    }

    public String sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.pcc.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
