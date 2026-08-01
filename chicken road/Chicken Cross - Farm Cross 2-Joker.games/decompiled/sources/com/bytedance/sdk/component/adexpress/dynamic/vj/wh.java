package com.bytedance.sdk.component.adexpress.dynamic.vj;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.vj.vj;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.facebook.internal.NativeProtocol;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh {
    private static HashMap<String, String> qf;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.gm gm;
    private pcc oo;
    private JSONObject pcc;
    private JSONObject sf;
    private gm vj;
    private com.bytedance.sdk.component.adexpress.dynamic.oo.oo wh;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        qf = hashMap;
        hashMap.put("subtitle", "description");
        qf.put("source", "source|app.app_name");
        qf.put("screenshot", "dynamic_creative.screenshot");
    }

    public wh(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.pcc = jSONObject;
        this.sf = jSONObject2;
        this.gm = new com.bytedance.sdk.component.adexpress.dynamic.oo.gm(jSONObject2);
        this.oo = pcc.pcc(jSONObject3);
        this.wh = com.bytedance.sdk.component.adexpress.dynamic.oo.oo.pcc(jSONObject4);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc(double d, int i, double d2, String str, hc hcVar) {
        JSONObject jSONObject;
        this.gm.pcc();
        try {
            jSONObject = new JSONObject(this.wh.sf);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc2 = pcc(oo.pcc(this.pcc, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.oo.kj) null);
        pcc(pcc2);
        vj vjVar = new vj(d, i, d2, str, hcVar);
        vj.pcc pccVar = new vj.pcc();
        pccVar.pcc = this.oo.pcc;
        pccVar.sf = this.oo.sf;
        pccVar.gm = 0.0f;
        vjVar.pcc(pccVar);
        vjVar.pcc(pcc2, 0.0f, 0.0f);
        vjVar.pcc();
        if (vjVar.pcc.oo == 65536.0f) {
            return null;
        }
        return vjVar.pcc.wh;
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        int pcc2;
        if (kjVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm() != null) {
            pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().dax();
        } else {
            pcc2 = com.bytedance.sdk.component.adexpress.oo.qf.pcc(com.bytedance.sdk.component.adexpress.oo.pcc());
        }
        float min = this.oo.gm ? this.oo.pcc : Math.min(this.oo.pcc, com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), pcc2));
        if (this.oo.sf == 0.0f) {
            kjVar.vj(min);
            kjVar.ork().vj().ork("auto");
            kjVar.wh(0.0f);
        } else {
            kjVar.vj(min);
            kjVar.wh(this.oo.gm ? this.oo.sf : Math.min(this.oo.sf, com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc(), com.bytedance.sdk.component.adexpress.oo.qf.sf(com.bytedance.sdk.component.adexpress.oo.pcc()))));
            kjVar.ork().vj().ork("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("type");
        if (TextUtils.equals(optString, "custom-component-vessel")) {
            int optInt = jSONObject.optInt("componentId");
            if (this.wh != null) {
                gm gmVar = new gm();
                this.vj = gmVar;
                JSONObject pcc2 = gmVar.pcc(this.wh.pcc, optInt, jSONObject);
                if (pcc2 != null) {
                    jSONObject = pcc2;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc3 = pcc(jSONObject);
        pcc3.pcc(kjVar);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null) {
            pcc3.pcc((List<com.bytedance.sdk.component.adexpress.dynamic.oo.kj>) null);
            return pcc3;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
            if (optJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(optString, "tag-group")) {
                    length = pcc3.ork().vj().otd();
                } else {
                    length = optJSONArray2.length();
                }
                for (int i2 = 0; i2 < length; i2++) {
                    com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc4 = pcc(optJSONArray2.optJSONObject(i2), pcc3);
                    if (com.bytedance.sdk.component.adexpress.oo.sf() && "skip-with-time".equals(pcc3.ork().sf()) && !U3.i.T.equals(pcc3.of()) && !TextUtils.isEmpty(pcc3.of())) {
                        pcc4.gm(pcc3.of());
                    }
                    arrayList.add(pcc4);
                    arrayList3.add(pcc4);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            pcc3.pcc(arrayList);
        }
        if (arrayList2.size() > 0) {
            pcc3.sf(arrayList2);
        }
        return pcc3;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.oo.kj pcc(JSONObject jSONObject) {
        String pcc2;
        JSONObject jSONObject2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("id");
        JSONObject optJSONObject = jSONObject.optJSONObject("values");
        vy.pcc(optString, optJSONObject);
        JSONObject pcc3 = vy.pcc(optString, vy.pcc(jSONObject.optJSONArray("sceneValues")), optJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = new com.bytedance.sdk.component.adexpress.dynamic.oo.kj();
        if (TextUtils.isEmpty(optString2)) {
            kjVar.sf(String.valueOf(kjVar.hashCode()));
        } else {
            kjVar.sf(optString2);
        }
        if (optJSONObject != null) {
            sf(kjVar);
            kjVar.gm((float) optJSONObject.optDouble("x"));
            kjVar.oo((float) optJSONObject.optDouble("y"));
            kjVar.vj((float) optJSONObject.optDouble("width"));
            kjVar.wh((float) optJSONObject.optDouble("height"));
            kjVar.qf(optJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.oo.vj vjVar = new com.bytedance.sdk.component.adexpress.dynamic.oo.vj();
            vjVar.pcc(optString);
            vjVar.sf(optJSONObject.optString("data"));
            vjVar.gm(optJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.oo.wh pcc4 = com.bytedance.sdk.component.adexpress.dynamic.oo.wh.pcc(optJSONObject);
            vjVar.pcc(pcc4);
            com.bytedance.sdk.component.adexpress.dynamic.oo.wh pcc5 = com.bytedance.sdk.component.adexpress.dynamic.oo.wh.pcc(pcc3);
            if (pcc5 == null) {
                vjVar.sf(pcc4);
            } else {
                vjVar.sf(pcc5);
            }
            pcc(pcc4);
            pcc(pcc5);
            if (TextUtils.equals(optString, "video-image-budget") && (jSONObject2 = this.sf) != null) {
                pcc(vjVar, jSONObject2.optInt("image_mode"));
            }
            String sf = vjVar.sf();
            com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = vjVar.vj();
            if (qf.containsKey(sf) && !vj.se()) {
                vj.lo(qf.get(sf));
            }
            if (vj.se()) {
                pcc2 = vjVar.gm();
            } else {
                pcc2 = pcc(vjVar.gm());
            }
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                if (TextUtils.equals(sf, "star") || TextUtils.equals(sf, "text_star")) {
                    pcc2 = pcc("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(sf, "score-count") || TextUtils.equals(sf, "score-count-type-1") || TextUtils.equals(sf, "score-count-type-2")) {
                    pcc2 = pcc("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(sf) && pcc4.az()) {
                    pcc2 = pcc("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(pcc()) && (TextUtils.equals("logo-union", optString) || TextUtils.equals("logo", optString))) {
                vjVar.sf(pcc2 + "adx:" + pcc());
            } else {
                vjVar.sf(pcc2);
            }
            kjVar.pcc(vjVar);
        }
        return kjVar;
    }

    private void sf(com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        com.bytedance.sdk.component.adexpress.dynamic.oo.gm gmVar;
        Object pcc2;
        Object pcc3;
        Object pcc4;
        Object pcc5;
        if (kjVar == null || (gmVar = this.gm) == null || (pcc2 = gmVar.pcc("image.0.url")) == null) {
            return;
        }
        String valueOf = String.valueOf(pcc2);
        if (TextUtils.isEmpty(valueOf) || (pcc3 = this.gm.pcc("title")) == null) {
            return;
        }
        String valueOf2 = String.valueOf(pcc3);
        if (TextUtils.isEmpty(valueOf2) || (pcc4 = this.gm.pcc("description")) == null) {
            return;
        }
        String valueOf3 = String.valueOf(pcc4);
        if (TextUtils.isEmpty(valueOf3) || (pcc5 = this.gm.pcc("icon")) == null) {
            return;
        }
        String valueOf4 = String.valueOf(pcc5);
        if (TextUtils.isEmpty(valueOf4)) {
            return;
        }
        Object pcc6 = this.gm.pcc("app.app_name");
        Object pcc7 = this.gm.pcc("source");
        if (pcc6 == null && pcc7 == null) {
            return;
        }
        if (pcc6 == null) {
            pcc6 = pcc7;
        }
        String valueOf5 = String.valueOf(pcc6);
        if (TextUtils.isEmpty(valueOf5)) {
            return;
        }
        kjVar.pcc("imageUrl", valueOf);
        kjVar.pcc("title", valueOf2);
        kjVar.pcc("description", valueOf3);
        kjVar.pcc("icon", valueOf4);
        kjVar.pcc(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, valueOf5);
        kjVar.pcc(true);
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.vj vjVar, int i) {
        int lastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            vjVar.pcc("video");
            String pcc2 = vy.pcc("video");
            vjVar.vj().lo(pcc2);
            String pcc3 = vy.pcc("video", "clickArea");
            if (!TextUtils.isEmpty(pcc3)) {
                vjVar.vj().jr(pcc3);
                vjVar.qf().jr(pcc3);
            }
            vjVar.qf().lo(pcc2);
            vjVar.sf(pcc2);
            vjVar.vj().eko();
            return;
        }
        vjVar.pcc("image");
        String pcc4 = vy.pcc("image");
        com.bytedance.sdk.component.adexpress.dynamic.oo.wh vj = vjVar.vj();
        vj.lo(pcc4);
        vjVar.qf().lo(pcc4);
        String pcc5 = vy.pcc("image", "clickArea");
        if (!TextUtils.isEmpty(pcc5)) {
            vj.jr(pcc5);
            vjVar.qf().jr(pcc5);
        }
        JSONObject by = vj.by();
        if (by != null) {
            vj.of(by.optString("imageLottieTosPath"));
            vj.tmg(by.optBoolean("animationsLoop"));
            vj.jsj(by.optInt("lottieAppNameMaxLength"));
            vj.mk(by.optInt("lottieAdDescMaxLength"));
            vj.tsz(by.optInt("lottieAdTitleMaxLength"));
        }
        vjVar.sf(pcc4);
        if (pcc4 != null && (lastIndexOf = pcc4.lastIndexOf(".")) > 0) {
            String substring = pcc4.substring(0, lastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", pcc(substring + ".width"));
                jSONObject.put("height", pcc(substring + ".height"));
            } catch (JSONException unused) {
            }
            vjVar.gm(jSONObject.toString());
        }
        vj.oyx();
    }

    private String pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.gm.sf(str2)) {
                String valueOf = String.valueOf(this.gm.pcc(str2));
                if (!TextUtils.isEmpty(valueOf)) {
                    return valueOf;
                }
            }
        }
        return "";
    }

    private String pcc() {
        Object pcc2;
        com.bytedance.sdk.component.adexpress.dynamic.oo.gm gmVar = this.gm;
        return (gmVar == null || (pcc2 = gmVar.pcc("adx_name")) == null) ? "" : String.valueOf(pcc2);
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.wh whVar) {
        if (whVar == null) {
            return;
        }
        String atb = whVar.atb();
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            String gm = com.bytedance.sdk.component.adexpress.oo.qf.gm(com.bytedance.sdk.component.adexpress.oo.pcc());
            if ("zh".equals(gm)) {
                gm = "cn";
            }
            if (!TextUtils.isEmpty(gm) && whVar.wh() != null) {
                String optString = whVar.wh().optString(gm);
                if (!TextUtils.isEmpty(optString)) {
                    atb = optString;
                }
            }
        }
        if (TextUtils.isEmpty(atb)) {
            return;
        }
        int indexOf = atb.indexOf("{{");
        int indexOf2 = atb.indexOf("}}");
        if (indexOf < 0 || indexOf2 < 0 || indexOf2 < indexOf) {
            whVar.tmg(atb);
            return;
        }
        String pcc2 = pcc(atb.substring(indexOf + 2, indexOf2));
        StringBuilder sb = new StringBuilder(atb.substring(0, indexOf));
        if (!TextUtils.isEmpty(pcc2)) {
            sb.append(pcc2);
        }
        sb.append(atb.substring(indexOf2 + 2));
        whVar.tmg(sb.toString());
    }

    static class pcc {
        boolean gm;
        float pcc;
        float sf;

        public static pcc pcc(JSONObject jSONObject) {
            pcc pccVar = new pcc();
            if (jSONObject != null) {
                pccVar.pcc = (float) jSONObject.optDouble("width");
                pccVar.sf = (float) jSONObject.optDouble("height");
                pccVar.gm = jSONObject.optBoolean("isLandscape");
            }
            return pccVar;
        }
    }
}
