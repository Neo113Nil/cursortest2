package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes4.dex */
public class vy extends com.bytedance.adsdk.sf.qf.pcc<PointF> {
    private Path ork;
    private final com.bytedance.adsdk.sf.qf.pcc<PointF> vh;

    public vy(com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar) {
        super(qfVar, pccVar.pcc, pccVar.sf, pccVar.gm, pccVar.oo, pccVar.vj, pccVar.wh, pccVar.qf);
        this.vh = pccVar;
        pcc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void pcc() {
        boolean z = (this.sf == 0 || this.pcc == 0 || !((PointF) this.pcc).equals(((PointF) this.sf).x, ((PointF) this.sf).y)) ? false : true;
        if (this.pcc == 0 || this.sf == 0 || z) {
            return;
        }
        this.ork = com.bytedance.adsdk.sf.wh.wh.pcc((PointF) this.pcc, (PointF) this.sf, this.vh.kj, this.vh.vy);
    }

    Path sf() {
        return this.ork;
    }
}
