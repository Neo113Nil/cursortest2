package com.bytedance.adsdk.pcc.sf.sf.pcc;

import android.text.TextUtils;
import com.ironsource.U3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class tz implements com.bytedance.adsdk.pcc.sf.sf.pcc {
    private final String pcc;

    public tz(String str) {
        this.pcc = str;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public Object pcc(Map<String, JSONObject> map) {
        Object pcc;
        if (map == null || map.size() <= 0 || (pcc = pcc(this.pcc, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return pcc;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public com.bytedance.adsdk.pcc.sf.oo.vj pcc() {
        return com.bytedance.adsdk.pcc.sf.oo.wh.VARIABLE;
    }

    public String toString() {
        return "VariableNode [literals=" + this.pcc + U3.j.e;
    }

    @Override // com.bytedance.adsdk.pcc.sf.sf.pcc
    public String sf() {
        return this.pcc;
    }

    public Object pcc(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return pcc(str.split("\\."), 0, jSONObject);
    }

    private Object pcc(String[] strArr, int i, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int indexOf = str.indexOf(U3.j.d);
            int indexOf2 = str.indexOf(U3.j.e);
            if (indexOf < 0 || indexOf2 < 0 || indexOf > indexOf2) {
                opt = jSONObject.opt(str);
            } else {
                String substring = str.substring(0, indexOf);
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1, indexOf2));
                    Object opt2 = jSONObject.opt(substring);
                    opt = opt2 instanceof JSONArray ? ((JSONArray) opt2).opt(parseInt) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
            if (i == strArr.length - 1) {
                return opt;
            }
            if (opt instanceof String) {
                try {
                    return pcc(strArr, i + 1, new JSONObject((String) opt));
                } catch (JSONException unused2) {
                    return opt;
                }
            }
            if (opt instanceof JSONObject) {
                return pcc(strArr, i + 1, (JSONObject) opt);
            }
        }
        return null;
    }
}
