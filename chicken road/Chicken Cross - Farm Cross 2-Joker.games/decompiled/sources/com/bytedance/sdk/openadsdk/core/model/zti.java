package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zti {
    private String gm;
    private String oo;
    private String pcc;
    private String sf;
    private JSONObject vj;
    private pcc wh;

    public String pcc() {
        return this.pcc;
    }

    public String sf() {
        return this.sf;
    }

    public String gm() {
        return this.gm;
    }

    public String oo() {
        return this.oo;
    }

    public JSONObject vj() {
        return this.vj;
    }

    public pcc wh() {
        return this.wh;
    }

    public static zti pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        zti ztiVar = new zti();
        ztiVar.pcc = jSONObject.optString("id");
        ztiVar.oo = jSONObject.optString("data");
        ztiVar.gm = jSONObject.optString("url");
        ztiVar.sf = jSONObject.optString("md5");
        ztiVar.vj = jSONObject.optJSONObject("custom_components");
        JSONObject optJSONObject = jSONObject.optJSONObject("preload");
        if (optJSONObject != null) {
            ztiVar.wh = pcc.pcc(optJSONObject);
        }
        return ztiVar;
    }

    public static class pcc {
        private JSONArray gm;
        private JSONArray pcc;
        private JSONArray sf;

        public JSONArray pcc() {
            return this.pcc;
        }

        public void pcc(JSONArray jSONArray) {
            this.pcc = jSONArray;
        }

        public JSONArray sf() {
            return this.sf;
        }

        public void sf(JSONArray jSONArray) {
            this.sf = jSONArray;
        }

        public JSONArray gm() {
            return this.gm;
        }

        public void gm(JSONArray jSONArray) {
            this.gm = jSONArray;
        }

        public static pcc pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("image");
            pcc pccVar = new pcc();
            pccVar.pcc(optJSONArray);
            pccVar.sf(jSONObject.optJSONArray(RemoteConfigComponent.FETCH_FILE_NAME));
            pccVar.gm(jSONObject.optJSONArray("script"));
            return pccVar;
        }
    }
}
