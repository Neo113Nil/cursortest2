package com.bytedance.adsdk.sf.pcc.sf;

import java.util.List;

/* loaded from: classes4.dex */
public class sf extends qf<Integer> {
    public sf(List<com.bytedance.adsdk.sf.qf.pcc<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Integer pcc(com.bytedance.adsdk.sf.qf.pcc<Integer> pccVar, float f) {
        return Integer.valueOf(gm(pccVar, f));
    }

    public int gm(com.bytedance.adsdk.sf.qf.pcc<Integer> pccVar, float f) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gm != null) {
            pccVar.qf.floatValue();
            oo();
            kj();
            throw null;
        }
        return com.bytedance.adsdk.sf.wh.sf.pcc(com.bytedance.adsdk.sf.wh.vj.sf(f, 0.0f, 1.0f), pccVar.pcc.intValue(), pccVar.sf.intValue());
    }

    public int vy() {
        return gm(gm(), vj());
    }
}
