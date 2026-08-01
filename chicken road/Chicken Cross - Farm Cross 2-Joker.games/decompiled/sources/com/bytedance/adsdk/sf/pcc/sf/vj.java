package com.bytedance.adsdk.sf.pcc.sf;

import java.util.List;

/* loaded from: classes4.dex */
public class vj extends qf<com.bytedance.adsdk.sf.gm.sf.oo> {
    private final com.bytedance.adsdk.sf.gm.sf.oo oo;

    public vj(List<com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo>> list) {
        super(list);
        com.bytedance.adsdk.sf.gm.sf.oo ooVar = list.get(0).pcc;
        int gm = ooVar != null ? ooVar.gm() : 0;
        this.oo = new com.bytedance.adsdk.sf.gm.sf.oo(new float[gm], new int[gm]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.sf.gm.sf.oo pcc(com.bytedance.adsdk.sf.qf.pcc<com.bytedance.adsdk.sf.gm.sf.oo> pccVar, float f) {
        this.oo.pcc(pccVar.pcc, pccVar.sf, f);
        return this.oo;
    }
}
