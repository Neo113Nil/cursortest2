package com.bytedance.sdk.openadsdk.oo.pcc;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vy implements com.bytedance.sdk.openadsdk.dax.sf {
    private final com.bytedance.sdk.component.wh.pcc.wh.oo pcc;
    private final boolean sf;

    public vy(boolean z, com.bytedance.sdk.component.wh.pcc.wh.oo ooVar) {
        this.pcc = ooVar;
        this.sf = z;
    }

    @Override // com.bytedance.sdk.openadsdk.dax.sf
    public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
        int i;
        if (this.pcc == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.sf);
        jSONObject.put("url", this.pcc.sf());
        int oo = this.pcc.oo();
        if (oo <= 0) {
            oo = 0;
        }
        jSONObject.put("retry_times", oo);
        jSONObject.put("ad_id", this.pcc.wh());
        jSONObject.put("track_type", this.pcc.vj());
        if (!this.sf) {
            i = 4;
        } else if (this.pcc.ork()) {
            i = 3;
        } else {
            i = this.pcc.oo() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String qf = this.pcc.qf();
        if (!TextUtils.isEmpty(qf)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : qf.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String vy = this.pcc.vy();
        if (!TextUtils.isEmpty(vy)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : vy.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        jSONObject.put("use_new_upload", this.pcc.tmg());
        return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("track_link_result").sf(jSONObject.toString());
    }
}
