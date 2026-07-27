package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    public int gm = 1;
    public ArrayList<Integer> oo;
    public String pcc;
    public int qf;
    public int sf;
    public AdSlot vj;
    public String wh;

    public String pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public int sf() {
        return this.sf;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public int gm() {
        return this.gm;
    }

    public void sf(int i) {
        this.gm = i;
    }

    public AdSlot oo() {
        return this.vj;
    }

    public void pcc(AdSlot adSlot) {
        this.vj = adSlot;
    }

    public ArrayList<Integer> vj() {
        return this.oo;
    }

    public void pcc(ArrayList<Integer> arrayList) {
        this.oo = arrayList;
    }

    public void sf(String str) {
        this.wh = str;
    }

    public void gm(int i) {
        this.qf = i;
    }

    public static void pcc(gm gmVar) {
        int sf;
        if (gmVar == null || gmVar.oo() == null || (sf = gmVar.sf()) >= 0 || sf == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.oo.pcc("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.model.gm.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.MessagePayloadKeys.FROM, gm.this.gm());
                jSONObject.put("err_code", gm.this.sf());
                jSONObject.put("err_msg", gm.this.wh);
                jSONObject.put("ext_from", gm.this.qf);
                jSONObject.put("server_res_str", gm.this.pcc());
                if (gm.this.vj() != null && gm.this.vj().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) gm.this.vj()).toString());
                }
                new Object[]{"rd_client_custom_error = ", jSONObject};
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("rd_client_custom_error").pcc(gm.this.oo().getDurationSlotType()).sf(jSONObject.toString());
            }
        });
    }
}
