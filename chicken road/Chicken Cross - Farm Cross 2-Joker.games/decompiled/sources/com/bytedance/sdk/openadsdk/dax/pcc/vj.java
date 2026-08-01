package com.bytedance.sdk.openadsdk.dax.pcc;

import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vj {
    public static void pcc(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc(str, false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.dax.pcc.vj.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                if (!TextUtils.isEmpty(str4)) {
                    jSONObject.put("error_url", str4);
                }
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    jSONObject.put("back_up_url", list.toString());
                }
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return oo.sf().pcc(str).sf(jSONObject.toString());
            }
        });
    }

    public static void sf(final String str, final String str2, final int i, final String str3, final String str4, final List<String> list) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc(str, false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.dax.pcc.vj.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                String str5 = str2;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                jSONObject.put("url", str5);
                String str7 = str4;
                if (str7 == null) {
                    str7 = "";
                }
                jSONObject.put("web_sence", str7);
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    str6 = new JSONArray((Collection) list).toString();
                }
                jSONObject.put("back_up_url", str6);
                jSONObject.put("error_code", i);
                jSONObject.put("error_msg", str3);
                return oo.sf().pcc(str).sf(jSONObject.toString());
            }
        });
    }
}
