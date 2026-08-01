package com.bytedance.sdk.openadsdk.oo.pcc.pcc;

import com.bytedance.sdk.openadsdk.yt.sf;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj {
    public static final kj pcc = new kj();
    private static final sf.pcc<kj> sf = new sf.pcc<kj>() { // from class: com.bytedance.sdk.openadsdk.oo.pcc.pcc.kj.1
        @Override // com.bytedance.sdk.openadsdk.yt.sf.pcc
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public kj sf(String str) {
            return new kj(str);
        }
    };
    private final pcc gm;
    private final pcc oo;
    private final pcc vj;

    public kj(String str) {
        pcc pccVar = new pcc(1, 50);
        this.gm = pccVar;
        pcc pccVar2 = new pcc(1, 50);
        this.oo = pccVar2;
        pcc pccVar3 = new pcc(3, 50);
        this.vj = pccVar3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            pccVar.pcc(jSONObject.optJSONObject("al_hi"));
            pccVar2.pcc(jSONObject.optJSONObject("al_no"));
            pccVar3.pcc(jSONObject.optJSONObject("st_no"));
        } catch (JSONException unused) {
        }
    }

    private kj() {
        this.gm = new pcc(1, 50);
        this.oo = new pcc(1, 50);
        this.vj = new pcc(3, 50);
    }

    private static kj oo() {
        return (kj) com.bytedance.sdk.openadsdk.yt.vj.pcc("olog_config", pcc, sf);
    }

    public static com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pcc() {
        return oo().gm.pcc();
    }

    public static com.bytedance.sdk.component.wh.pcc.oo.sf.pcc sf() {
        return oo().oo.pcc();
    }

    public static com.bytedance.sdk.component.wh.pcc.oo.sf.pcc gm() {
        return oo().vj.pcc();
    }

    public static class pcc {
        public int pcc;
        public int sf;

        public pcc(int i, int i2) {
            this.pcc = i;
            this.sf = i2;
        }

        public void pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.pcc = jSONObject.optInt("m_c_c", this.pcc);
            this.sf = jSONObject.optInt("b_u_m_c", this.sf);
        }

        public com.bytedance.sdk.component.wh.pcc.oo.sf.pcc pcc() {
            return com.bytedance.sdk.component.wh.pcc.oo.sf.pcc.pcc(this.pcc, this.sf);
        }

        public String toString() {
            return super.toString();
        }
    }
}
