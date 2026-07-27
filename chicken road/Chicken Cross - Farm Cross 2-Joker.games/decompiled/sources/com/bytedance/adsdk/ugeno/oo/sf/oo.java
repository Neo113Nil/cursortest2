package com.bytedance.adsdk.ugeno.oo.sf;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.oo.wh;

/* loaded from: classes4.dex */
public class oo extends pcc {
    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void sf() {
    }

    public oo(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        super(gmVar, str, pccVar);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.sf.pcc
    public void pcc() {
        Object obj;
        com.bytedance.adsdk.ugeno.sf.gm sf;
        com.bytedance.adsdk.ugeno.sf.gm kj;
        com.bytedance.adsdk.ugeno.pcc.pcc tmg;
        if (this.wh == null || this.wh.size() <= 0 || (obj = this.wh.get("name")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || (sf = this.gm.sf(this.gm)) == null || (kj = sf.kj(valueOf)) == null || (tmg = kj.tmg(valueOf)) == null) {
            return;
        }
        tmg.sf();
        tmg.pcc(new com.bytedance.adsdk.ugeno.pcc.sf() { // from class: com.bytedance.adsdk.ugeno.oo.sf.oo.1
            @Override // com.bytedance.adsdk.ugeno.pcc.sf
            public void pcc() {
            }

            @Override // com.bytedance.adsdk.ugeno.pcc.sf
            public void sf() {
                oo.this.gm();
            }
        });
    }
}
