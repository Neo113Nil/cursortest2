package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf {
    private String gm;
    private float kj;
    private JSONObject oo;
    private boolean ork;
    private JSONObject pcc;
    private boolean qf;
    private JSONObject sf;
    private String vj;
    private float vy;
    private JSONObject wh;

    public qf(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public qf(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject optJSONObject;
        this.ork = true;
        if (jSONObject != null) {
            if (jSONObject.has("body")) {
                this.pcc = jSONObject.optJSONObject("body");
            } else {
                this.pcc = jSONObject.optJSONObject("main_template");
            }
            this.sf = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has(Constants.REFERRER_API_META)) {
                optJSONObject = jSONObject.optJSONObject(Constants.REFERRER_API_META);
            } else {
                optJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (optJSONObject != null) {
                if (jSONObject.has("body")) {
                    this.qf = true;
                    String optString = optJSONObject.optString("version");
                    this.gm = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.gm = "3.0";
                    }
                } else {
                    this.gm = optJSONObject.optString("sdk_version");
                }
                if (optJSONObject.has("adType")) {
                    this.vj = optJSONObject.optString("adType");
                }
                if (optJSONObject.has("gestureThrough")) {
                    this.ork = com.bytedance.adsdk.ugeno.qf.gm.pcc(optJSONObject.optString("gestureThrough"), true);
                }
            } else if (jSONObject.has("body")) {
                this.gm = "3.0";
                this.qf = true;
            }
            this.oo = jSONObject2;
            this.wh = jSONObject3;
        }
    }

    public pcc pcc() {
        return vj();
    }

    public void pcc(float f, float f2) {
        this.kj = f;
        this.vy = f2;
    }

    private pcc vj() {
        if (!oo()) {
            return pcc(this.pcc, (pcc) null);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("flexDirection", "row");
            jSONObject.put("justifyContent", "flex_start");
            jSONObject.put("alignItems", "flex_start");
            jSONObject.put("clickable", false);
            jSONObject.put("width", "match_parent");
            jSONObject.put("height", "wrap_content");
            float f = this.kj;
            if (f > 0.0f) {
                jSONObject.put("width", f);
            }
            float f2 = this.vy;
            if (f2 > 0.0f) {
                jSONObject.put("height", f2);
            }
            JSONObject jSONObject2 = this.oo;
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("xSize");
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject3 = new JSONObject(optString);
                    if (jSONObject3.optInt("width") > 0) {
                        jSONObject.put("width", jSONObject3.optInt("width"));
                    }
                    if (jSONObject3.optInt("height") > 0) {
                        jSONObject.put("height", jSONObject3.optInt("height"));
                    }
                }
            }
        } catch (JSONException unused) {
        }
        pcc pccVar = new pcc();
        pccVar.sf = "View";
        pccVar.pcc = "virtualNode";
        pccVar.gm = jSONObject;
        pccVar.wh = null;
        pccVar.qf = this.gm;
        pccVar.vy = this.ork;
        pccVar.kj = this.vj;
        pccVar.pcc(pcc(this.pcc, pccVar));
        return pccVar;
    }

    public String sf() {
        return this.gm;
    }

    public List<pcc> gm() {
        if (this.sf == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.sf.keys();
        while (keys.hasNext()) {
            pcc pcc2 = pcc(this.sf.optJSONObject(keys.next()), (pcc) null);
            if (pcc2 != null) {
                arrayList.add(pcc2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private pcc pcc(JSONObject jSONObject, pcc pccVar) {
        String optString;
        String optString2;
        pcc pcc2;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.has("type")) {
            optString = jSONObject.optString("type");
        } else {
            optString = jSONObject.optString("name");
        }
        String optString3 = jSONObject.optString("id");
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.equals(next, "children")) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
        pcc pccVar2 = new pcc();
        pccVar2.pcc = optString3;
        if (!this.qf || !TextUtils.equals("Video", optString)) {
            pccVar2.sf = optString;
        } else {
            pccVar2.sf = optString + "V3";
        }
        pccVar2.gm = jSONObject2;
        pccVar2.wh = pccVar;
        pccVar2.qf = this.gm;
        pccVar2.vy = this.ork;
        pccVar2.kj = this.vj;
        if (jSONObject2.has("i18n")) {
            pccVar2.oo = jSONObject2.optJSONObject("i18n");
        }
        if (TextUtils.equals(optString, "CustomComponent")) {
            pcc(jSONObject, pccVar2.gm);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            int i = 0;
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (jSONObject.has("type")) {
                    optString2 = jSONObject.optString("type");
                } else {
                    optString2 = jSONObject.optString("name");
                }
                String pcc3 = com.bytedance.adsdk.ugeno.gm.sf.pcc(optJSONObject.optString("id"), this.oo);
                if (TextUtils.equals(optString2, "Template")) {
                    JSONObject jSONObject3 = this.sf;
                    if (jSONObject3 != null) {
                        optJSONObject = jSONObject3.optJSONObject(pcc3);
                    } else {
                        pcc2 = null;
                        if (pcc2 != null) {
                            pcc2.sf(sf(pcc2));
                            pcc2.pcc(pcc(pcc2));
                        }
                        if (!gm(pcc2)) {
                            i++;
                            pccVar2.sf(pcc2);
                        } else if (pcc2 != null) {
                            pccVar2.pcc(i2 - i, pcc2);
                        }
                    }
                }
                pcc2 = pcc(optJSONObject, pccVar2);
                if (pcc2 != null) {
                }
                if (!gm(pcc2)) {
                }
            }
        }
        return pccVar2;
    }

    public boolean pcc(pcc pccVar) {
        JSONObject vj;
        if (pccVar == null || (vj = pccVar.vj()) == null) {
            return false;
        }
        return TextUtils.equals(vj.optString("width"), "match_parent");
    }

    public boolean sf(pcc pccVar) {
        JSONObject vj;
        if (pccVar == null || (vj = pccVar.vj()) == null) {
            return false;
        }
        return TextUtils.equals(vj.optString("height"), "match_parent");
    }

    public boolean gm(pcc pccVar) {
        JSONObject vj;
        if (pccVar == null || (vj = pccVar.vj()) == null) {
            return false;
        }
        return TextUtils.equals(vj.optString(U3.i.L), com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_ABSOLUTE);
    }

    public boolean oo() {
        return this.qf;
    }

    private void pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.wh == null || jSONObject2 == null) {
            return;
        }
        try {
            String optString = this.wh.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString);
            JSONObject optJSONObject = jSONObject2.optJSONObject("targetProps");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = optJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (opt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.qf.sf.pcc(jSONObject3.optJSONArray("events"), (JSONArray) opt);
                        }
                    } else {
                        jSONObject3.put(next, opt);
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("children");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                optJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", optJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean oo(pcc pccVar) {
        return (pccVar == null || pccVar.gm == null) ? false : true;
    }

    public static class pcc {
        private JSONObject gm;
        private String kj;
        private JSONObject oo;
        private boolean ork;
        private String pcc;
        private String qf;
        private String sf;
        private boolean vh;
        private LinkedList<pcc> vj;
        private boolean vy;
        private pcc wh;

        public String pcc() {
            return this.pcc;
        }

        public String sf() {
            return this.qf;
        }

        public boolean gm() {
            return this.vy;
        }

        public String oo() {
            return this.sf;
        }

        public void pcc(String str) {
            this.sf = str;
        }

        public void pcc(boolean z) {
            this.ork = z;
        }

        public void sf(boolean z) {
            this.vh = z;
        }

        public JSONObject vj() {
            return this.gm;
        }

        public List<pcc> wh() {
            return this.vj;
        }

        public void pcc(pcc pccVar) {
            if (this.vj == null) {
                this.vj = new LinkedList<>();
            }
            this.vj.add(pccVar);
        }

        public void sf(pcc pccVar) {
            if (this.vj == null) {
                this.vj = new LinkedList<>();
            }
            this.vj.addLast(pccVar);
        }

        public void pcc(int i, pcc pccVar) {
            if (this.vj == null) {
                this.vj = new LinkedList<>();
            }
            this.vj.add(i, pccVar);
        }

        public JSONObject qf() {
            return this.oo;
        }

        public String toString() {
            return "UGNode{id='" + this.pcc + "', name='" + this.sf + "'}";
        }
    }
}
