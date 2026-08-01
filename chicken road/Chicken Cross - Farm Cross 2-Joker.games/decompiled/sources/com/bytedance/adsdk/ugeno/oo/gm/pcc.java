package com.bytedance.adsdk.ugeno.oo.gm;

import com.bytedance.adsdk.ugeno.oo.wh;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.oo.sf.pcc {
    public pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        com.bytedance.adsdk.ugeno.sf.gm sf;
        if (this.gm == null || (sf = this.gm.sf(this.gm)) == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm wh = sf.wh("SwiperView");
        if (wh instanceof com.bytedance.adsdk.ugeno.sf) {
            ((com.bytedance.adsdk.ugeno.sf) wh).gm();
        }
    }
}
