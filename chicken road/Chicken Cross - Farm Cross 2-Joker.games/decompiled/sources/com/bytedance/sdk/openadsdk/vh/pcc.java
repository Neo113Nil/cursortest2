package com.bytedance.sdk.openadsdk.vh;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.wh;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc implements gm {
    private final Map<String, com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm> gm = new HashMap();
    private final of pcc;
    private final sf sf;

    private pcc(sf sfVar, of ofVar) {
        this.sf = sfVar;
        this.pcc = ofVar;
    }

    public static pcc pcc(sf sfVar, of ofVar) {
        return new pcc(sfVar, ofVar);
    }

    @Override // com.bytedance.sdk.openadsdk.vh.gm
    public void pcc() {
        this.gm.clear();
    }

    private of pcc(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        of ofVar = new of();
        ofVar.vj(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            ofVar.jsj(str);
        }
        if (this.pcc == null) {
            return ofVar;
        }
        String pcc = ofVar.xfm() != null ? ofVar.xfm().pcc() : null;
        if (TextUtils.isEmpty(pcc)) {
            return this.pcc;
        }
        wh xfm = this.pcc.xfm();
        if (xfm != null && pcc.equals(xfm.pcc())) {
            return this.pcc;
        }
        if (xfm != null && pcc.contains("play.google.com/store") && !pcc.contains(Constants.REFERRER)) {
            ofVar.xfm().pcc(xfm.pcc());
        }
        return ofVar;
    }

    @Override // com.bytedance.sdk.openadsdk.vh.gm
    public void pcc(Context context, JSONObject jSONObject, String str, int i, boolean z) {
        JSONObject optJSONObject;
        if (context == null || jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        pcc(context, pcc(optJSONObject, str), optJSONObject, i, z);
    }

    private void pcc(Context context, of ofVar, JSONObject jSONObject, int i, boolean z) {
        if (context == null || ofVar == null || ofVar.xfm() == null || jSONObject == null || this.sf == null || this.gm.get(ofVar.xfm().pcc()) != null) {
            return;
        }
        String sf = kun.sf(i);
        if (TextUtils.isEmpty(sf)) {
            return;
        }
        this.gm.put(ofVar.xfm().pcc(), pcc(context, sf));
    }

    @Override // com.bytedance.sdk.openadsdk.vh.gm
    public void pcc(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.pcc == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(context, str).pcc(this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.vh.gm
    public void pcc(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        pcc(pcc(optJSONObject, (String) null), optJSONObject);
    }

    private void pcc(of ofVar, JSONObject jSONObject) {
        if (this.sf == null || ofVar == null || ofVar.xfm() == null) {
            return;
        }
        String pcc = ofVar.xfm().pcc();
        if (this.gm.containsKey(pcc)) {
            this.gm.remove(pcc);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.sf.pcc("app_ad_event", jSONObject2);
            } catch (JSONException e) {
                lo.gm("JsAppAdDownloadManager", e.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm pcc(Context context, String str) {
        return com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(context, str);
    }
}
