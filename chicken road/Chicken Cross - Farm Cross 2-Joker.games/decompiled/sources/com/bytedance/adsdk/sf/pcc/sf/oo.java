package com.bytedance.adsdk.sf.pcc.sf;

import java.util.List;

/* loaded from: classes4.dex */
public class oo extends qf<Float> {
    public oo(List<com.bytedance.adsdk.sf.qf.pcc<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Float pcc(com.bytedance.adsdk.sf.qf.pcc<Float> pccVar, float f) {
        return Float.valueOf(gm(pccVar, f));
    }

    float gm(com.bytedance.adsdk.sf.qf.pcc<Float> pccVar, float f) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.gm != null) {
            pccVar.qf.floatValue();
            oo();
            kj();
            throw null;
        }
        return com.bytedance.adsdk.sf.wh.vj.pcc(pccVar.wh(), pccVar.qf(), f);
    }

    public float vy() {
        return gm(gm(), vj());
    }
}
