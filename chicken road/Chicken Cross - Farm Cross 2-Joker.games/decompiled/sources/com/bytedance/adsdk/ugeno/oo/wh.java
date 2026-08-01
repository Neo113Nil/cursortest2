package com.bytedance.adsdk.ugeno.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh {
    private boolean gm = false;
    private int oo = 0;
    private pcc pcc;
    private List<pcc> sf;

    public pcc pcc() {
        return this.pcc;
    }

    public List<pcc> sf() {
        return this.sf;
    }

    public boolean gm() {
        return this.gm;
    }

    public int oo() {
        return this.oo;
    }

    public static class pcc {
        private String gm = "global";
        private String oo;
        private String pcc;
        private String sf;
        private Map<String, Object> vj;
        private Map<String, Object> wh;

        public String pcc() {
            return this.gm;
        }

        public void pcc(String str) {
            this.gm = str;
        }

        public String sf() {
            return this.oo;
        }

        public void sf(String str) {
            this.oo = str;
        }

        public Map<String, Object> gm() {
            return this.vj;
        }

        public void pcc(Map<String, Object> map) {
            this.vj = map;
        }

        public void gm(String str) {
            this.pcc = str;
        }

        public String oo() {
            return this.pcc;
        }

        public void oo(String str) {
            this.sf = str;
        }

        public String vj() {
            return this.sf;
        }

        public void sf(Map<String, Object> map) {
            this.wh = map;
        }

        public String toString() {
            return "Action{scheme='" + this.gm + "', name='" + this.oo + "', params=" + this.vj + ", host='" + this.sf + "', origin='" + this.pcc + "', extra=" + this.wh + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static wh pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        pcc pcc2;
        pcc pcc3;
        if (jSONObject == null) {
            return null;
        }
        wh whVar = new wh();
        Object opt = jSONObject.opt(DebugKt.DEBUG_PROPERTY_VALUE_ON);
        JSONArray optJSONArray = jSONObject.optJSONArray("handlers");
        if (opt instanceof String) {
            pcc2 = tmg.pcc((String) opt, jSONObject2);
        } else {
            pcc2 = opt instanceof JSONObject ? tmg.pcc((JSONObject) opt, jSONObject2) : null;
        }
        if (pcc2 != null) {
            whVar.pcc = pcc2;
        }
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            Object opt2 = optJSONArray.opt(i);
            if (opt2 instanceof String) {
                pcc pcc4 = tmg.pcc((String) opt2, jSONObject2);
                if (pcc4 != null) {
                    arrayList.add(pcc4);
                }
            } else if ((opt2 instanceof JSONObject) && (pcc3 = tmg.pcc((JSONObject) opt2, jSONObject2)) != null) {
                arrayList.add(pcc3);
            }
        }
        whVar.sf = arrayList;
        if (jSONObject.has("delay")) {
            whVar.oo = com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("delay"), jSONObject2), 0);
        }
        if (jSONObject.has("disable")) {
            whVar.gm = com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("disable"), jSONObject2), false);
        }
        return whVar;
    }
}
