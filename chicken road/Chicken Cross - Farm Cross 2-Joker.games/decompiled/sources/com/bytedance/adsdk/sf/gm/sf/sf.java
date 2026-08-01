package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.PointF;

/* loaded from: classes4.dex */
public class sf implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.wh gm;
    private final boolean oo;
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> sf;
    private final boolean vj;

    public sf(String str, com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar, com.bytedance.adsdk.sf.gm.pcc.wh whVar, boolean z, boolean z2) {
        this.pcc = str;
        this.sf = hcVar;
        this.gm = whVar;
        this.oo = z;
        this.vj = z2;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.wh(vyVar, pccVar, this);
    }

    public String pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> sf() {
        return this.sf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.wh gm() {
        return this.gm;
    }

    public boolean oo() {
        return this.oo;
    }

    public boolean vj() {
        return this.vj;
    }
}
