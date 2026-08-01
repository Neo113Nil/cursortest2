package com.bytedance.adsdk.pcc;

import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class hc implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    public Object pcc(JSONObject jSONObject, Object[] objArr) {
        String obj;
        int intValue;
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String str = objArr[0];
        Object obj2 = objArr[1];
        Object obj3 = objArr.length >= 3 ? objArr[2] : null;
        if (!(obj2 instanceof String)) {
            return null;
        }
        String str2 = (String) obj2;
        if (str == null) {
            return null;
        }
        if (str instanceof String) {
            obj = str;
        } else {
            if (!(str instanceof Number)) {
                return null;
            }
            obj = str.toString();
        }
        String[] split = obj.split(Pattern.quote(str2), -1);
        if (obj3 == null) {
            return split;
        }
        if (!(obj3 instanceof Number) || (intValue = ((Number) obj3).intValue()) < 0 || intValue >= split.length) {
            return null;
        }
        return split[intValue];
    }
}
