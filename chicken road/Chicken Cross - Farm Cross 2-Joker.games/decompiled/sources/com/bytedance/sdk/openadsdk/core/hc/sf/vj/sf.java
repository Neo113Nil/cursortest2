package com.bytedance.sdk.openadsdk.core.hc.sf.vj;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.oo;
import com.bytedance.adsdk.ugeno.qf.gm;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.adsdk.ugeno.sf.pcc<pcc> {
    private int uae;
    private int vd;
    private JSONArray xf;

    public sf(Context context) {
        super(context);
        this.vd = 0;
        this.uae = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public View pcc() {
        try {
            this.vj = new pcc(this.sf);
            ((pcc) this.vj).pcc((oo) this);
        } catch (Throwable unused) {
            this.vj = new View(this.sf);
        }
        return this.vj;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "driveMode":
                this.uae = gm.pcc(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.vd = 1;
                    break;
                } else {
                    this.vd = 0;
                    break;
                }
            case "dataList":
                this.xf = com.bytedance.adsdk.ugeno.qf.sf.pcc(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        if (this.vj instanceof pcc) {
            ((pcc) this.vj).setOrientation(this.vd);
            ((pcc) this.vj).pcc(this);
            if (this.uae == 1) {
                oo();
            } else {
                gm();
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (gmVar == null) {
            return;
        }
        this.pcc.add(gmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, ViewGroup.LayoutParams layoutParams) {
        if (gmVar == null) {
            return;
        }
        this.pcc.add(gmVar);
    }

    private void gm() {
        if (this.pcc == null || this.pcc.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.pcc.get(0);
        if (this.xf == null) {
            return;
        }
        for (int i = 0; i < this.xf.length(); i++) {
            tmg tmgVar = new tmg(this.sf);
            tmgVar.pcc(this.fvk);
            try {
                JSONObject optJSONObject = this.xf.optJSONObject(i);
                if (optJSONObject != null) {
                    if (optJSONObject.has("$chunk")) {
                        this.oo.put("$item", optJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.oo.put("$item", optJSONObject);
                    }
                    ((pcc) this.vj).pcc(tmgVar.pcc(gmVar.ye(), this.oo, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void oo() {
        for (int i = 0; i < this.pcc.size(); i++) {
            com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.pcc.get(i);
            if (gmVar != null) {
                tmg tmgVar = new tmg(this.sf);
                tmgVar.pcc(this.fvk);
                ((pcc) this.vj).pcc(tmgVar.pcc(gmVar.ye(), this.oo, (JSONObject) null));
            }
        }
    }
}
