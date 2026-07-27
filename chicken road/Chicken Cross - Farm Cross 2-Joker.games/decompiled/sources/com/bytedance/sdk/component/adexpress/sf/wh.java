package com.bytedance.sdk.component.adexpress.sf;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.ork;

/* loaded from: classes4.dex */
public class wh implements ork {
    private hc gm;
    private Context pcc;
    private pcc sf;

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public void pcc() {
    }

    public wh(Context context, hc hcVar, pcc pccVar) {
        this.pcc = context;
        this.sf = pccVar;
        this.gm = hcVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.ork
    public boolean pcc(final ork.pcc pccVar) {
        this.gm.vj().qf(0);
        this.sf.pcc(new qf() { // from class: com.bytedance.sdk.component.adexpress.sf.wh.1
            @Override // com.bytedance.sdk.component.adexpress.sf.qf
            public void pcc(View view, gbb gbbVar) {
                if (pccVar.gm()) {
                    return;
                }
                jr sf = pccVar.sf();
                if (sf != null) {
                    sf.pcc(wh.this.sf, gbbVar);
                }
                pccVar.pcc(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.sf.qf
            public void pcc(int i, String str) {
                jr sf = pccVar.sf();
                if (sf != null) {
                    sf.a_(i);
                }
            }
        });
        return true;
    }

    public void pcc(gm gmVar) {
        this.sf.pcc(gmVar);
    }
}
