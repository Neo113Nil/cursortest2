package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class nac {
    private pcc pcc;
    private pcc sf;

    public nac(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("easy_playable");
        if (optJSONObject != null) {
            this.pcc = new pcc(optJSONObject.optJSONObject("components"));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("popup");
        if (optJSONObject2 != null) {
            this.sf = new pcc(optJSONObject2.optJSONObject("components"));
        }
    }

    public static boolean pcc(of ofVar) {
        return pcc(ofVar, false);
    }

    public static boolean pcc(of ofVar, boolean z) {
        nac fv;
        if (ofVar == null || (fv = ofVar.fv()) == null) {
            return false;
        }
        if (z) {
            pcc pccVar = fv.sf;
            return pccVar != null && pccVar.pcc();
        }
        pcc pccVar2 = fv.pcc;
        return pccVar2 != null && pccVar2.pcc();
    }

    public static pcc sf(of ofVar) {
        nac fv;
        if (ofVar == null || (fv = ofVar.fv()) == null) {
            return null;
        }
        return fv.sf;
    }

    public static pcc gm(of ofVar) {
        nac fv;
        if (ofVar == null || (fv = ofVar.fv()) == null) {
            return null;
        }
        return fv.pcc;
    }

    public static class pcc {
        C0166pcc pcc;
        C0166pcc sf;

        public pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            if (jSONObject.has("vertical")) {
                this.pcc = new C0166pcc(jSONObject.optJSONObject("vertical"));
            }
            if (jSONObject.has("horizontal")) {
                this.sf = new C0166pcc(jSONObject.optJSONObject("horizontal"));
            }
        }

        public boolean pcc() {
            C0166pcc c0166pcc = this.sf;
            if (c0166pcc != null && c0166pcc.pcc()) {
                return true;
            }
            C0166pcc c0166pcc2 = this.pcc;
            return c0166pcc2 != null && c0166pcc2.pcc();
        }

        public String pcc(boolean z) {
            if (z) {
                C0166pcc c0166pcc = this.pcc;
                if (c0166pcc != null) {
                    return c0166pcc.pcc;
                }
                return "";
            }
            C0166pcc c0166pcc2 = this.sf;
            if (c0166pcc2 != null) {
                return c0166pcc2.pcc;
            }
            return "";
        }

        /* renamed from: com.bytedance.sdk.openadsdk.core.model.nac$pcc$pcc, reason: collision with other inner class name */
        public static class C0166pcc {
            String pcc;

            public C0166pcc(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return;
                }
                this.pcc = jSONObject.optString("entry");
            }

            public boolean pcc() {
                return !TextUtils.isEmpty(this.pcc);
            }
        }
    }
}
