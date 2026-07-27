package com.bytedance.adsdk.ugeno.oo.sf;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;

/* loaded from: classes4.dex */
public class vj extends pcc {
    public vj(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        if (this.wh == null || this.wh.size() <= 0) {
            return;
        }
        Object obj = this.wh.get("id");
        if (obj == null) {
            pcc(this.gm);
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            pcc(this.gm);
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm sf = this.gm.sf(this.gm);
        if (sf == null) {
            return;
        }
        pcc(sf.vj(valueOf));
    }

    private void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        Object obj;
        if (gmVar == null) {
            return;
        }
        for (String str : this.wh.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id") && (obj = this.wh.get(str)) != null) {
                gmVar.pcc(str, String.valueOf(obj));
            }
        }
        gmVar.pcc(this.wh.containsKey("width"), this.wh.containsKey("height"));
        gmVar.sf();
    }
}
