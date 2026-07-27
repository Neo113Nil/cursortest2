package com.bytedance.adsdk.ugeno.vy.vj;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.adsdk.ugeno.sf.gm;

/* loaded from: classes4.dex */
public class sf extends gm<pcc> {
    private float gga;
    private int pcc;
    private float uae;
    private int vd;
    private float xf;
    private static final int rc = Color.parseColor("#FFC642");
    private static final int kez = Color.parseColor("#e3e3e4");

    public sf(Context context) {
        super(context);
        this.pcc = rc;
        this.vd = kez;
        this.xf = 4.0f;
        this.uae = 20.0f;
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
        if (lq()) {
            ((pcc) this.vj).pcc(this.xf, this.pcc, this.vd, this.uae, (int) this.gga);
        } else {
            ((pcc) this.vj).pcc(this.xf, this.pcc, this.vd, this.uae, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.pcc = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2, kez);
                break;
            case "gap":
                this.gga = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "size":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 20.0f);
                break;
            case "score":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 4.0f);
                break;
        }
    }
}
