package com.bytedance.sdk.openadsdk.core.hc.sf.pcc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class sf extends gm<pcc> {
    private int gga;
    private com.bytedance.sdk.openadsdk.core.hc.sf kez;
    private int pcc;
    private float rc;
    private int uae;
    private int vd;
    private int xf;

    public sf(Context context) {
        super(context);
        this.vd = -1;
        this.xf = -1;
        pcc(context);
    }

    private void pcc(Context context) {
        this.kez = new com.bytedance.sdk.openadsdk.core.hc.sf(context, true);
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
        com.bytedance.adsdk.ugeno.vy.wh.pcc pcc = ((pcc) this.vj).pcc();
        if (pcc != null) {
            this.kez.pcc(pcc);
            ((pcc) this.vj).pcc(pcc);
        }
        ((pcc) this.vj).pcc(this.pcc, this.vd, this.xf, this.uae, this.gga, this.rc);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "barWidth":
                this.uae = rj.sf(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "bottomBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.xf = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                    break;
                }
                break;
            case "shadowColor":
            case "shadowOffsetX":
            case "shadowOffsetY":
            case "textAlign":
            case "textColor":
            case "textStyle":
            case "shadowBlur":
            case "textSize":
            case "textDecoration":
            case "fontWeight":
            case "lineHeight":
            case "text":
            case "lines":
            case "ellipsis":
            case "maxLines":
            case "letterSpacing":
                this.kez.pcc(str, str2);
                break;
            case "topBackgroundColor":
                if (!TextUtils.isEmpty(str2)) {
                    this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                    break;
                }
                break;
            case "barHeight":
                this.gga = rj.sf(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "barRadius":
                this.rc = rj.sf(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "downtime":
                this.pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void pcc(Canvas canvas) {
        super.pcc(canvas);
    }
}
