package com.bytedance.adsdk.sf.gm.sf;

/* loaded from: classes4.dex */
public class hc implements gm {
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.hc<Float, Float> sf;

    public hc(String str, com.bytedance.adsdk.sf.gm.pcc.hc<Float, Float> hcVar) {
        this.pcc = str;
        this.sf = hcVar;
    }

    public String pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.hc<Float, Float> sf() {
        return this.sf;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.nac(vyVar, pccVar, this);
    }
}
