package com.bytedance.sdk.openadsdk.core.hc.sf.oo;

import android.content.Context;
import com.bytedance.adsdk.ugeno.qf.kj;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.adsdk.ugeno.sf.gm<pcc> {
    private float gga;
    private String pcc;
    private float uae;
    private int vd;
    private int xf;

    public gm(Context context) {
        super(context);
        this.pcc = "line";
        this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc("#FFD813");
        this.xf = com.bytedance.adsdk.ugeno.qf.pcc.pcc("rgba(0, 0, 0, 0.5)");
        this.uae = kj.pcc(this.sf, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        ((pcc) this.vj).pcc(this.pcc).pcc(this.vd).sf(this.xf).sf(this.gga).pcc(this.uae);
    }

    public void pcc(int i) {
        ((pcc) this.vj).setProgress(i);
    }

    public void qf(int i) {
        ((pcc) this.vj).setAnimationDuration(i);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "progressBackgroundColor":
                this.xf = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "progressSize":
                this.uae = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f));
                break;
            case "progressType":
                this.pcc = str2;
                break;
            case "progressColor":
                this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f) <= 0.0f) {
                    this.gga = 0.0f;
                    break;
                } else {
                    this.gga = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                    break;
                }
        }
    }
}
