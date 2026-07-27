package com.bytedance.adsdk.sf.pcc.sf;

import java.util.List;

/* loaded from: classes4.dex */
public class tmg extends qf<com.bytedance.adsdk.sf.qf.gm> {
    private final com.bytedance.adsdk.sf.qf.gm oo;

    public tmg(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.qf.gm>> list) {
        super(list);
        this.oo = new com.bytedance.adsdk.sf.qf.gm();
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.sf.qf.gm pcc(com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.qf.gm> pccVar, float f) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.sf.qf.gm gmVar = pccVar.pcc;
        com.bytedance.adsdk.sf.qf.gm gmVar2 = pccVar.sf;
        if (this.gm != null) {
            pccVar.qf.floatValue();
            oo();
            kj();
            throw null;
        }
        this.oo.pcc(com.bytedance.adsdk.sf.wh.vj.pcc(gmVar.pcc(), gmVar2.pcc(), f), com.bytedance.adsdk.sf.wh.vj.pcc(gmVar.sf(), gmVar2.sf(), f));
        return this.oo;
    }
}
