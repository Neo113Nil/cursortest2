package com.bytedance.sdk.component.pcc;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class qf {
    private ork pcc;

    static qf pcc(ork orkVar) {
        return new qf(orkVar);
    }

    private qf(ork orkVar) {
        this.pcc = orkVar;
    }

    <T> T pcc(String str, Type type) throws JSONException {
        pcc(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) new JSONObject(str);
        }
        return (T) this.pcc.pcc(str, type);
    }

    <T> String pcc(T t) {
        String obj;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            obj = t.toString();
        } else {
            obj = this.pcc.pcc(t);
        }
        pcc(obj);
        return obj;
    }

    private static void pcc(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        kj.pcc(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(String.valueOf(str))));
    }
}
