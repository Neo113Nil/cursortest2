package com.bytedance.adsdk.sf.gm.pcc;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes4.dex */
public class vj implements hc<PointF, PointF> {
    private final List<com.bytedance.adsdk.sf.qf.pcc<PointF>> pcc;

    public vj(List<com.bytedance.adsdk.sf.qf.pcc<PointF>> list) {
        this.pcc = list;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public List<com.bytedance.adsdk.sf.qf.pcc<PointF>> gm() {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public boolean sf() {
        return this.pcc.size() == 1 && this.pcc.get(0).vj();
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc() {
        if (this.pcc.get(0).vj()) {
            return new com.bytedance.adsdk.sf.pcc.sf.vh(this.pcc);
        }
        return new com.bytedance.adsdk.sf.pcc.sf.ork(this.pcc);
    }
}
