package com.bytedance.adsdk.ugeno.oo.sf;

import com.bytedance.adsdk.ugeno.oo.wh;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class sf extends pcc {
    private List<com.bytedance.adsdk.ugeno.oo.pcc.oo> vy;

    public sf(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
        this.vy = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Object obj;
        com.bytedance.adsdk.ugeno.oo.pcc.gm pcc;
        if (this.wh == null || this.wh.size() <= 0 || (obj = this.wh.get("name")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        com.bytedance.adsdk.ugeno.oo.pcc.pcc rj = this.gm.rj();
        if (rj == null || (pcc = rj.pcc(valueOf)) == null) {
            return;
        }
        pcc.pcc(valueOf);
    }
}
