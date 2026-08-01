package com.bytedance.adsdk.sf.pcc.sf;

import java.util.List;

/* loaded from: classes4.dex */
public class wh extends qf<Integer> {
    public wh(List<com.bytedance.adsdk.sf.qf.pcc<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Integer pcc(com.bytedance.adsdk.sf.qf.pcc<Integer> pccVar, float f) {
        return Integer.valueOf(gm(pccVar, f));
    }

    int gm(com.bytedance.adsdk.sf.qf.pcc<Integer> pccVar, float f) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gm != null) {
            pccVar.qf.floatValue();
            oo();
            kj();
            throw null;
        }
        return com.bytedance.adsdk.sf.wh.vj.pcc(pccVar.kj(), pccVar.vy(), f);
    }

    public int vy() {
        return gm(gm(), vj());
    }
}
