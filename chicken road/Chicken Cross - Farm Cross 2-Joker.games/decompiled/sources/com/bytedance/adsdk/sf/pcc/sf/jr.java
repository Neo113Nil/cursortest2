package com.bytedance.adsdk.sf.pcc.sf;

import java.util.List;

/* loaded from: classes4.dex */
public class jr extends qf<com.bytedance.adsdk.sf.gm.sf> {
    public jr(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.sf.gm.sf pcc(com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf> pccVar, float f) {
        if (this.gm != null) {
            if (pccVar.qf != null) {
                pccVar.qf.floatValue();
            }
            vj();
            kj();
            throw null;
        }
        if (f != 1.0f || pccVar.sf == null) {
            return pccVar.pcc;
        }
        return pccVar.sf;
    }
}
