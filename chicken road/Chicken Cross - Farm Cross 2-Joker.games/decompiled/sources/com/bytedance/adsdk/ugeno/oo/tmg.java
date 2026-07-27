package com.bytedance.adsdk.ugeno.oo;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg {
    public static wh.pcc pcc(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        wh.pcc pccVar = new wh.pcc();
        String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(str, jSONObject);
        if (pcc.contains("#")) {
            pcc = pcc.replace("#", "%23");
        }
        Uri parse = Uri.parse(pcc);
        if (parse == null) {
            return null;
        }
        pccVar.gm(pcc);
        if (!TextUtils.isEmpty(parse.getScheme())) {
            pccVar.pcc(parse.getScheme());
        }
        String authority = parse.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = parse.getPath();
        }
        pccVar.sf(authority);
        pccVar.oo(pccVar.pcc() + "://" + pccVar.sf());
        HashMap hashMap = new HashMap();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, com.bytedance.adsdk.ugeno.gm.sf.pcc(parse.getQueryParameter(str2), jSONObject));
            }
        }
        pccVar.pcc(hashMap);
        return pccVar;
    }

    public static wh.pcc pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        wh.pcc pccVar = new wh.pcc();
        String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("protocol"), jSONObject2);
        pccVar.sf(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("name"), jSONObject2));
        if (TextUtils.isEmpty(pcc)) {
            pccVar.pcc("global");
        } else {
            pccVar.pcc(pcc);
        }
        pccVar.oo(pccVar.pcc() + "://" + pccVar.sf());
        pccVar.gm(String.valueOf(jSONObject.hashCode()));
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        HashMap hashMap = new HashMap();
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, com.bytedance.adsdk.ugeno.gm.sf.pcc(optJSONObject.opt(next), jSONObject2));
            }
        }
        pccVar.pcc(hashMap);
        return pccVar;
    }
}
